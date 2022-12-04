package Eventi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CountDown implements ActionListener{

    private int count;
    public CountDown (int count){
        this.count = count;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(count >= 0)
            System.out.println(count);
        count--;
    }

    public static void main(String[] args) {
        CountDown listener = new CountDown(10);
        Timer t = new Timer(1000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit?");
        System.exit(0);
    }
}
