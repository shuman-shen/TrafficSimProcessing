import processing.core.*;

public class TrafficLight {
    
    private PApplet parent;
    //private int rPosition;
    private int posX;
    private int posY;
    private String direction;
    // hL hR vT vB
    private String status;
    private int x;
    private int y;
       
    
    // #99faaf 153, 250, 175 green;
    // #facf9d 250,207,157 AMBER
    // #fa3d42 250, 61, 66 RED
    
    
    
    public TrafficLight(PApplet p, int posX, int posY, String d) {
        parent = p;
        this.posX = posX;
        this.posY = posY;
        direction = d;
//        System.out.println("InterX  " + x);
//        System.out.println("InterY " + y);
        setPositions();
        
        
    }
    
    public String getStatus() {
        return status;
    }
    
    
    public void setPositions() {
    
    if(direction.equals("hL")) {
        x = 116 + (posX-1)*300;
        y = 120 + (posY-1)*300;
    }
    else if(direction.equals("hR")) {
        x = 180 + (posX -1)*300;
        y = 160 + (posY -1)*300;
    }
    else if(direction.equals("vT")) {
        x = 160 + (posX-1)*300;
        y = 116 + (posY-1)*300;
        
    }
    else { //veritcal bottom
        x = 120 + (posX-1)*300;
        y = 180 + (posY-1)*300;
    }
    
//    System.out.println("Get x at " + x);
//    System.out.println("Get y at " + y);
    
    }
    
    public void changeLight(int s){
        if(direction.equals("hL")||direction.equals("hR")) {
            
       
            if(s>=0 && s<120) {
          parent.fill(153, 250, 175);; //GREEN 153, 250, 175
          status = "G";
        
            }
            else if(s<180) {
          parent.fill(250,207,157);; //AMBER
          status = "A";
            }
            else {
          parent.fill(250, 61, 66);; //RED
          status = "R";
            }
            
            
            parent.rect(x, y, 4, 20);
            
        }
        else {
            if(s>=0 && s<180) {
                parent.fill(250, 61, 66);; //red
                status = "R";
              
                  }
                  else if(s<300) {
                parent.fill(153, 250, 175);; //green
                status = "G";
                  }
                  else {
                parent.fill(250,207,157);; //amber
                status = "A";
                  }
        
            
            
            parent.rect(x, y, 20, 4);
        }

      
      
      //System.out.print("");
    }
    
    
    
    
}
