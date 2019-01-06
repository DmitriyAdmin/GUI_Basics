import javax.swing.*;

public class Loader
    {
        public static void main(String[] args)
            {
                MyFrame frame = new MyFrame();
                frame.setTitle("GUI Basics");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
    }
