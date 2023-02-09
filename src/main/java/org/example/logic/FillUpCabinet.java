package org.example.logic;

import org.example.data.drawer.SilverwareDrawer;
import org.example.data.drawer.TuppleWareDrawer;
import org.example.data.shelf.MiddleShelf;
import org.example.data.shelf.BigShelf;
import org.example.data.shelf.CupShelf;
import org.example.data.items.Items;

public class FillUpCabinet {
    public void FillUpCabinet(){
        Cabinet cabinet = new Cabinet();
        Items pohar1 = Items.GLASS_CUP;
        Items pohar3 = Items.GLASS_CUP;
        Items pohar2 = Items.PLASTIC_CUP;
        Items tal1 = Items.GLASS_CEREAL_BOWL;
        Items tal2 = Items.PLASTIC_CEREAL_BOWL;
        Items femEvoeszkoz = Items.METAL_SILVERWARE;
        Items faEvoeszkoz = Items.WOODEN_SILVERWARE;
        Items tanyerUveg = Items.GLASS_PLATE;
        Items tanyerMuanyag = Items.PLASTIC_PLATE;
        CupShelf cupShelf = new CupShelf();
        BigShelf bigShelf = new BigShelf();
        MiddleShelf middleShelf = new MiddleShelf();
        SilverwareDrawer silverwareDrawer = new SilverwareDrawer();
        TuppleWareDrawer tuppleWareDrawer = new TuppleWareDrawer();
        cupShelf.addtoItemList(pohar1);
        cupShelf.addtoItemList(pohar2);
        cupShelf.addtoItemList(pohar3);
        bigShelf.addtoItemList(tal1);
        bigShelf.addtoItemList(tal2);
        silverwareDrawer.addtoItemList(faEvoeszkoz);
        silverwareDrawer.addtoItemList(femEvoeszkoz);

        cabinet.addToSzekreny(bigShelf);
        cabinet.addToSzekreny(cupShelf);
        cabinet.addToSzekreny(silverwareDrawer);
        cabinet.addToSzekreny(middleShelf);
        Items searchItem = pohar1;
        System.out.println("Here's your szekreny " + searchItem + " capacity: ");
        System.out.println(cabinet.countItems(pohar1));
    }
}
