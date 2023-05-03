package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.entity.Recurso;
import ar.edu.utn.frvm.sistemas.daw2023.service.IRecursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recursos/")
public class RecursoController {

    private final IRecursoService recursoService;

    public RecursoController(IRecursoService recursoService){
        this.recursoService = recursoService;
    }

    @GetMapping("/{id}")
    public Recurso getRecursoById(@PathVariable Long id){
        return this.recursoService.getRecursoById(id);
    }
}
