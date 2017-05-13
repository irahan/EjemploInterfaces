

public class Auto implements OnOff{

	private String modelo;
	
	public Auto(String modelo){
		this.modelo = modelo;
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Esta encendido el Auto");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Esta apagado el Auto");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo;
	}
