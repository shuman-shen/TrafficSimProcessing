import processing.core.PApplet;


public class Traffic extends PApplet {
    
   private int interX = 1;
   private int interY = 2;
   //private Car[] cars = new Car[100];
   private int inters = interX * interY;
   private int qCount = (interX + interY)*2;
   
   private TrafficLight[] leftLights;
   private TrafficLight[] rightLights;
   private TrafficLight[] topLights;
   private TrafficLight[] bottomLights;
   
   private CarQueue[] queuesHL;
   private CarQueue[] queuesHR;
   private CarQueue[] queuesVT;
   private CarQueue[] queuesVB;
   private CarQueue queue;
   private Car c;
   
   private int timer;
   //private ArrayList
   
   //private Car car = new Car(this);
   private TrafficLight light;
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
        setLeftLights();
        setRightLights();
        setTopLights();
        setBottomLights();
        setQueuesHL();
        
        
        
    };
  
    
    public void draw() {
         
         map.drawBlock();
         
         if(frameCount % (6 * 60+1) == 0 ){
            timer = 1; 
         }
         
         timer = timer+1;
         
         
         for(TrafficLight l : leftLights) {
             l.changeLight(timer);
         }
         for(TrafficLight l : rightLights) {
             l.changeLight(timer);
         }
         for(TrafficLight l : topLights) {
             l.changeLight(timer);
         }
         for(TrafficLight l : bottomLights) {
             l.changeLight(timer);
         }
         
         
         for(CarQueue q : queuesHL) {
             
             
             for(int j = 0; j<q.getCarList().length; j++){
                 if(frameCount> j*80) {
                   if(leftLights[0].getStatus().equals("G"))
                     q.getCar(j).move();
                   else
                       q.getCar(j).stop();
//                   else if (l.getStatus().equals("A")|| (c[j].getPosition()-l.getPosition())> -26)
//                     c[j].move();
//                   else if(checkFront(j)==true)
//                     c[j].move();
//                   else
//                     c[j].stop();
                   }
                 
               }   
             
             
             
             
             
         }
         
         
         
        
    }
    
   public void setQueuesHL() {
       queuesHL = new CarQueue[interY];
       for(int i =0; i<queuesHL.length; i++) {
           queue = new CarQueue(this, "hL", i, interX, interY);
           queuesHL[i] = queue;
       }       
       
   }
   
//   public void setQueuesHR() {
//       queuesHR = new CarQueue[interY];
//       for(int i =0; i<queuesHR.length; i++) {
//           queue = new CarQueue(this, "hR", i, interX, interY);
//       }       
//       
//   }
//   
//   public void setQueuesVT() {
//       queuesVT = new CarQueue[interX];
//       for(int i =0; i<queuesVT.length; i++) {
//           queue = new CarQueue(this, "vT", i);
//       }       
//       
//   }
//   
//   public void setQueuesVB() {
//       queuesVB = new CarQueue[interX];
//       for(int i =0; i<queuesVB.length; i++) {
//           queue = new CarQueue(this, "vB", i);
//       }       
//       
//   }
   
   
    
    public void setLeftLights() {
        int count = 0;
        leftLights = new TrafficLight[inters];
        for (int i = 1; i< interX+1; i++) {
            for (int j = 1; j< interY+1; j++) {
                light = new TrafficLight(this, i, j, "hL");
                
                leftLights[count] = light;
                count++;
            }
        }
        }
    public void setRightLights() {
        int count = 0;
        rightLights = new TrafficLight[inters];
        for (int i = 1; i< interX+1; i++) {
            for (int j = 1; j< interY+1; j++) {
                light = new TrafficLight(this, i, j, "hR");
                    
                rightLights[count]=light;
                count++;
            }
        }
        
    }
    public void setTopLights() {
        int count = 0;
        topLights = new TrafficLight[inters];
        for (int i = 1; i< interX+1; i++) {
            for (int j = 1; j< interY+1; j++) {
                light = new TrafficLight(this, i, j, "vT");
                    
                topLights[count]=light;
                count++;
            }
    }
    }
    public void setBottomLights() {
            int count = 0;
            bottomLights = new TrafficLight[inters];
            for (int i = 1; i< interX+1; i++) {
                for (int j = 1; j< interY+1; j++) {
                    light = new TrafficLight(this, i, j, "vB");
                        
                    bottomLights[count]=light;
                    count++;
                }
        }
    
    } 
    
    
}
