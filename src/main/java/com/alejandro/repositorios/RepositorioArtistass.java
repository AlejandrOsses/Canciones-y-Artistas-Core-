package com.alejandro.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alejandro.modelos.Artista;

@Repository
public interface RepositorioArtistass extends CrudRepository<Artista, Long> {
    List<Artista> findAll();
}

