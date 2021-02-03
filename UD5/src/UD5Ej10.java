import javax.swing.JOptionPane;

public class UD5Ej10 {
	public static void main(String[] args) {
		double result=0;
		String numVentas=JOptionPane.showInputDialog("Introduce el" +
				" numero de ventas:");
		for (int i = 1; i <= Double.parseDouble(numVentas); i++) {
			String ventaActual=JOptionPane.showInputDialog("Introduce el" +
					" precio de la venta(€):");
			result+=Double.parseDouble(ventaActual);
		}
		JOptionPane.showMessageDialog(null, "Suma de las ventas: "+result+"€");
	}
}
