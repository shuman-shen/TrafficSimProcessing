import processing.core.PApplet;




public class Car {

    private PApplet parent;
    private int count;
    private int interX;
    private int interY;
    private int startX;
    private int startY;
    String direction;
    // hL, hR, vT, vB
    
    public Car(PApplet p, int count, String d, int x, int y){
        parent = p;
        this.count = count;
        direction = d;
        interX = x;
        interY = y;
        setStartPoint();
    }
    
    
    public void setStartPoint() {
        if (direction.equals("hL")){
            startX = 0;
            startY = 124 + 300*count;
        }
        else if (direction.equals("hR")){
        
            startX = 300* interX - 30;
            startY = 154 + 300*count;
            
            
        }
        else if (direction.equals("vT")) {
            startX = 124 + 300*count;
            startY = 0;
        }
        else {
            startX = 154 + 300*count;
            startY = 300* interY - 30;
        }
        
        
        
    }
    
    void move() {
        
       
        parent.stroke(250);
        parent.fill(135, 205, 247);
        

        
        if(direction.equals("hL")) {
            parent.rect(startX, startY, 30, 20);
            startX = startX+1;
        }
            
            
            
        if(direction.equals("hR")) {
            parent.rect(startX, startY, 30, 20);
            startX = startX-1;
        }
        
        if(direction.equals("vT")) {
            parent.rect(startX, startY, 20, 30);
            startY = startY+1;
        }
        if(direction.equals("vB")) {
            parent.rect(startX, startY, 20, 30);
            startY = startY-1;
        }
        
        
       


      }
      
      void stop(){
          
          //parent.stroke(240);
          parent.fill(135, 205, 247);
          

          
          if(direction.equals("hL")) {
              parent.rect(startX, startY, 30, 20);            
          }
              
              
              
          if(direction.equals("hR")) {
              parent.rect(startX, startY, 30, 20);
          }
          
          if(direction.equals("vT")) {
              parent.rect(startX, startY, 20, 30);
          }
          if(direction.equals("vB")) {
              parent.rect(startX, startY, 20, 30);
          }
    }
    
      
}
    
    
    

