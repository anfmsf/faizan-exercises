class Employee
{
  String Name;
  int age;
  int salary;
}
Employee e1=new Employee(name:'faizan',age:23 as int,salary:50000)
Employee e2=new Employee(name:'anil',age:53 as int,salary:3500)
Employee e3=new Employee(name:'hariom',age:83 as int,salary:3000)
Employee e4=new Employee(name:'sunny',age:13 as int,salary:4000)
Employee e5=new Employee(name:'Ranjan',age:52 as int,salary:25000)
Employee e6=new Employee(name:'Raghav',age:28 as int,salary:6000)
Employee e7=new Employee(name:'Anwar',age:74 as int,salary:7000)
Employee e8=new Employee(name:'Paddy',age:12 as int,salary:12000)
Employee e9=new Employee(name:'Sandy',age:18 as int,salary:18000)
Employee e10=new Employee(name:'Samir',age:19 as int,salary:12500)
List l=[e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]
println "--------------------------------"
List l2=l.findAll{Employee e->          
   e.salary<5000
}
l2.each    
{
   println it.name+" "+it.age+" "+it.salary
}
println "---------------------------------"
println "YONGEST= "+l.min({it.age}).name
println "OLDEST= "+l.max({it.age}).name
println "---------------------------------"
println "PERSON WITH HIGHEST SALARY= "+l.max({it.salary}).name
println "---------------------------------"
List l1=l.findAll
{
  it.name
}
print l1*.name