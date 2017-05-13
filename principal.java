public class Principal {
public static void main(String args[]){
	
	System.out.println("No usamos polimorfismo");
	Auto auto = new Auto("Chevrolet");
	Computadora compu= new Computadora("MacBook Pro");
	Television tv = new Television("LG");
	
	System.out.println("EL modelo es: "+auto.toString());
	auto.apagar();
	auto.encender();
	System.out.println("EL modelo es: "+compu.toString());
	compu.apagar();
	compu.encender();
	System.out.println("EL modelo es: "+tv.toString());
	tv.apagar();
	tv.encender();
	
	
	System.out.println("Usamos polimorfismo con interfaces");
	 OnOff obj = new Auto("Nissan");
	 System.out.println("Modelo es: "+obj.toString());
	 obj.encender();
	 obj.apagar();
}
}
