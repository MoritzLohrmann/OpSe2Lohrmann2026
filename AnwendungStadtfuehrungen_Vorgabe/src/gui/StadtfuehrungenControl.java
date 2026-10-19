package gui;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

//import business.Stadtfuehrung;
import business.StadtfuehrungenModel;
import javafx.stage.Stage;

public class StadtfuehrungenControl {
	private StadtfuehrungenModel stadtfuehrungenModel;
	private StadtfuehrungenView stadtfuehrungenView;
	
	public StadtfuehrungenControl(Stage primaryStage) {
		this.stadtfuehrungenModel = new StadtfuehrungenModel();
		this.stadtfuehrungenView = new StadtfuehrungenView(primaryStage, stadtfuehrungenModel, this);
	}

	
	public void leseAusDatei(String typ) {
		try {
      		if("csv".equals(typ)){
      			stadtfuehrungenModel.leseAusDatei(typ);
      			stadtfuehrungenView.zeigeInformationsfensterAn(
      	  	   			"Das Stadtfuehrung wurde gelesen!");
      		}
       		else{
       			stadtfuehrungenView.zeigeInformationsfensterAn(
	   				"Noch nicht implementiert!");
	   		}
		}
		catch(IOException exc){
			stadtfuehrungenView.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
		catch(Exception exc){
			stadtfuehrungenView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Lesen!");
		}
		
	}
	
	
	
	
	public void schreibeStadtfuehrungenInCsvDatei(String typ) {
		try {
      		if("csv".equals(typ)){
      			stadtfuehrungenModel.schreibeStadtfuehrungenInCsvDatei();
      			stadtfuehrungenView.zeigeInformationsfensterAn(
      	  	   			"Das Stadtfuehrung wurde geschrieben!");
      		}
       		else{
       			stadtfuehrungenView.zeigeInformationsfensterAn(
	   				"Noch nicht implementiert!");
	   		}
		}
		catch(IOException exc){
			stadtfuehrungenView.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
		catch(Exception exc){
			stadtfuehrungenView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Lesen!");
		}
		
	}

	

}
