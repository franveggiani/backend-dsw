package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Libro;
import com.utn.apiresttutorial.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

}
