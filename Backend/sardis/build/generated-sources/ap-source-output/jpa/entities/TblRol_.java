package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.TblUsuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-19T21:55:39")
@StaticMetamodel(TblRol.class)
public class TblRol_ { 

    public static volatile SingularAttribute<TblRol, Integer> idRol;
    public static volatile CollectionAttribute<TblRol, TblUsuarios> tblUsuariosCollection;
    public static volatile SingularAttribute<TblRol, String> rol;

}