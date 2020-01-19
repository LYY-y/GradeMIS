package gdut.imis.view;

import java.io.IOException;

import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainScenceController {
	@FXML
	private MenuItem addEngstu;
	@FXML
	private MenuItem AddCompStu;
	@FXML
	private MenuItem addLitStu;
	@FXML
	private MenuItem delete;
	@FXML
	private MenuItem engUpdate;
	@FXML
	private MenuItem comUpdate;
	@FXML
	private MenuItem litUpdate;
	@FXML
	private MenuItem save;
	@FXML
	private MenuItem findByNo;
	@FXML
	private MenuItem findByName;
	@FXML
	private MenuItem findSome;
	@FXML
	private MenuItem sort;
	
	//计算机系学生增添功能
	@FXML
	private void handleAddCompStu() {
		showComStuAdd();
	}
	
	private void showComStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("ComStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("计算机系信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			ComStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//英语系学生增添功能
	@FXML
	private void handleAddEngstu() {
		showEngStuAdd();
	}
	
	private void showEngStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("EngStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("英语系信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			EngStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	////文学系学生增添功能
	@FXML
	private void handleAddLitAdd() {
		showLitStuAdd();
	}
	
	private void showLitStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("LitStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("文学系信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			LitStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//删除学生信息功能
	@FXML
	private void handleDelete() {
		showDelete();
	}
	
	private void showDelete() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("Delete.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("删除信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			DeleteController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//英语系学生修改功能
	@FXML
	private void handleUpdateEngstu() {
		showEngStuUpdate();
	}
	
	private void showEngStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("EngUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("英语系学生修改信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			EngUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//计算机系学生修改功能
	@FXML
	private void handleUpdateComstu() {
		showComStuUpdate();
	}
	
	private void showComStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("ComUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("计算机系学生修改信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			ComUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//文学系学生修改功能
	@FXML
	private void handleUpdateLitstu() {
		showLitStuUpdate();
	}
	
	private void showLitStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("LitUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("文学系学生修改信息录入");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			LitUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//保存功能
	@FXML
	private void handleSave() {
		new GradeService().save();
	}
	
	//按学号查询
	@FXML
	private void handleFindByNo() {
		showFindByNo();
	}
	
	private void showFindByNo() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("FindByNo.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("按学号查询");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			FindByNoController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//按姓名查询
	@FXML
	private void handleFindByName() {
		showFindByName();
	}
	
	private void showFindByName() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("FindByName.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//设置对话框（舞台）
			dialogStage.setTitle("按姓名查询");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
			Scene scene = new Scene(page);	//设置场景，将页面放入
			dialogStage.setScene(scene);	//场景放入舞台
			
			//设置新增页面控制器
			FindByNameController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//显示对话框并等待用户操作
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//按成绩筛选
		@FXML
		private void handleFindSome() {
			showFindSome();
		}
		
		private void showFindSome() {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainScenceController.class.getResource("FindSome.fxml"));
				AnchorPane page = (AnchorPane)loader.load();
				Stage dialogStage = new Stage();	//设置对话框（舞台）
				dialogStage.setTitle("综合成绩筛选");
				dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
				Scene scene = new Scene(page);	//设置场景，将页面放入
				dialogStage.setScene(scene);	//场景放入舞台
				
				//设置新增页面控制器
				FindSomeController controller = loader.getController();
				controller.setDialogStage(dialogStage);
				//显示对话框并等待用户操作
				dialogStage.showAndWait();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//按系排名
		@FXML
		private void handleSort() {
			showSort();
		}
		
		private void showSort() {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainScenceController.class.getResource("Sort.fxml"));
				AnchorPane page = (AnchorPane)loader.load();
				Stage dialogStage = new Stage();	//设置对话框（舞台）
				dialogStage.setTitle("系排名");
				dialogStage.initModality(Modality.WINDOW_MODAL);	//窗体初始化
				Scene scene = new Scene(page);	//设置场景，将页面放入
				dialogStage.setScene(scene);	//场景放入舞台
				
				SortController controller = loader.getController();
				controller.setDialogStage(dialogStage);
				//显示对话框并等待用户操作
				dialogStage.showAndWait();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
	
}
