package com.alura.LiteraturaChallenge.repository;

import com.alura.LiteraturaChallenge.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LibrosRepository extends JpaRepository<Libros, Long> {
    Libros save(Libros libro);


    @Query("SELECT l FROM Libros l WHERE l.idiomas = :idioma")
    List<Libros> findByIdioma(@Param("idioma") String idioma);
}
