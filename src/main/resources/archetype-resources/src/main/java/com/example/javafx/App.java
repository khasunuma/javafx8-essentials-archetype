package com.example.javafx;

import com.example.javafx.main.MainView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The entry point of your JavaFX application.
 * 
 * @author k.hasunuma
 * @see http://afterburner.adam-bien.com/
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // create View instance provide Dependency Injection and etc.
        // In this application, the base window is named 'Main'.
        // So the actual View class name is 'MainView'
        MainView mainView = new MainView();

        // Setting Scene and Stage based on standard procedures.
        // This section is based on standard JavaFX application development.
        Scene scene = new Scene(mainView.getView());

        stage.setScene(scene);
        stage.show();
    }

    /**
     * The entry point of the application. When to run the application,
     * {@linkplain #main} method will be called at first.
     * 
     * @param args
     *            list of command-line arguments, this sample doesn't use.
     */
    public static void main(String[] args) {
        launch(args);
    }

}
