package com.example.estadoApp.services.impl;

import com.example.estadoApp.dtos.AutorDto;
import com.example.estadoApp.entities.Estado;
import com.example.estadoApp.repositories.EstadoRepository;
import com.example.estadoApp.services.EstadoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log4j2
public class EstadoServiceImpl implements EstadoService {

    private final EstadoRepository repository;

    @Autowired
    private RestTemplate clientRest;

    public EstadoServiceImpl(EstadoRepository repository) {
        this.repository = repository;
    }


    @Override
    public ResponseEntity<?> buscarPorId(Long id) {
        try{
            ResponseEntity<AutorDto> response = clientRest.exchange(
                    "http://localhost:8080/autor/1", HttpMethod.GET, null, AutorDto.class
            );



            log.info("Hola desde el Nuevo Micro Service Estado");
            log.info("El ms Anterior (viejo) respondio un status:"+response.getStatusCodeValue());
            log.info("El Autor (nombre):"+response.getBody().getNombre());


            Estado estadoEnBD=repository.findById(id).orElse(null);
            return ResponseEntity.status(HttpStatus.OK).body(estadoEnBD);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocurrio un error");
        }
    }
}
