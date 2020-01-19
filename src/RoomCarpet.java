

public class RoomCarpet {
	private RoomDemension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDemension size, double carpetCost) {
		this.size = size;
		this.carpetCost = carpetCost;
	}

	public double getTotalCost() {
		return size.getArea()*carpetCost;
	}
}
