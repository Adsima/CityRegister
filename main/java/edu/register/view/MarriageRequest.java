package edu.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {
    private String husSurname;
    private String husGivenName;
    private String husPatronymic;
    private LocalDate husDateOfBirth;
    private String husPassportSeria;
    private String husPassportNumber;
    private String wifeSurname;
    private String wifeGivenName;
    private String wifePatronymic;
    private LocalDate wifeDateOfBirth;
    private String wifePassportSeria;
    private String wifePassportNumber;

    private String certificateNumber;
    private LocalDate certificateIssueDate;

    public String getHusSurname() {
        return husSurname;
    }

    public void setHusSurname(String husSurname) {
        this.husSurname = husSurname;
    }

    public String getHusGivenName() {
        return husGivenName;
    }

    public void setHusGivenName(String husGivenName) {
        this.husGivenName = husGivenName;
    }

    public String getHusPatronymic() {
        return husPatronymic;
    }

    public void setHusPatronymic(String husPatronymic) {
        this.husPatronymic = husPatronymic;
    }

    public LocalDate getHusDateOfBirth() {
        return husDateOfBirth;
    }

    public void setHusDateOfBirth(LocalDate husDateOfBirth) {
        this.husDateOfBirth = husDateOfBirth;
    }

    public String getHusPassportSeria() {
        return husPassportSeria;
    }

    public void setHusPassportSeria(String husPassportSeria) {
        this.husPassportSeria = husPassportSeria;
    }

    public String getHusPassportNumber() {
        return husPassportNumber;
    }

    public void setHusPassportNumber(String husPassportNumber) {
        this.husPassportNumber = husPassportNumber;
    }

    public String getWifeSurname() {
        return wifeSurname;
    }

    public void setWifeSurname(String wifeSurname) {
        this.wifeSurname = wifeSurname;
    }

    public String getWifeGivenName() {
        return wifeGivenName;
    }

    public void setWifeGivenName(String wifeGivenName) {
        this.wifeGivenName = wifeGivenName;
    }

    public String getWifePatronymic() {
        return wifePatronymic;
    }

    public void setWifePatronymic(String wifePatronymic) {
        this.wifePatronymic = wifePatronymic;
    }

    public LocalDate getWifeDateOfBirth() {
        return wifeDateOfBirth;
    }

    public void setWifeDateOfBirth(LocalDate wifeDateOfBirth) {
        this.wifeDateOfBirth = wifeDateOfBirth;
    }

    public String getWifePassportSeria() {
        return wifePassportSeria;
    }

    public void setWifePassportSeria(String wifePassportSeria) {
        this.wifePassportSeria = wifePassportSeria;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getCertificateIssueDate() {
        return certificateIssueDate;
    }

    public void setCertificateIssueDate(LocalDate certificateIssueDate) {
        this.certificateIssueDate = certificateIssueDate;
    }
}
