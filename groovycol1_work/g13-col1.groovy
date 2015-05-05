String x="faizanequebal"
def c='a'
def ctr=0;
x.each{
    if(it==c)
    ctr++
}
println "number of Occurences of ${c}=${ctr}"

/*x.eachWithIndex{p,index->
List l=x.findAll{it==p}
print p+l.size()+"\t";
}*/