/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanjo
 */
@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "Libro.findByIdlibro", query = "SELECT l FROM Libro l WHERE l.idlibro = :idlibro"),
    @NamedQuery(name = "Libro.findByNombre", query = "SELECT l FROM Libro l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Libro.findByPrecios", query = "SELECT l FROM Libro l WHERE l.precios = :precios"),
    @NamedQuery(name = "Libro.findByEdicion", query = "SELECT l FROM Libro l WHERE l.edicion = :edicion")})
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlibro")
    private Integer idlibro;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precios")
    private BigDecimal precios;
    @Size(max = 4)
    @Column(name = "edicion")
    private String edicion;
    @JoinColumn(name = "idautor", referencedColumnName = "idautor")
    @ManyToOne
    private Autor idautor;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne
    private Categoria idcategoria;

    public Libro() {
    }

    public Libro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public Integer getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecios() {
        return precios;
    }

    public void setPrecios(BigDecimal precios) {
        this.precios = precios;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Autor getIdautor() {
        return idautor;
    }

    public void setIdautor(Autor idautor) {
        this.idautor = idautor;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlibro != null ? idlibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.idlibro == null && other.idlibro != null) || (this.idlibro != null && !this.idlibro.equals(other.idlibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.libreria.Libro[ idlibro=" + idlibro + " ]";
    }
    
}
