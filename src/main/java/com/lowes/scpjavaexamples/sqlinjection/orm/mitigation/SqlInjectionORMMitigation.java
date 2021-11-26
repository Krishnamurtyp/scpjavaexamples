package com.lowes.scpjavaexamples.sqlinjection.orm.mitigation;

import com.lowes.scpjavaexamples.sqlinjection.orm.beans.UserOrm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlInjectionORMMitigation {

    @Autowired
    UserRepository userRepository;

    public UserOrm loginUser(String userName, String userPassword) {
        List<UserOrm> users = userRepository.findByUserNameAndUserPassword(userName, userPassword);
        if (!users.isEmpty()) {
            return users.get(1);
        }else {
            return null;
        }
    }
}
