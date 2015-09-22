
public class Doctor {
	public String name;
	public String getName() {
		System.out.println("¬ведите им€ доктора");
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int age;
	public String specialist;
}
