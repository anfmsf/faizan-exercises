Map<String,Map> m=['Computing':['Computing':600,'InformationSystems':300],
'Engineering':['Civil':200,'Mechanical':100],
'Management':['Management':800]
]
println "------------PROBLEM 1--------------"
List l=m.keySet() as List
println "Number of Departments= "+ l.size()
println "-------------PROBLEM2---------------"
Map x=m."Computing"
println "Number of Programs by Computing Department:"+x.size()
println "----------------PROBLEM 3----------------"
println "Students in Civil Engineering Program= "+ m.'Engineering'.'Civil'