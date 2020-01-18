package gdut.imis.view;

import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class EngStuAddController {
	@FXML
	private TextField noField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField ageField;
	@FXML
	private ToggleGroup sex;
	@FXML
	private TextField speechField;
	@FXML
	private TextField midGradeField;
	@FXML
	private TextField finalGradeField;
	
	private Stage dialogStage;	//声明舞台
	private Student stu;
	
	
	@FXML
	private void initialize() {	//初始化方法
		
	}

	//自动生成舞台
	public Stage getDialogStage() {
		return dialogStage;
	}


	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private void handleOk() {
		EnglishStu es = new EnglishStu();
		es.setNo(noField.getText());
		es.setName(nameField.getText());
		es.setDepart("英语系");
		es.setAge(Integer.parseInt(ageField.getText()));
		String sexStr = ((RadioButton)sex.getSelectedToggle()).getText();
		es.setSex(Sex.valueOf(sexStr));
		es.setSpeechGrade(Double.parseDouble(speechField.getText()));
		es.setMidGrade(Double.parseDouble(midGradeField.getText()));
		es.setFinalGrade(Double.parseDouble(finalGradeField.getText()));
		new GradeService().add(es);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}
