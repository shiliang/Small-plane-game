package playersystem;

import java.awt.image.BufferedImage;

import com.tarena.fly.Bullet;
import com.tarena.fly.FlyingObject;

public class Player implements Cloneable {
	
	protected int x;
	protected int y; 
	protected int width; 
	protected int height; 
	protected BufferedImage image; 
	protected BufferedImage[] images;
	protected int life;
	protected int doubleFire;
	private int index = 0;
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}

	private String body;
	private String weapon;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void moveTo(int x,int y){   
		this.x = x - width/2;
		this.y = y - height/2;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public void step() {
		if(images.length>0){
			image = images[index++/10%images.length];  //�л�ͼƬhero0��hero1
		}
	}
	
	public Bullet[] shoot(){   
		int xStep = width/4;    
		int yStep = 20;  
		if(doubleFire>0){ 
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(x+xStep,y-yStep);  //y-yStep(�ӵ���ɻ���λ��)
			bullets[1] = new Bullet(x+3*xStep,y-yStep);
			return bullets;
		}else{
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(x+2*xStep,y-yStep);  
			return bullets;
		}
	}
	
	public boolean hit(FlyingObject other){
		
		int x1 = other.getX() - this.width/2;                 
		int x2 = other.getX() + this.width/2 + other.getWidth();   
		int y1 = other.getY() - this.height/2;                
		int y2 = other.getY() + this.height/2 + other.getHeight(); 
	
		int herox = this.x + this.width/2;               
		int heroy = this.y + this.height/2;              
		
		return herox>x1 && herox<x2 && heroy>y1 && heroy<y2; 
	}
	
	public void addDoubleFire(){
		doubleFire = 40;
	}
	
	public void subtractLife(){   //生命值减一
		life--;
	}
	
	public void setDoubleFire(int doubleFire) {
		this.doubleFire = doubleFire;
	}
	
	public void addLife(){
		life++;
	}
	
	

}
