package bugeModel;

public class Street extends Road {
private String name;
Car car;



	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


	@Override
	public String run() {
		return this.name+"ио";
	}

}
