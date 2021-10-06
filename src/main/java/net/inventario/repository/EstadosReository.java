package net.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.inventario.model.Estado;

public interface EstadosReository extends JpaRepository<Estado, Integer> {

}
