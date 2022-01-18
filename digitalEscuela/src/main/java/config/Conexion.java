package config;

import java.sql.*;

public class Conexion {
    public Connection getConection (){
        Connection conexion  = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109","Vanina","123456");
        } catch(SQLException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
        return conexion;
    }
   /* public static void main (String[] vanina) throws SQLException{
    Connection  c  = null;
    Conexion con = new Conexion();
    c = con.getConection();
    PreparedStatement ps;
    ResultSet rs;
    
    ps = c.prepareStatement("SELECT * from participantes");
    rs = ps.executeQuery();
    
    while(rs.next()){
        int id = rs.getInt("id");
        String nombres = rs.getString("nombres");
        String apellidos = rs.getString("apellidos");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");
        
        System.out.println("id: "+ id + "nombres: "+ nombres+ "apellidos "+ apellidos+ "email "+ email+ "telefono "+ telefono);
    
    }
    }
   */         
}
