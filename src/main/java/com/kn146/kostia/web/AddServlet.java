package com.kn146.kostia.web;

import com.kn146.kostia.User;
import com.kn146.kostia.db.DaoFactory;
import com.kn146.kostia.db.DatabaseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Константин on 11-Dec-16.
 */
public class AddServlet  extends EditServlet {

    protected void processUser(User user) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }

    protected void showPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }
}
