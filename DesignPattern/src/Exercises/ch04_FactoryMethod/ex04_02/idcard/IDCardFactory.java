package Exercises.ch04_FactoryMethod.ex04_02.idcard;
import java.util.HashMap;
import java.util.Map;

import Exercises.ch04_FactoryMethod.ex04_02.framework.Factory;
import Exercises.ch04_FactoryMethod.ex04_02.framework.Product;

public class IDCardFactory extends Factory {
    private Map<Integer, String> owners = new HashMap<Integer, String>();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        IDCard id_card = (IDCard)product;
        owners.put(id_card.getId(), id_card.getOwner());
    }
    public Map<Integer, String> getOwners() {
        return owners;
    }
}
