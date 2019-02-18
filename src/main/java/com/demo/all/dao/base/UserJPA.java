package com.demo.all.dao.base;

import com.demo.all.model.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author asus
 * @Date 2019/2/15
 * @see
 */
public interface UserJPA extends
        Serializable,
        JpaRepository<User, Integer>,
        JpaSpecificationExecutor<User> {
}
