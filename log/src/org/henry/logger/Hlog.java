package org.henry.logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hlog
 */
public class Hlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String msg ="";
		String realPath = request.getServletContext().getRealPath("/");
		File file = new File(realPath+"/sh/short_log.log");
		if(file.exists()){
			
		
			FileInputStream fis = new FileInputStream(file);
			
			 byte[] buff  =new byte[1024];
			 int len =-1;
			 StringBuffer sb = new StringBuffer();  
			
			 while((len = fis.read(buff))!=-1){
				 
				 
				 sb.append(new String(buff,0,len,"GBK"));
			 }
			
		        msg=sb.toString();
		        
		     fis.close();
		       
		}else{
			
			msg="not found log file";
		}
		response.setCharacterEncoding("GBK");
		PrintWriter writer = response.getWriter();
	
		
		
		writer.println(msg);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
