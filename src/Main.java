import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {

		PApplet.main("Main");
	}

	Player p;

	ArrayList<Bullet> Bullets;
	ArrayList<Enemie> Enemies;
	
	boolean spacebar;

	public void settings() {
		size(500, 500);

	}

	public void setup() {
		Bullets = new ArrayList<Bullet>();
		Enemies = new ArrayList<Enemie>();
		p = new Player(250, 400);
		spacebar = true;

	}

	public void draw() {

		background(50);
		noStroke();
		drawPlayer(p);

		for (int i = 0; i < Bullets.size(); i++) {

			Bullet b = Bullets.get(i);

			drawBullet(b);
			b.moveUp();
			
			if(b.getY()==0) {
				Bullets.remove(i);
			}
		}
		
		for (int i = 0; i < Enemies.size(); i++) {

			Enemie e = Enemies.get(i);
			
			if (e instanceof FastEnemie) {
				drawFastEnemie(e);
			}
			
			if (e instanceof SlowEnemie) {
				drawSlowEnemie(e);
			}
			
			e.moveDown();

		}
		
		if(spacebar) {
			fill(255);
			textAlign(CENTER);
			text("Press key UP to shot", width/2,200);
		}

	}

	public void keyPressed() {
		if (keyCode == LEFT) {
			p.left();
		}

		if (keyCode == RIGHT) {
			p.right();
		}

		if (keyCode == UP) {

			spacebar = false;
			Bullet b = new Bullet(this, p.getX(), p.getY());
			Bullets.add(b);

		}

	}

	public void drawPlayer(Player p) {
		fill(255);
		rect(p.getX() - 15, p.getY(), 30, 50);

	}

	public void drawFastEnemie(Enemie e) {
		fill(255, 0, 0);
		rect(e.getX() + 25, e.getY() + 25, 50, 50);

	}

	public void drawSlowEnemie(Enemie e) {
		fill(255, 0, 0);
		ellipse(e.getX(), e.getY(), 50, 50);

	}

	public void drawBullet(Bullet b) {
		fill(55, 230, 255);
		ellipse(b.getX(), b.getY(), 10, 10);

	}

}
