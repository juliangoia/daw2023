package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.entity.Recurso;

import java.util.List;

public interface IRecursoService {
    public Recurso getRecursoById(Long id);
    public List<Recurso> getRecursos();
}
