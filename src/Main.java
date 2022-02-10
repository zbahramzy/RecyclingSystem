import container.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecyclingMachine machine = new RecyclingMachine();

        ContainerTypeA a1 = new ContainerTypeA();
        ContainerTypeA a2 = new ContainerTypeA();
        ContainerTypeA a3 = new ContainerTypeA();

        ContainerTypeB b1 = new ContainerTypeB();
        ContainerTypeB b2 = new ContainerTypeB();
        ContainerTypeB b3 = new ContainerTypeB();

        ContainerTypeC c1 = new ContainerTypeC();
        ContainerTypeC c2 = new ContainerTypeC();
        ContainerTypeC c3 = new ContainerTypeC();

        machine.insertContainer(a1);
        machine.insertContainer(a2);
        machine.insertContainer(a3);

        machine.insertContainer(b1);
        machine.insertContainer(b2);
        machine.insertContainer(b3);

        machine.insertContainer(c1);
        machine.insertContainer(c2);
        machine.insertContainer(c3);
        machine.insertContainer(c3);

        System.out.println("answer");
        Scanner input = new Scanner(System.in);
        String insert = input.nextLine();
        if(insert.equals("A")) {
            machine.insertContainer(new ContainerTypeA());
        } else if(insert.equals("B")) {
            machine.insertContainer(new ContainerTypeB());
        } else if(insert.equals("C")) {
            machine.insertContainer(new ContainerTypeC());
        } else {
            System.out.println("Could not identify container try again!");
        }

        System.out.println(machine.numberOfItemsA());
        System.out.println(machine.numberOfItemsB());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.numberOfItemsC());
        System.out.println(machine.totalNumberOfItems());
    }
}