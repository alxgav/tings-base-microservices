package com.tings.userservice.repository;

import com.tings.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>{}
