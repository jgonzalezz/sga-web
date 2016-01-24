package web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.jgonzo.domain.Persona;
import co.com.jgonzo.servicio.PersonaService;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet({ "/ServletControlador", "/ListarPersonas" })
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @EJB
    private PersonaService personaService;
    //Importamos el ejb de la capa de servicios o negocio

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Persona> personas = personaService.listarPersonas();
		
		request.setAttribute("personas", personas);
		
		request.getRequestDispatcher("listarPersonas.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
