package com.app.demo.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.demo.jpa.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
