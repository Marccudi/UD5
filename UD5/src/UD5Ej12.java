import javax.swing.JOptionPane;

public class UD5Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contrasenya="marc";
		
		int intento=1, maximo=3;
		
		while (intento<=maximo) {
			String passTry=JOptionPane.showInputDialog("Introduce tu " +
			"contrase�a:");
			if (passTry.equals(contrasenya)) {
				JOptionPane.showMessageDialog(null, "Contrase�a correcta");
				intento=4;
			}else{
				JOptionPane.showMessageDialog(null, "Contrase�a incorrecta (" +
			intento + "/" + maximo + ")");
			}
			intento++;
		}
	}

}
