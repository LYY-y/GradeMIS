package gdut.imis.show;

import java.util.ArrayList;

import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Sex;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainScenceController {
	@FXML
	private TextField departField;
	private ObservableList<Student> sortList = FXCollections.observableArrayList();
	private Stage dialogStage;
	
	public Stage getDialogStage() {
		return dialogStage;
	}
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private void handleOk() {
		String depart = departField.getText();
		sortList=(ObservableList<Student>) new GradeService().sortByGrade(depart);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	public ObservableList<Student> getStudentData() {
        return sortList;
    }
}
