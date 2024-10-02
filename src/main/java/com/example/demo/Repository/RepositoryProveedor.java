package com.example.demo.Repository;

import com.example.demo.Entitys.ProveedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProveedor extends JpaRepository<ProveedorEntity,Long> {
}
