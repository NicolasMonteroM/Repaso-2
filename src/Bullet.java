import processing.core.PApplet;

public class Bullet {
	
	protected float x;
	protected float y;
	protected int vel;
	PApplet app;
	
	public Bullet(PApplet app, float x, float y) {
		this.x=x;
		this.y=y;
		this.vel=5;
		this.app=app;
		
	}
	
	public void moveUp() {
		this.y-=vel;
		
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

}
