package modelo;

public class Hora {
	
	//Atributos

	private int hora;
	private int minutos;
	private int segundos;
	
	//Métodos
	
	//1. Método constructor sin parámetros que inicialice la Hora a medianoche.(00:00:00)
	
	public Hora() {
		this.hora=0;
		this.minutos=0;
		this.segundos=0;
		
	}
	/**
	 2.Método constructor con parámetros (hora,minutos y segundos) que establezca la hora siempre que sea una hora correcta,
	 de lo contrario se establecerá la hora en 00:00:00.
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
	
	//4.Método estático y privado
	
	
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
	
	//5.Métodos getters de todos los atributos.
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	public int getSegundos() {
		return this.segundos;
	}
	
	//6.Método setHora. Usar método valida.
	
	
	public void setHora(int hora) {
		
		this.hora=hora;
	}
	

	//7.Sobreescribe el método toString para mostrar la hora en formato hh:mm:ss,utliza para ello String.format.
	
	@Override
	public String toString() {
		return String.format("Hora [hora=%s, minutos=%s, segundos=%s]", hora, minutos, segundos);
	}
	
	//8.Método aSegundos.Devolverá el número de segundos transcurridos de la hora desde la medianoche.
	
	public int aSegundos() {
		int horasASegundos=this.hora/3600;
	}
	
	/**
	9.Método deSegundos(int).Establece la hora convirtiendo de segundos a horas,minutos y segundos.
	Dividiendo por 60,60 y 24.
	*/
	int horasdeSegundos=
	public int deSegundos() {
		
	}
	
	
	
	
	//10.Método segundosEntre(Hora). Devolverá un entero con el numero de segundos existentes entre las dos horas.
	
	public int segundosEntre() {
		
	}
}
