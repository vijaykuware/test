package Variable_Study;

public class HR_Portal {

	public static void main(String[] args) {
		Employee_Info emp1=new Employee_Info();
		emp1.emp_name="Vijay";
		emp1.emp_id=1201;
		emp1.emp_salary=40000;
		emp1.emp_city="Mumbai";
		
		Employee_Info emp2=new Employee_Info();
		emp2.emp_name="Sachin";
		emp2.emp_id=1202;
		emp2.emp_salary=45000;
		emp2.emp_city="Pune";
		
		Employee_Info emp3=new Employee_Info();
		emp3.emp_name="Akash";
		emp3.emp_id=1203;
		emp3.emp_salary=46000;
		emp3.emp_city="Delhi";
		
		emp1.Employee();
		emp2.Employee();
		emp3.Employee();
		

	}

}
