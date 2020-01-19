package gdut.imis.view;

import gdut.imis.entity.LiteratureStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class LitStuAddController {
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
	private TextField workField;
	@FXML
	private TextField midGradeField;
	@FXML
	private TextField finalGradeField;
	
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
		LiteratureStu ls = new LiteratureStu();
		ls.setNo(noField.getText());
		ls.setName(nameField.getText());
		ls.setDepart("��ѧϵ");
		ls.setAge(Integer.parseInt(ageField.getText()));
		String sexStr = ((RadioButton)sex.getSelectedToggle()).getText();
		ls.setSex(Sex.valueOf(sexStr));
		ls.setSpeechGradeL(Double.parseDouble(speechField.getText()));
		ls.setWork(Double.parseDouble(workField.getText()));
		ls.setMidGrade(Double.parseDouble(midGradeField.getText()));
		ls.setFinalGrade(Double.parseDouble(finalGradeField.getText()));
		new GradeService().add(ls);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}