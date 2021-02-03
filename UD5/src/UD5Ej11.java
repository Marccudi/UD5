import javax.swing.JOptionPane;

public class UD5Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diaSemana=JOptionPane.showInputDialog("Dí un dia de la semana");
		switch (diaSemana) {
		case "Lunes":
		case "Martes":
		case "Miercoles":
		case "Jueves":
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Es dia laboral!");
			break;
		case "Sabado":
		case "Domingo":
			JOptionPane.showMessageDialog(null, "Es dia festivo!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "No has introducido un dia correcto");
			break;
		}
	}

}
