package com.juan.license.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.license.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
