class ByteAddition {

 public static void main(String[] args) {
  
  byte a = 10;
  byte b = 12;
  byte c = (byte)(a + b);  // if we remove the type conversion it will give error of lossy conversion  error: incompatible types: possible lossy conversion from int to byte
  System.out.println(c);
  
 
 }

}