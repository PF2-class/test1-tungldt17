
public class CarpetCalculator {

	public static void main(String[] args) {
		RoomDemension r1 = new RoomDemension(10, 12);
		RoomCarpet c1 = new RoomCarpet(r1, 8);
		System.out.println("The total cost of this room is: " + c1.getTotalCost());
		System.out.println("Hello");
	}

}
