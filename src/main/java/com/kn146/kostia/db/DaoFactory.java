package com.kn146.kostia.db;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Константин on 09-Nov-16.
 */
public class DaoFactory {

    public static final String USER_DAO = "dao.com.kn146.kostia.java.1.db.UserDao";
    private  final Properties properties;

    public static DaoFactory getINSTANCE() {
        return INSTANCE;
    }

    private final static DaoFactory INSTANCE = new DaoFactory();

    private DaoFactory(){
        properties = new Properties();
        try{
            properties.load(getClass().getClassLoader().getResourceAsStream("setting.properties"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private  ConnectionFactory getConnectionFactory(){
        String user = properties.getProperty("connection.user");
        String password = properties.getProperty("connection.password");
        String url = properties.getProperty("connection.url");
        String driver = properties.getProperty("connection.driver");
        return new ConnectionFactoryImpl(driver, url, user, password);
    }

    public  UserDao getUserDao(){
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
