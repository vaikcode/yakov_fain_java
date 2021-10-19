/**
 * @author vaikcode
 *
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {

	SimpleSwingCalculator parent;

	CalculatorEngine(SimpleSwingCalculator parent){
		
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {

		JButton clickedButton = (JButton) e.getSource();
		Object src = e.getSource();

		double valueNumber1 = Double.parseDouble(parent.number1Field.getText()); 
		double valueNumber2 = Double.parseDouble(parent.number2Field.getText()); 
		double valueResult;
		
		if (src == parent.plusButton) {
			valueResult = valueNumber1 + valueNumber2;
			parent.resultField.setText("" + valueResult);
		} else if (src == parent.minusButton) {
			valueResult = valueNumber1 - valueNumber2;
			parent.resultField.setText("" + valueResult);
		} else if (src == parent.multiplyButton) {
			valueResult = valueNumber1 * valueNumber2;
			parent.resultField.setText("" + valueResult);
		} else if (src == parent.divideButton) {
			valueResult = valueNumber1 / valueNumber2;
			parent.resultField.setText("" + valueResult);
		}
	}
}
