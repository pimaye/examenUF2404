package modelo;

public class Hora {
	
	//Atributos

	private int hora;
	private int minutos;
	private int segundos;
	
	//M�todos
	
	//1. M�todo constructor sin par�metros que inicialice la Hora a medianoche.(00:00:00)
	
	public Hora() {
		this.hora=0;
		this.minutos=0;
		this.segundos=0;
		
	}
	/**
	 2.M�todo constructor con par�metros (hora,minutos y segundos) que establezca la hora siempre que sea una hora correcta,
	 de lo contrario se establecer� la hora en 00:00:00.
	 */
	
	public Hora(int hora,int minutos, int segundos) {
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	
	//3.Constructor de copia.
	
	public Hora (Hora h) {
		this.hora=h.hora;
		this.minutos=h.minutos;
		this.segundos=h.segundos;
	}
	
	//4.M�todo est�tico y privado
	
	
	for(int this.hora=0;this.hora<24;this.this.hora++) {
		for(int this.minutos=0;this.minutos<60;this.minutos++) {
			for(int this.segundos=0;this.segundos<60;this.segundos++) {
				
			}
		}
	}
	int horaCorrecta=hora;
	int minutosCorrectos=this.minutos;
	int segundosCorrectos=this.segundos;
			
	private static boolean valida() {
			
		
		if(horaCorrecta = hora ) {
		return true;
	}else{
		return false;
	}
		if (minutosCorrectos= minutos) {
			return true;
		}else {
			return false;
		}
		if(segundosCorrectos= segundos) {
			return true;
		}else {
			return false;
		}
	}
	
	//5.M�todos getters de todos los atributos.
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	public int getSegundos() {
		return this.segundos;
	}
	
	//6.M�todo setHora. Usar m�todo valida.
	
	
	public void setHora(int hora) {
		
		this.hora=hora;
	}
	

	//7.Sobreescribe el m�todo toString para mostrar la hora en formato hh:mm:ss,utliza para ello String.format.
	
	@Override
	public String toString() {
		return String.format("Hora [hora=%s, minutos=%s, segundos=%s]", hora, minutos, segundos);
	}
	
	//8.M�todo aSegundos.Devolver� el n�mero de segundos transcurridos de la hora desde la medianoche.
	
	public int aSegundos() {
		int horasASegundos=this.hora/3600;
	}
	
	/**
	9.M�todo deSegundos(int).Establece la hora convirtiendo de segundos a horas,minutos y segundos.
	Dividiendo por 60,60 y 24.
	*/
	int horasdeSegundos=
	public int deSegundos() {
		
	}
	
	
	
	
	//10.M�todo segundosEntre(Hora). Devolver� un entero con el numero de segundos existentes entre las dos horas.
	
	public int segundosEntre() {
		
	}
}
