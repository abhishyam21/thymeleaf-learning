package com.abhishyam.learn.db;

import com.abhishyam.learn.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Abhishyam.c on 13/10/20
 */
public interface UserRepo extends JpaRepository<User, Integer> {

}
