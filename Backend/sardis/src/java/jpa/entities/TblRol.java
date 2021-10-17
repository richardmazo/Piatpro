/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author johan
 */
@Entity
@Table(name = "tbl_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblRol.findAll", query = "SELECT t FROM TblRol t")
    , @NamedQuery(name = "TblRol.findByIdRol", query = "SELECT t FROM TblRol t WHERE t.idRol = :idRol")
    , @NamedQuery(name = "TblRol.findByRol", query = "SELECT t FROM TblRol t WHERE t.rol = :rol")})
public class TblRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ROL")
    private Integer idRol;
    @Size(max = 45)
    @Column(name = "ROL")
    private String rol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRol")
    private Collection<TblUsuarios> tblUsuariosCollection;

    public TblRol() {
    }

    public TblRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlTransient
    public Collection<TblUsuarios> getTblUsuariosCollection() {
        return tblUsuariosCollection;
    }

    public void setTblUsuariosCollection(Collection<TblUsuarios> tblUsuariosCollection) {
        this.tblUsuariosCollection = tblUsuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRol)) {
            return false;
        }
        TblRol other = (TblRol) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.TblRol[ idRol=" + idRol + " ]";
    }
    
}
