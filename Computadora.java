public class Computadora implements OnOff{

	private String modelo;
	
	public Computadora(String modelo){
		this.modelo = modelo;
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Esta encendida la computadora");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Esta apagada la computadora");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo;
	}

}
