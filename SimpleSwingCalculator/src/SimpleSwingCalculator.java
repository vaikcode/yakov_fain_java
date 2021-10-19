/**
 * @author vaikcode
 *
 */

import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleSwingCalculator {

	JLabel number1Label = new JLabel("Number 1:");
	JTextField number1Field = new JTextField(10);
	JLabel number2Label = new JLabel("Number 2:");
	JTextField number2Field = new JTextField(10);
	JLabel resultLabel = new JLabel("Result:");
	JTextField resultField = new JTextField(10);
	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");
	JButton multiplyButton = new JButton("*");
	JButton divideButton = new JButton("/");
	JPanel windowContent = new JPanel();
	
	SimpleSwingCalculator() {
	
		FlowLayout fl = new FlowLayout ();
		
		windowContent.setLayout(fl);
		windowContent.add(number1Label);
		windowContent.add(number1Field);
		windowContent.add(number2Label);
		windowContent.add(number2Field);
		windowContent.add(resultLabel);
		windowContent.add(resultField);
		windowContent.add(plusButton);
		windowContent.add(minusButton);
		windowContent.add(multiplyButton);
		windowContent.add(divideButton);
		
		JFrame frame = new JFrame("My Simlpe Swing Calculator");
		frame.setContentPane(windowContent);
		
		CalculatorEngine calcEngine = new CalculatorEngine(this);

		plusButton.addActionListener(calcEngine);
		minusButton.addActionListener(calcEngine);
		multiplyButton.addActionListener(calcEngine);
		divideButton.addActionListener(calcEngine);
		
		frame.setSize(400,100);
		frame.setVisible(true);		
	}

	public static void main(String[] args) {

		SimpleSwingCalculator calc = new SimpleSwingCalculator();
		
	}
}
