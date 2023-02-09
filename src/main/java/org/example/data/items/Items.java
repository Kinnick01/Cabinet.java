package org.example.data.items;

public enum Items {
    GLASS_CEREAL_BOWL(Material.GLASS, Size.BIG),
    PLASTIC_CEREAL_BOWL(Material.PLASTIC, Size.BIG),
    GLASS_CUP(Material.GLASS, Size.BIG),
    PLASTIC_CUP(Material.PLASTIC, Size.BIG),
    GLASS_PLATE(Material.GLASS, Size.BIG),
    PLASTIC_PLATE(Material.PLASTIC, Size.BIG),
    METAL_SILVERWARE(Material.METAL, Size.SMALL),
    WOODEN_SILVERWARE(Material.WOOD, Size.BIG);

    Material material;
    Size meret;

    public Material getAnyag() {
        return material;
    }

    public Size getMeret() {
        return meret;
    }

    Items(Material material, Size meret) {
        this.material = material;
        this.meret = meret;
    }
}
