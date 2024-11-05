package com.javaspring.fullstack.repository;

import com.javaspring.fullstack.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<user,Long> {
    Object findByid(Long id);
}
