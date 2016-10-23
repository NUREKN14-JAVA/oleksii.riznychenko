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

    @Before
    public void setUp() throws Exception {
        user = new User();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997, Calendar.JULY, 7);
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
        assertEquals(19, user.getAge());
    }

}