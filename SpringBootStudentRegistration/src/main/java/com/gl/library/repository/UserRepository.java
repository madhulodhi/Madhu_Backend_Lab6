package com.gl.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.gl.library.entity.User;
//@Repository
//public interface UserRepository extends JpaRepository<User,Long> {
//	@Query("SELECT u FROM u WHERE u.USERNAME = ?1")
//	public User getUserByUsername(String username);
//
//	public UserDetails findByUsername(String username);
//}
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
