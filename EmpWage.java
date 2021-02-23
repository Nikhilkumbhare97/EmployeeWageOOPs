public class EmpWage {

	//Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;

	public static void calcWage(){

		//Variables
		int empHrs, empWage;

		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME :
				System.out.println("Employee is Full Time");
				empHrs = 8;
				break;
			case IS_PART_TIME :
				System.out.println("Employee is Part Time");
				empHrs = 4;
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
