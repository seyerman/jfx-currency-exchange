package ui;

import model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CurrencyExchangeGUI {

    @FXML
    private TextField COPExchangeValue;
    
    @FXML
    private TextField USDExchangeValue; 
    
    @FXML
    void COPExchange(ActionEvent event) {
    	COPExchangeValue.setText(String.valueOf(CurrencyExchange.USDtoCop(Double.parseDouble(USDExchangeValue.getText()))));
    }

	@FXML
    void USDExchange(ActionEvent event) {	
		System.out.println("Hola");
		System.out.println(COPExchangeValue);
		System.out.println(USDExchangeValue);
		String txt = COPExchangeValue.getText();		
		System.out.println(txt);
		
		USDExchangeValue.setText(String.valueOf((CurrencyExchange.COPtoUSD(Double.parseDouble(txt)))));
		
	}
	
}
