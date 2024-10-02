package com.example.demo.Repository;

import com.example.demo.Entitys.TipoProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProductoRepository extends JpaRepository<TipoProductoEntity, Long> {

}