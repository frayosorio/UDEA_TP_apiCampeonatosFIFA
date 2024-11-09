package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Seleccion;

@RestController
@RequestMapping("/api/selecciones")
@CrossOrigin(origins = "http://localhost:4200/")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Seleccion> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Seleccion obtener(@PathVariable int id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Seleccion> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Seleccion agregar(@RequestBody Seleccion pais) {
        return servicio.agregar(pais);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Seleccion modificar(@RequestBody Seleccion pais) {
        return servicio.modificar(pais);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }

}
