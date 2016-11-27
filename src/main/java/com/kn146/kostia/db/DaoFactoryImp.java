package com.kn146.kostia.db;

/**
 * Created by Константин on 17-Nov-16.
 */
public class DaoFactoryImp extends DaoFactory {
    public UserDao getUserDao(){
        UserDao result = null;
        try {
            Class clasz = Class.forName(properties.getProperty(USER_DAO));
            result = (UserDao) clasz.newInstance();
            result.setConnectionFactory(getConnectionFactory());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
