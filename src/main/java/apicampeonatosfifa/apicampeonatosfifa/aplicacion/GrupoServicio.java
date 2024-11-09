package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.IGrupoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionesDto;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;
import jakarta.persistence.EntityManager;

@Service
public class GrupoServicio implements IGrupoServicio {

    @Autowired
    private EntityManager em;

    private IGrupoRepositorio repositorio;

    public GrupoServicio(IGrupoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Grupo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Grupo obtener(int id) {
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    @Override
    public List<Grupo> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Grupo agregar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Grupo modificar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<TablaPosicionesDto> obtenerTablaPosiciones(int idGrupo) {
        List<TablaPosicionesDto> tablaPosiciones=em.createNativeQuery("SELECT * FROM fobtenertablaposiciones(:idgrupotabla)", TablaPosicionesDto.class)
                                                    .setParameter("idgrupotabla", idGrupo)
                                                    .getResultList();

        return tablaPosiciones;
    }

}
