import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form
    {
        private JPanel rootPanel;
        private JLabel surnameLabel;
        private JTextField surnameField;
        private JLabel nameLabel;
        private JTextField nameField;
        private JTextField patronymicField;
        private JLabel patronymicLabel;
        private JButton changeFormButton;

        public Form()
            {
                changeFormButton.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {
                                surnameField.setText("Go");
                            }
                    });
            }

        public JPanel getRootPanel()
            {
                return rootPanel;
            }

    }
