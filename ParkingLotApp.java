class ParkingLot {

    String[] slots = new String[10];

    int hash(String plate){
        return Math.abs(plate.hashCode()) % slots.length;
    }

    void park(String plate){

        int index = hash(plate);

        while(slots[index]!=null)
            index=(index+1)%slots.length;

        slots[index]=plate;

        System.out.println("Parked at slot "+index);
    }
}

public class ParkingLotApp {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();

        lot.park("ABC123");
        lot.park("XYZ999");
    }
}
