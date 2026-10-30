package day39.kodewala.abstraction.ems;

public class ContractEmployee extends Employee{

	private int workingHours;
    private double hourlyRate;

    public ContractEmployee(
            int id, String name,
            int workingHours, double hourlyRate) {

        super(id, name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

}
