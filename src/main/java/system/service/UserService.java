package system.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDAO;
import system.model.Element;
import system.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    Statement statement = null;
    @Autowired
    private UserDAO userDAO;

//    public UserService(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    public UserService() {
//    }
//
//    public UserDAO getUserDAO() {
//        return userDAO;
//    }
//
//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

//    public String getElement(int index) throws SQLException {
//        return userDAO.getElement(index);
//    }


    public List<User> getAllUsers(){
        return userDAO.getAllUser();
    }

    public List<Element> getAllElements() throws SQLException {
        List <Element> list = new ArrayList<Element>();
        statement = userDAO.dataSource().getConnection().createStatement();
        String sql = "SELECT * FROM persons";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            list.add(new Element(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)));
        };
        return list;
    }
}
