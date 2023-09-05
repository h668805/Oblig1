package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {
	public static void main(String[] args) {
		int prosent;
		String karakter = null;
		for (int i = 1; i <= 10; i++) {
			prosent = parseInt(showInputDialog("Poengsum prøve " + i + ":"));
			switch (prosent / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
				karakter = "F";
				break;
			case 4:
				karakter = "E";
				break;
			case 5:
				karakter = "D";
				break;
			case 6:
			case 7:
				karakter = "C";
				break;
			case 8:
				karakter = "B";
				break;
			case 9:
			case 10:
				karakter = "A";
				break;
			}
			if (prosent >= 0 && prosent <= 100) {
				showMessageDialog(null, "Poengsummen " + prosent + " gir karakteren " + karakter + ".");
			} else {
				showMessageDialog(null, "Error: " + prosent + " er en ugyldig poengsum");
				i--;
			}
		}
	}
}
