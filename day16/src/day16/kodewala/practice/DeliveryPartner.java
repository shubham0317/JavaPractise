package day16.kodewala.practice;

class DeliveryPartner {

    int partnerId;
    String partnerName;
    String vehicle;

    DeliveryPartner() {
        this(501);
    }

    DeliveryPartner(int partnerId) {
        this(partnerId, "Rahul");
    }

    DeliveryPartner(int partnerId, String partnerName) {
        this(partnerId, partnerName, "Bike");
    }

    DeliveryPartner(int partnerId, String partnerName, String vehicle) {

        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.vehicle = vehicle;
    }

    void display() {

        System.out.println("Partner ID: " + partnerId);
        System.out.println("Partner Name: " + partnerName);
        System.out.println("Vehicle: " + vehicle);
    }

    public static void main(String[] args) {

        DeliveryPartner d = new DeliveryPartner();

        d.display();
    }
}
