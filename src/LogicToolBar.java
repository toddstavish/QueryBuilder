import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicToolBar extends JToolBar {

    String[] conjunctionStrings = {"Any", "All", "None"};
    String[] booleanStrings = {"of the following are true", "of the following are false"};
    JComboBox conjunctionList;
    JComboBox booleanList;

    public LogicToolBar()
    {
        super("Conjunction Selector");

        conjunctionList = new JComboBox(conjunctionStrings);
        booleanList = new JComboBox(booleanStrings);

        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("This should add another logic bar to the parent JPanel");
             }
        });

        JButton removeButton = new JButton("-");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("This should remove *this* logic bar from the parent JPanel");
             }
        });

        // Toolbar layout
        add(conjunctionList);
        add(booleanList);
        addSeparator();
        add(addButton);
        // There should be some logic here to check if this is the only logic bar
        // if so it should not offer the remove button
        add(removeButton);

    }

    // Tells conjunction setting
    public String getConjunctionSetting() {
        return (String)conjunctionList.getSelectedItem();
    }

    // Tells boolean setting
    public String getBooleanSetting() {
        return (String)booleanList.getSelectedItem();
    }
}
