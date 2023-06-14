package com.test_fikrizulfikarkusmana.TestCrud.repo;

import com.test_fikrizulfikarkusmana.TestCrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

