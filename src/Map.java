import processing.core.*;;

public class Map {

    PApplet parent;
    //int blockColor = parent.color(130); //139, 211, 138
    int interX;
    int interY;
    
    
    Map(PApplet p, int interX, int interY){
        parent = p;
        this.interX = interX;
        this.interY = interY;
    }
    
    
    void drawBlock(){
        
        
        //System.out.print(139,211,138);
        //drawing green blocks
        for (int i = 1; i < interX+1; i++){
          
          for(int j = 1; j < interY+1; j++){
          
            int leftTopX = (i -1)* 300;
            int leftTopY = (j -1)* 300;
          
            int rightTopX = (i-1)*300 + 180;
            int rightTopY = (j -1)* 300;
          
            int leftBottomX = (i -1)* 300;
            int leftBottomY = (j -1)* 300+180;
          
            int rightBottomX = (i-1)*300 + 180;
            int rightBottomY = (j-1)* 300 +180;
          
          
          parent.noStroke();
          parent.fill(139,211,138); //green boxes
          parent.rect(leftTopX, leftTopY, 120, 120);
          parent.rect(rightBottomX, rightBottomY, 120, 120);  
          parent.rect(leftBottomX, leftBottomY, 120, 120);
          parent.rect(rightTopX, rightTopY, 120, 120);    
         
            }    
          }
      }
    
    
    
}
