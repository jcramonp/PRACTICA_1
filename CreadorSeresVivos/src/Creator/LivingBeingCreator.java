package Creator;

import BeingsOfTheEarth.Dog;
import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.LivingBeing;
import SkyBeings.Angel;
import SkyBeings.Bird;

import java.util.Scanner;

public class LivingBeingCreator implements Creator {
    private Scanner scanner;

    public LivingBeingCreator() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public LivingBeing createLivingBeings() {
        int opcion = 0;
        do {
            Creator creator = new LivingBeingCreator();
            int opcionsub = 0;

            System.out.println("|--------------------------------|");
            System.out.println("|        1. human                |");
            System.out.println("|        2. Bird                 |");
            System.out.println("|        3. Angel                |");
            System.out.println("|        4. Dog                  |");
            System.out.println("|        5. Salir                |");
            System.out.println("|--------------------------------|");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();


            switch (opcion) {
                case 1:
                    Human human=new Human();
                    System.out.println("|--------------------------------|");
                    System.out.println("|        1. born                 |");
                    System.out.println("|        2. grow                  |");
                    System.out.println("|        3. Die                   |");
                    System.out.println("|        4.reproduce             |");
                    System.out.println("|        5. fly                  |");
                    System.out.println("|        6. changeDimension      |");
                    System.out.println("|                                |");
                    System.out.println("|--------------------------------|");
                    System.out.println("Ingrese opcion");
                    opcionsub = scan.nextInt();

                    switch (opcionsub) {
                        case 1:
                            human.born();
                            break;
                        case 2:
                            human.grow();
                            break;
                        case 3:
                            human.die();
                            break;
                        case 4:
                            human.reproduce();
                            break;
                        case 5:
                            human.fly();
                            break;
                        case 6:
                            human.changeDimension();
                            break;
                        default:
                            System.out.println("Opción no válida. Creando un humano por defecto.");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("|--------------------------------|");
                    System.out.println("|        1. born                 |");
                    System.out.println("|        2. grow                  |");
                    System.out.println("|        3. Die                   |");
                    System.out.println("|        4.reproduce             |");
                    System.out.println("|        5. fly                  |");
                    System.out.println("|        6. changeDimension      |");
                    System.out.println("|                                |");
                    System.out.println("|--------------------------------|");
                    Bird bird = new Bird();
                    System.out.println("Ingrese opcion");
                    opcionsub = scan.nextInt();

                    switch (opcionsub) {
                        case 1:
                            bird.born();
                            break;
                        case 2:
                            bird.grow();
                            break;
                        case 3:
                            bird.die();
                            break;
                        case 4:
                            bird.reproduce();
                            break;
                        case 5:
                            bird.fly();
                            break;
                        case 6:
                            bird.changeDimension();
                            break;
                        default:
                            System.out.println("Opción no válida. Creando un humano por defecto.");
                            break;

                    }
                    break;
                case 3:
                    System.out.println("|--------------------------------|");
                    System.out.println("|        1. born                 |");
                    System.out.println("|        2. grow                  |");
                    System.out.println("|        3. die                  |");
                    System.out.println("|        4.reproduce             |");
                    System.out.println("|        5. fly                  |");
                    System.out.println("|        6. changeDimension      |");
                    System.out.println("|                                |");
                    System.out.println("|--------------------------------|");
                    Angel angel = new Angel();
                    opcionsub = scan.nextInt();
                    switch (opcionsub) {
                        case 1:
                            angel.born();
                            break;
                        case 2:
                            angel.grow();
                            break;
                        case 3:
                            angel.die();
                            break;
                        case 4:
                            angel.reproduce();
                            break;
                        case 5:
                            angel.fly();
                            break;
                        case 6:
                            angel.changeDimension();
                            break;
                        default:
                            System.out.println("Opción no válida. Creando un humano por defecto.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("|--------------------------------|");
                    System.out.println("|        1. grow                 |");
                    System.out.println("|        2. born                  |");
                    System.out.println("|        3. die                  |");
                    System.out.println("|        4. reproduce            |");
                    System.out.println("|--------------------------------|");
                    Dog dog = new Dog();
                    opcionsub = scan.nextInt();
                    switch (opcionsub) {
                        case 1:
                            dog.grow();
                            break;
                        case 2:
                            dog.born();
                            break;
                        case 3:
                            dog.die();
                            break;
                        case 4:
                            dog.reproduce();
                            break;
                        default:
                            System.out.println("Opción no válida. Creando un humano por defecto.");
                            break;
                    }


            }

        }while (opcion != 5) ;
        return null;
    }

}



