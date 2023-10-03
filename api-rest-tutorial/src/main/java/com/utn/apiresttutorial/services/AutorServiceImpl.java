package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Autor;
import com.utn.apiresttutorial.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

}
