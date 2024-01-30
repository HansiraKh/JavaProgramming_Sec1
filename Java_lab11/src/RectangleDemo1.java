import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("input width"));
		double lenghtInput = Double.parseDouble(JOptionPane.showInputDialog("input lenght"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		Rectangle obj1 = new Rectangle(widthInput,lenghtInput,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1.toString()+"\nArea of Rectangle = "+obj1.getArea());*/
//Input data using interface class
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("input width"));
		double lenghtInput = Double.parseDouble(JOptionPane.showInputDialog("input lenght"));
		Rectangle2 obj2 = new Rectangle2(widthInput,lenghtInput);
		JOptionPane.showMessageDialog(null, obj2.toString()+"\nArea of Rectangle = "+obj2.getArea());
	}

}
