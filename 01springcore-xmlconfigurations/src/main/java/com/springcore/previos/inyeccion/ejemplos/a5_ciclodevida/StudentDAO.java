package com.springcore.previos.inyeccion.ejemplos.a5_ciclodevida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class StudentDAO {
	
	
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection con;
	
	
	//EL NOMBRE DE LOS METODOS POR DEFECTO SON LOS INIT Y DESTROY
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("Llamando al metodo de inicializacion");
		createStudentConnection();
	}
	
	public void destroy() throws SQLException
	{
		System.out.println("Llamando al metodo de destruccion");
		closeConnection();
	}
	
	public void createStudentConnection() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//getConexion
		this.con = DriverManager.getConnection(url, user, password);
	}
	
	
	public void closeConnection() throws SQLException
	{
		con.close();
	}
	
	
	public void selectAll() throws ClassNotFoundException, SQLException
	{
			
		//execute Query
		Statement stm =  con.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from tabla1");
		
		while(rs.next())
		{
			System.out.println(rs.getString("campo1_tabla_1"));
		}	
		
		
	}
	
	
	public void deleteSingleRow() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//getConexion
		Connection con = DriverManager.getConnection(url, user, password);
		
		//execute Query
		Statement stm =  con.createStatement();
		
		stm.executeUpdate("delete from tabla1 where clave_tabla_1 = 1");
		
	
		
		con.close();
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
