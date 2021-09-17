import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.io.*;

public class CountButtonAction implements EventHandler<ActionEvent> 
{
    private TextField file; 
    private TextField pattern;
    private Label result;
    
    public CountButtonAction( TextField f, TextField p, Label r )
    {
        file = f;
        pattern = p;
        result = r;
    }
   
    public void handle(ActionEvent event) {
        try {
            result.setText( "" + PatternMatcher.count( pattern.getText(), file.getText() ) );
        }
        catch (IOException e)
        {
            result.setText( "file error" );
        }
    }
}
