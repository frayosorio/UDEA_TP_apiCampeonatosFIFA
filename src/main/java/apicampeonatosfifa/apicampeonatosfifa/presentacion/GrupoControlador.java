package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.DTOs.TablaPosicionesDto;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;

import java.util.List;

@RestController
@RequestMapping("api/grupos")
public class GrupoControlador {

    private IGrupoServicio servicio;

    public GrupoControlador(IGrupoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/tablaposiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicionesDto> obtener(@PathVariable int id) {
        return servicio.getTablaPosiciones(id);
    }

}
