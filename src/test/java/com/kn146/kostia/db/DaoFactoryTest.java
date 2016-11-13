package com.kn146.kostia.db;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Константин on 09-Nov-16.
 */
public class DaoFactoryTest {
    @Test
    public void getUserDao() throws Exception {
        try {
            DaoFactory daoFactory = DaoFactory.getINSTANCE();
            assertNotEquals("DaoFactory instance is null", daoFactory);
            UserDao userDao = daoFactory.getUserDao();
            assertNotEquals("UserDao instance is null", userDao);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

}