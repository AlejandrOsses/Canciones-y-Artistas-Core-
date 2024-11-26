package com.alejandro.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandro.modelos.Artista;
import com.alejandro.repositorios.RepositorioArtistass;
import com.nicolasgarcia.repositorios.RepositorioArtistas;

@Service
public class ServicioArtistas {
	@Autowired
	private RepositorioArtistass repositorioArtistas;
	
	public ServicioArtistas(RepositorioArtistass repositorioArtistas) {
        this.repositorioArtistas = repositorioArtistas;
    }

    public List<Artista> obtenerTodosLosArtistas() {
        return repositorioArtistas.findAll();
    }

    public Artista obtenerArtistaPorId(Long id) {
        return this.repositorioArtistas.findById(id).orElse(null);
    }

    public Artista agregarArtista(Artista artista) {
        return repositorioArtistas.save(artista);
    }
}






