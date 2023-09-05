package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class OppgaveO1 {
	public static void main(String[] args) {
		double bruttolonn = parseDouble(showInputDialog("Bruttolønn"));
		double sats = 0;
		if (bruttolonn > 198349) {
			sats = 0.017;
		}
		if (bruttolonn > 279149) {
			sats = 0.04;
		}
		if (bruttolonn > 642949) {
			sats = 0.135;
		}
		if (bruttolonn > 926799) {
			sats = 0.165;
		}
		if (bruttolonn > 1499999) {
			sats = 0.175;
		}
		showMessageDialog(null, "Trinnskatten for denne bruttolønnen er " + bruttolonn * sats + " kr.");
		showMessageDialog(null, "Da blir nettolønnen " + (bruttolonn - bruttolonn * sats) + " kr.");
	}
}