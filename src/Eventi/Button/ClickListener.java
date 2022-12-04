package Eventi.Button;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I was clicked");
    }

}
