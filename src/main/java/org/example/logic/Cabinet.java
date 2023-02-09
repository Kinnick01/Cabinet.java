package org.example.logic;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {
    List<CabinetItem> cabinetItems;

    public Cabinet() {
        this.cabinetItems = new ArrayList<>();
    }

    public List<CabinetItem> getCabinetItems() {
        return cabinetItems;
    }

    public void addToSzekreny(CabinetItem cabinetItem){
        cabinetItems.add(cabinetItem);
    }

    public List<Items> countItems(Items targy){
        List<Items> result = new ArrayList<>();
        for (CabinetItem polc: cabinetItems) {
            for (Items item: polc.getItemList()) {
                if(item.equals(targy)){
                    result.add(item);
                }
            }
        }
        return result;
    }
}
