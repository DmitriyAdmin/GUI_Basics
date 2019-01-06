import javax.swing.*;
import java.awt.event.ActionListener;

public class StandartForm extends JPanel
    {
        private JPanel rootPanel;
        private JLabel surnameLabel;
        private JTextField surnameTextField;
        private JTextField nameTextField;
        private JTextField patronymicTextField;
        private JButton nextFormButton;
        private JLabel nameLabel;
        private JLabel patronymicLabel;


        private void createUIComponents()
            {
                // TODO: place custom component creation code here
                rootPanel = this;
            }

        public Person getPerson()
            {
                return new Person(surnameTextField.getText().trim(), nameTextField.getText().trim(), patronymicTextField.getText().trim());
            }

        public void setPerson(Person person)
            {
                surnameTextField.setText(person.getSurname());
                nameTextField.setText(person.getName());
                patronymicTextField.setText(person.getPatronymic());
            }

        public void addActionListenerForSwitchAction(ActionListener actionListener)
            {
                nextFormButton.addActionListener(actionListener);
            }
    }
