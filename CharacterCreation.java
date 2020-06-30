import java.util.Scanner;

public class CharacterCreation {

    public CharacterCreation() {
        Scanner Statistics = new Scanner(System.in);

        String name;

        /*
        int level = 1;
        int exp = 0;
        int health = 10;
        int mana = 10;
        int intelligence = 1;
        int luck = 1;
        int strength = 1;
        int persuasion = 1;
        int stamina = 1;
        int stealth = 1;
        int point = 10;
         */

        String statNames[] = {"level       ", "experience  ", "health      ", "mana        ", "intelligence", "luck        ", "strength    ", "persuasion  ", "stamina     ", "stealth     ", "point       "};
        int stats[] = {1, 0, 10, 10, 1, 1, 1 ,1 ,1 ,1, 10};
        String decision1, decision2;
        int decision3;

        System.out.println("What is your name?");
        name = Statistics.nextLine();

        System.out.println("Your profile is:");

        /*
        System.out.println("Name: " + "\t" + name);
        System.out.println("Level: " + "\t" + level);
        System.out.println("Experience: " +  "\t" +exp);
        System.out.println("Health: " + "\t" + health);
        System.out.println("Mana: " +  "\t" +mana);
        System.out.println("Intelligence: " + "\t" + intelligence);
        System.out.println("Luck: " + "\t" + luck);
        System.out.println("Strength: " + "\t" + strength);
        System.out.println("Persuasion: " + "\t" + persuasion);
        System.out.println("Stamina: " + "\t" + stamina);
        System.out.println("Stealth: " + "\t" + stealth);
        System.out.println("Upgrade Points: " + "\t" + point);
         */

        for(int statcounter = 0; statcounter < stats.length; statcounter++)
            System.out.println(statNames[statcounter] + "\t" + "\t" + stats[statcounter]);

        if (stats[10] == 0) {
            System.out.println("You have " + stats[10] + " upgrade points, you cannot upgrade any stats.");
        } else if (stats[10] == 1) {
            System.out.println("You have " + stats[10] + " upgrade point, would you like to upgrade a stat? Yes or No?");
        } else {
            System.out.println("You have " + stats[10] + " upgrade points, would you like to upgrade a stat? Yes or No?");
        }

        decision1 = Statistics.nextLine();
        if(decision1.equals("Yes") || decision1.equals("yes")) {
            System.out.println("Which stat would you like to upgrade?");
            System.out.println("Health" + "\n" + "Mana" + "\n" + "Intelligence" + "\n" + "Luck" + "\n" + "Strength" +  "\n" + "Persuasion" +  "\n" + "Stamina" + "\n" + "Stealth" );

            /*
            System.out.println("Mana");
            System.out.println("Intelligence");
            System.out.println("Luck");
            System.out.println("Strength");
            System.out.println("Persuasion");
            System.out.println("Stamina");
            System.out.println("Stealth");
            */

            decision2 = Statistics.nextLine();

            System.out.println("How many times do you want to upgrade?");
            decision3 = Statistics.nextInt();
            Statistics.nextLine();

            switch(decision2){
                case "Health":
                    stats[2] += decision3;
                    System.out.println("Health is now " + stats[2]);
                    break;
                case "Mana":
                    stats[3] += decision3;
                    System.out.println("Mana is now " + stats[3]);
                    break;
                case "Intelligence":
                    stats[4] += decision3;
                    System.out.println("Intelligence is now " + stats[4]);
                    break;
                case "Luck":
                    stats[5] += decision3;
                    System.out.println("Luck is now " + stats[5]);
                    break;
                case "Strength":
                    stats[6] += decision3;
                    System.out.println("Strength is now " + stats[6]);
                    break;
                case "Persuasion":
                    stats[7] += decision3;
                    System.out.println("Persuasion is now " + stats[7]);
                    break;
                case "Stamina":
                    stats[8] += decision3;
                    System.out.println("Stamina is now " + stats[8]);
                    break;
                case "Stealth":
                    stats[9] += decision3;
                    System.out.println("Stealth is now " + stats[9]);
                    break;
            }

            /*
            if(decision2.equals("Health")  || decision2.equals("health")) {
                System.out.println("How many times do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (stats[10] == 1) {
                    System.out.println(health + 1);
                } else {
                    System.out.println(health + decision3);
                }
            }


            if(decision2.equals("Mana")  || decision2.equals("mana")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(mana + 1);
                } else {
                    System.out.println(mana + decision3);
                }
            }


            if(decision2.equals("Intelligence")  || decision2.equals("intelligence")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(intelligence + 1);
                } else {
                    System.out.println(intelligence + decision3);
                }
            }


            if(decision2.equals("Luck")  || decision2.equals("luck")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(luck + 1);
                } else {
                    System.out.println(luck + decision3);
                }
            }


            if(decision2.equals("Strength")  || decision2.equals("strength")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(strength + 1);
                } else {
                    System.out.println(strength + decision3);
                }
            }


            if(decision2.equals("Persuasion")  || decision2.equals("persuasion")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(persuasion + 1);
                } else {
                    System.out.println(persuasion + decision3);
                }
            }


            if(decision2.equals("Stamina")  || decision2.equals("stamina")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(stamina + 1);
                } else {
                    System.out.println(stamina + decision3);
                }
            }


            if(decision2.equals("Stealth")  || decision2.equals("stealth")) {
                System.out.println("How many time do you want to upgrade?");
                decision3 = Statistics.nextInt();

                if (point == 1) {
                    System.out.println(stealth + 1);
                } else {
                    System.out.println(stealth + decision3);
                }
            }
             */

        } else if(decision1.equals("No") || decision1.equals("no")){
            System.out.println("You do not want to upgrade any stats.");
        } else {
            System.out.println("Oops! There was an error!");
        }
    }
}
