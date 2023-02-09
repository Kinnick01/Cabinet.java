package org.example.data.drawer;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

public class SilverwareDrawer extends CabinetItem {
    @Override
    public void addtoItemList(Items targy) {
        if(targy.equals(Items.WOODEN_SILVERWARE) || targy.equals(Items.METAL_SILVERWARE)){
            itemList.add(targy);
        }
        else {
            System.out.println("Cannot put in evoeszkoz");
        }
    }

    @Override
    public void removeFromTargyakLista(Items targy) {
        if(targy.equals(Items.WOODEN_SILVERWARE) || targy.equals(Items.METAL_SILVERWARE)){
            itemList.remove(targy);
        }
    }
}
