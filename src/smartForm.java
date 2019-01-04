import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class smartForm
    {
        private JTextField fullNameField;
        private JPanel rootPanel;
        private JButton changeFormButton;
        private JLabel fullNameLabel;

        public smartForm()
            {
                changeFormButton.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {

                            }
                    });
            }

        public JPanel getRootPanel()
            {
                return rootPanel;
            }

    }
