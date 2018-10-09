import processing.core.PApplet;

public class CarQueue {
    
    
    private int interX;
    private int interY;
    private PApplet parent;
    private Car[] cars = new Car[100];
    private String direction;
    private int count;
    private Car car;
    // hL hR vT vB
    
    
    public CarQueue(PApplet p, String d, int count, int x, int y){
        parent = p;
        direction = d;
        this.count = count;
        interX = x;
        interY = y;
        generateCars();
        
    }
    
    
    public void generateCars() {
        if (direction.equals("hL")) {
            for (int i =0; i<cars.length; i++) {
                car = new Car(parent,count, direction, interX, interY);
                cars[i] = car;
                
            }
        }
    }
    
    
    public Car getCar(int k) {
        return cars[k];
    }
    public Car[] getCarList() {
        return cars;
    }
}
