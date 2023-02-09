package org.example.data.targyak;

public enum Targy {
    UVEG_MUZLIS_TAL(Anyag.UVEG,Meret.NAGY),
    MUANYAG_MUZLIS_TAL(Anyag.MUANYAG,Meret.NAGY),
    UVEG_POHAR(Anyag.UVEG,Meret.NAGY),
    MUANYAG_POHAR(Anyag.MUANYAG,Meret.NAGY),
    UVEG_TANYER(Anyag.UVEG,Meret.NAGY),
    MUANYAG_TANYER(Anyag.MUANYAG,Meret.NAGY),
    FEM_EVOESZKOZ(Anyag.FEM,Meret.KICSI),
    FA_EVOESZKOZ(Anyag.FA,Meret.NAGY);

    Anyag anyag;
    Meret meret;

    public Anyag getAnyag() {
        return anyag;
    }

    public Meret getMeret() {
        return meret;
    }

    Targy(Anyag anyag, Meret meret) {
        this.anyag = anyag;
        this.meret = meret;
    }
}
