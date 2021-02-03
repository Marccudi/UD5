import javax.swing.JOptionPane;

public class UD5Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio=JOptionPane.showInputDialog("Introduce el radio del circulo");
		JOptionPane.showMessageDialog(null, "Area = " + 
		Math.PI * Math.pow(Double.parseDouble(radio), 2));


	}

}
