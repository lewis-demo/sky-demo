package hello;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController extends AnchorPane implements Initializable {
	
	@FXML
	private TextField userId;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;
	@FXML
	private Label errorMessage;

	private FXMLLoginDemoApp application;

	public void setApp(FXMLLoginDemoApp application) {
		this.application = application;
	}
	
	public LoginController() {
		Logger.getLogger(LoginController.class.getName()).log(Level.INFO, "LoginController()");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Logger.getLogger(LoginController.class.getName()).log(Level.INFO, "LoginController.initialize()");
		
		errorMessage.setText("");
		userId.setPromptText("demo");
		password.setPromptText("demo");
	}

	public void processLogin(ActionEvent event) {
		if (application == null) {
			// We are running in isolated FXML, possibly in Scene Builder.
			// NO-OP.
			errorMessage.setText("Hello " + userId.getText());
		} else {
			if (!application.userLogging(userId.getText(), password.getText())) {
				errorMessage.setText("Username/Password is incorrect");
			}
		}
	}

}
