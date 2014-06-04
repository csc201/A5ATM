import javax.swing.JOptionPane;

import edu.nvcc.accounts.User;
import edu.nvcc.pads.NumberPad;

public class AtmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User david = new User("david",1234);
		NumberPad npad = new NumberPad();
		NumberPad npad1 = null;
		while(david.getPin()!=npad.getDisplayNumber()) {
			npad1 = new NumberPad();
		}	
		
		if (david.getPin()!=npad1.getDisplayNumber())
			JOptionPane.showMessageDialog(null, "Welcome " + david.getUsername());
		else {
			JOptionPane.showMessageDialog(null, "Invalid PIN!");
		}
	}

}
