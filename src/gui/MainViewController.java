package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenunItemSellerAction() {
		System.out.println("onMenunItemSellerAction");
			}
	
	@FXML
	public void onMenunItemDepartmentAction() {
		System.out.println("onMenunItemDepartmentAction");
			}
	
	@FXML
	public void onMenunItemAboutAction() {
		System.out.println("onMenunItemAboutAction");
			}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	
		
	}

}
