package ch0123;

import ch1206.Plastic;
import ch1206.Powder;

public class GeneriPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

    }

}
