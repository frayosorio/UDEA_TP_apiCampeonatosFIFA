package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Seleccion;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    private ISeleccionRepositorio repositorio;

    public SeleccionServicio(ISeleccionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Seleccion> listar() {
        return repositorio.findAll();
    }

    @Override
    public Seleccion obtener(int id) {
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    @Override
    public List<Seleccion> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Seleccion agregar(Seleccion pais) {
        pais.setId(0);
        return repositorio.save(pais);
    }

    @Override
    public Seleccion modificar(Seleccion pais) {
        if (repositorio.findById(pais.getId()).isEmpty())
            return null;
        return repositorio.save(pais);
    }

    @Override
    public boolean eliminar(int id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
