package juego;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import entorno.Entorno;
import entorno.Herramientas;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Pared paredIzquierda;
	private Pared paredDerecha;
	private Pared paredSupIzquierda;
	private Pared paredSupDerecha;
	private Viga vigaInfIzquierda;
	private Viga vigaInfDerecha;
	private Viga vigaSuperior;
	private Viga vigaMedioIzquierda;
	private Viga vigaMedioDerecha;
	private Viga vigaMedioCentro;
	private Viga vigaInferiorCentro;
	private Monstruo monstruo1;
	private Monstruo monstruo2;
	private Monstruo monstruo3;
	private Monstruo monstruo4;
	private Viga[] vigas;
	private Monstruo[] monstruos;
	private Mago mago;
	private boolean caminaDer;
	private boolean caminaIzq;
	private boolean algunaTecla;
	private Bala[] balas;
	private double disparoHaciaDerecha;
	private double disparoHaciaIzquierda;
	private boolean estaCayendo;
	private int timerM1;
	private int timerM2;
	private int timerM3;
	private int timerM4;
	private boolean juegoTerminado;
	private boolean gano;
	private int puntaje;
	private BarraPoder barraPoder;
	private Bala[] balasEsp;
	private boolean poderEsp;
	private Items vida;
	private Random rv;
	private int timerv;
	private int[] alturas;
	private int[] anchosDesde;
	private int[] anchosHasta;
	private int xVida;
	private int yVida;
	private int posItems;
	private Random rPI;
	private Random rYI;
	private int posItemsY;
	private boolean aparecioVida;	
	private int intentos;
	private int multiploVida;
	private int timerInvulnerable;
	private boolean invulnerable;
	private boolean loContiene;
	private boolean Disparo;
	private Image fondo ;
	private Image textoSuper;
	private Image textoPuntaje;
	private boolean magoHaciaDerecha;
    private boolean magoHaciaIzquierda;
    private boolean magoEstaQuieto;
    private Image corazon;
