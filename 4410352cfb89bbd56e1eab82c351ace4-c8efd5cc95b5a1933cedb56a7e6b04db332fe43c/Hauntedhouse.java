import java.util.Scanner;

class Hauntedhouse {
    public static int userHealth;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("After receiving a letter from your late grand father you arrive at his estate.");
        System.out.println("you enter the mansion and the door suddenly slams shut and you here a click. You are trapped, but you notice three doors in front of you.");
        System.out.println("Set your health amount: (15 amount is recommend)");
        userHealth = scanner.nextInt();
        while (true) {
            System.out.println("Which door do you choose?");
            int door = scanner.nextInt();
            switch (door) {
                case 1:
                    System.out.println("door one opens");
                    next_room();
                case 2:
                    System.out.println("door two opens");
                    room_1();
                case 3:
                    System.out.println("door three opens");
                    next_room3_3();
                default:
                    System.out.println("Invalid answer try again");
            }
// case 0:
//                //leave room or house
//                System.exit();

        }

    }

    public static void room_1() {
        System.out.println("You carefully open the door to the next room.");
        System.out.println("You begin to see two strangely illuminating lights in the distance.");
        System.out.println("As you tread forward you gain a closer look.\n it seems as though they are glowing eggs");
        System.out.println("The first egg is has a faint golden glow and the second has a vibrant green glow.");
        System.out.println("after careful observation you notice that there is a door containing a lock behind each egg ");
        System.out.println("You now know you have to break one of the eggs to retrieve the key to continue.\nWhich egg do you break?1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int eggs = scanner.nextInt();
        if (eggs == 1) {
            System.out.println("After breaking the egg you start to see a golden key emerge form it");
            System.out.println("You then slide the key into the rusted lock.\n as the door creeps open you hear a grunting echoing towards you");
        } else {
            System.out.println("The green illuminating egg begins to hiss violently.");
            System.out.println("Then all of a sudden a giant flesh eating snake lunges at you and you fall down.");
            System.out.println("In a desperate attempt to escape you find a screw driver.\n fearing the snake will eat you alive you forcefully impale the snake's eye.");
            System.out.println("how hard do you penetrate the snake? enter a number!");
            int pierce = scanner.nextInt();
            if (pierce == 1) {
                System.out.println("the snake give off a screeching noise and becomes a corpse.");
            } else {
                int bite = 5;
                for (int x = 0; x < bite; x++) {
                    userHealth -= 1;
                }
                System.out.println("as you penetrate the snake with the screw driver it somehow manages to bite your arm");
                System.out.println("your health is now:" + userHealth);
                System.out.println("the snake then drops to the ground and leaves a a fang stuck in your arm.\n you use it to pick the lock to the second door.");

            }
        }
        is_dead();
        room_2();
    }

    public static void room_2() {
        System.out.println("You open the door the all a sudden you hear a loud grunting noise.");
        System.out.println("You start to see mangled humanoid right in front of you.");
        System.out.println("Frighten by the sight you freeze in a panic.\nIn that brief moment you notice that goul like figure has no eyes.");
        System.out.println("Thinking it will not notice you step forward and it stares into your eyes as if it senses your every movement.");
        System.out.println("Behind the mangled being you see a door.\nYou know in order to get past it you have two options crawl past it or strike the goul down.?");
        System.out.println("Which option do you choose 1 or 2");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("you some how manage to sneak your way past the ghoul and force the door open as fast as you can.");

        } else {
            int scratch = 5;
            for (int x = 0; x < scratch; x++) {
                userHealth -= 1;
            }
            System.out.println("The ghoul swings its claws at you as you hit it with your fist.");
            System.out.println("your health is now:" + userHealth);
            System.out.println("the ghoul is now slain making the path to the door clear.");

        }
        is_dead();
        room_3();
    }
    public static void is_dead() {
        if (userHealth <= 0) {
            System.out.println("you have died");
            //throw new NullPointerException();
            System.exit(11);
        }
    }

    public static void room_3() {
        System.out.println("You open the door in a hurry while entering the room you almost step on what seems like a pressure plate.");
        System.out.println("you see two pressure plates and a door behind it");
        System.out.println("on both plates you see different symbols which look like hieroglyphics.");
        System.out.println("on the first pressure plate you see a line, bird, bowl, and line.");
        System.out.println("on the second pressure plate you see a snail, raven, feathers, lion, bird and eye.");
        System.out.println("you know if you step on the correct pressure plate the door will open.\n which pressure plate do you step on 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int pressure = scanner.nextInt();
        if (pressure == 1) {
            System.out.println("with a bit of force the plate slides into the ground causing the door to swing open.");
            System.out.println("as you pass through the door you walk into a loud crunching noise as you take each step.");
        } else {
            System.out.println("the pressure plate slides into the ground then there is a brief pause.");
            System.out.println("then all of a sudden the room starts rumbling. you start to see the floor opening.");
            System.out.println("you stare into the bottomless pit the floor displays.\n fearing you might fall in you jump over it and land on the first plate.");
            System.out.println("while jumping in the air the pit spews a sizzling dark black ooze onto your legs.");
            System.out.println("fortunately it does not burn through your clothes leaving you burnt free but now your covered in dark ooze");
            System.out.println("the door swings open and you encounter a maze of bones");
        }
        is_dead();
        room_4();
    }

    public static void room_4() {
        System.out.println("You open the door the all a sudden you hear a loud crunching noise as you step forward.");
        System.out.println("You start to see a labyrinth of bone which seems to be leading to a door with empty case on it which says give offering.");
        System.out.println("making you way through the challenging path of bones you discover two sugar skulls.");
        System.out.println("the first skull has a decorated flower on it and the second as a scythe painted on it.");
        System.out.println("you one of the skull needs to presented as an offering to the case.\n which skull do you offer 1 or 2 ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("you place the flower skull inside the case. the room gives off a rose aroma and the door opens.");
        } else {
            int bite = 5;
            for (int x = 0; x < bite; x++) {
                userHealth -= 1;
            }
            System.out.println("you place the scythe decorated skull in the case. the all of a sudden the bones merges into a four legged creature.");
            System.out.println("the creature latches onto your arm causing a minor cut. luckily you kick it off of your arm and the creature crumbles into pieces.");
            System.out.println("your health is now:" + userHealth);
            System.out.println("the creature is now defeated. you replace the second skull with the first causing the door to slowly open.");
        }
        is_dead();
        room_5();
    }

    public static void room_5() {
        System.out.println("You open the door to the next room it is pitch black.\nYou manage to find a dim flashlight");
        System.out.println("As you shine your light to clear a path way you discover bats sleeping bat hanging above you.");
        System.out.println("Fearing you would wake them up you shine the light in front of you and you find out that there is a door with two levers on each side.");
        System.out.println("Under each lever there is an engraving. the first one says abrir and the second says luz.");
        System.out.println("Your curiosity tells you that one of these levers opens the door.\nWhich lever do you choose 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int lever = scanner.nextInt();
        if (lever == 1) {
            System.out.println("you forcefully push down the lever.\nThe door creeks open...");
            System.out.println("you exit the door with great relief know you did not wake the bats.");
        } else {
            System.out.println("you push down the lever.then all of a sudden the room lights up.");
            System.out.println("you start to hear hundreds of screeching noises.\nThen in a blink of an eye the bats swarm you.");
            System.out.println("out of panic you shine your flash light at them.\nThe bats become stunned causing them to forcefully ram into the door.");
            System.out.println("the bats force open the door and fly out of the room. knowing that you are free you run to the door and exit the room.");
        }
        is_dead();
        System.exit(10);
    }

    public static void next_room3_3() {
        System.out.println("As you open the third door you get a sinking feeling.");
        System.out.println("You are reluctant to look down, you look down and notice there is no floor.");
        System.out.println("you fall to your death");
        System.exit(4);
        is_dead();
    }

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
                    is_dead();
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


    public static void next_room2() {
        System.out.println("You creep through the door with the spider door knob.");
        System.out.println("Once inside you notice that there only a staircase. You proceed to go up the stairs, you arrive in the mansion's attic.");
        System.out.println("There are two boxes one with descriptions on them. The first reads curiosity killed the cat. The second one reads those that searching will never be lost.");
        System.out.println("Which box will you choose 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();
        if (boxes == 2) {
            System.out.println("You open the second box and a spider springs out at you tripping and hitting you head on the ground.\nYou quickly gather yourself and notice that the spider is dead.\nYou look back in the box and there is a key to unlock the door.");
            userHealth -= 1;
            System.out.println(userHealth);
            System.out.println("You notice there is a trap door cover by some boxes.\nYou move them and take the key and you use it on the lock.");
            System.out.println("You see a torch and grab it as the room becomes illuminated you notice another set of doors.\nThe first door has a inscription reading all great journeys must come to an end.\nThe second door reads those that wander arent always lose.");
        } else {
            System.out.println("Suddenly a giant tarantula creeps out from the box!\nYou search around the room for a weapon you find an antique mace.\nHow hard do you attack?\nEnter number amount:");
            int power = scanner.nextInt();
            if (power >= 5) {
                System.out.println("As luck with have it the mace was keep in excellent condition.\nSo it was able to with stand your full strength. Instantly reducing the spider to a pulp.");
                System.out.println("You look back in the first box seeing nothing was in there you moved on to the next box.\nBeing prepare this time you poke the box and out jumps a dead spider.\nyou grab the key and head over the tower of boxes.\nYou move them out the way and you head throught the trap door.");
                System.out.println("You see a torch and grab it as the room becomes a illuminated you notice another set of doors.\nThe first door has a inscription reading all great journeys must come to an end.\nThe second door reads those that wander arent always lose.");
            } else {
                int poison = 7;
                for (int i = 0; i < poison; i++) {
                    userHealth -= 1;
                }
                System.out.println("You swing the old mace but you feel it crack mid swing. You slowed your strike to account for this, The spider was able to reach you and is able to bite you in the leg. You take another swing and kill it this time.");
                System.out.println("You have this amount of health remaining:" + userHealth);
                is_dead();
            }
        }
        System.out.println("You look back in the first box seeing nothing was in there you moved on to the next box.\nBeing prepare this time you poke the box and out jumps a dead spider.\nYou grab the key and head over the tower of boxes.\nYou move them out the way and you head through the trap door.");
        System.out.println("You see a torch and grab it as the room becomes a illuminated you notice another set of doors.\nThe first door has a inscription reading all great journeys must come to an end.\nThe second door reads those that wander arent always lose.");
        System.out.println("Which door do you choose:");
        int rooms = scanner.nextInt();
        switch (rooms) {
            case 1:
                next_room21();
            case 2:
                next_room22();
            default:
                System.out.println("Invalid answer please try again.");
        }
    }


    public static void next_room21() {
        System.out.println("You proceed to through the first door and arrive in the underground bunker.");
        System.out.println("it rather spacious, the furniture resembles a 1950s style home.\nYou notice there is a tv at the center of the room. The TV suddenly turns on and it your grandfather.");
        System.out.println("My kin you have always been the nice and brightest of my lot. You see I am a researcher of the occult.\nThrough my studies I came across a old relic. Though looking back my efforts were fruitless.");
        System.out.println("I knew if this relic got into the wrong hands it world bring ruin to anyone unlucky enough to share a fate with it.");
        System.out.println("As you can probably tell it has already started corrupting my estate.\nI can only pray it not to far gone when you get here.");
        System.out.println("However if you see this message that means you made it, and as my final wish. Please destroy this cursed relic!");
        System.out.println("I discovered that when it comes in contact with water it begins to degrade rapidly.");
        System.out.println("By time I came to ths discovery it was too late I already corrupt. So I Locked my self in this room with the relic.");
        System.out.println("Please stop me and put a end to the madness of this mansion.");
        System.out.println("You are hit with a wave of sadness as you know what you must do. You feel a strong wave of dread radiating from the door to your right.");
        System.out.println("You grab your grandfathers claymore of the wall, and brace yourself for what comes next.");
        System.out.println("You swing the door open and there lies your grandfather with glowing orange eyes with a shadowy veil surrounding him.\nWhile holding a strange pumpkin.");
        System.out.println("You deduce that the strange pumpkin is the relic.\nYou are stuck with a herculean size decision.\nWill you try to reason with your grandfather or attack first?");
        System.out.println("Will it be choice 1 or choice 2?");
        Scanner Key = new Scanner(System.in);
        int choice = Key.nextInt();
        if (choice == 1) {
            System.out.println("You try to reason with your grandpa calling out his name urging him to fight back and resist the effects of the relic.");
            System.out.println("He suddenly starts fall to the floor the orange in his eyes fade. It your grandpa, but for you could say anything.");
            System.out.println("He says my my how much you have grown. What they say about time is true just flies by. Listen I don't have long until it possesses me again.");
            System.out.println("You have come a long way, but there is no way to save me so don't you think about trying, you hear me?!.\nWhile im me finish me and destroy the relic.");
            System.out.println("I know im asking the world of you. Don't worry ill always be in your heart. he smiles");
            System.out.println("With tears in your eyes your ready your sword preparing to strike.\nHow hard do you swing?");
            int power = Key.nextInt();
            if (power == 0) {
                System.out.println("You try and try to bring yourself to finish the task at hand you cant do it. Not to your grandfather.");
                System.out.println("Instead you run and grab the relic from him. He yells you fool! but it to late the shadow veil has moved on from him to you.");
                System.out.println("You open the doors that lead to outside and make way for the river. The whole time you fell the relic getting closer to claiming you.");
                System.out.println("You make it to the river, but you can feel that every bit of your strength has been stolen.\nIn a last ditch effort you fall in to the river. The relic fades from existence and you black out.");
                System.out.println("Suddenly you feel a tugging sensation. You wake and see it your grandfather! You have both made it out alive.");
                System.out.println("Congrats on achieving Happily Ever After ending.\n Thank you for playing our game");
                System.exit(1);
            } else {
                System.out.println("With a heavy heart you strike your grandfather. He falls to his knees, the shadow veil leaves his body.\nFor a moment he is your grandpa once more. His final words were I knew you had it in you champ. Thank you.");
                System.out.println("The bunker doors open revealing outside. You take the relic outside with you.\nYou walk to the river that you and your grandfather would fish by and toss in the relic in it.");
                System.out.println("It slowly reduce to dust in the shimmering water.");
                System.out.println("Congrats on achieving the champion ending.\nThank you for playing our game.");
                System.exit(2);
            }
        } else {
            System.out.println("Knowing that your grandfather too far gone in your heart.\nYou ready all your might to make it as swift as possible.");
            System.out.println("In one quick decisive slash. The evil leaves your grandfather body. He falls to his knees. and the relic rolls out of his hands.");
            System.out.println("The doors leading to outside open. You take the relic and your grandfather and walk over to the river you play at with you were a child");
            System.out.println("You throw the relic into the river. you and your grandfather release a sigh of relieve as it erodes away.");
            System.out.println("Your grandfather says look obviously I don't have a lot of time left. So I wanted to stay that I could never thank you enough.\nNot only did you save me from my own fate but very well the world's!");
            System.out.println("Your the greatest grandchild any one could of have ask for. He smiles. He goes on and say well my time is near cough, oh!\nHere it the key to my estate. I entrust it to you.");
            System.out.println("He lets out one final smile and then he gone.\nCongrats on the Honorable ending!\nThank you for playing out game.");
            System.exit(3);
        }
    }

    public static void next_room22() {
        System.out.println("You creep through the door with a strange reflection to it. You're hit with a bright light once your through.");
        System.out.println("After your eyes adjust, you see what seems to be a room surrounded by mirrors.");
        System.out.println("You turn behind you to check if the door is still there but it now just a mirror.\nIn the center of the room you see two pedestal.");
        System.out.println("The first is the key to your grandfather's estate and his fortune.\nThe second one is a fishing rod that you used when you were younger with your grandfather.");
        System.out.println("Which one will you choose? 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int ped = scanner.nextInt();
        switch (ped) {
            case 1:
                System.out.println("You grab the keys and his will. You then hear is this what you really came here for? My own kin just came for personal gain.");
                System.out.println("I thought you were better then this. The voice starts to fade. The room then starts to fill with a dark gaseous substance.");
                System.out.println("you start grasping for air and realize you fate. You blackout. You have died");
                System.out.println("Congrats on the Bad ending.\nThank you for playing.");
                System.exit(5);
                break;
            case 2:
                System.out.println("You grab the fishing rod. From the corner of your eye you see something materialize. Your grandfather appears, he smiles at you.");
                System.out.println("He walks over and grabs the keys and his will and hands it to you.\nYour grandfather then says I knew you were always the amazing person I thought you were. I just needed to make sure you were still the same as before.");
                System.out.println("They are yours to have. You cut him off and ask is there any way to save him.\nHe smiles at you and said no Im too far gone the last good deed i can do for this world is to purify this of it evil.");
                System.out.println("He brings up a door and ushers you out. He smiles at you one last time and says goodbye. You then see the house start shimmer brilliantly in a white glow.");
                System.out.println("The evil feeling you can feel from the house is now gone and the house is now white");
                System.out.println("Congrats on the Test ending.\nThank you for playing.");
                System.exit(6);
                break;
            default:
                System.out.println("Invalid answer please try again.");
        }
    }

    public static void next_room3() {
        System.out.println("With a bit of force you open the slime ridden door.\nYour now in a room that seems to be like the boiler room.\nHowever it cover in a thick bright green goo.");
        System.out.println("As you explore the room making sure to avoid the goo. You find two mysterious machines.\nYou figure that these machine are the way out of this room");
        System.out.println("As you are searching around the machines on the back of them you know strange engraving.\nYou make out the first machine's engraving");
        System.out.println("It reads salvación.\nThe second machine looks more decrypt and it harder to make out after a small bit of time you figure out.");
        System.out.println("It reads peligro.");
        System.out.println("You know that you have to activate one of them to get out of this room.\nWhich machine do you choose?\nMachine 1 or 2?");
        Scanner scanner = new Scanner(System.in);
        int machines = scanner.nextInt();
        if (machines == 1) {
            System.out.println("You start to hear the machine come to life. It heaves and rumbles as if a old man.\nWith a loud pop it finally starting running properly.");
            System.out.println("You then notice that a wall starts to slide into the ground.\nIt reveals two doors.");
        } else {
            System.out.println("The second machine starts to run smoothly no apparent issues. All of a sudden it starts to smoke and screech");
            System.out.println("You start to worry and you find a wrench. Fearing that the machine will blow you hit it in a desperate attempt.");
            System.out.println("How hard do you hit it? enter a number:");
            int wack = scanner.nextInt();
            if (wack == 1) {
                System.out.println("The machine lets out a whine but then settles down. You hear a loud slam. You instinctively turn around.\nThen notice that there are now two doors.");
            } else {
                int explosion = 5;
                for (int x = 0; x < explosion; x++) {
                    userHealth -= 1;
                }
                System.out.println("You hit the machine and instantly feel a wave of regret as the machine starts to shake violently.");
                System.out.println("The Machine starts to glow brilliantly and then explodes.\n after a bit of time you waken and notice the room is now in shambles.");
                System.out.println("Miraculously you are okay but of course a bit ding up.\nYour health is now:" + userHealth);
                is_dead();
                System.out.println("As you gather your self you notice that a wall used to be there is now a stack of rumble.\nBehind it is two doors.\nThe first door is freezing to the touch and almost fells like metallic.");
                System.out.println("The second door is rather small as if only a child could walk through it.\nWhich door do you choose 1 or 2?");
                int finchoice = scanner.nextInt();
                switch (finchoice) {
                    case 1:
                        next_room31();
                    case 2:
                        next_room32();
                    default:
                        System.out.println("Invalid answer please try again.");
                        break;
                }

            }
        }
    }

    public static void next_room31() {
        System.out.println("You proceed to through the first door and arrive in what seems to be your freezer.");
        System.out.println("As your exploring the room you hear the slam shut and click.");
        System.out.println("Realizing your situation you sit in a corner and await your fate.");
        System.out.println("You have died.\nCongrats on the Lazy Writing ending.\nThank you for playing");
        System.exit(7);
    }

    public static void next_room32() {
        System.out.println("You open the small door and realize it a crawl space.");
        System.out.println("You get on your belly and begin to crawl through it.\nIt is litter with bugs and dust.");
        System.out.println("You can make out that there is a door not to far out.You get caught on something you look back it a hand.");
        System.out.println("You kick of the hand and start to hurry towards the door while hands all around you are sprouting out the ground");
        System.out.println("You finally make it to the door and bust out of it and lay on the ground grasping for air.\nYou have escaped!");
        System.out.println("Congrats on the Escapist ending.\nThank you for playing");
        System.exit(8);
    }
}






