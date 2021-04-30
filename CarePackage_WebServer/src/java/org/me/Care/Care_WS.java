/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.Care;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author James
 */
@WebService(serviceName = "Care_WS")
@Stateless()

public class Care_WS {

    public static double globalAmount = 0;
    public static String globalEmail = "";
    public static String globalProject = "";
    public static String globalMessage = "";
    public static String globalName = "";
    public static String connurl = "jdbc:mysql://localhost:3306/carepackage?useTimezone=true&serverTimezone=UTC";

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     *
     * @param project
     * @param name
     * @param email
     * @param amount
     * @param message
     * @return
     */
    @WebMethod(operationName = "saveDonate")
    public String saveDonate(
            @WebParam(name = "name") String name,
            @WebParam(name = "email") String email,
            @WebParam(name = "amount") String amount) {

        globalName = name;
        globalEmail = email;
        globalAmount = Double.parseDouble(amount);
        //   return name + " " + email + " " + amount.toString();
        return "";
    }

    @WebMethod(operationName = "donate")
    public String donate() {
        if (!globalEmail.equals(null) && !globalName.equals(null) && !globalProject.equals(null) && globalAmount != 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(connurl, "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("INSERT INTO donation (name, email, amount) values('" + globalName + "','" + globalEmail + "','" + globalAmount + "')");
                return "<div class=\"jumbotron jumbotron-fluid bg-success\">\n"
                        + "  <div class=\"container\">\n"
                        + "      <h1 class=\"text-white\">Thank you for your kind donation</h1><br>\n"
                        + "  </div>";

            } catch (Exception e) {
                //return e.toString();
                return "<div class=\"jumbotron jumbotron-fluid bg-danger\">\n"
                        + "  <div class=\"container\">\n"
                        + "      <h1 class=\"text-white\">" + e.toString() + "</h1><br>\n"
                        + "  </div>";
            }
        } else {
            return "";
        }
    }

    @WebMethod(operationName = "retrieveDonation")
    public String retrieveDonation() {
        
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connurl, "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `donation`");
            String str = "";
            while (rs.next()) {
                str += " <tr> "
                        + " <td>" + rs.getString(1) + "</td> " // ID
                        + " <td>" + rs.getString(2) + "</td> " // Contributor_Name
                        + " <td>" + rs.getString(3) + "</td> " // Email  
                        + " <td>" + rs.getString(4) + "</td> " // Amount  
                        + " </tr >";
            }
            return str;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @WebMethod(operationName = "volunteer")
    public String volunteer(
            @WebParam(name = "site") String site,
            @WebParam(name = "name") String name,
            @WebParam(name = "email") String email,
            @WebParam(name = "message") String message) {
        if (site != null && name != null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(connurl, "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("INSERT INTO `volunteer`(`site`, `name`, `email`, `message`) "
                        + "VALUES ('" + site + "','" + name + "','" + email + "','" + message + "')");
                return "<div class=\"jumbotron jumbotron-fluid bg-success\">\n"
                        + "  <div class=\"container\">\n"
                        + "      <h1 class=\"text-white\">Thank you for joining the program</h1><br>\n"
                        + "  </div>";

            } catch (Exception e) {
                //return e.toString();
                return "<div class=\"jumbotron jumbotron-fluid bg-danger\">\n"
                        + "  <div class=\"container\">\n"
                        + "      <h1 class=\"text-white\">" + e.toString() + "</h1><br>\n"
                        + "  </div>";
            }
        } else {
            // return site + name + email + message;
            return "";
        }
    }

    @WebMethod(operationName = "retrieveVolunteer")
    public String retrieveVolunteer() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connurl, "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `volunteer`");
            String str = "";
            while (rs.next()) {
                str += "<li class=\"media\">\n"
                        + "<div class=\"media-body\">\n"
                        + "<h5 class=\"mt-0 mb-1\">"+rs.getString(3)+"</h5>\n"
                        + "\"" + rs.getString(5) + "\" \n"
                        + " </div>\n"
                        + "</li>\n"
                        + "<br>";
            }
            return str;
        } catch (Exception e) {
            return e.toString();
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "purchase")
    public String purchase(
            @WebParam(name = "itemName") String itemName,
            @WebParam(name = "quantity") String quantity,
            @WebParam(name = "price") String price,
            @WebParam(name = "discount") String discount) {
        double doublePrice = Double.parseDouble(price);
        if (!itemName.equals("") && !quantity.equals("") && !price.equals("") && !discount.equals("")) {
            //if (false) {
            try {

                double intDiscount = Double.parseDouble(discount) / 100;
                double lineTotal = (Double.parseDouble(quantity) * Double.parseDouble(price)) - (Double.parseDouble(quantity) * Double.parseDouble(price) * intDiscount);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(connurl, "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("INSERT INTO purchased (item, quantity, price, discount, lineTotal) "
                        + "values('" + itemName + "','" + quantity + "','" + doublePrice + "','" + discount + "','" + lineTotal + "')");
                return "Your purchase has been successfully created";

            } catch (Exception e) {
                return e.toString();
            }
        } else {
            return itemName + " - " + quantity + " - " + price + " - " + discount;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retrievePurchase")
    public String retrievePurchase() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connurl, "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM purchased");
            String str = "";
            while (rs.next()) {
                str += " <tr> "
                        + " <td>" + rs.getString(1) + "</td> " //ID
                        + " <td>" + rs.getString(2) + "</td>" //Item Name
                        + " <td>" + rs.getString(3) + "</td> " //Quantity
                        + " <td>" + rs.getString(4) + "</td> " // Price per Unit
                        + " <td>" + rs.getString(5) + "%" + " </td> " //Discount                   
                        + " <td>" + rs.getString(6) + "</td> " // Line Total
                        + " </tr >";
            }
            return str;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @WebMethod(operationName = "rescue")
    public String rescue(
            @WebParam(name = "site_id") String site_id,
            @WebParam(name = "evacuee_name") String evacuee_name,
            @WebParam(name = "condition") String condition) {
        if (!site_id.equals("") && !evacuee_name.equals("")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(connurl, "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("INSERT INTO `evacuee`(`site_id`, `evacuee_name`, `condition`) "
                        + "VALUES ('" + site_id + "','" + evacuee_name + "','" + condition + "')");
                return "Your purchase has been successfully created";

            } catch (Exception e) {
                return e.toString();
            }
        } else {
            return site_id + " - " + evacuee_name + " - " + condition;
        }
    }

    @WebMethod(operationName = "retrieveRescue")
    public String retrieveRescue() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connurl, "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `evacuee`");
            String str = "";
            while (rs.next()) {
                str += " <tr> "
                        + " <td>" + rs.getString(1) + "</td> " // ID
                        + " <td>" + rs.getString(2) + "</td>" // Site_ID
                        + " <td>" + rs.getString(3) + "</td> " // Evacuee_Name
                        + " <td>" + rs.getString(4) + "</td> " // Condition                
                        + " <td>" + rs.getString(5) + "</td> " // Date_Rescue
                        + " </tr >";
            }
            return str;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @WebMethod(operationName = "retrievePurchaseSum")
    public String retrievePurchaseSum() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connurl, "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(lineTotal) FROM purchased");
            String sum = "";
            while (rs.next()) {
                sum = rs.getString(1);
            }
            return sum;
        } catch (Exception e) {
            return e.toString();
        }
    }

}
