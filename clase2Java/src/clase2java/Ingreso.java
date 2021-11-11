
package clase2java;

public class Ingreso {
    private  String usuario,pass;





    public String getUsuario() {
        return usuario;
    }
private String miUsuario ="Luis";
private String  mipass = "123456";
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
        public boolean Validar(){
        return miUsuario.equals(this.usuario) && mipass.equals(this.pass);
        
        }    
}