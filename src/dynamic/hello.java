package dynamic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hello extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		//super.init();
		System.out.println("Initiate the Servlet..");
	}
	
	
	/*@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("In Service ..");
	}
	*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		System.out.println("Initiate the Servlet..");
	}
	
	@Override
	public void destroy() {
		//super.destroy();
	
		System.out.println("Distroying the Servlet..");
	}

	/*public static void main(String[] args) {
		
		System.out.println("hai");
	}*/

}
