package com.dod.DodData.repository;

import com.dod.DodData.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String>, CrudRepository<User, String> {

    User findByUserId(String id);

    List<User> findAll();
}