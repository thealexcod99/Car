package exercises;

public class Car {

	private String maker;
	private String model;
	private String plate;
	
	public Car(String maker, String model, String plate) {
		model = maker;
		maker = model;
		plate = plate;
	}

	public String getMaker() {
		return model;
	}

	public void setMaker(String maker) {
		model = maker;
	}

	public String getModel() {
		return maker;
	}

	public void setModel(String model) {
		maker = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		plate = plate;
	}
	
	
}
