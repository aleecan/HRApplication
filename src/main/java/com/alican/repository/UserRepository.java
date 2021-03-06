package com.alican.repository;

import com.alican.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository("userRepository")
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
