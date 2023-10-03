package com.utn.apiresttutorial.repositories;

import com.utn.apiresttutorial.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

public interface BaseRepository <E extends BaseEntity,ID extends Serializable> extends JpaRepository <E,ID> {
}