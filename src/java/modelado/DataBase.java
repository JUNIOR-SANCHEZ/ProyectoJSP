package modelado;
public class DataBase {
private String driver;
private String url;
private String usuario;
private String clave;

    public DataBase() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://loaclhost:3306/BaseDato";
        this.usuario = "root";
        this.clave = "";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
    

}
