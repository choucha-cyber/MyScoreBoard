package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MatchDao;
import model.Joueur;
import model.Match;

/**
 * Servlet implementation class MatchServlet
 */
@WebServlet("/Match")
public class MatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MatchDao matchDao = new MatchDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ajoutMatch.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recup saisies
		int game_id =  Integer.parseInt(request.getParameter("game_id"));
		String start_date = request.getParameter("start-date");
		int winner_id = Integer.parseInt(request.getParameter("winner_id"));
		
		
		// instancie un nouveau joueur
		//
		Match match =new Match(game_id, start_date, winner_id);
		
		matchDao.create(match);
		System.out.println(match);
doGet(request, response);
	}

}
