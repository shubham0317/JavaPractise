class Office {

    public static void main(String[] args) {

        boolean validId = true;
        boolean activeEmployee = true;

        if (validId && activeEmployee) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}