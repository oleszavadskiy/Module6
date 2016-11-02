/**
 * Created by Олесь on 02.11.2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        MusicalShop shop = new MusicalShop();
        shop.setPianos(2);
        shop.setGuitars(16);
        shop.setTrumpets(7);
        System.out.println(shop);
        Map<String, Integer> order = new HashMap<>();
        order.put("piano", 0);
        order.put("guitar", 7);
        order.put("trumpet", 2);


        List<MusicalInstrument> guitarsToRemove = prepareOrder(shop, order);
        System.out.println("removed guitars: " + guitarsToRemove.size());

        List<MusicalInstrument> trumpetsToRemove = prepareOrder(shop, order);
        System.out.println("removed trumpets: " + trumpetsToRemove.size());

        System.out.println(shop);
    }

    private static List<MusicalInstrument> prepareOrder(MusicalShop shop, Map<String, Integer> order) {
        int numberOfPianosToRemove = order.get("piano");
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfTrumpetsToRemove = order.get("trumpet");

        if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
        if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
        if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();


        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);


        List<MusicalInstrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfPianosToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfGuitarsToRemove; i++) {
            result.add(new Guitar());
        }

        for (int i = 0; i < numberOfTrumpetsToRemove; i++) {
            result.add(new Trumpet());
        }
        return result;
    }
}


