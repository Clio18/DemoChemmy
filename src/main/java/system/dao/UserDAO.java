package system.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import system.model.User;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDAO{

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Periodic");
        dataSource.setUsername( "postgres" );
        dataSource.setPassword( "admin" );
        return dataSource;
    }










    //выход к БД
    private List<User> users = Arrays.asList(
            new User("admin", "admin"),
            new User("user1", "user1")
    );

    public List<User> getAllUser() {
        return users;
    }
}
