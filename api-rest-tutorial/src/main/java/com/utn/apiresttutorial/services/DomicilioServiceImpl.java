package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Domicilio;
import com.utn.apiresttutorial.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

}
