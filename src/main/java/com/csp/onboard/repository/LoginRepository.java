package com.csp.onboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csp.onboard.model.AdminUser;

import jakarta.transaction.Transactional;

@Repository
@Transactional 
public interface LoginRepository extends CrudRepository<AdminUser, Integer>{

}
