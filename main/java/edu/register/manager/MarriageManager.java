package edu.register.manager;

import edu.register.dao.MarriageDao;
import edu.register.dao.PersonDao;
import edu.register.domain.MarriageCertificate;
import edu.register.domain.Person;
import edu.register.domain.PersonFemale;
import edu.register.domain.PersonMale;
import edu.register.view.MarriageRequest;
import edu.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service("marriageService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao managerDao;
    @Autowired
    private PersonDao personDao;
    @Transactional
    public MarriageResponse findMarriageCertificated(MarriageRequest request) {
        LOGGER.info("MarriageManager called");

        personDao.addPerson(getPerson(1));
        personDao.addPerson(getPerson(2));

        MarriageCertificate certificate = getMarriageCertificate();
        managerDao.saveAndFlush(certificate);

        List<MarriageCertificate> byNumbers = managerDao.findByNumber("12345");
        byNumbers.forEach(m -> LOGGER.info("MC:{}", m.getMarriageCertificateId()));
        LOGGER.info("------------ >>>>>>>>>>>");
        List<MarriageCertificate> byNumbers1 = managerDao.findByNumber("98765");
        byNumbers1.forEach(m -> LOGGER.info("MC:{}", m.getMarriageCertificateId()));
        LOGGER.info("------------ >>>>>>>>>>>");
        List<MarriageCertificate> byNumbers2 = managerDao.findMarriageCertificate("01234");
        byNumbers2.forEach(m -> LOGGER.info("MC:{}", m.getMarriageCertificateId()));

        return new MarriageResponse();
    }

    private MarriageCertificate getMarriageCertificate() {
        MarriageCertificate mc = new MarriageCertificate();
        mc.setIssueDate(LocalDate.now());
        mc.setActive(true);
        mc.setNumber("01234");

        List<Person> persons = personDao.findPersons();
        for(Person person : persons) {
            if(person instanceof PersonMale) {
                mc.setHusband((PersonMale) person);
            } else {
                mc.setWife((PersonFemale) person);
            }
        }

        return mc;
    }

    private Person getPerson(Integer sex) {
        Person person = sex == 1 ? new PersonMale() : new PersonFemale();
        person.setFirstName("1_" + sex);
        person.setLastName("2_" + sex);
        person.setPatronymic("3_" + sex);
        person.setDateOfBirth(LocalDate.of(1993,3,12));

        return person;
    }


}
