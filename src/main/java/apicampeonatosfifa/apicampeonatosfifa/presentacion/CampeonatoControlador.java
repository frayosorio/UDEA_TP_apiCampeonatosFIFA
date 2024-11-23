package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;

@RestController
@RequestMapping("/api/campeonatos")
@CrossOrigin(origins = "http://localhost:4200/")
public class CampeonatoControlador {

    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Campeonato obtener(@PathVariable int id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Campeonato> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Campeonato agregar(@RequestBody Campeonato campeonato) {
        return servicio.agregar(campeonato);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Campeonato modificar(@RequestBody Campeonato campeonato) {
        return servicio.modificar(campeonato);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }



}
