
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntityToolBar extends JToolBar
                           implements ActionListener {

    public EntityToolBar()
    {
        super("Entity Selector");
        JLabel label = new JLabel("Entities: ");

        // User schema classes pulled from Objectivity
        String[] entityStrings = {"EntityA", "EntityB", "EntityC"};

        JComboBox entityList = new JComboBox(entityStrings);
        entityList.setSelectedIndex(0);
        entityList.addActionListener(this);

        // tool bar layout
        add(label);
        add(entityList);
    }

    // Listens to the combo box
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String entityName = (String)cb.getSelectedItem();
        createAttributeToolBars(entityName);
    }

    // Creates attribute tool bars
    public void createAttributeToolBars(String entityName) {
        // 1. Get schema class' attributes from Objectivity
        // 2. Create a attribute tool bar for every attribute
        // 3. Add each attribute tool bar to the parent JPanel
    }
}
