package com.utn.ejercicio1.repositorios;

import com.utn.ejercicio1.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
