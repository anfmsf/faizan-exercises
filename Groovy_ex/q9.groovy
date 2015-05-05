def nfile=new File('new2.txt')
def file=new File('faizan.txt')
int var=0;
file.eachLine{line->print line
   var++
   if(var%2!=0)
   nfile<<var<<" "<<line<<"\n";
}
