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

public class UsuarioDAO {

	Connection con;
	
	public boolean insert(String clave, String email, String nombre, String apellidos) {
		
		con = Conexion.getConexion();
		
		try {
		
			PreparedStatement sentenciaSQL = con.prepareStatement("insert into usuario (id, rol_id, clave, email, nombre, apellidos, baja) values(null, null, ?, ?, ?, ?, 1)");
			
			sentenciaSQL.setString(1, clave);
			sentenciaSQL.setString(2, email);
			sentenciaSQL.setString(3, nombre);
			sentenciaSQL.setString(4, apellidos);
			
			sentenciaSQL.executeUpdate();
			
			Conexion.desconectar();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	public List<Usuario> obtenerUsuarios() {
		con = Conexion.getConexion();
		
		List<Usuario> usuarios = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM usuario");
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				int id_rol = resultSet.getInt("id_rol");
				String email = resultSet.getString("email");
				String clave = resultSet.getString("clave");
				String nombre = resultSet.getString("nombre");
				String apellidos = resultSet.getString("apellido1");
				boolean baja = resultSet.getBoolean("baja");
				
				Usuario usuario = new Usuario(id, id_rol, clave, email, nombre, apellidos, baja);
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
			
			PreparedStatement sentenciaSQL = con.prepareStatement("SELECT * FROM usuario where email = ?");
			
			sentenciaSQL.setString(1, email);
			
			ResultSet resultSet = sentenciaSQL.executeQuery();
			
			while (resultSet.next()) {
				
				usuario.setId(resultSet.getInt("id"));
				usuario.setId_rol(resultSet.getInt("id_rol"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setClave(resultSet.getString("clave"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setApellidos(resultSet.getString("apellidos"));
				usuario.setBaja(resultSet.getBoolean("baja"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public Usuario validarUsuario(String nombre, String clave) {
		
		con = Conexion.getConexion();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("SELECT * FROM usuario where email = ? AND clave = ?");
			
			sentenciaSQL.setString(1, nombre);
			sentenciaSQL.setString(2, clave);
			
			ResultSet resultSet = sentenciaSQL.executeQuery();
			
			if(resultSet.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setId(resultSet.getInt("id"));
				usuario.setId_rol(resultSet.getInt("id_rol"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setClave(resultSet.getString("clave"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setApellidos(resultSet.getString("apellidos"));
				usuario.setBaja(resultSet.getBoolean("baja"));
				
				return usuario;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
