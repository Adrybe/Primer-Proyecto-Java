package juego;

import java.awt.Image;

import entorno.Entorno;

public class bolaNieve {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int velocidad;
	private int direccion;
	private int velocidadCaida;
	private Image bolaDeNieve;
	
	public bolaNieve(int x, int y, int ancho, int alto, int velocidad) 
	{
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.velocidad = velocidad;
		this.direccion = velocidad;
		this.velocidadCaida = 2;
		this.bolaDeNieve = entorno.Herramientas.cargarImagen("bolaNieve.gif");
	}
	
	void dibujarBolaNieve(Entorno entorno) {
		entorno.dibujarImagen(this.bolaDeNieve, this.x, this.y, 0, 0.5);
	}

	void moverse() {
		this.x = this.x + this.velocidad;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getDireccion() {
		return direccion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		this.direccion = velocidad;
	}

	void caer() {
		this.y = this.y + velocidadCaida;
	}

	
}
