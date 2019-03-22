package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Model;

public class SampleController {
	Model model;
    public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;
    @FXML
    void doRiempi(ActionEvent event) {
    	lbl1.setText(model.getNome());
    	lbl2.setText(model.getCognome());
    	lbl3.setText(model.getTelefono());
    }

    @FXML
    void initialize() {
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lbl2 != null : "fx:id=\"lbl2\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lbl3 != null : "fx:id=\"lbl3\" was not injected: check your FXML file 'Sample.fxml'.";
        //lbl1.setText(model.getNome());
        }
}
