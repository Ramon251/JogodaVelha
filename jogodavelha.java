
import java.awt.BorderLayout;

import javax.swing.JFrame;
public class jogodavelha extends JFrame {
	JPanel ptela = new JPanel(new GridLayout(3,3,10,10));
	JLabel Informacao = new JLabel();
	public jogodavelha() {
		configurar janela();
	}
	
	public void configurartela();{
		add(BorderLayout.CENTER,ptela);
		add(BorderLayout.NORTH,Informacao);
		
		
	}
	
	public void ConfigurarJanela() {
		setTitle("Jogo davelha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
public static void main(String[] args) {
		new jogodavelha();
	
	}
public class Bloco extends JButton{
	public Bloco () {
		setBackground(Color,WRITE);
	}
}

}
