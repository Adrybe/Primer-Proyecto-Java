package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;

public class BarraPoder {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Color color;
	private Image barraVacia; 
	private Image barra1; 
	private Image barra2; 
	private Image barra3; 
	private Image barra4; 
	private Image barra5; 
	private Image barra6; 
	private Image barra7; 
	private Image barra8;
	private Image barraLlena; 
	private int cambio;
	
	public BarraPoder(int x, int y, int ancho, int alto, Color color) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.barraVacia = entorno.Herramientas.cargarImagen("barraDePoder0.png");
		this.barra1 = entorno.Herramientas.cargarImagen("barraDePoder1.png");	
		this.barra2 = entorno.Herramientas.cargarImagen("barraDePoder2.png");	
		this.barra3 = entorno.Herramientas.cargarImagen("barraDePoder3.png");	
		this.barra4 = entorno.Herramientas.cargarImagen("barraDePoder4.png");	
		this.barra5 = entorno.Herramientas.cargarImagen("barraDePoder5.png");	
		this.barra6 = entorno.Herramientas.cargarImagen("barraDePoder6.png");	
		this.barra7 = entorno.Herramientas.cargarImagen("barraDePoder7.png");	
		this.barra8 = entorno.Herramientas.cargarImagen("barraDePoder8.png");	
		this.barraLlena = entorno.Herramientas.cargarImagen("barraPoderLlena.png");
		this.cambio = 0;
	}

	void cargarSuper(){		
		this.cambio=this.cambio + 10;
//		this.x = this.x + 5;
//		this.ancho = this.ancho + 10;
	}

	void dibujarBarraVacia(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barraVacia, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarraLlena(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barraLlena, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarra1(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra1, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarra2(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra2, this.x, this.y, 0, 0.5);
	}
	void dibujarBarra3(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra3, this.x, this.y, 0, 0.5);
	}
	void dibujarBarra4(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra4, this.x, this.y, 0, 0.5);
	}
	void dibujarBarra5(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra5, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarra6(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra6, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarra7(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra7, this.x, this.y, 0, 0.5);
	}
	
	void dibujarBarra8(Entorno entorno) {
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
	entorno.dibujarImagen(this.barra8, this.x, this.y, 0, 0.5);
	}
	
	public int getCambio() {
		return cambio;
	}


	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	void dibujar(Entorno entorno) {
		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
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
}