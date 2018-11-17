public class Main {

    public static void main(String[] args) {

        Flight passangerFlight = new Flight(175);
        CargoFlight cargoFlight = new CargoFlight();

        Flight mixFlight = new CargoFlight();

        System.out.println("Max liczba pasażerów :: passangerFlight to: "+passangerFlight.getSeats()+" a zajętych miejsc: "+passangerFlight.passenger);
        System.out.println("Max liczba pasażerów :: cargoFlight to: "+cargoFlight.getSeats()+" a zajętych miejsc: "+cargoFlight.passenger);
        System.out.println("Max liczba pasażerów :: mixFlight to: "+mixFlight.getSeats()+" a zajętych miejsc: "+mixFlight.passenger);

        mixFlight.addOnePassenger();
        cargoFlight.addOnePassenger();

        System.out.println("Max liczba pasażerów :: passangerFlight to: "+passangerFlight.getSeats()+" a zajętych miejsc: "+passangerFlight.passenger);
        System.out.println("Max liczba pasażerów :: cargoFlight to: "+cargoFlight.getSeats()+" a zajętych miejsc: "+cargoFlight.passenger);
        System.out.println("Max liczba pasażerów :: mixFlight to: "+mixFlight.getSeats()+" a zajętych miejsc: "+mixFlight.passenger);

        Flight flight1 = new Flight(175);
        Flight flight2 = new Flight(175);

        if (flight1 == flight2){
            System.out.println("\"==\" Loty identyczne.");
        }
            else System.out.println("\"==\" Loty rożne.");

        if (flight1.equals(flight2)){
            System.out.println("\"equals\" Loty identyczne.");
        }
            else System.out.println("\"equals\" Loty rożne.");

    }
}
