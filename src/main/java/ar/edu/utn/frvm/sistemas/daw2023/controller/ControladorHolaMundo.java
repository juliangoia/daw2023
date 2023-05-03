package ar.edu.utn.frvm.sistemas.daw2023.controller;

import ar.edu.utn.frvm.sistemas.daw2023.service.IHolaMundoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHolaMundo {

    //aca le digo a Spring que esta clase va a estar relacionada con un objeto servicio, pero
    // no lo instancio yo, sino que con @autowired le digo que Spring lo va a tener que hacer.
    // y spring lo que hace es crear el ServicioHolaMundo antes.
    //@Autowired Una forma es hacerlo con el autowired, otra que es la mejor, es con el constructor como esta hecho
    private IHolaMundoServicio servicio;

    public ControladorHolaMundo(IHolaMundoServicio servicio){
        this.servicio=servicio;
    }

    //GET
    //GET a la direcion /esp sin pasar ningun parametro
    @GetMapping("/esp")
    public String hola(){
        return servicio.saludar();
    }

    //GET
    //GET a la direcion /ing sin pasar ningun parametro
    @GetMapping(value = "/ing")
    public String hello(){
        return "Hello";
    }

    //GET
    //GET a la direcion /ing usando un paramentro RequestParam
    @GetMapping(value = "/ing", params = {"name"})
    public String hello1(@RequestParam("name") String nombre){
        return "Hello " + nombre;
    }

    //GET
    //GET a la direcion /ing usando un parametro PathVariable
    @GetMapping(value = "/ing/{name}")
    public String hello2(@PathVariable("name") String nombre){
        return "Hello " + nombre;
    }

    //GET
    //GET a la direcion /ing usando un parametro PathVariable y un RequestParam
    @GetMapping(value = "/ing/{name}" , params = {"lastName"})
    public String hello3(@PathVariable("name") String nombre, @RequestParam("lastName") String apellido){
        return "Hello " + nombre + " " + apellido ;
    }

}
