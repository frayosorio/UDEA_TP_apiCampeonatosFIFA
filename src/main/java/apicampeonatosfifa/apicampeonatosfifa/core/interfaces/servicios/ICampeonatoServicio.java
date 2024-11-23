package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;

public interface ICampeonatoServicio {
    
    public List<Campeonato> listar();

    public Campeonato obtener(int id);

    public List<Campeonato> buscar(String nombre);

    public Campeonato agregar(Campeonato pais);

    public Campeonato modificar(Campeonato pais);

    public boolean eliminar(int id);
}
