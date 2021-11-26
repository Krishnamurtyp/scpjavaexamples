package com.lowes.scpjavaexamples.sqlinjection.orm.mitigation;

import com.lowes.scpjavaexamples.sqlinjection.orm.beans.UserOrm;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserOrm, Long> {
    List<UserOrm> findByUserNameAndUserPassword(String userName, String userPassword);
    UserOrm findById(long id);
}
