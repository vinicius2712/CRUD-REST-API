package br.com.viniciussoares.cliente.repository;

import br.com.viniciussoares.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
