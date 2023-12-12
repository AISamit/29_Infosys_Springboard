package day2;

public class EmployeeRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0;
		double sum=0;
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		for (int i=0;i<salary.length;i++) {
			sum=sum+salary[i];
		}
		avg=sum/salary.length;
		System.out.println("The avg salary is "+avg);
		int countg=0;
		int countl=0;
		
		for (int i=0;i<salary.length;i++) {
		if(salary[i]>avg) {
			countg++;
		}
		else{
			countl++;
			}
		}
		
		System.out.println("The no of salary greater than avg salary "+ countg);
		System.out.println("The no of salary lesser than avg salary "+ countl);
	}

}
