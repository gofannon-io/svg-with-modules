package io.gofannon.swm;

import de.codecentric.centerdevice.javafxsvg.SvgImageLoaderFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {


        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        //Image image = new Image("/images/bull-logo.png");
        Image image = new Image("/images/bull-logo.svg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(300);
        imageView.setFitWidth(300);

        VBox vbox = new VBox();
        vbox.getChildren().add(l);
        vbox.getChildren().add(imageView);

        Scene scene = new Scene(new StackPane(vbox), 640, 480);
        stage.setTitle("Hello !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        SvgImageLoaderFactory.install();
        launch();
    }
}