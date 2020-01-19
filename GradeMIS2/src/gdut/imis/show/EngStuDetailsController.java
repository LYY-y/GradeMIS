package gdut.imis.show;



import gdut.imis.entity.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EngStuDetailsController {
	 @FXML
	    private TableView<Student> studentTable;
	    @FXML
	    private TableColumn<Student, String> noColumn;
	    @FXML
	    private TableColumn<Student, String> nameColumn;

	    @FXML
	    private Label noLabel;
	    @FXML
	    private Label nameLabel;
	    @FXML
	    private Label ageLabel;
	    @FXML
	    private Label sexLabel;
	    @FXML
	    private Label departLabel;
	    @FXML
	    private Label speechGradeLabel;
	    @FXML
	    private Label midGradeLabel;
	    @FXML
	    private Label finalGradeLabel;

	    
	    // Reference to the main application.
	    private MainScenceController mainScenceController;

	    /**
	     * The constructor.
	     * The constructor is called before the initialize() method.
	     */
	    public EngStuDetailsController() {
	    }

	    /**
	     * Initializes the controller class. This method is automatically called
	     * after the fxml file has been loaded.
	     */
	    @FXML
	    private void initialize() {
	    	
	        // Initialize the person table with the two columns.
	    	noColumn.setCellValueFactory(cellData -> cellData.getValue().noProperty());
	    	nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
	        
	     // Clear person details.
	        showEngStuDetails(null);	//重设个人详情

	        // Listen for selection changes and show the person details when changed.
	        studentTable.getSelectionModel().selectedItemProperty().addListener(
	                (observable, oldValue, newValue) -> showEngStuDetails(newValue));
	    }

	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(MainScenceController mainScenceController) {
	        this.mainScenceController = mainScenceController;

	        // Add observable list data to the table
	        studentTable.setItems(mainScenceController.getStudentData());
	    }
	    
	    /**
	     * Fills all text fields to show details about the person.
	     * If the specified person is null, all text fields are cleared.
	     * 
	     * @param person the person or null
	     */
	    private void showEngStuDetails(Student stu) {
	        if (stu != null) {
	            // Fill the labels with info from the person object.
	        	noLabel.setText(stu.getNo());
	        	nameLabel.setText(stu.getName());
	        	ageLabel.setText(stu.getAge());
	        	sexLabel.setText(stu.getSex());
	        	departLabel.setText(stu.getDepart());
	        	midGradeLabel.setText(Double.toString(stu.getMidGrade()));
	        	finalGradeLabel.setText(Double.toString(stu.getFinalGrade()));
	            // TODO: We need a way to convert the birthday into a String! 
	            // birthdayLabel.setText(...);
	        } else {
	            // Person is null, remove all the text.
	        	noLabel.setText("");
	        	nameLabel.setText("");
	        	ageLabel.setText("");
	        	sexLabel.setText("");
	        	departLabel.setText("");
	        	midGradeLabel.setText("");
	        	finalGradeLabel.setText("");
	        }
	    }
	    
	    /**
	     * Called when the user clicks on the delete button.
	     */
	    @FXML
	    private void handleDeletePerson() {
	    	int selectedIndex = studentTable.getSelectionModel().getSelectedIndex();
	        if (selectedIndex >= 0) {
	        	studentTable.getItems().remove(selectedIndex);
	        } 
//	        else {
//	            // Nothing selected.
//	            Dialogs.create()
//	                .title("No Selection")
//	                .masthead("No Person Selected")
//	                .message("Please select a person in the table.")
//	                .showWarning();
//	        }
	    }
	    
	    /**
	     * Called when the user clicks the new button. Opens a dialog to edit
	     * details for a new person.
	     */
//	    @FXML
//	    private void handleNewPerson() {
//	        Student tempPerson = new Student();
//	        boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
//	        if (okClicked) {
//	            mainApp.getPersonData().add(tempPerson);
//	        }
//	    }
//
//	    /**
//	     * Called when the user clicks the edit button. Opens a dialog to edit
//	     * details for the selected person.
//	     */
//	    @FXML
//	    private void handleEditPerson() {
//	        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
//	        if (selectedPerson != null) {
//	            boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
//	            if (okClicked) {
//	                showPersonDetails(selectedPerson);
//	            }
//
//	        } else {
//	            // Nothing selected.
//	            Dialogs.create()
//	                .title("No Selection")
//	                .masthead("No Person Selected")
//	                .message("Please select a person in the table.")
//	                .showWarning();
//	        }
//	    }
}
