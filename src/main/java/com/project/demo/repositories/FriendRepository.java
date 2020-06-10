package com.project.demo.repositories;

import com.project.demo.entities.Friend;
import com.project.demo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FriendRepository extends JpaRepository<Friend, Long> {


}
