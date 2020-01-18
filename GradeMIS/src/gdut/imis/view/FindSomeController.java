package gdut.imis.view;

import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class FindSomeController {
	@FXML
	private TextField departField;
	@FXML
	private TextField lowerField;
	@FXML
	private TextField upperField;
	
	private Stage dialogStage;	//������̨
	private Student stu;
	
	
	@FXML
	private void initialize() {	//��ʼ������
		
	}

	//�Զ�������̨
	public Stage getDialogStage() {
		return dialogStage;
	}


	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private void handleOk() {
		String depart = departField.getText();
		Double lower = Double.parseDouble(lowerField.getText());
		Double upper = Double.parseDouble(upperField.getText());
		new GradeService().findSome(depart, lower, upper);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}


