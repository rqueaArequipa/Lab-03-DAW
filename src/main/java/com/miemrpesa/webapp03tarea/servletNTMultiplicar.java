/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miemrpesa.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 51946
 */
@WebServlet(name = "servletNTMultiplicar", urlPatterns = {"/servletNTMultiplicar"})
public class servletNTMultiplicar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\"\n"
                    + "        integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\"\n"
                    + "        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n"
                    + "    <link rel=\"stylesheet\" href=\"static/css/style.css\"/>");
            out.print("<link rel=\"stylesheet\" \n"
                    + "              href=\"webjars/bootstrap/5.1.0/css/bootstrap.min.css\" type=\"text/css\" />");
            out.println("<title>Lab - 03</title>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "    <!-- HEADER -->\n"
                    + "    <div class=\"container-header\">\n"
                    + "        <header>\n"
                    + "            <div class=\"logo\">\n"
                    + "                <a href=\"#\">QJ Developer</a>\n"
                    + "            </div>\n"
                    + "            <nav id=\"nav\">\n"
                    + "                <ul>\n"
                    + "                    <li><a href=\"servlet.html\" onclick=\"seleccionar()\"><i class=\"fa-solid fa-link\"></i> LINKS</a>\n"
                    + "                    </li>\n"
                    + "                     <li><a href=\"formTMultiplicar.html\" onclick=\"seleccionar()\"><i class=\"fa-solid fa-file\"></i> VOLVER A OBTENER</a>\n"
                    + "                    </li>\n"
                    + "                </ul>\n"
                    + "            </nav>\n"
                    + "            <div class=\"nav-responsive\" onclick=\"mostrarOcultarMenu()\">\n"
                    + "                <i class=\"fa-solid fa-bars\"></i>\n"
                    + "            </div>\n"
                    + "        </header>\n"
                    + "    </div>\n"
                    + "");
            //out.println("<body class=\"bg-secondary bg-gradient\">");
            out.println("<div class=\"bg-secondary bg-gradient\" style=\"margin-top: 80px;\">");

            out.println("<div class=\"container text-center\">");
            out.println("<div class=\"row\">");
            String numP = request.getParameter("num");
            int num = Integer.parseInt(numP);
            int num1 = 12;

            out.println("<h1 class=\"bg-secondary\" style=\"border: 1px solid rgb(130, 128, 128); border-radius: 20px;\"> TABLA DE MULTIPLICACIÓN DE 0 a " + num + "</h1>");

            for (int i = 0; i <= num; i++) {
                out.println("<div class=\"col-sm-4 bg-secondary\" style=\"border: 1px solid rgb(130, 128, 128); border-radius: 20px;\" >");
                out.println("<hr>");
                out.println("<h3> Tabla de " + i + "</h3>");

                out.println("<hr>");
                for (int j = 0; j <= num1; j++) {
                    out.print("<h5>" + i + " x " + j + " = " + (i * j) + "</h5>");
                }
                out.println("</div>");
            }
            out.println("</div>");
            out.println("</div>");

            out.println("   <footer>\n"
                    + "        <a href=\"#home\" class=\"arriba\">\n"
                    + "            <i class=\"fa-solid fa-angles-up\"></i>\n"
                    + "        </a>\n"
                    + "        <div class=\"redes\">\n"
                    + "            <a href=\"#\"><i class=\"fa-brands fa-facebook-f\"></i></a>\n"
                    + "            <a href=\"#\"><i class=\"fa-brands fa-instagram\"></i></a>\n"
                    + "            <a href=\"#\"><i class=\"fa-brands fa-github\"></i></a>\n"
                    + "            <a href=\"#\"><i class=\"fa-brands fa-discord\"></i></a>\n"
                    + "        </div>\n"
                    + "    </footer>\n"
                    + "\n"
                    + "    <script src=\"static/js/script.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
