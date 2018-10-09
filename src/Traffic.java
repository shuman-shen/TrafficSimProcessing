import processing.core.PApplet;


public class Traffic extends PApplet {
    
   private int interX = 2;
   private int interY = 2;
   private Car[] cars = new Car[100];
   
   private Car car = new Car(this);
   private Map map;
   
   
   
   private int bgColor = color(240);
   
    public void settings() {
        size(900,900);

//
    }
    
    public void setup() {
        frameRate(60);
        background(bgColor);
        map = new Map(this, interX, interY);
    };
    
    
    
    
    public void draw() {
         
         map.drawBlock();
        
        
    }
    
    
    
    
}
