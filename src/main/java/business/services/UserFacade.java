package business.services;

import business.entities.User;
import business.persistence.Database;
import business.persistence.UserMapper;
import business.exceptions.UserException;

import java.sql.SQLException;

public class UserFacade
{
    UserMapper userMapper;

    public UserFacade(Database database)
    {
        userMapper = new UserMapper(database);
    }

    public User login(String email, String password) throws UserException
    {
        return userMapper.login(email, password);
    }

    public User createUser(String name, String street, String town, int zipCode, String email, String password, int phone) throws UserException
    {
        User user = new User(name, street, town, zipCode, email, password, phone);
        userMapper.createUser(user);
        return user;
    }

}
