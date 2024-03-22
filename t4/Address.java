package t4;
public class Address {
  private String street;
  private String city;
  private String zipCode;

  // Constructor
  public Address(String street, String city, String zipCode) {
      this.street = street;
      this.city = city;
      this.zipCode = zipCode;
  }

  // Getter methods
  public String getStreet() {
      return street;
  }

  public String getCity() {
      return city;
  }

  public String getZipCode() {
      return zipCode;
  }

  // Setter methods
  public void setStreet(String street) {
      this.street = street;
  }

  public void setCity(String city) {
      this.city = city;
  }

  public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
  }

  public static void main(String[] args) {
      Address address = new Address("safa", "nep", "544545");

      // Displaying address information
      System.out.println("Street: " + address.getStreet());
      System.out.println("City: " + address.getCity());
      System.out.println("Zip Code: " + address.getZipCode());

      // Modifying address information
      address.setStreet("sdfs");
      address.setCity("dfs");
      address.setZipCode("54321");

      // Displaying modified address information
      System.out.println("\nModified Address:");
      System.out.println("Street: " + address.getStreet());
      System.out.println("City: " + address.getCity());
      System.out.println("Zip Code: " + address.getZipCode());
  }
}
