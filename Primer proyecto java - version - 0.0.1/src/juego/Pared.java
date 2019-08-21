package juego;


import java.awt.Image;

import entorno.Entorno;

public class Pared {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Image paredCostados;
	private Image paredSuperiores;

	Pared(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.paredCostados = entorno.Herramientas.cargarImagen("paredCostados.png");
		this.paredSuperiores = entorno.Herramientas.cargarImagen("paredSuperior.png");
	}

	void dibujarParedCostado(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.GREEN);
	entorno.dibujarImagen(this.paredCostados, this.x, this.y, 0, 1);
	}

	void dibujarParedSuperiores(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.GREEN);
	entorno.dibujarImagen(this.paredSuperiores, this.x, this.y, 0, 1);
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
