/**
 * esta clase estan los metodos 
 * y atributos del cilindro
 * @author: Martin
 * @version:1.0
 */
import javax.swing.JOptionPane;
public class Cilindro {
	private double radio;
	private double altura;
	//constructor
	public Cilindro(double r, double h){
		this.radio=r;
		this.altura=h;
		}
	//area
	public double areal(){
		return 2*Math.PI*(this.radio*this.altura);
		}
	public  double areat(){
		return 2*Math.PI*this.radio*(this.radio+this.altura);
		}
	//volumen
	public double volumen(){
		return Math.PI*Math.pow(this.radio,2)*this.altura;
		}
	public double mayor(){
		return Math.max(this.radio, this.altura);
		}
	//toString
	@Override
	public String toString(){
		return "El area Lateral es: "+areal()+" El area Total es: "+areat()+" El Volumen es: "+volumen(); 
		}
}
class TestCilindro{
	public static void main (String[]arg){
		String ra = JOptionPane.showInputDialog("Mete el radio");
		double radio = Double.parseDouble(ra);
		String al = JOptionPane.showInputDialog("Mete la altura");
		double altura = Double.parseDouble(al);
		Cilindro c=new Cilindro(radio,altura);
		System.out.println(c);
		System.out.println(c.mayor());
		JOptionPane.showMessageDialog(null, c, "Cilindro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
