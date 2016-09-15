package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;
import model.User;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static String message="";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		String id = request.getParameter("ID");

	
        String fname = request.getParameter("first_name");
        String lname = request.getParameter("last_name");
        String password = request.getParameter("passwrd");
        String accountType = request.getParameter("accountType");
        String email = request.getParameter("email");
   	 
        User user=new User(id,fname,lname,email,password,accountType);
        DataAccess da=new DataAccess();
        try {
			da.addNewUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        boolean uNCheck =checkUsername(id);
        boolean emailCheck =checkEmail(email);
        boolean passwordCheck =checkPassword(password);
       if(uNCheck && emailCheck && passwordCheck)
    	   response.sendRedirect("./signedup.html");
       else
    	   System.out.println(message);
           response.sendRedirect("./addUser.html");

        
	}
	public  boolean checkUsername(String username){
		String uN = username;
		//String message = "";
		if(uN.length()==9 && isNumeric(uN.substring(6)) || isNumeric(uN) && uN.length()==9  )
		{
			
			return true;
		}
		else
		{
			message+= "Username format incorrect (.example XXXYYY001) \n";
			return false;
		}
		
	}
	public boolean isNumeric(String s) {
	    return java.util.regex.Pattern.matches("\\d+", s);
	}
	
	public boolean checkEmail(String email)
	{
		String em = email;
		CharSequence cs1 = "@";
		if(em.contains(cs1) )
		{
			
			return true;
		}
		else
		{
			message+= "Email format incorrect, should contain @";
			return false;
		}
		
	}

	public boolean checkPassword(String password){
		String ps = password;
		//String message = "";
		boolean gotUpper = false;
		boolean gotDigit = false;
		for (int i = 0; i < ps.length(); i++){
		    char c = ps.charAt(i);
		    if(Character.isUpperCase(c))
		    {
		    	gotUpper = true;
		    }	
		    else{
		    	if(i == ps.length() - 1 && gotUpper == false)
		    		message+="Password should contain at least 1 upper case \n";
		    }
		    	
		   
		}
		for (int i = 0; i < ps.length(); i++){
		    char c = ps.charAt(i);    
		    if(Character.isDigit(c))
		    	gotDigit = true;
		    else
		    	if(i == ps.length() - 1 && gotDigit == false)
		    		message+="Password should contain at least 1 digit \n";
		    //Process char
		}
		if(gotUpper && gotDigit)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		 
		
		
	}


}
