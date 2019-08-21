package juego;


import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Pared paredIzquierda;
	private Pared paredDerecha;
	private Pared paredSupIzquierda;
	private Pared paredSupDerecha;
	private Pared paredInfIzquierda;
	private Pared paredInfDerecha;
	private Viga vigaSuperior;
	private Viga vigaMedioIzquierda;
	private Viga vigaMedioDerecha;
	private Viga vigaMedioCentro;
	private Viga vigaInferior;
	//private Moustruo mounstruoSuperiorIzquierdo;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "La torre de los magos - Grupo Apellido1 - Apellido2 -Apellido3 - V0.01", 800, 600);
		this.paredIzquierda = new Pared(10,305,30,560);
		this.paredDerecha = new Pared(800,305,30,560);
		this.paredSupIzquierda = new Pared(150,10,350,30);
		this.paredSupDerecha = new Pared(660,10,350,30);
		this.paredInfIzquierda = new Pared(150,600,350,30);
		this.paredInfDerecha = new Pared(660,600,350,30);
		this.vigaSuperior = new Viga(400,138,500,20);
		this.vigaMedioIzquierda = new Viga(150,246,350,20);
		this.vigaMedioDerecha = new Viga(660,246,350,20);
		this.vigaMedioCentro = new Viga(400,354,300,20);
		this.vigaInferior = new Viga(400,462,500,20);
		//this.mounstruoSuperiorIzquierdo = new Mounstruo(150,482,-2);
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...
		this.paredIzquierda.dibujar(this.entorno);
		this.paredDerecha.dibujar(this.entorno);
		this.paredSupIzquierda.dibujar(this.entorno);
		this.paredSupDerecha.dibujar(this.entorno);
		this.paredInfIzquierda.dibujar(this.entorno);
		this.paredInfDerecha.dibujar(this.entorno);
		this.vigaSuperior.dibujar(this.entorno);
		this.vigaMedioIzquierda.dibujar(this.entorno);
		this.vigaMedioDerecha.dibujar(this.entorno);
		this.vigaMedioCentro.dibujar(this.entorno);
		this.vigaInferior.dibujar(this.entorno);
		//this.mounstruoSuperiorIzquierdo.dibujar(this.entorno);
		

	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
