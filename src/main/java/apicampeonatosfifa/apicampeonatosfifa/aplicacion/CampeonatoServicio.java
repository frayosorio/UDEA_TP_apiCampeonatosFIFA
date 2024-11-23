package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

    private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll(Sort.by("nombre"));
    }

    @Override
    public Campeonato obtener(int id) {
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    @Override
    public List<Campeonato> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Campeonato agregar(Campeonato campeonato) {
        campeonato.setId(0);
        return repositorio.save(campeonato);
    }

    @Override
    public Campeonato modificar(Campeonato campeonato) {
        if (repositorio.findById(campeonato.getId()).isEmpty())
            return null;
        return repositorio.save(campeonato);
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
