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
    private Date dateOfBirthd;

    public User(String firstname, String lastNam, Date dateOfBirthd) {
        this.firstname = firstname;
        this.lastNam = lastNam;
        this.dateOfBirthd = dateOfBirthd;
    }

    public User(Long id, String firstname, String lastNam, Date dateOfBirthd) {
        this.id = id;
        this.firstname = firstname;
        this.lastNam = lastNam;
        this.dateOfBirthd = dateOfBirthd;
    }

    public User() {}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
