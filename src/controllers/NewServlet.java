package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import javax.persistence.EntityManager;
import models.Task;
import utils.DBUtil;


/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/new")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        /*EntityManager em = DBUtil.createEntityManager();
        em.getTransaction().begin();

        Task m = new Task();

        String content = "hello";
        m.setContent(content);

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        m.setCreated_at(currentTime);
        m.setUpdated_at(currentTime);

        em.persist(m);
        em.getTransaction().commit();

        response.getWriter().append(Integer.valueOf(m.getId()).toString());

        em.close();*/
        request.setAttribute("_token", request.getSession().getId());

        request.setAttribute("task", new Task());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/tasks/new.jsp");
        rd.forward(request,  response);
    }

}
