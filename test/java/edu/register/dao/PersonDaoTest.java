package edu.register.dao;

import edu.register.domain.Person;
import edu.register.domain.PersonFemale;
import edu.register.domain.PersonMale;
import org.junit.jupiter.api.Test;

import java.util.List;


class PersonDaoTest {

    @Test
    void findPersons() {
//        PersonDao dao = new PersonDao();
//        List<Person> persons = dao.findPersons();
//
//        persons.forEach(person -> {
//            System.out.println("Name - " + person.getFirstName());
//            System.out.println("Gender - " + person.getClass().getName());
//            System.out.println("Passport - " + person.getPassports());
//            System.out.println("Birth Certificate - " + person.getBirthCertificate());
//            if(person instanceof PersonMale) {
//                System.out.println("Birth Cert - " + ((PersonMale)person).getBirthCertificates().size());
//                System.out.println("Marriage Cert" + ((PersonMale)person).getMarriageCertificates().size());
//            } else {
//                System.out.println("Birth Cert - " + ((PersonFemale)person).getBirthCertificates().size());
//                System.out.println("Marriage Cert - " + ((PersonFemale)person).getMarriageCertificates().size());
//            }
//        });
    }

//    @Test
//    void findCertificate() {
//        MarriageDao dao = new MarriageDao();
//        MarriageCertificate certificate = new MarriageCertificate();
//
//        System.out.println("Number " + certificate.getNumber());
//        System.out.println("Husband" + certificate.getHusband());
//        System.out.println("Wife" + certificate.getWife());
//        System.out.println("Active" + certificate.isActive());
//        System.out.println("Issue Date" + certificate.getIssueDate());
//    }

}