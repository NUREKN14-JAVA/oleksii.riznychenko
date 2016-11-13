package com.kn146.kostia;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Константин on 23-Oct-16.
 */
public class UserTest {

    private User user;
    private Date dateOfBirthd;
    final private int year = 1997;
    final private int day = 7;
    final private int old = 19;


    @Before
    public void setUp() throws Exception {
        user = new User();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JULY, day);
        dateOfBirthd = calendar.getTime();
    }

    @Test
    public void testFullName(){
        user.setFirstname("Hitagi");
        user.setLastNam("Senjougahara");
        assertEquals("Senjougahara, Hitagi", user.getFullName());
    }

    @Test
    public void testGetAge(){
        user.setDateOfBirthd(dateOfBirthd);
        assertEquals(old, user.getAge());
    }

}