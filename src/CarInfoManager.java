public class Car {
    private String model;
    private String year;
    private int persons;
    private boolean usedAsTaxi;

    public Car(String model, String year, int persons, boolean usedAsTaxi) {
        this.model = model;
        this.year = year;
        this.persons = persons;
        this.usedAsTaxi = false;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
    public int getPersons() {
        return persons;
    }
    public boolean getUsedAsTaxi() {
        return usedAsTaxi;
    }

    public void setUsedAsTaxi(boolean usedAsTaxi) {
        this.usedAsTaxi = usedAsTaxi;
    }
    public String toString() {
        return "Car Information: " + "\nModel: " + model + "\nYear: " + year + "\nPersons: " + persons + "\nTaxi: " + (usedAsTaxi ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Car mycar = new Car("Toyota Corolla", "2019", 4, false);
        System.out.println(mycar.toString());

        if (mycar.getUsedAsTaxi()) {
            System.out.println("This " + mycar.getModel() + " is Taxi");
        }
        else {
            System.out.println("This " + mycar.getModel() + " is not Taxi");
        }

        mycar.setUsedAsTaxi(true);
        if (mycar.getUsedAsTaxi()) {
            System.out.println("This " + mycar.getModel() + " is taxi");
        }
        else {
            System.out.println("This " + mycar.getModel() + " is not taxi");
        }
    }
}