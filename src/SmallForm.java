import javax.swing.*;
import java.awt.event.ActionListener;

public class SmallForm extends JPanel
    {
        private JPanel rootPanel;
        private JTextField fullNameTextField;
        private JLabel fullNameLabel;
        private JButton nextFormButton;

        private void createUIComponents()
            {
                // TODO: place custom component creation code here
                rootPanel = this;
            }

        public void setPerson(Person person)
            {
                fullNameTextField.setText(person.toString());
            }

        public Person getPerson()
            {
                String arrayReturn[] = fullNameTextField.getText()
                                                        .trim()
                                                        .split("\\s+");

                switch(arrayReturn.length)
                    {
                        case 0:
                            return new Person("", "", "");
                        case 1:
                            return new Person(arrayReturn[0], "", "");
                        case 2:
                            return new Person(arrayReturn[0], arrayReturn[1], "");
                        case 3:
                            return new Person(arrayReturn[0], arrayReturn[1], arrayReturn[2]);
                        default:
                            return new Person("", "", "");

                    }
            }

        public void addActionListenerForSwitchAction(ActionListener actionListener)
            {
                nextFormButton.addActionListener(actionListener);
            }
    }
