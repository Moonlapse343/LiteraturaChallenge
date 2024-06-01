package com.alura.LiteraturaChallenge.repository;

import com.alura.LiteraturaChallenge.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor save(Autor libro);

    Autor findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fechaDeNacimiento = :años")
    List<Autor> findAutoresVivosEnAño(String años);
}
