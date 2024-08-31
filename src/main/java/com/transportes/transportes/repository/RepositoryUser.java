package com.transportes.transportes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryUser extends CrudRepository<User, Long> {

User findByUsername(String correo);

}
