import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame
    {
        private StandartForm standartForm = new StandartForm();
        private SmallForm smallForm = new SmallForm();

        {
            setContentPane(standartForm);
            setMinimumSize(new Dimension(400, 250));

            standartForm.addActionListenerForSwitchAction(e -> switchStandart());
            smallForm.addActionListenerForSwitchAction(e -> switchSmall());

            getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                         .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, InputEvent.CTRL_DOWN_MASK, false), "switchForms");

            getRootPane().getActionMap()
                         .put("switchForms", new AbstractAction()
                             {
                                 @Override
                                 public void actionPerformed(ActionEvent e)
                                     {
                                         switchForm();
                                     }
                             });

        }

        protected void switchForm()
            {
                if(getContentPane() == standartForm)
                    switchStandart();
                else if(getContentPane() == smallForm)
                    switchSmall();
                else
                    throw new IllegalStateException();
            }

        protected void switchStandart()
            {
                Person person = standartForm.getPerson();

                smallForm.setPerson(person);
                setContentPanel(smallForm);
            }

        protected void switchSmall()
            {
                Person person = smallForm.getPerson();

                standartForm.setPerson(person);
                setContentPanel(standartForm);
            }

        protected void setContentPanel(Container container)
            {
                setContentPane(container);
                getContentPane().revalidate();
                getContentPane().repaint();
            }
    }
