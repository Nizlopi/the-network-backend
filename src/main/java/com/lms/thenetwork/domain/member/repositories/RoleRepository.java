package com.lms.thenetwork.domain.member.repositories;

import com.lms.thenetwork.domain.member.ERole;
import com.lms.thenetwork.domain.member.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
