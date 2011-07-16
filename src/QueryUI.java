import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.BorderFactory;


public class QueryUI extends JPanel {

    EntityToolBar entityBar;
    LogicToolBar logicBar; // Should implement a controller that manages
                           // an array of logic bars or embed in a JPanel
                           // w/ associated attribute tool bar array
                           // add a new JPanel for every new logic bar?
    AttributeToolBar attributeBar;


    public QueryUI() {
        super(new BorderLayout());

        entityBar = new EntityToolBar();
        logicBar = new LogicToolBar();
        attributeBar = new AttributeToolBar();

        //Lay out UI
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(entityBar, BorderLayout.NORTH);
        add(logicBar, BorderLayout.CENTER);
        add(attributeBar, BorderLayout.SOUTH);
    }

    public static void main(String s[])
    {
        //Create and set up the window
        JFrame frame = new JFrame("Java Predicate GUI Mockup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane
        JComponent ui = new QueryUI();
        frame.setContentPane(ui);

        //Display the window
        frame.pack();
        frame.setVisible(true);
    }
}
