package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.bar.model.Model;
import it.polito.tdp.bar.model.Statistiche;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {

	Model model;
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="simulaBtn"
    private Button simulaBtn; // Value injected by FXMLLoader

    @FXML // fx:id="txtArea"
    private TextArea txtArea; // Value injected by FXMLLoader

    @FXML
    void doSimula(ActionEvent event) {
    txtArea.clear();
    model.simula();
    Statistiche statistiche= model.getStatistiche();
    txtArea.appendText("Numero clienti arrivati: "+statistiche.getNumero_totale_clienti()+"\n");
    txtArea.appendText("Numero soddisfatti: "+statistiche.getNumero_clienti_soddisfatti()+"\n");
    txtArea.appendText("Numero insoddisfatti: "+statistiche.getNumero_clienti_insoddisfatti()+"\n");
    	
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert simulaBtn != null : "fx:id=\"simulaBtn\" was not injected: check your FXML file 'Untitled'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Untitled'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
    
}
