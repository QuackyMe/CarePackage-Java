package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.ConnectionUtil;

/**
 *
 * @author oXCToo
 */
public class LoginController implements Initializable {

    @FXML
    private Label lblErrors;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;
    
    @FXML
    private TextField txtUsernameSignup;

    @FXML
    private TextField txtPasswordSignup;
    
    @FXML
    private TextField txtEmailSignup;

    @FXML
    private TextField txtConfPassSignup;

    @FXML
    private Button btnSignin;
    
    @FXML
    private Button btnSignup;

    /// -- 
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == btnSignin) {
            //login here
            if (logIn().equals("Success")) {
                try {

                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/OnBoard.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            }
        }
        
        else if (event.getSource() == btnSignup) {
            System.out.println("Test");
            if (signUp().equals("Success")) {
                try {

                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/OnBoard.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            }
            
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (con == null) {
            lblErrors.setTextFill(Color.TOMATO);
            lblErrors.setText("Server Error : Check");
        } else {
            lblErrors.setTextFill(Color.GREEN);
            lblErrors.setText("Server is up : Good to go");
        }
    }

    public LoginController() {
        con = ConnectionUtil.conDB();

    }

    //we gonna use string to check for status
    private String logIn() {

        String email = txtUsername.getText();
        String password = txtPassword.getText();

        //query
        String sql = "SELECT * FROM admins Where (email = ? and password = ?) or (username = ? and password = ?)";

        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                lblErrors.setTextFill(Color.TOMATO);
                lblErrors.setText("Enter Correct Username/Password");
                System.err.println("Wrong Logins --///");
                return "Error";

            } else {
                lblErrors.setTextFill(Color.GREEN);
                lblErrors.setText("Login Successful..Redirecting..");
                System.out.println("Successfull Login");
                return "Success";
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return "Exception";
        }

    }
    
    private String signUp() {
        String username = txtUsernameSignup.getText();
        String email = txtEmailSignup.getText();
        String password = txtPasswordSignup.getText();
        String confPass = txtConfPassSignup.getText();

        //query
        String sql = "INSERT INTO `admins`(`email`, `password`, `username`) VALUES (?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, username);  
            if (!password.equals(confPass)) {
                lblErrors.setTextFill(Color.TOMATO);
                lblErrors.setText("Passwords did not match");
                System.err.println("Wrong Logins --///");
                return "Error";

            } else {
                preparedStatement.executeUpdate();
                lblErrors.setTextFill(Color.GREEN);
                lblErrors.setText("Signup Successful..Redirecting..");
                System.out.println("Successfull Registration");
                return "Success";
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return "Exception";
        }

    }


}
