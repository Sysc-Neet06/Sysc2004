public class Train
{
    public static void main(String[] args)
    {
        Car cars[];
        
        int maximumNumberOfCars = 10;
        int currentNumberOfBusinessCars = 2;
        int currentNumberOfEconomyCars = 4;

        if ((currentNumberOfBusinessCars + currentNumberOfEconomyCars)> maximumNumberOfCars) 
               throw new IllegalArgumentException("The train cannot have more cars than it can physically pull");
        
        // TBD
        // A train can only pull so many cars, as given by "maximumNumberOfCar".
        // Use this argument to initialize an array of the biggest number of cars possible.
        
        cars = new Car[maximumNumberOfCars];
        
        // TBD
        // Then, add cars to this train, 
        // as per requested by "currentNumberOfBusinessCars" and "currentNumberOfEconomyCars

        int i;
        for (i=0; i<currentNumberOfBusinessCars;i++) {
            Car car = new Car(i, true);
            cars[i] = car; 
        }
        for (int j=0; j<currentNumberOfEconomyCars;j++) {
            Car car = new Car(i++, false);
            cars[i] = car; 
        }
        
        // TBD: Print out the train
        
        System.out.println("Train ");
        for (i=0;i<cars.length;i++) {
            if (cars[i] != null) System.out.println(cars[i].toString());
 
        }
    }
}