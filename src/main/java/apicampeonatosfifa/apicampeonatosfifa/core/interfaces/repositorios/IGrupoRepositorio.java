package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

@Repository
public interface IGrupoRepositorio extends JpaRepository<Grupo, Integer> {

    /* 
    @Query("SELECT ")
    public List<Encuentro> obtenerEncuentros(int id);
    */
}