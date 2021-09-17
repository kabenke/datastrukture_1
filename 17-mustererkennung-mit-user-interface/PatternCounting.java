import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PatternCounting extends Application {
    
    public void start(Stage primaryStage) {
        
        FlowPane pane = new FlowPane();
        pane.setHgap( 10 );
        pane.setVgap( 10 );
        
        pane.getChildren().add( new Label( "pattern: "));
        TextField pattern = new TextField();
        pane.getChildren().add( pattern ); 
        
        pane.getChildren().add( new Label( "file: "));
        TextField file = new TextField();
        pane.getChildren().add( file );
        
        Button count = new Button();
        count.setText( "count" );
        pane.getChildren().add( count );
        
        pane.getChildren().add( new Label( "result: ") );
        Label result = new Label();
        pane.getChildren().add( result );
        
        Button quit = new Button();
        quit.setText( "quit" );
        pane.getChildren().add( quit );
 
        primaryStage.setTitle("Pattern Matching");
        primaryStage.setScene( new Scene( pane, 220, 100 ) );
        primaryStage.show();
        
        count.setOnAction( new CountButtonAction( file, pattern, result ) );
        quit.setOnAction( new QuitButtonAction() );
    }

    public static void main( String[] args ) {
        launch(args);
    }
    
}
