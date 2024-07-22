class  MyThis
{
int  x=10;

void  get(MyThis  this,int  x)
{
System.out.println(this);
System.out.println(this.x);
System.out.println(x);

}


public static  void main(String... s)
{
MyThis  mt=new MyThis();
mt.get(16);
}
}
