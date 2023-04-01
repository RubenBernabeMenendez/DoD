package com.dod.DodData.repository.User;

import com.dod.DodData.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {

    User findByUserId(Long id);

    List<User> findAll();
}