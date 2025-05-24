
package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterrUser extends HttpServlet {
static int count=0;
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           Connection con = null;
           PreparedStatement pmt = null;
           String n = request.getParameter("name");
           String em = request.getParameter("mail");
           String p = request.getParameter("pass");
           String id = n.charAt(0)+n.charAt(1)+"P"+count++;
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes", "root", "6755");
           String q = "INSERT INTO USERS (id, name, email, password) VALUES (?,?,?,?)";
           pmt=con.prepareStatement(q);
           pmt.setString(1, id);
           pmt.setString(2, n);
           pmt.setString(3,em);
           pmt.setString(4,p);
           pmt.executeUpdate();
           
          response.sendRedirect("/eNotes/myjsp/login.jsp");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(RegisterrUser.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(RegisterrUser.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

}