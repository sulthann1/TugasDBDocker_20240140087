package com.dbdocker.praktikum.repository;

import com.dbdocker.praktikum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}
