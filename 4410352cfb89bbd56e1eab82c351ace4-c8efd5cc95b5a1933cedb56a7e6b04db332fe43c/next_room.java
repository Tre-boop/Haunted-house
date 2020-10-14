public static void next_room() {

        while (true) {

        System.out.println("You proceed to through the first door and arrive in what seems to be your grandpa's study.");

        System.out.println("As you search around for clues you notice two book protruding from the bookcase.");

        System.out.println("One is named The Art of War and the second one War and Peace.\nWhich book do you choose?\nBook 1 or book 2?");

        Scanner scanner = new Scanner(System.in);

        int books = scanner.nextInt();

        if (books == 1) {

        System.out.println("You pull the first book and nothing seems to happen two doors appear in front of you.\nThen all of the sudden you hear a bumps in the ceiling you reach for the nearest weapon to you.");

        System.out.println("Two ghouls fall from the ceiling.\nYou ready your lamp.\nHow hard do you swing?");

        int power = scanner.nextInt();

        if (power >= 3) {

        System.out.println("You hit the first ghoul knocking it out cold, you rush the second ghoul and smash the lamp over it head!\nIt falls to the fall like a bag of potatoes.");

        System.out.println("you walk to the doors for a closer look.");

        System.out.println("The door on the left has a spider orndement for a door knob. The second door has what seems like slime trickling down from the top.\n which door will you pick 1 or 2?");

        } else {

        int ghouls = 3;

        for (int i = 0; i < ghouls; i++) {

        userHealth -= 1;

        }

        System.out.println("You hit them all at once how ever it doesn't full incapticate one.\n It has enough time to scratch you.");

        System.out.println("You take 3 damage.");

        System.out.println("your health is now:" + userHealth);

        }

        }

        System.out.println("Book case turns revealing two doors.\n A wave of relief passes over you.\n you walk to the doors for a closer look.");

        System.out.println("The door on the left has a spider ornaments for a door knob. The second door has what seems like slime trickling down from the top.\nWhich door will you pick 1 or 2?");

        int rooms = scanner.nextInt();

        switch (rooms) {

        case 1:

        next_room2();

        case 2:

        next_room3();

default:

        System.out.println("Invalid choice please try again.");

        }

        }

        }
