import java.util.Scanner;
public class HauntedHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("After recieveing a letter from your late grand father you arrive at his estate.");
        System.out.println("you enter the masion and the door suddenly slams shut and you here a click. You are trapped, but you notice three doors in front of you.");
        while (true) {
            System.out.println("Which door do you choose?");
            //int userHealth = scanner.nextInt();
            int door = scanner.nextInt();
            switch (door) {
                case 1:
                    System.out.println("door one opens");
                    next_room();
                case 2:
                    System.out.println("door two opens");
                    idk.next_room();
                    break;
                case 3:
                    System.out.println("door three opens");
                    break;
                default:
                    System.out.println("Invalid answer try again");
            }
// case 0:
//                //leave room or house
//                System.exit();
        }
    }



}

