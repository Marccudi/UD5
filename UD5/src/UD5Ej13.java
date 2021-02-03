import javax.swing.JOptionPane;

public class UD5Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1=JOptionPane.showInputDialog("Introduce un numero:");
		String num2=JOptionPane.showInputDialog("Introduce otro numero");
		String signo=JOptionPane.showInputDialog("Introduce un signo aritmétrico");
		
		double num1f=Double.parseDouble(num1);
		double num2f=Double.parseDouble(num2);
		
		switch (signo) {
		case "+":
			JOptionPane.showMessageDialog(null, "El resultado de la suma es: "
		+(num1f+num2f));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "El resultado de la resta es: "
		+(num1f-num2f));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion"+
		" es: " + (num1f-num2f));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "El resultado de la division es: "+
		(num1f-num2f));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, "El resultado del exponente es: "+
		(Math.pow(num1f, num2f)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "El modulo de la division es: "+
		(num1f % num2f));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Signo equivocado");
			break;
		}

	}

}
