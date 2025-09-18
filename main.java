import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celebration type:");
        String celebrationType = sc.nextLine();

        ToihanaFactory factory;
        switch (celebrationType.toLowerCase()){
            case "wedding":
                factory = new WeddingFactory();
                break;
            case "birthday":
                factory = new BirthdayFactory();
                break;
            case "anniversary":
                factory = new AnniversaryFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid celebration type" + celebrationType);
        }
        factory.holdCelebration();
    }
}
