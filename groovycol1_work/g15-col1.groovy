class Stack
{
  List l1=[];
  int top=-1
  void push(String x)
  {
    top++;
    l1.add(x);
    println  x + " pushed"
  }
  void pop()
  {
   if(top>=0)
   {
    println l1[top]+" popped"
    l1.pop()
    top--
    }
  }
  void top()
  {
     if(top>=0)
     {
     println l1.last()
       }
      else 
      println "list is empty" 
  }
}
Stack obj=new Stack();
obj.push("aaa")
obj.push("bbb")
obj.push("ccc");
obj.pop();
obj.top();
obj.pop();
obj.top();
obj.pop();
obj.top();