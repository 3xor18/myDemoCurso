package com.example.estadoApp.repositories;

import com.example.estadoApp.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado,Long> {
}
