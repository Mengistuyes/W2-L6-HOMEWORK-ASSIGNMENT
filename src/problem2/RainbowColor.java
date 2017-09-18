package problem2;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RainbowColor extends JFrame implements ActionListener {
JButton red=new JButton();
JButton Orange=new JButton();
JButton Yellow=new JButton();
JButton Green=new JButton();
JButton Blue=new JButton();
JButton Indigo=new JButton();
JButton Violet=new JButton();

RainbowColor()
{
	setLayout(null);
	setTitle("Rainbow Colors");
	setBounds(100, 200, 700, 120);
	
	red.setBackground(Color.RED);
	red.setBounds(0,0,100,80);
	red.addActionListener(this);
	add(red);

	Orange.setBackground(Color.ORANGE);
	Orange.setBounds(100,0,100,80);
	add(Orange);
	
	Yellow.setBackground(Color.YELLOW);
	Yellow.setBounds(200, 0, 100, 80);
	add(Yellow);
	
	Green.setBackground(Color.GREEN);
	Green.setBounds(300,0,100,80);
	add(Green);
	Blue.setBackground(Color.BLUE);
	Blue.setBounds(400, 0, 100, 80);
	add(Blue);
	
	Indigo.setBackground(Color.decode("#4B0082"));
	Indigo.setBounds(500, 0, 100, 80);
	add(Indigo);

	Violet.setBackground(Color.decode("#8B00FF"));
	Violet.setBounds(600, 0, 100, 80);
	add(Violet);

	red.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Red signifies passion, vitality, enthusiasm and security");
			}
			});	
	Orange.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "orange is stimulating, vibrant, and flamboyant. While made up of red and yellow, it carries less aggression and fierceness than the color red due to its combination with the calming color yellow.");
			}
			});	
	Yellow.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Yellow, the color of sunshine, hope, and happiness, has conflicting associations.");
			}
			});	
	Green.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Green, the color of life, renewal, nature, and energy, is associated with meanings of growth, harmony, freshness, safety, fertility, and environment. ");
			}
			});	
	Blue.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Blue represents both the sky and the sea, and is associated with open spaces, freedom, intuition, imagination, expansiveness, inspiration, and sensitivity.");
			}
			});	
	Indigo.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Indigo symbolizes a mystical borderland of wisdom, self-mastery and spiritual realization.");
			}
			});	
	Violet.addActionListener(new
			ActionListener(){
			public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source,
			source.getText()
			+ "Violet is the color of amethyst, lavender and beautyberries. It takes its name from the violet flower.");
			}
			});	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
	public static void main(String[] args) {
		RainbowColor RbColor=new RainbowColor();
		RbColor.setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	//	red.setText("Testing");
		
	}

}
/*Red (web color) (Hex: #FF0000) (RGB: 255, 0, 0)
Orange (color wheel Orange) (Hex: #FF7F00) (RGB: 255, 127, 0)
Yellow (web color) (Hex: #FFFF00) (RGB: 255, 255, 0)
Green (X11) (Electric Green) (HTML/CSS “Lime”) (Color wheel green) (Hex: #00FF00) (RGB: 0, 255, 0)
Blue (web color) (Hex: #0000FF) (RGB: 0, 0, 255)
Indigo (Electric Indigo) (Hex: #4B0082) (RGB: 75, 0, 130)
Violet (Electric Violet) (Hex: #8B00FF) (RGB: 139, 0, 255)
*/
