public class EmpWage {

	//Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int DAYS_IN_MONTH = 20;

	//Variable
	static int totalEmpWage;

	public static int calcWage(){

		for (int day = 1; day <= DAYS_IN_MONTH; day++) {

			//Variables
			int empHrs, empWage;

			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_FULL_TIME) {
				empHrs = 8;
			}else if (empCheck == IS_PART_TIME) {
				empHrs = 4;
			}else {
				empHrs = 0;
			}
			empWage = empHrs * EMP_WAGE_PER_HR;
			totalEmpWage += empWage;
			System.out.println("Employee day " + day + " Wage : "+empWage);
		}return totalEmpWage;
	}

	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");
 		calcWage();
		System.out.println("Total Employee Wage : " +totalEmpWage);
	}
}
