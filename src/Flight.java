public class Flight {

    int passenger;

    public Flight() {
    }

    int getSeats(){
        return 150;
    }

    public void addOnePassenger(){
        if (hasSeating()){
            passenger++;
        }
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("No chance to find a seat for this passenger :(");
    }

    private boolean hasSeating() {
        return passenger < getSeats();
    }



    private int flightNumber;
    private  char flightClass;

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Flight)){
            return false;
        }
        Flight other = (Flight) o;
        return other.flightNumber == flightNumber;
    }
}
