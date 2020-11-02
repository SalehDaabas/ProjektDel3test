package del3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Passenger> ac = new ArrayList<Passenger>();

        PriceClass priceClass = new PriceClass();

        Passenger passenger = new Passenger();






        System.out.println("Hej! Programmet är redo att användas! Tryck 1 för att starta programmet eller tryck 2 för att avsluta programmet ");
          int i = scan.nextInt();

        while (i == 1) {




            System.out.println("För enkel tågbiljett tryck 1, För månadsbiljett tryck 2");
            priceClass.ticketType = scan.nextInt();


            System.out.println("Hej! vad är ditt namn?");
            passenger.setName(scan.next());
            System.out.println("Hur gammal är du?");
            passenger.setAge(scan.nextInt());

            Passenger list = new Passenger(passenger.getName());
            ac.add(list);

            if (passenger.getAge() < 18) {
                priceClass.ticket = 20;
                priceClass.monthlyCard = 450;

            } else if (passenger.getAge() < 65) {
                priceClass.ticket = 35;
                priceClass.monthlyCard = 600;

            } else {
                priceClass.ticket = 20;
                priceClass.monthlyCard = 450;
            }


            switch (priceClass.ticketType) {
                case 1:
                    priceClass.price = priceClass.ticket;
                    priceClass.typAvBiljett = "Enkel Tåg biljett";
                    break;
                case 2:
                    priceClass.price = priceClass.monthlyCard;
                    priceClass.typAvBiljett = "Månadskort";
            }

            System.out.println("Namn: " + passenger.getName() + ":" + " Typ av biljett: " + priceClass.typAvBiljett + " Pris: " + priceClass.price +"kr");
            System.out.println("Hej! vill du lägga till en resenär tryck 1, Om det inte finns fler resenärer tryck 2 för att avsluta. ");
            i = scan.nextInt();
        }


        System.out.println("Listan med alla passagerare namn:");
        System.out.println(ac);











    }

}
