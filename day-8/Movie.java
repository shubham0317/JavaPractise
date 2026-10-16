class Movie {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        String result = age >= 18 ? "Allowed" : "Not Allowed";

        System.out.println(result);
    }
}