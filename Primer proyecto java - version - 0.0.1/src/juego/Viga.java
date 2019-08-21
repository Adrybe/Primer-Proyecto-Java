package juego;


import java.awt.Image;

import entorno.Entorno;

public class Viga {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Image vigaSuperior;
	private Image vigaInfIzquierda;
	private Image vigaInfDerecha;
	private Image vigaMedioIzquierda;
	private Image vigaMedioDerecha;
	private Image vigaMedioCentro;
	private Image vigaInferiorCentro;

	Viga(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.vigaSuperior = entorno.Herramientas.cargarImagen("vigaSuperior.png");
		this.vigaInfDerecha = entorno.Herramientas.cargarImagen("vigaInfDerecha.png");
		this.vigaInferiorCentro = entorno.Herramientas.cargarImagen("vigaInferiorCentro.png");
		this.vigaInfIzquierda = entorno.Herramientas.cargarImagen("vigaInferiorIzquierda.png");
		this.vigaMedioCentro = entorno.Herramientas.cargarImagen("vigaMedioCentro.png");
		this.vigaMedioDerecha = entorno.Herramientas.cargarImagen("vigaMedioDerecha.png");
		this.vigaMedioIzquierda = entorno.Herramientas.cargarImagen("vigaMedioIzquierda.png");
	}

	void dibujarVigaSuperior(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaSuperior, this.x, this.y, 0, 1);
	}

	void dibujarVigaInfDerecha(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaInfDerecha, this.x, this.y, 0, 1);
	}

	void dibujarVigaInferiorCentro(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaInferiorCentro, this.x, this.y, 0, 1);
	}

	void dibujarVigaInfIzquierda(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaInfIzquierda, this.x, this.y, 0, 1);
	}
	void dibujarVigaMedioCentro(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaMedioCentro, this.x, this.y, 0, 1);
	}
	void dibujarVigaMedioDerecha(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaMedioDerecha, this.x, this.y, 0, 1);
	}
	void dibujarVigaMedioIzquierda(Entorno entorno) {
	    entorno.dibujarImagen(this.vigaMedioIzquierda, this.x, this.y, 0, 1);
	}

//	void dibujar(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.GREEN);
//	}

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
