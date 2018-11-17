public class CargoFlight extends Flight{

    int getSeats(){
        return 12;
    }

    float maxCargoSpace = 1000;
    float usedCargoSpace;

    public void addOnePackage(float height, float width, float depth){
        float size = height * width * depth;
        if(handleCargoSpace(size)){
            usedCargoSpace =+ size;
        }
        else
            handleNoSpace();
    }

    private void handleNoSpace() {
        System.out.println("No enough space for this package");
    }

    private boolean handleCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }


}
