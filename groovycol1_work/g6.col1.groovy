class Employee
{
String name;
int age;
int salary;
}

Employee e1=new Employee(name:'faizan',age:23,salary:42000)
Employee e2=new Employee(name:'Ranjit',age:25,salary:20000)
Employee e4=new Employee(name:'Farhan',age:25,salary:25000)
Employee e5=new Employee(name:'Ankit',age:25,salary:26000)
Employee e6=new Employee(name:'Mukul',age:25,salary:18000)
Employee e7=new Employee(name:'Ranjan',age:25,salary:27000)
Employee e8=new Employee(name:'Rohit',age:25,salary:26000)
Employee e9=new Employee(name:'Paddy',age:25,salary:28000)
Employee e3=new Employee(name:'pankaj',age:25,salary:22000)
Employee e10=new Employee(name:'Anwar',age:25,salary:21000)
List l1=[e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]
println"-------------------------------"
List l2=l.findAll{Employee e->
e.salary<5000
}
