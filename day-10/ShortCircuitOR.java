class ShortCircuitOR{

   public static void main(String[] args) {
   
     int a = 10;

if (a > 5 || ++a > 20) {    /*here a is not increased because that OR operator want only one True and condition will
                             become true and it will not check for second condition so ++a is never executed  */
    System.out.println("Yes");
}

System.out.println(a);
   
   }

}