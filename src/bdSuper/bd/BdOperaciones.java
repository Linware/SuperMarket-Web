package bdSuper.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import bdSuper.bd.BdBase;
import java.sql.*;

//import bdLibreria.beans.Libro;
//import bdLibreria.beans.Usuario;

public class BdOperaciones extends BdBase{
	
	public BdOperaciones() {
		super();
	}

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select usuario,contrasenya from usuarios where usuario='" + user + "' and contrasenya='"
					+ password + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			correcto = rs.next();
			rs.close();
			stmt.close();
			/*
			 * PreparedStatement preparado=conexion.prepareStatement(sentenciaSql);
			 * preparado.setString(1, user); preparado.setString(2, password); ResultSet rs
			 * = preparado.executeQuery(sentenciaSql); correcto = rs.next(); rs.close();
			 * preparado.close();
			 */
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validacion no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
/*
	public boolean insertarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into cliente values ('" + usuario.getDni() + "','" + usuario.getNombre()
					+ "','" + usuario.getPrimerApellido() + "','" + usuario.getSegundoApellido() + "','"
					+ usuario.getDireccion() + "','" + usuario.getFechaDeNacimiento() + "','" + usuario.getMail()
					+ "','" + usuario.getNombreUsuario() + "','" + usuario.getPassword() + "')";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			String sentenciaSql = "select * from cliente";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Usuario usuario = null;
			while (hayMas) {
				usuario = new Usuario();
				usuario.setDni(rs.getString(1));
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(4));		
				usuario.setDireccion(rs.getString(5));
				usuario.setFechaDeNacimiento(rs.getString(6));
				usuario.setMail(rs.getString(7));
				usuario.setNombreUsuario(rs.getString(8));
				usuario.setPassword(rs.getString(9));
				usuarios.add(usuario);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return usuarios;
	}

	public List<Libro> getLibros() { // ADAPTAR A LIBRO
		List<Libro> libros = new ArrayList<Libro>();
		try {
			String sentenciaSql = "select * from libro";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIdLibro(rs.getString(1));
				libro.setTitulo(rs.getString(2));
				libro.setCantidad(rs.getInt(3));
				libro.setEditorial(rs.getString(4));
				libro.setPrecio(rs.getDouble(5));
				libro.setIdGenero(rs.getString(6));
				libro.setIdAutor(rs.getString(7));
				libros.add(libro);
				hayMas = rs.next();

			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de libros no efectuada correctamente");
		}
		return libros;
	}

	public boolean eliminarUsuario(String dni) {
		boolean correcto = true;
		try {

			String sentenciaSql = "DELETE FROM cliente WHERE dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean modificarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update cliente set " + "nombre='" + usuario.getNombre() + "', " + "primerApellido='"
					+ usuario.getPrimerApellido() + "', " + "segundoApellido=" + usuario.getSegundoApellido() + ", "
					+ "dni='" + usuario.getDni() + "', " + "direccion=" + usuario.getDireccion() + ", "
					+ "fechaDeNacimiento='" + usuario.getFechaDeNacimiento() + "', " + "e-mail=" + usuario.getMail()
					+ "nombreUsuario=" + usuario.getNombreUsuario() + "password=" + usuario.getPassword()
					+ "passwordConfirmado=" + usuario.getConfirmPassword() + " where dni = '" + usuario.getDni() + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public Usuario getUsuario(String dni) {
		Usuario usuario = null;
		try {
			String sentenciaSql = "select * from cliente " + "where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				usuario = new Usuario();
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(4));
				usuario.setDni(rs.getString(5));
				usuario.setDireccion(rs.getString(6));
				usuario.setFechaDeNacimiento(rs.getString(7));
				usuario.setMail(rs.getString(8));
				usuario.setNombreUsuario(rs.getString(9));
				usuario.setPassword(rs.getString(10));
				usuario.setConfirmPassword(rs.getString(11));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return usuario;
	}

	public Libro getLibro(String idLibro) {
		List<Libro> libros = new ArrayList<Libro>();
		Libro libro = null;
		try {
			String sentenciaSql = "select * from libro " + "where idLibro='" + idLibro + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {

				libro = new Libro();
				libro.setIdLibro(rs.getString(1));
				libro.setTitulo(rs.getString(2));
				libro.setCantidad(rs.getInt(3));
				libro.setEditorial(rs.getString(4));
				libro.setPrecio(rs.getDouble(5));
				libro.setIdGenero(rs.getString(6));
				libro.setIdAutor(rs.getString(7));
				libros.add(libro);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de libros no efectuada correctamente");
		}
		return libro;
	}
	
	public Libro getLibrosFiltrados(String titulo,String autor) {
		List<Libro> libros=new ArrayList<Libro>();
		Libro libro=null;
		try {
			PreparedStatement sentenciaSql=conexion.prepareStatement("SELECT * FROM tulibroencasa.libro AS l INNER JOIN tulibroencasa.autor AS a ON l.cod_autor =a.cod_autor WHERE l.titulo=? AND a.nom_autor=?;"); 
			//SELECT * FROM tulibroencasa.libro AS l INNER JOIN tulibroencasa.autor AS a ON l.cod_autor =a.cod_autor WHERE l.titulo='Fundacion y Tierra' AND a.nom_autor='Isaac Asimov';
			sentenciaSql.setString(1,titulo);
			sentenciaSql.setString(2,autor);
			sentenciaSql.addBatch();
			System.out.println(sentenciaSql);
			ResultSet rs = sentenciaSql.executeQuery();
			boolean hayMas = rs.next();
			if (hayMas) {

				libro = new Libro();
				libro.setIdLibro(rs.getString(1));
				libro.setTitulo(rs.getString(2));
				libro.setCantidad(rs.getInt(3));
				libro.setEditorial(rs.getString(4));
				libro.setPrecio(rs.getDouble(5));
				libro.setIdGenero(rs.getString(6));
				libro.setIdAutor(rs.getString(7));
				libros.add(libro);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de filtro no efectuada correctamente");
		}
		return libro;*/

}
