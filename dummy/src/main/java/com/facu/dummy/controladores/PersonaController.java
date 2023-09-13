package com.facu.dummy.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping(path = "api/personas")
public class PersonaController {

    @GetMapping("subRuta")
    public ResponseEntity<String> holaMundo(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te saludo desde la API Dummy");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error. Intente nuevamente");
        }
    }

    @GetMapping("subRutaChau")
    public ResponseEntity<String> chauMundo(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te despido desde la API Dummy");
        }
        catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error. Intente nuevamente");
        }
    }

}
