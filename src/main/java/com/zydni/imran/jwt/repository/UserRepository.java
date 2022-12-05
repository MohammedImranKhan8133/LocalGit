package com.zydni.imran.jwt.repository;

import com.zydni.imran.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByusername(String username);
}
