package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog(null, "Please enter a number.");
int number = Integer.parseInt(num);
int divisor = 2;
for (int i = 0; i < number - 2; i++) {
	if (number % divisor == 0) {
		JOptionPane.showMessageDialog(null, "Your number, " + number + ", is not a prime number.");
		return;
	}
	divisor = divisor + 1;
}
JOptionPane.showMessageDialog(null, "Your number, " + number + ", is a prime number.");
	}

}
