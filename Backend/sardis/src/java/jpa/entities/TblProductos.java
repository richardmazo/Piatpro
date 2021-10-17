/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johan
 */
@Entity
@Table(name = "tbl_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProductos.findAll", query = "SELECT t FROM TblProductos t")
    , @NamedQuery(name = "TblProductos.findByIdProducto", query = "SELECT t FROM TblProductos t WHERE t.idProducto = :idProducto")
    , @NamedQuery(name = "TblProductos.findByTitulo", query = "SELECT t FROM TblProductos t WHERE t.titulo = :titulo")
    , @NamedQuery(name = "TblProductos.findByReferencia", query = "SELECT t FROM TblProductos t WHERE t.referencia = :referencia")
    , @NamedQuery(name = "TblProductos.findByTalla", query = "SELECT t FROM TblProductos t WHERE t.talla = :talla")
    , @NamedQuery(name = "TblProductos.findByColor", query = "SELECT t FROM TblProductos t WHERE t.color = :color")
    , @NamedQuery(name = "TblProductos.findByStock", query = "SELECT t FROM TblProductos t WHERE t.stock = :stock")
    , @NamedQuery(name = "TblProductos.findByDescripcion", query = "SELECT t FROM TblProductos t WHERE t.descripcion = :descripcion")})
public class TblProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;
    @Size(max = 100)
    @Column(name = "TITULO")
    private String titulo;
    @Size(max = 100)
    @Column(name = "REFERENCIA")
    private String referencia;
    @Size(max = 10)
    @Column(name = "TALLA")
    private String talla;
    @Size(max = 50)
    @Column(name = "COLOR")
    private String color;
    @Column(name = "STOCK")
    private Integer stock;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public TblProductos() {
    }

    public TblProductos(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProductos)) {
            return false;
        }
        TblProductos other = (TblProductos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.TblProductos[ idProducto=" + idProducto + " ]";
    }
    
}
