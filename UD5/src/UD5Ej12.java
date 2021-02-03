import javax.swing.JOptionPane;

public class UD5Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contrasenya="marc";
		
		int intento=1, maximo=3;
		
		while (intento<=maximo) {
			String passTry=JOptionPane.showInputDialog("Introduce tu " +
			"contraseña:");
			if (passTry.equals(contrasenya)) {
				JOptionPane.showMessageDialog(null, "Contraseña correcta");
				intento=4;
			}else{
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta (" +
			intento + "/" + maximo + ")");
			}
			intento++;
		}
	}

}
