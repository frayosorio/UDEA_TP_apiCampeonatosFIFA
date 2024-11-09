package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionesDto;

@RestController
@RequestMapping("/api/grupos")
public class GrupoControlador {

    @Autowired
    private IGrupoServicio servicio;

    @RequestMapping(value = "/posiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicionesDto> obtenerTablaPosiciones(@PathVariable int id) {
        return servicio.obtenerTablaPosiciones(id);
    }

}
