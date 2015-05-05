Map m=[Faizan:23,Ranjan:24,Anwar:25,Yogesh:24,Rohit:5,Paddy:29,Manoj:32,Pankaj:28,Gaurav:26,Manish:27]
print m.each{
    it
}
print "\n"
m.eachWithIndex{entry,index->
    print entry.key+":"+entry.value+", "
}