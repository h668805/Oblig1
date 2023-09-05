package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Positivt heltall:"));
		int nn = 1;
		for (int i = 1; i <= n; i++) {
			nn *= i;
		}
		showMessageDialog(null, n + "! = " + nn);
	}
}