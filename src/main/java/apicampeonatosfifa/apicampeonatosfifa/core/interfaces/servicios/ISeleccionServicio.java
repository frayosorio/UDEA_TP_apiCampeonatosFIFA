package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Seleccion;

public interface ISeleccionServicio {
    
    public List<Seleccion> listar();

    public Seleccion obtener(int id);

    public List<Seleccion> buscar(String nombre);

    public Seleccion agregar(Seleccion seleccion);

    public Seleccion modificar(Seleccion seleccion);

    public boolean eliminar(int id);

}
