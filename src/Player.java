
public class Player {

	protected float x;
	protected float y;
	protected int vel;

	public Player(float x, float y) {
		this.setX(x);
		this.setY(y);
		this.vel = 20;

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

	public void right() {
		this.x += vel;
	}

	public void left() {
		this.x -= vel;
	}
}