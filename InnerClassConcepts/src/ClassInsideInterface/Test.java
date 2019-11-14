package ClassInsideInterface;

interface Vehicle{
    public int getNoOfWheels();

    class DefaultImplementation implements Vehicle{
        public int getNoOfWheels(){
            return 2;
        }
    }
}

class Bus implements Vehicle{
    public int getNoOfWheels(){
            return 4;
     }
}

public class Test{
    
    public static void main(String... args){
    
    Vehicle.DefaultImplementation defalt = new   Vehicle.DefaultImplementation();  
    System.out.println("Default Vehicle Wheels ::: "+defalt.getNoOfWheels());

    Bus bus = new Bus();
    System.out.println("Bus Wheels ::: "+bus.getNoOfWheels());
    
    }
}