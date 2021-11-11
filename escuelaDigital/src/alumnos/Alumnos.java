package alumnos;
public class Alumnos {
    public String nombre, apellido, email, curso;
    private String dni, telefono;
   
    
   public Alumnos(String nombre, String apellido,String email,String curso){
       this.nombre=nombre;
       this.apellido=apellido;
       this.email=email;
       this.curso=curso;
   } 
   public boolean rendirExamen(String curso, String materia, String tema, float nota){
       if(nota >=6){
       return true;
       }else return false;
       
   }
}
