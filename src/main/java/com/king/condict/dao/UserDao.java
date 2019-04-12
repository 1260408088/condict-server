package com.king.condict.dao;

import com.king.condict.entry.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: guoning
 * @Description: // TODO
 * @Date: 2019/4/12 17:49
 * @Version: 1.0
 */
public interface UserDao extends MongoRepository<User,String> {
    User findUserByName();
}
