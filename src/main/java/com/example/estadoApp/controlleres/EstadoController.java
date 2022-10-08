package com.example.estadoApp.controlleres;

import com.example.estadoApp.services.EstadoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estado")
@CrossOrigin("*")
@Log4j2
public class EstadoController {

    private final EstadoService service;

    public EstadoController(EstadoService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }


}
