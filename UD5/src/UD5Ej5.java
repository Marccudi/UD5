import javax.swing.JOptionPane;

public class UD5Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		
		if (Double.parseDouble(numero)%2==0) {
			JOptionPane.showMessageDialog(null, numero + " es divisible entre 2 ");
		}else {
			JOptionPane.showMessageDialog(null, numero + " no es divisible entre 2 ");
		}
		

	}

}
