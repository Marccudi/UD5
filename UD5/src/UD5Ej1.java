import javax.swing.JOptionPane;
public class UD5Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=35, num2=14;
		if (num1>num2) {
			JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
			//System.out.println(num1 + " es mayor que "+num2);
		}else if(num1<num2) {
			JOptionPane.showMessageDialog(null, num1 + " es menor que " + num2);
			//System.out.println(num1+" es menor que " + num2);
		}else {
			JOptionPane.showMessageDialog(null, num1 + " y " + num2 + " són iguales");
			//System.out.println(num1 + " y " + num2 + " són iguales");
		}
	}

}
