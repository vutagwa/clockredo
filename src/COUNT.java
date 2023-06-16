import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class COUNT extends JFrame {
    SimpleDateFormat timeFormat;
    JLabel timelabel;
    String time;
    COUNT(){
        timeFormat = new SimpleDateFormat("hh:mm:ss");
        timelabel = new JLabel();
        timelabel.setFont(new Font("times new roman",Font.BOLD,60));
        timelabel.setForeground(Color.blue);
        this.setSize(400,300);
        this.add(timelabel);
        this.setVisible(true);
        time();
    }
    public void time(){
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
