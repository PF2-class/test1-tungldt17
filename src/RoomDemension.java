
public class RoomDemension {
	private double width;
	private double length;
	
	public RoomDemension(double width, double length) {
		this.width = width;
		this.length = length;
	}	

	public double getArea() {
		return width*length;
	}
	
}
