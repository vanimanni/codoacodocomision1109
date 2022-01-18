package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    Connection conexion;

    public AlumnoDAO() {
        Conexion con = new Conexion();
        conexion = con.getConection();
    }

    public List<Alumno> listarAlumno() throws SQLException {
        PreparedStatement ps;
        ResultSet rs;
        List<Alumno> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT * FROM participantes");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                Alumno alumno = new Alumno(id, nombres, apellidos, email, telefono);
                lista.add(alumno);
            }
            return lista;
        } catch (SQLDataException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public Alumno mostrarAlumno(int _id) {
        PreparedStatement ps;
        ResultSet rs;
        Alumno alumno = null;
        try {
            ps = conexion.prepareStatement("SELECT id, nombres,apellidos,email,"
                    + "            telefono FROM participantes " + "Where id = ?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                alumno = new Alumno(id, nombres, apellidos, email, telefono);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            alumno = null;
        }
        return alumno;

    }

    public boolean insertarAlumno(Alumno alumno) {
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("INSERT INTO participantes(nombres,apellidos,"
                    + "email,telefono)VALUES(?,?,?,?)");

            ps.setString(1, alumno.getNombres());
            ps.setString(2, alumno.getApellidos());
            ps.setString(3, alumno.getEmail());
            ps.setString(4, alumno.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }
       public boolean actualizarAlumno(Alumno alumno){
            PreparedStatement ps;
           try {
            ps = conexion.prepareStatement("UPDATE participantes SET nombres=?, apellidos=?, email=?, telefono=,WHERE id=?");
            ps.setString(1, alumno.getNombres());
            ps.setString(2, alumno.getApellidos());
            ps.setString(3, alumno.getEmail());
            ps.setString(4, alumno.getTelefono());
            ps.setInt(5, alumno.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
       }
       public boolean eliminarAlumno (int _id){
       PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("DELET FROM participantes WHERE id=?");
            ps.setInt(1, _id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
       }
}
