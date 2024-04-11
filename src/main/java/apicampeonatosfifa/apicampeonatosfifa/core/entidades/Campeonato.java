package apicampeonatosfifa.apicampeonatosfifa.core.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @Column(name = "año")
    private int año;

    @ManyToOne
    @JoinColumn(name="idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    public Campeonato() {
    }

    public Campeonato(int id, String nombre, int año, Seleccion seleccion) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.seleccion = seleccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    

}
