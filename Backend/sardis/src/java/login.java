
import java.sql.*;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class login {

    private String correo;
    private String password;
    private String idRol;
    private String direccion;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String autenticacion() throws ClassNotFoundException, SQLException{
        String db = "jdbc:mysql://localhost:3308/sardis";
        String usuario = "root";
        String password = "root";
        String controlador = "com.mysql.jdbc.Driver";        
        Class.forName(controlador);
        Connection con = DriverManager.getConnection(db, usuario, password);
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("select * from tbl_usuarios where CORREO='"+getCorreo()+"' && CONTRASEÑA='"+getPassword()+"' && ID_ROL='"+1+"'");
        
        if(rs.next()){
            return "Exitoso";
        }else{
            return "Fallido";
        }
    }
    
}
