package juego;


import java.awt.Image;

import entorno.Entorno;


public class Mago {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int velocidad;
	private double angulo;
	private double tamaño;
	private Image magoQuieto;
	private Image magoCorreDerecha;
    private Image magoCorreIzquierda;
    private Image magoDisparaDerecha;
    private Image magoDisparaIzquierda;

	
	public Mago(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.ancho = 20;
		this.alto = 40;
		this.angulo = 0;
		this.velocidad = 3;
		this.tamaño = 0.6;
		this.magoQuieto = entorno.Herramientas.cargarImagen("magoQuieto.png");
        this.magoCorreDerecha =  entorno.Herramientas.cargarImagen("magoCorreDerecha.gif");	
	    this.magoCorreIzquierda =  entorno.Herramientas.cargarImagen("magoCorreIzquierda.gif");
	    this.magoDisparaDerecha = entorno.Herramientas.cargarImagen("magoDisparaDerecha.png");
	    this.magoDisparaIzquierda = entorno.Herramientas.cargarImagen("magoDisparaIzquierda.png");
	}

	void dibujarMagoCorreDerecha(Entorno entorno) 
	{
		entorno.dibujarImagen(this.magoCorreDerecha, this.x, this.y, 0, this.tamaño);
	}

	void dibujarMagoCorreIzquierda(Entorno entorno) 
	{
		entorno.dibujarImagen(this.magoCorreIzquierda, this.x, this.y, 0, this.tamaño);
	}

	void dibujarMagoQuieto(Entorno entorno) 
	{
		entorno.dibujarImagen(this.magoQuieto, this.x, this.y, 0, 0.5);
	}

	void dibujarMagoDisparaIzquierda(Entorno entorno) 
	{
		entorno.dibujarImagen(this.magoDisparaIzquierda, this.x, this.y, 0, 0.4);
	}
	
	void dibujarMagoDisparaDerecha(Entorno entorno) 
	{
		entorno.dibujarImagen(this.magoDisparaDerecha, this.x, this.y, 0, 0.4);
	}
	
	void caer() 
	{
		this.y += 2;
	} 
	
	double perfilIzquierdo()
	{
		return this.x-(this.ancho/2);
	}
	
	double perfilDerecho()
	{
		return this.x+(this.ancho/2);
	}
	
	double perfilSuperior()
	{
		return this.y-(this.alto/2);
	}
	
	double perfilInferior()
	{
		return this.y+(this.alto/2);
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

	public double getVelocidad() {
		return velocidad;
	}

	public double getAngulo() {
		return angulo;
	}
	
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

//	void dibujarMago(Entorno entorno) 
//	{
//		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.ORANGE);
//    
//	}
//	
	void moverse() {
		this.x = this.x + this.velocidad;
	}
	
	void cambiarDireccion() {
		this.velocidad = (-1) * this.velocidad;
	}
	
	void moverseMagoDerecha() 
	{
		//if(this.x + this.ancho/2 < entorno.ancho() - 10) 
		//{
			this.x +=this.velocidad;
		//}
	}
	
	void moverseMagoIzquierda() 
	{
		//if(this.x - this.ancho/2 > 15)
		//{
			this.x-=this.velocidad;
		//}	
	}
	
	public void setY(int y) {
		this.y = y;
	}

	Bala magoDispara()
	{
		return new Bala(this.x,this.y,this.angulo);		
	}
}