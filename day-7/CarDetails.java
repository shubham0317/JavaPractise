class CarDetails{

  static String brand = "BMW";
String model;
int price;

 void discount() {
        int discount = 5555;
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
        System.out.println("discount: " + (discount));
 }
 
 public static void main(String[] args) {
 
  CarDetails c1 = new CarDetails();
  c1.model = "M4";
  c1.price = 400000;
  c1.discount();
 
 }

}