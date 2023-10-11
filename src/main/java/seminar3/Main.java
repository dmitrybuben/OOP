package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new CatPharmacy();
        Component penicil = new Penicillin("10mg");
        penicil.setWeight("7mg");
        catPharmacy.addComponent(new Arithromitsin("12mg"))
                .addComponent(new Water("10"))
                .addComponent(penicil);


        Pharmacy catPharmacy1 = new CatPharmacy();
        catPharmacy1.addComponent(new Arithromitsin("15mg"))
                .addComponent(penicil);

        Pharmacy catPharmacy2 = new CatPharmacy();
        catPharmacy2.addComponent(new Arithromitsin("15mg"))
                .addComponent(new Water("12mg"));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy2);
        for (Pharmacy components : pharmacyList) {
            System.out.println(components.getPharmacyPower());
        }

        /*while (((Iterator<Component>) catPharmacy).hasNext()) {
            System.out.println(((Iterator<Component>) catPharmacy).next());
        }*/

        for (Component component : catPharmacy) {
            System.out.println(component);
        }

        Collections.sort(pharmacyList);
        for (Pharmacy components : pharmacyList) {
            System.out.println(components.getPharmacyPower());
        }
    }
}
