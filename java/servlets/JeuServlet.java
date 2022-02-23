package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JeuDao;
import model.Jeu;
/**
 * Servlet implementation class JeuServlet
 */
@WebServlet("/Jeu")
public class JeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	JeuDao jeuDao = new JeuDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JeuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ajoutJeu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		// Recup saisies
		String title = request.getParameter("title");
		int min_players = Integer.parseInt(request.getParameter("min_players"));
		int max_players = Integer.parseInt(request.getParameter("max_players"));
		
		// instancie un nouveau jeu
		//int id, String title, int min_players, int max_players
		Jeu jeu =new Jeu(title, min_players, max_players);
		
		jeuDao.create(jeu);
		System.out.println(jeu);
		
		doGet(request, response);
	}

}
