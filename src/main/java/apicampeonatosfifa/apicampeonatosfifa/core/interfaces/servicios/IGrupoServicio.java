package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionesDto;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

public interface IGrupoServicio {

    public List<Grupo> listar();

    public Grupo obtener(int id);

    public List<Grupo> buscar(String nombre);

    public Grupo agregar(Grupo pais);

    public Grupo modificar(Grupo pais);

    public boolean eliminar(int id);

    public List<TablaPosicionesDto> obtenerTablaPosiciones(int idGrupo);
}
