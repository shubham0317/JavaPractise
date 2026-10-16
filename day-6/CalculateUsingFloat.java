class CalculateUsingFloat {

   public static void main(String[] args) {
   
        float principal = 10000.0f;
        float rate = 5.0f;
        float time = 2.0f;

        float si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
   }

}