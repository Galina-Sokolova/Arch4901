package Fabric;

import Interface.iGameItem;
import Product.Health;
import Product.Ruby;

public class HealthGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Health();
    }
}
