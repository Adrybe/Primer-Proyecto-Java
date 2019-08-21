package juego;


import java.awt.Image;

import entorno.Entorno;

public class Items {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Image corazon;
	
	Items(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.corazon = entorno.Herramientas.cargarImagen("corazon.png");
	}
	
	void dibujarVida(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.RED);
	entorno.dibujarImagen(this.corazon,this.x, this.y, 0, 0.2);
	}
	
//	void dibujarEspecial(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.BLUE);
//	}
//	
//	void dibujarVelocidad(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.GREEN);
//	}
//	
	
	int darVida() {
		return 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
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
}