package gdut.imis.view;



import gdut.imis.entity.ComputerStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ComStuAddController {
	@FXML
	private TextField noField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField ageField;
	@FXML
	private ToggleGroup sex;
	@FXML
	private TextField operField;
	@FXML
	private TextField writeField;
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
		ComputerStu cs = new ComputerStu();
		cs.setNo(noField.getText());
		cs.setName(nameField.getText());
		cs.setDepart("计算机系");
		cs.setAge(Integer.parseInt(ageField.getText()));
		String sexStr = ((RadioButton)sex.getSelectedToggle()).getText();
		cs.setSex(Sex.valueOf(sexStr));
		cs.setOperateGrade(Double.parseDouble(operField.getText()));
		cs.setWritingGrade(Double.parseDouble(writeField.getText()));
		cs.setMidGrade(Double.parseDouble(midGradeField.getText()));
		cs.setFinalGrade(Double.parseDouble(finalGradeField.getText()));
		new GradeService().add(cs);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}
