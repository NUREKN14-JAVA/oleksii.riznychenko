package com.kn146.kostia.db;

import com.mockobjects.dynamic.Mock;

/**
 * Created by Константин on 27-Nov-16.
 */
public class MockDaoFactory extends DaoFactory {

    private Mock mockUserDao;

    public MockDaoFactory() {
        mockUserDao = new Mock(UserDao.class);
    }

    public Mock getMockUserDao() {
        return mockUserDao;
    }

    @Override
    public UserDao getUserDao() {
        return (UserDao) mockUserDao.proxy();
    }
}
