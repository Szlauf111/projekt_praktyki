import java.util.Scanner;

public class projekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name[] = {"", "Kotlet mielony z ziemniakami", "Pizza peperoni", "Humburgurger", "Sphagetti", "Kurczak z ryżem", "Żeberka", "Kebab", "Sałatka z kurczakiem", "Paluszki rybne", "Polędwica wieprzowa nadziewana łososiem w otoczce z farszu z cielęciny z dodatkiem wątróbki i szparag, zawinięta w szynkę parmeńską i kapustę włoską w sosie z groszku cukrowego"};

        double cost[] = {0, 8.50, 6.50, 10.99, 7.60, 2.50, 24.99, 13.00, 3.99, 5.99, 56.99};

        String rest[] = {"", "restauracja pod dwoma złotymi łukami", "restauracja merlin", "pyra bar", "restauracja miód i mleko"};

        System.out.println("Wybierz które danie chciałbyś zamówić");

        for(int i = 1; i<=10; i++){
            System.out.println(i+". "+name[i] + " | cena: " + cost[i] + "zl");
        }
        System.out.println(" ");
        int wybor = scan.nextInt();

        switch(wybor) {
            case 1:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 2:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 3:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 4:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 5:
                System.out.println("Dodałeś "+ name[wybor]);            
            break;

            case 6:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 7:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 8:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 9:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            case 10:
                System.out.println("Dodałeś "+ name[wybor]);
            break;

            default:
                System.out.println("zla liczba");
            break;
        }

        System.out.println(" ");
        System.out.println("Wybierz do ktorej restauracji wysłać wybrane danie: ");

        for(int i = 1; i<=4; i++){
            System.out.println(i+". "+rest[i]);
        }
        
        System.out.println(" ");
        int wybor2 = scan.nextInt();
        switch(wybor2){
            case 1:
                System.out.println("Wybrałes "+ rest[wybor2]);
            break;

            case 2:
                System.out.println("Wybrałeś "+ rest[wybor2]);
            break;

            case 3:
                System.out.println("Wybrałeś "+ rest[wybor2]);
            break;

            case 4:
                System.out.println("Wybrałeś "+ rest[wybor2]);
            break;

            default:
                System.out.println("zla liczba");
            break;
        }

        System.out.println(" ");
        System.out.println("Podsumowanie: ");
        System.out.println(" ");
        System.out.println("Danie/a: "+ name[wybor]);
        System.out.println("Restauracja: "+rest[wybor2]);
        System.out.println("Suma do zapłaty: "+cost[wybor]+"zl");
    }
}