package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.DTOs.TablaPosicionesDto;

public interface IGrupoServicio {

    public List<TablaPosicionesDto> getTablaPosiciones(int id);

}
