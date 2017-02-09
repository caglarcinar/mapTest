

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.json.*;
/**
 * Servlet implementation class getMarkers
 */
@WebServlet(name = "Markers", urlPatterns = { "/markers" })
public class getMarkers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMarkers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Random rand = new Random();		
		double randD = rand.nextDouble();
		
//		double lat = (randD * 180) - 90;
//		randD = rand.nextDouble();
//		double lng = (randD * 360) - 180;
		
		double orLat = 41.9741625;
		double orLng = -87.9073214;
		int range = Integer.valueOf(request.getParameter("radius"));
		
		System.out.println(range);
		
		//TODO database query for points in that range
		
//		double desLat = (rand.nextDouble() * 20) - 10 + lat;
//		double desLng = (rand.nextDouble() * 40) - 20 + lng;
		
		
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		response.getWriter().print(
				Json.createArrayBuilder()
			     .add(
		    		 Json.createObjectBuilder()
			    		 .add("lat", orLat)
			    		 .add("lng", orLng))
				.build());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
