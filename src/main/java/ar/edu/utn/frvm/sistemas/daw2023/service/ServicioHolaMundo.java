package ar.edu.utn.frvm.sistemas.daw2023.service;

import ar.edu.utn.frvm.sistemas.daw2023.service.IHolaMundoServicio;
import org.springframework.stereotype.Service;

@Service
public class ServicioHolaMundo implements IHolaMundoServicio {
    @Override
    public String saludar(){
        return "hola";
    }
    @Override
    public String despedir(){
        return "chau";
    }
}
