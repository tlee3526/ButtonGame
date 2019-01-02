package sample;

import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javax.swing.*;
import java.awt.*;


public class Controller
{
    public Button buttons;
    int x = 0;
    public void Onbutton(ActionEvent clicks)
    {
        x++;
        buttons.setText("You have clicked this button " + x +" times.");

    }
}
