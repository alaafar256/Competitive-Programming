
public class Employee {
  int EmpIN ; 
  String EmpName ; 
  String EmpDept ; 
  double salary ; 
  double bonus ; 
  boolean resident  ; 
  static int numberofobjects = 0 ; 
  public Employee () 
  {
	  EmpIN = 100 ; 
	  EmpName = "No Name" ; 
	  EmpDept = "CS" ; 
	  salary = 154.000 ; 
	  bonus = 5545.666  ; 
	  resident = true ; 
	  numberofobjects++ ; 
      
  }
  public Employee (int n , String E ) 
  {
	  EmpIN = n ; 
	  EmpName = E ; 
	  numberofobjects++ ; 

  }
  public Employee (int n , String E  , boolean r ) 
  {
	/*  EmpIN = n ; 
	  EmpName = E ;   */ 
	//  this (n , E )  ; 
	  resident = r ; 
	  numberofobjects++ ; 

  } 
  public Employee (int n , String E  , double s , String d , boolean r ) 
  {
	//  this (n , E , r )  ;
	  salary = s ; 
      EmpDept = d ; 
	  numberofobjects++ ; 

  } 
  public void SetSalary ( double s ) 
  {
	  salary =s ; 
	  numberofobjects++ ; 

  }
  public void SetSalary ( double s , double b ) 
  {
	  this.SetSalary(s) ; 
	  bonus = b ; 
	  numberofobjects++ ; 

  } 
  public int numberofobjects() 
  {
	  return numberofobjects ; 
  }
  public void printData( ) 
  {
	  System.out.println("Employee ID : " + EmpIN ); 
	  System.out.println("Employee Name : " + EmpName );
	  System.out.println("Employee Department : " + EmpDept );
	  System.out.println("Employee salary  : " + salary ); 
	  System.out.println("Employee bonus : " + bonus ); 
	  System.out.println("Employee resident  : " + resident );

  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1 = new Employee() ;  
       Employee e2 = new Employee(10000 , "ALaa " , true ) ; 
       Employee e3 = new Employee (10054 , "Alaa" , 78.51 , "IS" , false) ; 
       Employee e4 = new Employee() ;
       Employee e7 = new Employee() ;  
       Employee e5 = new Employee() ; 
       Employee e6 = new Employee() ;   
       System.out.println(Employee.numberofobjects);
       
       /*  e1.SetSalary(1000, 500); 
       e1.printData(); 
       e2.printData(); 
       e3.printData(); */ 
	}

}