//    private boolean colisionConPared0;
//    private boolean colisionConPared1;
//    private boolean colisionConPared2;
//    private boolean colisionConPared3;
	
	// Variables y métodos propios de cada grupo
	// ...

	Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "La torre de los magos - Grupo Apellido1 - Apellido2 -Apellido3 - V0.01", 800,
				700);
		this.paredIzquierda = new Pared(10, 305, 30, 560);
		this.paredDerecha = new Pared(800, 305, 30, 560);
		this.paredSupIzquierda = new Pared(150, 10, 350, 30);
		this.paredSupDerecha = new Pared(660, 10, 350, 30);
		this.vigaInfIzquierda = new Viga(150, 600, 350, 30);
		this.vigaInfDerecha = new Viga(660, 600, 350, 30);
		this.vigaSuperior = new Viga(400, 138, 500, 20);
		this.vigaMedioIzquierda = new Viga(150, 246, 350, 20);
		this.vigaMedioDerecha = new Viga(660, 246, 350, 20);
		this.vigaMedioCentro = new Viga(400, 354, 300, 20);
		this.vigaInferiorCentro = new Viga(400, 462, 500, 20);
		this.monstruo1 = new Monstruo(280, 292, 60, 60, 2);
		this.monstruo2 = new Monstruo(520, 292, 60, 60, -2);
		this.monstruo3 = new Monstruo(630, 422, 60, 60, 2);
		this.monstruo4 = new Monstruo(170, 422, 60, 60, -2);
		this.barraPoder = new BarraPoder(750, 710, 0, 15, Color.YELLOW);  //(655, 671, 0, 15, Color.YELLOW);
		this.mago = new Mago(this.vigaSuperior.getX(), this.vigaSuperior.getY() - 30);
		this.vigas = new Viga[8];
		this.monstruos = new Monstruo[8];
		this.balas = new Bala[8];
		this.balasEsp = new Bala[8];
		this.alturas = new int[7];
		this.anchosDesde = new int[7];
		this.anchosHasta = new int[7];
		this.alturas[0] = 118;
		this.alturas[1] = 226;
		this.alturas[2] = 226;
		this.alturas[3] = 334;
		this.alturas[4] = 442;
		this.alturas[5] = 575;
		this.alturas[6] = 575;
		this.anchosDesde[0] = 160;
		this.anchosDesde[1] = 35;
		this.anchosDesde[2] = 495;
		this.anchosDesde[3] = 260;
		this.anchosDesde[4] = 160;
		this.anchosDesde[5] = 35;
		this.anchosDesde[6] = 495;
		this.anchosHasta[0] = 640;
		this.anchosHasta[1] = 315;
		this.anchosHasta[2] = 775;
		this.anchosHasta[3] = 540;
		this.anchosHasta[4] = 640;
		this.anchosHasta[5] = 315;
		this.anchosHasta[6] = 775;
		this.vigas[0] = this.vigaSuperior;
		this.vigas[1] = this.vigaMedioIzquierda;
		this.vigas[2] = this.vigaMedioDerecha;
		this.vigas[3] = this.vigaMedioCentro;
		this.vigas[4] = this.vigaInferiorCentro;
		this.vigas[5] = this.vigaInfDerecha;
		this.vigas[6] = this.vigaInfIzquierda;
		this.monstruos[0] = this.monstruo1;
		this.monstruos[1] = this.monstruo2;
		this.monstruos[2] = this.monstruo3;
		this.monstruos[3] = this.monstruo4;
		this.timerM1 = 0;
		this.timerM2 = 0;
		this.timerM3 = 0;
		this.timerM4 = 0;
		this.rv = new Random();
		this.rPI = new Random();
		this.rYI = new Random();
		this.timerv = 200 + rv.nextInt(500);
		this.posItems = rPI.nextInt(7);
		this.disparoHaciaDerecha = 0;
		this.disparoHaciaIzquierda = 9.43;
		this.caminaDer = false; // booleano que indica si esta caminando hacia la derecha o no.
		this.caminaIzq = false; // booleano que indica si esta caminando hacia la izquierda o no.
		this.algunaTecla = false;// booleano que indica si se preciono alguna tecla direecional para que comienze
									// a caminar el mago.
		this.estaCayendo = false; // booleano que indica si esta cayendo el mago. (sirve para que pueda disparar).
		this.juegoTerminado = false;
		this.gano = false;
		this.puntaje = 0;
		this.poderEsp = false;
		this.aparecioVida = false;
		this.intentos = 1;
		this.multiploVida = 1;
		this.timerInvulnerable = 0;
		this.invulnerable = false;
		this.loContiene = false;
		this.Disparo = false;
		this.fondo = Herramientas.cargarImagen("fondoPantalla.jpg");
		this.textoSuper = Herramientas.cargarImagen("textoSuper.png");
		this.textoPuntaje = Herramientas.cargarImagen("textoPuntaje.png");
		this.magoHaciaDerecha = false;
		this.magoHaciaIzquierda = false;
		this.magoEstaQuieto = true;
		this.corazon = Herramientas.cargarImagen("corazon.png");
		
