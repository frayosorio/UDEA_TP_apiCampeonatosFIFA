package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Seleccion;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;

import java.util.List;

@RestController
@RequestMapping("/api/selecciones")
public class SeleccionControlador {

    private ISeleccionServicio servicio;

    public SeleccionControlador(ISeleccionServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Seleccion> listar() {
        return servicio.listar();
    }

}
