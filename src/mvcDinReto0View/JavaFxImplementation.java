/**
This package contains the different views that can be used.(javaFX,JavaSwing and command line).
 */
package mvcDinReto0View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFx view class
 * This javaFx window displays the greeting.
 * @author Adrián & Jorge
 */
public class JavaFxImplementation extends Application implements View{

    private static String greeting;
    
    @Override
    public void start(Stage primaryStage) {
                      
        Label label = new Label();
        label.setText(greeting);
        
        
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("FxView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * View interface method implementation.
     * @param args the command line arguments
     */
    @Override
    public void showGreeting(String greeting) {   
        this.greeting=greeting;
        launch();
     
                
        
    }
    
}
