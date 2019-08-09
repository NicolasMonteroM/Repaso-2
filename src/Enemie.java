import processing.core.PApplet;

public class Enemie {

	
	protected float x;
	protected float y;
	protected int vel;
	protected int vida;
	PApplet app;
	
	public Enemie(PApplet app, float x, float y, int vel, int vida) {
		
		this.app = app;
		this.setX(x);
		this.setY(y);
		this.vel=vel;
		this.setVida(vida);
		
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}
	
	public void movimiento(float y, int vel) {
		
		
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
}
