
// Java Program to check the size by using switch case 

class SwitchCaseLottery {
  public static void main(String[] args) {

    int measurement = 32;
    String size;

    // switch statement to check size
    switch (measurement) {

      case 28:
        size = "Small";
        break;

      case 30:
        size = "Medium";
        break;

      case 32:
        size = "Large";
        break;

      case 34:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}
