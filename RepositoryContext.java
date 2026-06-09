package com.rafa.unigrades;

import com.rafa.unigrades.controller.MainController;
import com.rafa.unigrades.persistence.XmlDatabase;
import com.rafa.unigrades.repository.RepositoryContext;
import com.rafa.unigrades.service.AcademicService;
import com.rafa.unigrades.service.AuthService;
import com.rafa.unigrades.service.GradeService;
import com.rafa.unigrades.ui.LoginView;
import com.rafa.unigrades.util.AlertUtil;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Path;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            XmlDatabase xmlDatabase = new XmlDatabase(Path.of("data", "university-data.xml"));
            RepositoryContext repositoryContext = new RepositoryContext(xmlDatabase);

            AcademicService academicService = new AcademicService(repositoryContext);
            GradeService gradeService = new GradeService(repositoryContext);
            AuthService authService = new AuthService(repositoryContext);

            MainController mainController = new MainController(stage, authService, academicService, gradeService);

            LoginView loginView = new LoginView(mainController);
            Scene scene = new Scene(loginView.getRoot(), 980, 640);
            scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());

            stage.setTitle("UniGrades JavaFX - Sistema de Calificaciones");
            stage.setScene(scene);
            stage.setMinWidth(960);
            stage.setMinHeight(620);
            stage.show();
        } catch (Exception ex) {
            AlertUtil.showError("Error al iniciar la aplicación", ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
