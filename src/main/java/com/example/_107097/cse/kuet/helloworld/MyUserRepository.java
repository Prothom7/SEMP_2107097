package com.example._107097.cse.kuet.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<User, Long> {
}
