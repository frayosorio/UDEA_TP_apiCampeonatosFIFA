package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;

public interface ICampeonatoRepositorio  extends JpaRepository<Campeonato, Integer> {

}
