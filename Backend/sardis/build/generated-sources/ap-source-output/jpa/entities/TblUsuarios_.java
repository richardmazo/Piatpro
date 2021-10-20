package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.TblRol;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-19T21:55:39")
@StaticMetamodel(TblUsuarios.class)
public class TblUsuarios_ { 

    public static volatile SingularAttribute<TblUsuarios, TblRol> idRol;
    public static volatile SingularAttribute<TblUsuarios, Integer> idUsuario;
    public static volatile SingularAttribute<TblUsuarios, String> correo;
    public static volatile SingularAttribute<TblUsuarios, String> direccion;
    public static volatile SingularAttribute<TblUsuarios, String> contraseña;

}