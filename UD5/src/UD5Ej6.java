import javax.swing.JOptionPane;

public class UD5Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iva=0.21;
		String precio=JOptionPane.showInputDialog("Introduce el precio:");
		double precioFinal=(Double.parseDouble(precio)*iva)+Double.parseDouble(precio);
		
		JOptionPane.showMessageDialog(null,"el iva en este producto es: " 
		+ Double.parseDouble(precio)*iva);
		
		JOptionPane.showMessageDialog(null,"el precio final con iva es: " 
		+ precioFinal);


	}

}
