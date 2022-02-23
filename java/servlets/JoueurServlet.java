package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JoueurDao;
import model.Joueur;



/**
 * Servlet implementation class JoueurServlet
 */
@WebServlet("/Joueur")
public class JoueurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	JoueurDao joueurDao = new JoueurDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoueurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ajoutJoueur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recup saisies
				String email = request.getParameter("email");
				String nickname = request.getParameter("nickname");
				
				
				// instancie un nouveau joueur
				//
				Joueur joueur =new Joueur(email, nickname);
				
				joueurDao.create(joueur);
				System.out.println(joueur);
		doGet(request, response);
	}

}
