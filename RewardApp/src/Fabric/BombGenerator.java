package Fabric;

import Interface.iGameItem;
import Product.Bomb;

public class BombGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem(){
        return new Bomb();
    }
}
