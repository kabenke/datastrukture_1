import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.*;

public class PatternCountingWithLambdas extends Application {

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

        quit.setOnAction( event  ->   System.exit( 0 )  );
                
        count.setOnAction( event -> {
                    try {
                        result.setText( "" + PatternMatcher.count( pattern.getText(), file.getText() ) );
                    }
                    catch (IOException e)
                    {
                        result.setText( "file error" );
                    }
                }
        );
                    
    }

    public static void main( String[] args ) {
        launch(args);
    }

}