package bugeModel;

public class Car extends Vehicle {
private String name;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return this.name+"ÐÐÊ»";
	}

}
