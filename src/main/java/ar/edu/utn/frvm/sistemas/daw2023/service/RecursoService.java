package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.entity.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.repository.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService implements IRecursoService{

    private final RecursoRepository recursoRepository;
    public RecursoService(RecursoRepository recursoRepository){
        this.recursoRepository = recursoRepository;
    }
    @Override
    public Recurso getRecursoById(Long id) {
        return recursoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Recurso> getRecursos(){
        return recursoRepository.findAll();
    }
}
