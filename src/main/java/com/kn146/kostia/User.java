package com.kn146.kostia;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Константин on 23-Oct-16.
 */
public class User {

    private Long id;
    private String firstname;
    private String lastNam;
    private final Date dateOfBirthd;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastNam(String lastNam) {

        this.lastNam = lastNam;
    }

    public void setDateOfBirthd(Date dateOfBirthd) {

        this.dateOfBirthd = dateOfBirthd;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Date getDateOfBirthd() {

        return dateOfBirthd;
    }

    public String getLastNam() {

        return lastNam;
    }

    public String getFirstname() {
        return firstname;
    }

    public Long getId() {

        return id;
    }

    public String getFullName(){
        return getLastNam() + ", " + getFirstname();
    }

    public int getAge(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int carT = cal.get(Calendar.YEAR);
        cal.setTime(dateOfBirthd);
        return carT - cal.get(Calendar.YEAR);
    }
}
