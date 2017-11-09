package com.qualitas.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qualitas.entities.Cliente;
import com.qualitas.service.Service;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Service service;

    /**
     * Default constructor. 
     */
    public Servlet() {
    	service=new Service();// Se crea instancia al cargar el servlet
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 List<Cliente> clientes = service.getClientes();
		 
		 HttpSession session=request.getSession(true);
		 
		 //Almacena Clientes en la sesion lo que me regreso el Service
		 session.setAttribute("clientes", clientes);
		 
		 String nextJSP ="/index.jsp";		 
		 RequestDispatcher dispatcher= getServletContext().getRequestDispatcher(nextJSP);
		 dispatcher.forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
