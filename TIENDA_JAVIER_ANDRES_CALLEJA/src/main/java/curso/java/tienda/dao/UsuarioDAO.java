package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.model.articulo;

public class UsuarioDAO {

	Connection con;
	
	public List<Usuario> obtenerUsuarios() {
		con = Conexion.getConexion();
		
		List<Usuario> usuarios = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				int id_rol = resultSet.getInt("id_rol");
				String email = resultSet.getString("email");
				String clave = resultSet.getString("clave");
				String nombre = resultSet.getString("nombre");
				String apellido1 = resultSet.getString("apellido1");
				String apellido2 = resultSet.getString("apellido2");
				String direccion = resultSet.getString("direccion");
				String provincia = resultSet.getString("provincia");
				String localidad = resultSet.getString("localidad");
				String telefono = resultSet.getString("telefono");
				String dni = resultSet.getString("dni");
				
				Usuario usuario = new Usuario(id, id_rol, clave, email, nombre, apellido1, apellido2, direccion, localidad, provincia, telefono, dni);
				usuarios.add(usuario);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}
	
	public Usuario recogerUsuarioPorEmail(String email) {
		
		con = Conexion.getConexion();
		
		Usuario usuario = new Usuario();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("SELECT * FROM usuarios where email = ?");
			
			sentenciaSQL.setString(1, email);
			
			ResultSet resultSet = sentenciaSQL.executeQuery();
			
			while (resultSet.next()) {
				
				usuario.setId(resultSet.getInt("id"));
				usuario.setId_rol(resultSet.getInt("id_rol"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setClave(resultSet.getString("clave"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setApellido1(resultSet.getString("apellido1"));
				usuario.setApellido2(resultSet.getString("apellido2"));
				usuario.setDireccion(resultSet.getString("direccion"));
				usuario.setProvincia(resultSet.getString("provincia"));
				usuario.setLocalidad(resultSet.getString("localidad"));
				usuario.setTelefono(resultSet.getString("telefono"));
				usuario.setDni(resultSet.getString("dni"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public boolean validarUsuario(String nombre, String clave) {
		
		con = Conexion.getConexion();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("SELECT * FROM usuarios where email = ? AND clave = ?");
			
			sentenciaSQL.setString(1, nombre);
			sentenciaSQL.setString(2, clave);
			
			ResultSet resultSet = sentenciaSQL.executeQuery();
			
			if(resultSet.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
