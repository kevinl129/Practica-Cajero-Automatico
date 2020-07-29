
package cajeroautomatico;


public class UsuarioCajero {
    
    String usuario;
    String pasword;
    int dinero;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public UsuarioCajero(String usuario, String pasword, int dinero) {
        this.usuario = usuario;
        this.pasword = pasword;
        this.dinero = dinero;
    }

 
    
    
}
