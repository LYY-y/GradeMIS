package gdut.imis;

import java.io.IOException;

import gdut.imis.service.GradeService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	private Stage primaryStage;	//主舞台
	private AnchorPane mainScence;	//主场景
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		primaryStage.setTitle("成绩管理系统");
		initMainSence();
	}

	private void initMainSence() {
		try {
			new GradeService().init();	//初始化
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("show/MainScence.fxml"));
			mainScence=(AnchorPane)loader.load();
			
			Scene scene = new Scene(mainScence);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
