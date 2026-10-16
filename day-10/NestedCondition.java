class NestedCondition 
{
  public static void main(String[] args) 
  {
       int a = 10;

if (a > 5) {
    if (a > 15) {
        System.out.println("A");
    } else {
        System.out.println("B");
    }
} else {
    System.out.println("C");
}
  }
}