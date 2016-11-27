package com.kn146.kostia.db;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Константин on 09-Nov-16.
 */
public class DaoFactoryTest extends TestCase {
    @Test
    public void testGetUserDao() throws Exception {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            assertNotEquals("DaoFactory instance is null", daoFactory);
            UserDao userDao = daoFactory.getUserDao();
            assertNotEquals("UserDao instance is null", userDao);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

}