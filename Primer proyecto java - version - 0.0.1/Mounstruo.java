package juego;

import java.awt.Color;

import entorno.Entorno;

public class Mounstruo {
	private int x;
	private int y;
	private int velocidad;
	private int diametro;
	
	Mounstruo (int x, int y,int velocidad)
	{
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.diametro = 60;
	}
	void dibujar(Entorno entorno)
	{
		entorno.dibujarCirculo(this.x, this.y, this.diametro, Color.RED);
	}
	void moverse()
	{
		this.x = this.x + this.velocidad;
	}
	void cambiarDireccion()
	{
		this.velocidad = (-1) * this.velocidad; 
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public int getDiametro() {
		return diametro;
	}

}
