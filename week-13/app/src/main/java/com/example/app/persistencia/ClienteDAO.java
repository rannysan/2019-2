package com.example.app.persistencia;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Long> { 
    Optional<Cliente> findByNome(String nome);
}
