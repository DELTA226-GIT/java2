// Creating JCheckBox buttons.
import java.awt.*;
import javax.swing.*;

public class dialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hai");
		JOptionPane.showConfirmDialog(null, "Baaaa, belum tidur kamu");
		JOptionPane.showInputDialog("Masukkan nama kamuu");
		JOptionPane.showOptionDialog(null, "Are you sure?" , null, 0, 0, null, args, args);
	}
}
