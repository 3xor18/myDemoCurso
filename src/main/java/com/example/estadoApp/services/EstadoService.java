package com.example.estadoApp.services;

import org.springframework.http.ResponseEntity;

public interface EstadoService {

    public ResponseEntity<?> buscarPorId(Long id);
}
