package DefiningClassLab;

public class Car {
    public String make;
    public String model;
    public int horsepower ;

    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setHorsepower(int horsepower){
        this.horsepower=horsepower;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }


    public String carInfo(){
        return String.format("The car is: %s %s - %d HP."
                ,this.getMake(),this.getModel(), this.getHorsepower());
    }
}
