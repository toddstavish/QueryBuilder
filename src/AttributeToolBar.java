import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttributeToolBar extends JToolBar {

    String[] operatorStrings = {"==","!=",">",">=","<","<="}; // operators are based on type
                                                              // these are just for numerics
                                                              // need string operators, etc

    public AttributeToolBar()
    {
        super("Attribute Selector");

        // This should actually be a typed object that could be inspected, not strings
        // maybe passed in as a constructor param
        String[] attributeStrings = {"attribute1", "attribute2", "attribute3"};

        JComboBox attributeList = new JComboBox(attributeStrings);
        JComboBox operatorList = new JComboBox(operatorStrings);

        JTextField value = new JTextField("<value>");

        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("This should add another attribute bar to the parent JPanel");
             }
        });

        JButton removeButton = new JButton("-");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("This should remove *this* attribute bar from the parent JPanel");
             }
        });

        // Toolbar layout
        add(attributeList);
        add(operatorList);
        addSeparator();
        add(value);
        addSeparator();
        add(addButton);
        // There should be some logic here to check if this is the only attribute bar
        // if so it should not offer the remove button
        add(removeButton);

    }


}
