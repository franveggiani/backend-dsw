package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Localidad;
import com.utn.apiresttutorial.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

}
