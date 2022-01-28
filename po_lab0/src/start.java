import pl.igokaw.po.lab0.osoba;

public class start {
    public static void main(String[] args){
        //zad 1
        System.out.println("\n Zadanie 1 :");
        int x1=31+29+31;
        System.out.print(x1);

        osoba Igor = new osoba();
        //zad 2
        System.out.println("\n Zadanie 2 :");
        int x2=0;
        for(int i=1; i<11; i++){
            x2=x2+i;
        }
        System.out.print(x2);

        //zad 3
        System.out.println("\n Zadanie 3 :");
        int x3=1;
        for(int i=1; i<11; i++){
            x3=x3*i;
        }
        System.out.print(x3);

        //zad 4
        System.out.println("\n Zadanie 4 :");
        double start=1000;
        double oproc=0.06;
        for(int i=1; i<4; i++){
            start=start+(start*oproc);
        }
        System.out.print(start + "\n");

        //zad 5
        System.out.println("------");
        System.out.println("|JAVA|");
        System.out.println("------");

        //zad 6
        System.out.println("\nZadanie 6 :");
        System.out.println("  //♛//");
        System.out.println(" +''''''+");
        System.out.println("(| o o |)");
        System.out.println("  | ~ |  ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


        //zad 9 dodatkowe
        System.out.println("´´´´´´´¶¶¶¶´´´´´´´´´´´´´´´´´´\n" +
                "´´´´´´¶¶´´´´¶¶¶¶¶´´¶¶¶¶´¶¶¶¶´´\n" +
                "´´´´´´¶´´´´´´´´´´¶¶¶¶´¶¶´´´´¶´\n" +
                "´´´´´´¶´´´´´´´´´´¶´¶¶¶¶¶¶´´´¶´\n" +
                "´´´´´¶´´´´´´´´´´¶¶¶¶¶´´´¶¶¶¶¶´\n" +
                "´´´´¶´´´´´´´´´´´´´´´´¶¶¶¶¶¶¶¶´\n" +
                "´´´¶´´´´´´´´´´´´´´´´´´´¶¶¶¶¶´´\n" +
                "´¶¶¶´´´´´¶´´´´´´´´´´´´´´´´´¶´´        <------     | Hello beginner ! |\n" +
                "´´´¶´´´´¶¶´´´´´´´´´´´´´´´´´¶´´\n" +
                "´´´¶¶´´´´´´´´´´´´´´´´¶¶´´´´¶´´\n" +
                "´´¶¶¶´´´´´´´´´¶¶¶´´´´¶¶´´´¶¶´´\n" +
                "´´´´´¶¶´´´´´´´´´´´´´´´´´´¶¶¶´´\n" +
                "´´´´´´´¶¶¶´´´´´´´´´´´´´¶¶¶´´´´\n" +
                "´´´¶¶¶¶¶´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´´´\n" +
                "´´´¶´´´´¶¶¶¶¶´´´´¶¶¶¶´´´¶´´´´´\n" +
                "´´´¶´´´´¶¶¶´¶¶¶¶¶¶¶¶´´´¶¶¶´´´´\n" +
                "´´´¶¶¶¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶´´´¶¶´´\n" +
                "´´¶´´´´´´¶¶¶¶¶¶¶¶¶¶¶´´´´´´´¶´´\n" +
                "´¶´´´´´´´´´¶¶¶¶¶¶¶¶´´´´´´´´¶´´\n" +
                "´´¶´´´´´´´´¶¶¶¶¶¶¶¶´´´´´´´´¶´´\n" +
                "´´¶¶´´´´´´´¶¶´´´´¶¶´´´´´´¶¶´´´\n" +
                "´´´´¶¶¶¶¶¶¶´´´´´´´´¶¶¶¶¶¶´´´´´");

        //zad 10
        System.out.println("\nZadanie 10 :");
        System.out.println("Wojtowski");
        System.out.println("Bieranowski");
        System.out.println("Sopelek");
        /*
        System.out.print("Wojtowski\n");
        System.out.print("Bieranowski\n");
        System.out.print("Sopelek\n");
        */


        //zad 11
        System.out.println("\nZadanie 11 :");
        System.out.println("Na górze róże\n" +
                "Na dole padlina\n" +
                "Nic mnie nie cieszy\n" +
                "Życie to kpina \uD83D\uDC4D ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

    }
}
