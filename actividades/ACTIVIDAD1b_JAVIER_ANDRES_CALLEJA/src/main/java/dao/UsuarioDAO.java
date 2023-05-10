package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.jasypt.util.password.StrongPasswordEncryptor;

import config.Conexion;
import model.Usuario;

public class UsuarioDAO {

	Connection con;
	
	public boolean insert(Usuario usuario) {
		
		con = Conexion.getConexion();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("insert into usuarios (email, password) values(?, ?)");
			
			sentenciaSQL.setString(1, usuario.getEmail());
			sentenciaSQL.setString(2, usuario.getPass());
			
			boolean rs = sentenciaSQL.execute();
			
			if(rs) {
				Conexion.desconectar();
				
				return true;
			}
			
			Conexion.desconectar();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	public boolean findByEmail(String email, String password) {
		
		con = Conexion.getConexion();
		
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from usuarios where email = ?");
			
			sentenciaSQL.setString(1, email);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			if(rs.next()) {
				if(encryptor.checkPassword(password, rs.getString("password"))) {
					
					Conexion.desconectar();
					
					return true;
				}
			}
			
			Conexion.desconectar();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public HashMap <Integer, Usuario> get() {
		
		con = Conexion.getConexion();
		
		HashMap <Integer, Usuario> usuarios = new HashMap<>();
		int contador = 0;
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from usuarios");
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			while(rs.next()) {
				
				Usuario usuario = new Usuario(rs.getString("email"), rs.getString("password"));
				usuarios.put(++contador, usuario);
			}
			
			Conexion.desconectar();
			
			return usuarios;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
//	
//	
//	public boolean insert(Usuario usuario) {
//		
//		if(Usuarios.size() == 0) {
//			Usuarios.put(1, usuario);
//		} else {
//			for(Entry<Integer, Usuario> entry : Usuarios.entrySet()) {
//				if(entry.getValue().getEmail().equals(usuario.getEmail())) {
//					return false;
//				}
//			}
//			
//			Usuarios.put(Usuarios.size() + 1, usuario);
//		}
//		
//		return true;
//		
//	}
//	
//	public boolean findByEmailPassword(String email, String password) {
//		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
//		
//		for(Entry<Integer, Usuario> entry : Usuarios.entrySet()) {
//			if(entry.getValue().getEmail().equals(email)) {
//				if(encryptor.checkPassword(password, entry.getValue().getPass())) {
//					return true;
//				}
//			}
//		}
//		
//		return false;
//		
//	}
//	
//	public HashMap<Integer, Usuario> get() {
//		
//		return Usuarios;
//	}
	
	
}
