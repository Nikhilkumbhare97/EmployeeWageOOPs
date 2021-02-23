public class EmpWage {

	//Constant
	public static final int IS_PRESENT = 1;
	public static final int EMP_WAGE_PER_HR = 20;

	public static void calcWage(){

		//Variables
		int empHrs, empWage;

		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		switch (empCheck) {
			case IS_PRESENT :
				System.out.println("Employee is Present");
				empHrs = 8;
				break;
			default :
				System.out.println("Employee is Absent");
				empHrs = 0;
		}
		empWage = empHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee Daily Wage : "+empWage);
	}

	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");
 		calcWage();
	}
}
