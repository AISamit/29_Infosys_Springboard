package First_Package;

public class GetSet {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getRStatus() {
		return RStatus;
	}

	public void setRStatus(String rStatus) {
		RStatus = rStatus;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	int Id;
	String Name;
	int Marks;
	String RStatus;
	int Year;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet sam=new GetSet();
		sam.setName("samit");
		sam.setId(7);
		sam.setMarks(80);
		sam.setRStatus("H");
		sam.setYear(25);
		System.out.println(sam.Name);
		System.out.println(sam.Id);
		System.out.println(sam.Marks);
		System.out.println(sam.RStatus);
		System.out.println(sam.Year);
	}
	
}
