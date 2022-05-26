package com.tdtu.ecommerce.repository;

import com.tdtu.ecommerce.entity.ERole;
import com.tdtu.ecommerce.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}
