package bdSuper.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdSuper.bd.BdBase;
import bdSuper.bd.BdOperaciones;
import bdSuper.config.Configuracion;
import bdSuper.config.GestorConfiguracion;

/**
 * Servlet implementation class SrvLogin
 */
@WebServlet("/SrvLogin")
public class SrvLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String FICHERO_CONFIGURACION = getServletConfig().getInitParameter("fichero_propiedades");
		boolean cargaCorrecta = GestorConfiguracion.cargarConfiguracion(FICHERO_CONFIGURACION);
		if (!cargaCorrecta) {
			System.out.println("Fichero de configuración no cargado correctamente");
		} else {
			BdBase.inicializarParametrosConexion(Configuracion.getInstancia());
		}
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String user= request.getParameter("user");
		String password=request.getParameter("password");
		System.out.println("***********************************************");
		System.out.println("Esto es lo que recibe el servlet");
		System.out.println(user);
		System.out.println(password);
		System.out.println("***********************************************");
		BdOperaciones bdOperaciones=new BdOperaciones();
		bdOperaciones.abrirConexion();
		boolean correcto = bdOperaciones.validarUsuario(user, password);
		bdOperaciones.cerrarConexion();
		System.out.println("Funciono el service");
		if(correcto) {
			HttpSession sesion=request.getSession(true);
			sesion.setAttribute("user", user);
			System.out.println(user);
			System.out.println(password);
			sesion.setAttribute("password",password);
			ServletContext ct=getServletContext();
			RequestDispatcher rd=ct.getRequestDispatcher("/principal.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
	}}
