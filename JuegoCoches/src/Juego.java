
public class Juego {

	public static void main(String[] args) {
		Coche c1=new Coche("Verde","Diesel", 125, 5);
		Coche c2=new Coche();
		System.out.println("El coche es " + c1.getColor());
		c1.estado();

		System.out.println("El coche 1 ha consumido " + c1.consumido(50) + " litros en 50km.");

		System.out.println("El coche 2 ha consumido " + c2.consumido(30 , 1.6) + "€ en 30km.");
	}
}