//		this.colisionConPared0 = false;
//		this.colisionConPared1 = false;
//		this.colisionConPared2 = false;
//		this.colisionConPared3 = false;
		
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();

	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		// ...
		if (!juegoTerminado) {
			this.entorno.dibujarImagen(this.fondo, entorno.ancho()/2, entorno.alto()/2, 0, 2);
			this.vigaSuperior.dibujarVigaSuperior(entorno);
			this.vigaMedioIzquierda.dibujarVigaMedioIzquierda(entorno);
			this.vigaMedioDerecha.dibujarVigaMedioDerecha(entorno);
			this.vigaMedioCentro.dibujarVigaMedioCentro(entorno);
			this.vigaInferiorCentro.dibujarVigaInferiorCentro(entorno);
			this.vigaInfIzquierda.dibujarVigaInfIzquierda(entorno);
			this.vigaInfDerecha.dibujarVigaInfDerecha(entorno);
			this.paredIzquierda.dibujarParedCostado(entorno);
			this.paredDerecha.dibujarParedCostado(entorno);
			this.paredSupIzquierda.dibujarParedSuperiores(entorno);
			this.paredSupDerecha.dibujarParedSuperiores(entorno);
//			this.mago.dibujarMagoQuieto(this.entorno);
      		entorno.dibujarImagen(this.textoPuntaje, 100, 710, 0, 1);
			entorno.cambiarFont("Arial Black", 30, Color.RED);
			entorno.escribirTexto(""+this.puntaje, 185 ,685);
            entorno.dibujarImagen(this.textoSuper, 570, 695, 0, 1);
//            entorno.cambiarFont("Arial Black", 20, Color.RED);
//			entorno.escribirTexto("Super", 540, 680);
//			entorno.dibujarRectangulo(700, 671, 100, 20, 0, Color.RED);
	
        	if( this.magoEstaQuieto && !this.algunaTecla) 
			{
				this.mago.dibujarMagoQuieto(entorno);
			}
		
			if (this.barraPoder.getCambio() == 0) {
				this.barraPoder.dibujarBarraVacia(this.entorno);
			}
			if (this.barraPoder.getCambio() == 10) {
				this.barraPoder.dibujarBarra1(this.entorno);
			}
			if (this.barraPoder.getCambio() == 20) {
				this.barraPoder.dibujarBarra2(this.entorno);
			}
			if (this.barraPoder.getCambio() == 30) {
				this.barraPoder.dibujarBarra3(entorno);
			}
			if (this.barraPoder.getCambio() == 40) {
				this.barraPoder.dibujarBarra4(entorno);
			}
			if (this.barraPoder.getCambio() == 50) {
				this.barraPoder.dibujarBarra5(entorno);
			}
			if (this.barraPoder.getCambio() == 60) {
				this.barraPoder.dibujarBarra6(entorno);
			}
			if (this.barraPoder.getCambio() == 70) {
				this.barraPoder.dibujarBarra7(entorno);
			}
			if (this.barraPoder.getCambio() == 80) {
				this.barraPoder.dibujarBarra8(entorno);
			}
			if (this.barraPoder.getCambio() == 90) {
				this.barraPoder.dibujarBarraLlena(entorno);
			}
			if (timerv > 0 && !this.aparecioVida) {
				timerv--;
			}

			if (timerv == 0 && !this.aparecioVida) {
				this.posItems = rPI.nextInt(7);
				this.posItemsY = this.anchosDesde[posItems]
						+ rYI.nextInt(this.anchosHasta[posItems] - this.anchosDesde[posItems]);
				this.yVida = this.alturas[posItems];
				this.xVida = posItemsY;
				this.aparecioVida = true;

			}
			if (this.aparecioVida) {

				this.vida = new Items(xVida, yVida, 20, 20);
				this.vida.dibujarVida(this.entorno);
			}

			if (this.vida != null && colisionMagoItem(this.mago, this.vida) && this.intentos < 3) {

				this.intentos = this.intentos + 1;
				this.vida = null;
				this.aparecioVida = false;
				this.multiploVida = this.multiploVida + 1;
				this.timerv = (200 * this.multiploVida) + rv.nextInt(500 * this.multiploVida);
			}
			if (this.vida != null && colisionMagoItem(this.mago, this.vida) && this.intentos == 3) {
				
				this.vida = null;
				this.aparecioVida = false;
				this.multiploVida = this.multiploVida + 1;
				this.timerv = (200 * this.multiploVida) + rv.nextInt(500 * this.multiploVida);
				
			}
			if (this.intentos >= 1) {

//				entorno.dibujarRectangulo(335, 660, 40, 40, 0, Color.RED);
				entorno.dibujarImagen(this.corazon, 335,660, 0, 0.3);
			}

			if (this.intentos >= 2) {

//				entorno.dibujarRectangulo(385, 660, 40, 40, 0, Color.RED);
				entorno.dibujarImagen(this.corazon, 395,660, 0, 0.3);
			}
			if (this.intentos == 3) {

//			entorno.dibujarRectangulo(435, 660, 40, 40, 0, Color.RED);
			entorno.dibujarImagen(this.corazon, 455,660, 0, 0.3);
			} 

			// se hizo este if para que el mago comienze estatico y se mueva solo cuando se
			// presiona un direccional.

			for (int i = 0; i < this.monstruos.length; i++) {
				if (this.monstruos[i] != null) {
					if(i == 0 ) 
					{
					  this.monstruos[i].dibujarMonstruoIzquierda(entorno);	
					}
//					if(i == 0 && this.colisionConPared0) 
//					{
//						this.monstruos[i].dibujarMonstruoDerecha(entorno);
//					}
					if(i == 1 ) 
					{
					  this.monstruos[i].dibujarMonstruoDerecha(entorno);	
					}
//					if(i == 1 && this.colisionConPared1) 
//					{
//						this.monstruos[i].dibujarMonstruoDerecha(entorno);
//					}
//					
					if(i == 2 ) 
					{
					  this.monstruos[i].dibujarMonstruoIzquierda(entorno);	
					}
//					if(i == 2 && this.colisionConPared2) 
//					{
//						this.monstruos[i].dibujarMonstruoDerecha(entorno);
//					}
//					
					if(i == 3) 
					{
					  this.monstruos[i].dibujarMonstruoDerecha(entorno);	
					}
//					if(i == 3 && this.colisionConPared3) 
//					{
//						this.monstruos[i].dibujarMonstruoDerecha(entorno);
//					}
					}
			}
			
			if (this.entorno.sePresiono(this.entorno.TECLA_DERECHA) && !algunaTecla) {

				algunaTecla = true;// se cambia a true el booleano para que se inicie el for que verifica que este
									// en alguna viga y que camine.

				this.caminaDer = true;// se pone en true si el jugador inicio el juego presionando hacia la derecha.
										// si no se cambiara a true los controles quedarian invertidos.
				this.magoHaciaDerecha = true;
				this.magoHaciaIzquierda = false;
				this.magoEstaQuieto = false;
			}

			if (this.entorno.sePresiono(this.entorno.TECLA_IZQUIERDA) && !algunaTecla) {

				algunaTecla = true;
				this.mago.cambiarDireccion();// se cambia la direccion si el jugador comienza el juego presionando hacia
												// la
												// izquierda, dado que la velocidad del mago es positiva y se dirigia
												// siempre para la derecha. De este modo, nos aseguramos que se dirija
												// hacia
												// la izquierda.
				this.caminaIzq = true;
				this.magoHaciaIzquierda = false;
				this.magoHaciaIzquierda = true;
				this.magoEstaQuieto = false;
			}

			boolean estaMago = false;
			if (algunaTecla) { // se agrego esta condicion para que el mago comienze estatico y se mueva
								// continuamente.

				for (int i = 0; i < this.vigas.length; i++) {
					if (this.vigas[i] != null) {
						estaMago = estaMago || estaEnVigaMago(this.mago, vigas[i]);
					}
				}

				if (estaMago) {

					this.mago.moverse();
					// se agregaron booleanos para que no se inviertan los cambios de direcciones
					// presionando la misma tecla y si lo haga presionando alternadamente segun
					// corresponda izquierda y derecha.
					if (this.entorno.sePresiono(this.entorno.TECLA_DERECHA) && !caminaDer) {
						this.mago.cambiarDireccion();
						this.caminaDer = true;
						this.caminaIzq = false;
						this.magoHaciaDerecha = true;
						this.magoHaciaIzquierda = false;
					}

					if(this.magoHaciaDerecha && !this.magoHaciaIzquierda) 
					{
						this.mago.dibujarMagoCorreDerecha(entorno);
					}

					if (this.entorno.sePresiono(this.entorno.TECLA_IZQUIERDA) && !caminaIzq) {
						this.mago.cambiarDireccion();
						this.caminaDer = false;
						this.caminaIzq = true;
						this.magoHaciaDerecha = false;
						this.magoHaciaIzquierda = true;
					}
			
					if(!this.magoHaciaDerecha && this.magoHaciaIzquierda) 
					{
						this.mago.dibujarMagoCorreIzquierda(entorno);
					}
			
				} else {
					if(this.caminaDer && !this.caminaIzq) 
					{
						this.mago.dibujarMagoDisparaDerecha(entorno);
						this.mago.caer();
						estaCayendo = true;
					}else {
						this.mago.dibujarMagoDisparaIzquierda(entorno);
						this.mago.caer();
						estaCayendo = true;
					}
				}
				
				for (int i = 0; i < this.vigas.length; i++) {
					if (estaCayendo && estaMago) {
						if (caminaIzq) {
							this.mago.setAngulo(disparoHaciaIzquierda);
							if (this.balas[i] == null) {
								this.balas[i] = this.mago.magoDispara();
							}
							if (this.barraPoder.getAncho() < 90) {
								this.barraPoder.cargarSuper();
							}
							estaCayendo = false;
						} else {
							this.mago.setAngulo(disparoHaciaDerecha);
							if (this.balas[i] == null) {
								this.balas[i] = this.mago.magoDispara();
							}
							if (this.barraPoder.getAncho() < 90) {
								this.barraPoder.cargarSuper();
							}
							estaCayendo = false;
						}
					}
				}

				if (this.barraPoder.getCambio() == 90) {
					this.mago.setAngulo(disparoHaciaDerecha);
					this.balasEsp[0] = this.mago.magoDispara();
					this.mago.setAngulo(disparoHaciaIzquierda);
					this.balasEsp[1] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(90));
					this.balasEsp[2] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(270));
					this.balasEsp[3] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(45));
					this.balasEsp[4] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(135));
					this.balasEsp[5] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(225));
					this.balasEsp[6] = this.mago.magoDispara();
					this.mago.setAngulo(Herramientas.radianes(315));
					this.balasEsp[7] = this.mago.magoDispara();

				}
				if (this.barraPoder.getCambio() == 90 && this.entorno.sePresiono(this.entorno.TECLA_ESPACIO)) {
					this.poderEsp = true;
					this.barraPoder.setCambio(0);
					this.Disparo = true;
//					this.barraPoder.setColor(Color.YELLOW);
//					this.barraPoder.setX(655);
				}
				
				if(this.barraPoder.getCambio() < 90 && this.Disparo) 
				{
					this.Disparo = false;
				}
				
				if(this.barraPoder.getCambio() > 90 && !this.Disparo) 
				{
					this.barraPoder.setCambio(90);
					this.Disparo = false;
				}
				
				if (this.poderEsp) {
					for (int i = 0; i < this.balasEsp.length; i++) {
						if (this.balasEsp[i] != null) {
							this.balasEsp[i].dibujarBala(this.entorno);
							this.balasEsp[i].desplazarBala();
						}
					}
				}

				if (this.poderEsp && this.balasEsp[0] == null && this.balasEsp[1] == null && this.balasEsp[2] == null
						&& this.balasEsp[3] == null && this.balasEsp[4] == null && this.balasEsp[5] == null
						&& this.balasEsp[6] == null && this.balasEsp[7] == null) {
					this.poderEsp = false;
				}

				for (int i = 0; i < this.balas.length; i++) {
					if (this.balas[i] != null) {
						this.balas[i].dibujarBala(this.entorno);
						this.balas[i].desplazarBala();
					}
					for (int j = 0; j < this.balas.length; j++) {


						if (((this.balas[i] != null && colisionParedBala(this.balas[i]))
								|| (this.balas[i] != null && this.monstruos[j] != null && !this.invulnerable
										&& colisionBalaMounstruo(this.balas[i], this.monstruos[j])))
								|| ((this.balasEsp[i] != null && colisionParedBala(this.balasEsp[i]))
										|| (this.balasEsp[i] != null && this.monstruos[j] != null && !this.invulnerable
												&& colisionBalaMounstruo(this.balasEsp[i], this.monstruos[j])))) {

							if ((this.balas[i] != null && this.monstruos[j] != null
									&& !this.monstruos[j].estaCongelado() && !this.invulnerable
									&& !this.monstruos[j].estaRodando()
									&& (colisionBalaMounstruo(this.balas[i], this.monstruos[j])))
									|| (this.balasEsp[i] != null && this.monstruos[j] != null
											&& !this.monstruos[j].estaCongelado() && !this.invulnerable
											&& !this.monstruos[j].estaRodando()
											&& (colisionBalaMounstruo(this.balasEsp[i], this.monstruos[j])))) {
								this.monstruos[j].congelado();

								if (this.monstruos[j].equals(monstruo1)) {

									timerM1 = 300;
								}
								if (this.monstruos[j].equals(monstruo2)) {

									timerM2 = 300;
								}
								if (this.monstruos[j].equals(monstruo3)) {

									timerM3 = 300;
								}
								if (this.monstruos[j].equals(monstruo4)) {

									timerM4 = 300;
								}
								if (this.balas[i] != null && this.monstruos[j] != null
										&& colisionBalaMounstruo(this.balas[i], this.monstruos[j])) {
									this.balas[i] = null;
								}
								if (this.balasEsp[i] != null && this.monstruos[j] != null
										&& colisionBalaMounstruo(this.balasEsp[i], this.monstruos[j])) {
									this.balasEsp[i] = null;
								}

							} else {
								if (this.balas[i] != null && colisionParedBala(this.balas[i])) {

									this.balas[i] = null;
								}
								if (this.balasEsp[i] != null && colisionParedBala(this.balasEsp[i])) {

									this.balasEsp[i] = null;
								}
							}
						}

					}

				}

				if (timerM1 > 0) {
					timerM1--;
					/*if(this.monstruos[0] != null) {
					this.monstruos[0].dibujarBolaNieve(entorno);
					}*/
				}
				if (timerM2 > 0) {
					timerM2--;
					/*if(this.monstruos[1] != null) {
						this.monstruos[1].dibujarBolaNieve(entorno);
						}*/
				}
				if (timerM3 > 0) {
					timerM3--;
					/*if(this.monstruos[2] != null) {
						this.monstruos[2].dibujarBolaNieve(entorno);
						}*/
					}
				if (timerM4 > 0) {
					timerM4--;
					/*if(this.monstruos[3] != null) {
						this.monstruos[3].dibujarBolaNieve(entorno);
						}*/
				
				}
				for (int i = 0; i < this.monstruos.length; i++) {
					if((this.monstruos[i] != null && this.monstruos[i].estaCongelado()) || (this.monstruos[i] != null && this.monstruos[i].estaRodando())) {
						this.monstruos[i].dibujarBolaNieve(entorno);
					}
				}
				for (int i = 0; i < this.monstruos.length; i++) {

					if (this.monstruos[i] != null && timerM1 == 0 && this.monstruos[i].equals(monstruo1)
							&& this.monstruos[i].estaCongelado()) {

						this.monstruos[i].continuar();
					}

					if (this.monstruos[i] != null && timerM2 == 0 && this.monstruos[i].equals(monstruo2)
							&& this.monstruos[i].estaCongelado()) {

						this.monstruos[i].continuar();
					}

					if (this.monstruos[i] != null && timerM3 == 0 && this.monstruos[i].equals(monstruo3)
							&& this.monstruos[i].estaCongelado()) {

						this.monstruos[i].continuar();
					}

					if (this.monstruos[i] != null && timerM4 == 0 && this.monstruos[i].equals(monstruo4)
							&& this.monstruos[i].estaCongelado()) {

						this.monstruos[i].continuar();
					}

				}

				if (colisionParedMago(this.mago)) {

					this.mago.cambiarDireccion();
					if (this.caminaDer == false) {
						this.caminaDer = true;
						this.caminaIzq = false;
						this.magoHaciaDerecha =true;
						this.magoHaciaIzquierda = false;
					} else if (this.caminaIzq == false) {
						this.caminaIzq = true;
						this.caminaDer = false;
						this.magoHaciaDerecha = false;
						this.magoHaciaIzquierda = true;
					}
				}

			}

			if (estaEnHuecoMago(this.mago)) {

				this.mago.setY(0);
			}

			boolean estaMons1 = false;
			boolean estaMons2 = false;
			boolean estaMons3 = false;
			boolean estaMons4 = false;

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.vigas[i] != null && this.monstruo1 != null) {
					estaMons1 = estaMons1 || estaEnVigaMounstruo(this.monstruo1, this.vigas[i]);
				}
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.vigas[i] != null && this.monstruo2 != null) {
					estaMons2 = estaMons2 || estaEnVigaMounstruo(this.monstruo2, this.vigas[i]);
				}
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.vigas[i] != null && this.monstruo3 != null) {
					estaMons3 = estaMons3 || estaEnVigaMounstruo(this.monstruo3, this.vigas[i]);
				}
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.vigas[i] != null && this.monstruo4 != null) {
					estaMons4 = estaMons4 || estaEnVigaMounstruo(this.monstruo4, this.vigas[i]);
				}
			}

			if (this.monstruo1 != null && estaMons1) {

				this.monstruo1.moverse();

			} else {

				this.monstruo1.caer();
			}

			if (this.monstruo2 != null && estaMons2) {

				this.monstruo2.moverse();

			} else {

				this.monstruo2.caer();
			}

			if (this.monstruo3 != null && estaMons3) {

				this.monstruo3.moverse();

			} else {

				this.monstruo3.caer();
			}

			if (this.monstruo4 != null && estaMons4) {

				this.monstruo4.moverse();

			} else {

				this.monstruo4.caer();
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.monstruos[i] != null && colisionParedMounstruo(this.monstruos[i])) {
//                    if( i == 0) { 
					this.monstruos[i].cambiarDireccion();
//					this.colisionConPared0 = true;
//				}
//                if( i == 1) { 
//    				this.monstruos[i].cambiarDireccion();
//    				this.colisionConPared1 = true;
//    			}
//                if( i == 2) { 
//    				this.monstruos[i].cambiarDireccion();
//    				this.colisionConPared2 = true;
//    			}
//                if( i == 3) { 
//    				this.monstruos[i].cambiarDireccion();
//    				this.colisionConPared3 = true;
//    			}
			}
			}
			if(!this.invulnerable) {

			for (int i = 0; i < this.monstruos.length; i++) {
				if (this.monstruos[i] != null && colisionMagoMounstruo(this.mago, this.monstruos[i])
						&& !this.monstruos[i].estaRodando()) {

					if (this.monstruos[i].estaCongelado()) {
						if (this.mago.getVelocidad() > 0) {
							this.monstruos[i].fueEliminado(8);
							this.puntaje = this.puntaje + 100;

						}else if (this.mago.getVelocidad() < 0) {
							this.monstruos[i].fueEliminado(-8);
							this.puntaje = this.puntaje + 100;
						}				
					}
					
					if (this.intentos > 0 && !this.invulnerable && !this.monstruos[i].estaCongelado() && !this.monstruos[i].estaRodando()) {

						this.intentos = this.intentos - 1;
						this.timerInvulnerable = 150;
						this.invulnerable = true;
					}
					if (this.intentos == 0 && !this.invulnerable && !this.monstruos[i].estaCongelado() && !this.monstruos[i].estaRodando()) {

						juegoTerminado = true;

					}
				}
			}
			}
			if (this.timerInvulnerable > 0) {

				this.timerInvulnerable--;
			}
			if (this.timerInvulnerable == 0 && this.invulnerable) {

				this.invulnerable = false;
			}
			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.monstruos[i] != null && this.monstruos[i].estaRodando()) {

					for (int j = 0; j < this.monstruos.length; j++) {

						if (this.monstruos[i] != null && this.monstruos[j] != null && !this.monstruos[j].estaMuerto()
								&& colisionMuertoMounstruo(this.monstruos[i], this.monstruos[j])) {

							if (this.monstruos[i].getVelocidad() > 0) {

								this.monstruos[j].fueEliminado(8);
								this.puntaje = this.puntaje + 500;

							} else if (this.monstruos[i].getVelocidad() < 0) {

								this.monstruos[j].fueEliminado(-8);
								this.puntaje = this.puntaje + 500;
							}
						}
					}
				}
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.monstruos[i] != null && this.loContiene
						&& !colisionMagoMounstruo(this.mago, this.monstruos[i])) {

					this.loContiene = false;
				}
			}

			for (int i = 0; i < this.monstruos.length; i++) {

				if (this.monstruos[i] != null && estaEnHuecoMounstruo(this.monstruos[i])
						&& this.monstruos[i].estaRodando()) {

					this.monstruos[i] = null;

				} else if (this.monstruos[i] != null && estaEnHuecoMounstruo(this.monstruos[i])) {

					this.monstruos[i].setY(0);
				}
			}
			if (this.monstruos[0] == null && this.monstruos[1] == null && this.monstruos[2] == null
					&& this.monstruos[3] == null) {

				gano = true;
				juegoTerminado = true;
			}

		} else {

			if (gano) {

				entorno.cambiarFont("System", 100, Color.RED);
				entorno.escribirTexto("Has Ganado!", 110, 200);

			} else {
				entorno.cambiarFont("System", 100, Color.RED);
				entorno.escribirTexto("Has Perdido!", 110, 200);
			}
			entorno.cambiarFont("Courier", 30, Color.RED);
			entorno.escribirTexto("1.  Presiona la tecla [Enter] para jugar de nuevo", 20, 300);
			entorno.escribirTexto("2.  Presiona la tecla [Espacio] para salir", 20, 350);
			entorno.cambiarFont("Courier", 20, Color.RED);
			entorno.escribirTexto("Tu puntaje fue:" + "   " + this.puntaje, 10, 680);
			if (entorno.sePresiono(entorno.TECLA_ENTER)) {
				Juego juego = new Juego();
			}
			if (entorno.sePresiono(entorno.TECLA_ESPACIO)) {

				System.exit(0);
			}
		}

	}

	boolean colisionParedMounstruo(Monstruo mounstruo) {

		return (this.paredIzquierda.perfilDerecho() >= mounstruo.perfilIzquierdo()
				|| this.paredDerecha.perfilIzquierdo() <= mounstruo.perfilDerecho());

	}

	boolean estaEnVigaMounstruo(Monstruo mounstruo, Viga viga) {

		if (Math.abs(mounstruo.getVelocidad()) == 2) {

			return (viga.perfilIzquierdo() <= mounstruo.perfilDerecho()
					&& viga.perfilDerecho() >= mounstruo.perfilIzquierdo()
					&& Math.abs(viga.perfilSuperior() - mounstruo.perfilInferior()) <= 2);
		} else {
			return (viga.perfilIzquierdo() <= mounstruo.perfilDerecho()
					&& viga.perfilDerecho() >= mounstruo.perfilIzquierdo()
					&& Math.abs(viga.perfilSuperior() - mounstruo.perfilInferior()) <= 7);
		}
	}

	boolean estaEnHuecoMounstruo(Monstruo mounstruo) {

		return (mounstruo.perfilSuperior() > 600);
	}

	boolean estaEnVigaMago(Mago mago, Viga viga) {

		return (viga.perfilIzquierdo() <= mago.perfilDerecho() && viga.perfilDerecho() >= mago.perfilIzquierdo()
				&& Math.abs(viga.perfilSuperior() - mago.perfilInferior()) <= 2);

	}

	boolean colisionParedMago(Mago mago) {

		return (this.paredIzquierda.perfilDerecho() >= mago.perfilIzquierdo()
				|| this.paredDerecha.perfilIzquierdo() <= mago.perfilDerecho());

	}

	boolean colisionParedBala(Bala bala) {
		return (this.paredIzquierda.perfilDerecho() >= bala.perfilIzquierdo()
				|| this.paredDerecha.perfilIzquierdo() <= bala.perfilDerecho()
				|| this.paredSupDerecha.perfilInferior() >= bala.perfilSuperior()
				|| this.paredSupIzquierda.perfilInferior() >= bala.perfilSuperior()
				|| this.vigaInfDerecha.perfilSuperior() <= bala.perfilInferior()
				|| this.vigaInfIzquierda.perfilSuperior() <= bala.perfilInferior() || bala.perfilSuperior() <= 0
				|| bala.perfilInferior() >= 600);
	}

	boolean colisionBalaMounstruo(Bala bala, Monstruo mounstruo) {
		return (bala.perfilIzquierdo() <= mounstruo.perfilDerecho()
				&& bala.perfilDerecho() >= mounstruo.perfilIzquierdo()
				&& bala.perfilInferior() <= mounstruo.perfilInferior()
				&& bala.perfilSuperior() >= mounstruo.perfilSuperior());
	}

	boolean colisionMagoMounstruo(Mago mago, Monstruo mounstruo) {
		return (mago.perfilIzquierdo() <= mounstruo.perfilDerecho()
				&& mago.perfilDerecho() >= mounstruo.perfilIzquierdo()
				&& mago.perfilInferior() >= mounstruo.perfilSuperior()
				&& mago.perfilSuperior() <= mounstruo.perfilInferior());
	}

	boolean colisionMuertoMounstruo(Monstruo mMuerto, Monstruo mounstruo) {
		return (mMuerto.perfilIzquierdo() <= mounstruo.perfilDerecho()
				&& mMuerto.perfilDerecho() >= mounstruo.perfilIzquierdo()
				&& mMuerto.perfilInferior() >= mounstruo.perfilSuperior()
				&& mMuerto.perfilSuperior() <= mounstruo.perfilInferior());
	}

	boolean colisionMagoItem(Mago mago, Items item) {
		return (mago.perfilIzquierdo() <= item.perfilDerecho() && mago.perfilDerecho() >= item.perfilIzquierdo()
				&& mago.perfilInferior() >= item.perfilSuperior() && mago.perfilSuperior() <= item.perfilInferior());
	}

	boolean estaEnHuecoMago(Mago mago) {
		return (mago.perfilSuperior() > 600);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
