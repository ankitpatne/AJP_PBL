import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements MouseListener {
    TextField num1, num2;
    Label addLabel, subLabel, mulLabel, divLabel, n1label, n2label, instructionLabel, instructionLabel2;
    Button calcButton;

    public App() {
        
        num1 = new TextField(10);
        num2 = new TextField(10);
        addLabel = new Label("Addition Result: 0");
        subLabel = new Label("Subtraction Result: 0");
        mulLabel = new Label("Multiplication Result: 0");
        divLabel = new Label("Division Result: 0");
        calcButton = new Button("Calculate");
        n1label = new Label("Number 1");
        n2label = new Label("Number 2");
        // instructionLabel = new Label("Enter two numbers and click calculate");
        instructionLabel2 = new Label("Enter button area to perform division." + "\n" + " Exit button area for multiplication. \n Keep the button pressed for subtration. \n Release button for Addition.");

        // setbounds
        n1label.setBounds(50, 50, 100, 20);
        num1.setBounds(150, 50, 100, 20);
        n2label.setBounds(50, 100, 100, 20);
        num2.setBounds(150, 100, 100, 20);
        addLabel.setBounds(20, 150, 400, 20);
        subLabel.setBounds(20, 200, 400, 20);
        mulLabel.setBounds(20, 250, 400, 20);
        divLabel.setBounds(20, 300, 400, 20);
        calcButton.setBounds(20, 350, 100, 20);
        // instructionLabel.setBounds(20, 400, 300, 20);
        instructionLabel2.setBounds(20, 370, 800, 100);
        instructionLabel2.setBounds(20, 370, 800, 100);
        
        add(num1);
        add(num2);
        add(addLabel);
        add(subLabel);
        add(mulLabel);
        add(divLabel);
        add(calcButton);
        add(n1label);
        add(n2label);
        // add(instructionLabel);
        add(instructionLabel2);
        
        calcButton.addMouseListener(this);
        
        setLayout(null);
        setSize(900, 500);
        setVisible(true);
        setFont(new Font("Arial", Font.BOLD, 12));
        // setBackground(Color.PINK);
        // setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent e){
        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            addLabel.setText("Addition Result: " + (number1 + number2));
        } catch (Exception ex) {
            addLabel.setText("Addition Result: Invalid input");
        }
    }

    public void mouseExited(MouseEvent e) {
        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            mulLabel.setText("Multiplication Result: " + (number1 * number2));
        } catch (Exception ex) {
            mulLabel.setText("Multiplication Result: Invalid input");
        }
    }

    public void mousePressed(MouseEvent e) {
        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            subLabel.setText("Subtraction Result: " + (number1 - number2));
        } catch (Exception ex) {
            subLabel.setText("Subtraction Result: Invalid input");
        }
    }

    public void mouseEntered(MouseEvent e) {
        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            divLabel.setText("Division Result: " + (number1 / number2));
        } catch (Exception ex) {
            divLabel.setText("Division Result: Invalid input");
        }
    }

    public void mouseReleased(MouseEvent e) {}

    // window closing event
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}