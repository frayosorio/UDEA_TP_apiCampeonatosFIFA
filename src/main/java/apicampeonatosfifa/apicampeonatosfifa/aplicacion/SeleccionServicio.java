package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Seleccion;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;

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
        Optional<Seleccion> seleccionEncontrada = repositorio.findById(id);
        return seleccionEncontrada.isEmpty() ? null : seleccionEncontrada.get();
    }

    @Override
    public Seleccion agregar(Seleccion seleccion) {
        seleccion.setId(0);
        return repositorio.save(seleccion);
    }

    @Override
    public Seleccion modificar(Seleccion seleccion) {
        Optional<Seleccion> seleccionEncontrada = repositorio.findById(seleccion.getId());
        if (!seleccionEncontrada.isEmpty()) {
            return repositorio.save(seleccion);
        } else {
            return null;
        }
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

    @Override
    public List<Seleccion> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

}
