package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;

public interface ICampeonatoServicio {
    
    public List<Campeonato> listar();

    public Campeonato obtener(int id);

    public Campeonato agregar(Campeonato Campeonato);

    public Campeonato modificar(Campeonato Campeonato);

    public boolean eliminar(int id);
}
