package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.DTOs.TablaPosicionesDto;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;

@Service
public class GrupoServicio implements IGrupoServicio {

    @Autowired
    public EntityManager em;

    @Override
    public List<TablaPosicionesDto> getTablaPosiciones(int id) {
        List<TablaPosicionesDto> tablaPosiciones = em
                .createNativeQuery("SELECT * FROM fObtenerTablaposiciones(:idGrupoTabla)", TablaPosicionesDto.class)
                .setParameter("idGrupoTabla", id)
                .getResultList();

        return tablaPosiciones;
    }

}
