// Exercise 1 - GUI
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame implements ActionListener{

    private JPanel cbox;

    public Ex1() {
        initUI();
    }

    private void initUI() {
        BoxLayout b = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(b);
        setTitle("Exercise 1 - Lab 8a");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        JRadioButton bred= new JRadioButton();
        JRadioButton bblue = new JRadioButton();
        JRadioButton bgreen = new JRadioButton();
        bred.addActionListener(this);
        bblue.addActionListener(this);
        bgreen.addActionListener(this);
        bred.setText("red");
        bblue.setText("blue");
        bgreen.setText("green");
        ButtonGroup buttons = new ButtonGroup();
        buttons.add(bred);
        buttons.add(bblue);
        buttons.add(bgreen);
        JPanel bbox = new JPanel();
        bbox.add(bred);
        bbox.add(bblue);
        bbox.add(bgreen);
        this.add(bbox);
        this.cbox = new JPanel();
        this.cbox.setBackground(Color.BLACK);
        this.add(this.cbox);
    }

    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        switch (action) {
            case "red": changeColor(Color.RED);
                        break;
            case "blue": changeColor(Color.BLUE);
                         break;
            case "green": changeColor(Color.GREEN);
                          break;
            default:
                          break;
        }
    }

    public static void main(String[] args) {
        Ex1 s = new Ex1();
        s.setVisible(true);
    }

    public void changeColor(Color bg) {
        this.cbox.setBackground(bg);
    }

}
