package com.fullstackproject.backend.of.the.fullstack.project.repo;

import com.fullstackproject.backend.of.the.fullstack.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
