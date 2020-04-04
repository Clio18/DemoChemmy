//package system.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//
//public class ConnectionDB {
//        public Connection getConnection() throws SQLException {
//            Connection c = null;
//            try {
//                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Periodic", "postgres", "admin");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return c;
//        }
//}
