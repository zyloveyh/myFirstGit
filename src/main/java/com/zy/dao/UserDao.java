package com.zy.dao;

import com.zy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * project:  javaFour
 *
 * @author: zy
 * @date: 2018/10/18  20 : 11
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
