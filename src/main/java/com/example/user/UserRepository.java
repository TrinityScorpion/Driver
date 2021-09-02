package com.example.user;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByName(String name);
//    User findUserById(Long Id);
//    User removeUserById(Long Id);


}
