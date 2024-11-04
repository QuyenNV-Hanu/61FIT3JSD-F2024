package tank90.ui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by ducnd on 24/10/2016.
 */
public class GUI extends JFrame{
    public static final int WIDTH_FRAME = 28 * 20;
    public static final int HEIGHT_FRAME = 28 * 20;
     MyPanel myPanel;

    public GUI() {
        setTitle("Game Tank");

        //set kich cho khung tranh
        setSize(WIDTH_FRAME, HEIGHT_FRAME);

        //show ra giua man hinh
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        init();


    }

    public void init() {
        myPanel = new MyPanel();
        add(myPanel);
    }


}
