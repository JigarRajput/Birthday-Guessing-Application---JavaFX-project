package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class Controller implements Initializable{
	    
	    @FXML
	    private Label label;
	    
	    @FXML
	    private int total = 0;
	    @FXML
	    private CheckBox cb1;
	    @FXML
	    private CheckBox cb2;
	    @FXML
	    private CheckBox cb3;
	    @FXML
	    private CheckBox cb4;
	    @FXML
	    private CheckBox cb5;
	    @FXML
	    private void handleCB1(ActionEvent event) {
	        
	    total++;

	    }
	    
	    @FXML
	    private void handleCB2(ActionEvent event) {
	        
	    total = total + 2;

	    }

	    @FXML
	    private void handleCB3(ActionEvent event) {
	        
	    total = total + 4;

	    }

	    @FXML
	    private void handleCB4(ActionEvent event) {
	        
	    total = total + 8;
	        
	    }

	    @FXML
	    private void handleCB5(ActionEvent event) {
	        
	        total = total + 16;
	    }

	    
	    @FXML
	    private void handleGuess(ActionEvent event) {
	        String text;
	        text = String.valueOf(total);
	        label.setText("    " + text);
	       
	    }
	    
	    @FXML
	    private void handleReset(ActionEvent event) {
	    
	    	total=0;
	    	label.setText(" ");
	    	cb1.setSelected(false);
	    	cb2.setSelected(false);
	    	cb3.setSelected(false);
	    	cb4.setSelected(false);
	    	cb5.setSelected(false);
	    }

	    @Override
	    public void initialize(URL url, ResourceBundle rb) {
	        // TODO
	    }    

	}


