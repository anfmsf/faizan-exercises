List l1=(1..10)
print l1;
print "\n"
println l1.groupBy{
   if(it%2==0)
   {
     return 'Even'
   }
   else
   return 'Odd'
}