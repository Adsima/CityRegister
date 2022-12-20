DROP TABLE IF EXISTS m_passport;
DROP TABLE IF EXISTS m_birth_certificate;
DROP TABLE IF EXISTS m_certificate;
DROP TABLE IF EXISTS m_person;

CREATE TABLE m_person (
	person_id SERIAL,
	gender smallint NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	patronymic varchar(100),
	date_of_birth date NOT NULL,

	PRIMARY KEY(person_id)
);

CREATE TABLE m_passport (
	passport_id SERIAL,
	person_id integer NOT NULL,
	p_seria varchar(10) NOT NULL,
	p_number varchar(10) NOT NULL,
	p_issue_date date NOT NULL,
	p_issue_department varchar(200) NOT NULL,
	PRIMARY KEY(passport_id),
	FOREIGN KEY (person_id) REFERENCES m_person(person_id) ON DELETE RESTRICT
);

CREATE TABLE m_birth_certificate (
    birth_certificate_id SERIAL,
    number_certificate varchar(20) NOT NULL,
    date_issue date NOT NULL,
    person_id integer NOT NULL,
    father_id integer,
    mother_id integer,
    PRIMARY KEY(birth_certificate_id),
    FOREIGN KEY (person_id) REFERENCES m_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (father_id) REFERENCES m_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (mother_id) REFERENCES m_person(person_id) ON DELETE RESTRICT
);

CREATE TABLE m_certificate (
    m_certificate_id SERIAL,
    m_number_certificate varchar(20) NOT NULL,
    m_issue_date date NOT NULL,
    father_id integer NOT NULL,
    mother_id integer NOT NULL,
    m_active boolean DEFAULT FALSE,
    m_end_date date,
    PRIMARY KEY (m_certificate_id),
    FOREIGN KEY (father_id) REFERENCES m_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (mother_id) REFERENCES m_person(person_id) ON DELETE RESTRICT
);


INSERT INTO m_person (gender, first_name, last_name, patronymic, date_of_birth)
VALUES(1, 'Елена', 'Васильева', 'Сергеевна', '1998-03-24'),
(2, 'Олег', 'Васильев', 'Петрович', '1997-10-16'),
(2, 'Николай', 'Васильев', 'Олегович', '2018-10-21');

INSERT INTO m_passport (person_id, p_seria, p_number, p_issue_date, p_issue_department)
VALUES(1, '1234', '567890', '2014-04-02', 'МВД по РБ'),
(2, '1111', '567890', '2013-10-21', 'МВД по СПБ');

INSERT INTO m_birth_certificate (number_certificate, date_issue, person_id, father_id,  mother_id)
VALUES ('123 Birth', '2018-10-24', 3, 2, 1);

INSERT INTO m_certificate (m_number_certificate, m_issue_date, father_id, mother_id, m_active, m_end_date)
VALUES ('1234567', '2017-09-11', 2, 1, FALSE, NULL);