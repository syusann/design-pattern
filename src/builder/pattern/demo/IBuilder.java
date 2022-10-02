package builder.pattern.demo;

public interface IBuilder {

	void buildBody();

	void insertWheel();

	void addHeadLights();

	Product getVehicle();

}
