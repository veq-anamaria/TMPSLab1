package factory;

public class Main {

        public static void main(String[] args) {
            Transport avion = Factory.createTransport("Avion", "Iliciuc", "Carti");
            Transport bus = Factory.createTransport("Bus", "Vesca", "Haine");

            System.out.println("********************************");

            System.out.println("Avion:" + avion);

            System.out.println("*******************************");

            System.out.println("Bus:" + bus);

            System.out.println("*******************************");
        }
    }
