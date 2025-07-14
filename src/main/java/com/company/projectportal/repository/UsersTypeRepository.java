package com.company.projectportal.repository;

import com.company.projectportal.entity.Users;
import com.company.projectportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {

}
