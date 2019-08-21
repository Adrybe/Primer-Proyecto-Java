package juego;


import java.awt.Image;

import entorno.Entorno;

public class Monstruo {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int velocidad;
	private int direccion;
	private int velocidadCaida;
	private Image monstruoHaciaDerecha;
	private Image monstruoHaciaDerecha1;
	private Image monstruoHaciaIzquierda;
	private Image monstruoHaciaIzquierda1;
	private Image bolaDeNieve;
	
	Monstruo(int x, int y, int ancho, int alto, int velocidad) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.velocidad = velocidad;
		this.direccion = velocidad;
		this.velocidadCaida = 2;
		this.monstruoHaciaDerecha = entorno.Herramientas.cargarImagen("monstruoHaciaDerecha.png");
		this.monstruoHaciaDerecha1 = entorno.Herramientas.cargarImagen("monstruoHaciaDerecha1.png");
		this.monstruoHaciaIzquierda = entorno.Herramientas.cargarImagen("monstruoHaciaIzquierda.png");
		this.monstruoHaciaIzquierda1 = entorno.Herramientas.cargarImagen("monstruoHaciaIzquierda1.png");
		this.bolaDeNieve = entorno.Herramientas.cargarImagen("bolaNieve.gif");
	}

	void dibujarBolaNieve(Entorno entorno) {
		entorno.dibujarImagen(this.bolaDeNieve, this.x, this.y, 0, 0.8);
	}

	void dibujarMonstruoDerecha(Entorno entorno) {
		entorno.dibujarImagen(this.monstruoHaciaDerecha, this.x, this.y, 0, 0.3);
	}

	void dibujarMonstruoIzquierda(Entorno entorno) {
		entorno.dibujarImagen(this.monstruoHaciaIzquierda, this.x, this.y, 0, 0.3);
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		this.direccion = velocidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	void moverse() {
		this.x = this.x + this.velocidad;
	}
	
	void congelado() {
		
		this.velocidad = 0;				
	}
	
	boolean estaCongelado() {
		
		return(this.velocidad == 0);
		
	}
	boolean estaRodando() {
		
		return(this.velocidad == 8 || this.velocidad == -8  );
	}
	
	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	public void fueEliminado(int velocidad) {
		
		this.velocidad=velocidad;
		if(velocidad >= 0) {
		this.velocidadCaida=velocidad;
		}else {
		this.velocidadCaida=velocidad * -1;
		}
	}
	
	public boolean estaMuerto() {
		
		return(this.velocidad == 8 || this.velocidad == -8);
	}

	void continuar() {
		
		this.velocidad = this.direccion;
	}

	void cambiarDireccion() {
		this.velocidad = (-1) * this.velocidad;
		this.direccion = this.velocidad;
	}

	void caer() {
		this.y = this.y + velocidadCaida;
	}

	public void setX(double x) {
		this.x = (int) x;
	}

	public void setY(int y) {
		this.y = y;
	}

	double perfilIzquierdo() {
		return this.x - (this.ancho / 2);
	}

	double perfilDerecho() {
		return this.x + (this.ancho / 2);
	}

	double perfilSuperior() {
		return this.y - (this.alto / 2);
	}

	double perfilInferior() {
		return this.y + (this.alto / 2);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

}
