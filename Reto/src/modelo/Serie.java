/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rarui
 */
@Entity
@Table(name = "serie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serie.findAll", query = "SELECT s FROM Serie s")
    , @NamedQuery(name = "Serie.findByIdSerie", query = "SELECT s FROM Serie s WHERE s.idSerie = :idSerie")
    , @NamedQuery(name = "Serie.findByNombre", query = "SELECT s FROM Serie s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Serie.findByTemporadas", query = "SELECT s FROM Serie s WHERE s.temporadas = :temporadas")
    , @NamedQuery(name = "Serie.findByEpisodios", query = "SELECT s FROM Serie s WHERE s.episodios = :episodios")})
public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSerie")
    private Integer idSerie;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "temporadas")
    private int temporadas;
    @Basic(optional = false)
    @Column(name = "episodios")
    private int episodios;

    public Serie() {
    }

    public Serie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public Serie(Integer idSerie, String nombre, int temporadas, int episodios) {
        this.idSerie = idSerie;
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSerie != null ? idSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.idSerie == null && other.idSerie != null) || (this.idSerie != null && !this.idSerie.equals(other.idSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Serie[ idSerie=" + idSerie + " ]";
    }
    
}
