package be.tftic.webmobile.intro.exo.oo.enums;

public enum Categorie {

    PLUME(Integer.MIN_VALUE,60),
    LEGER(61, 70),
    MOYEN(71, 80),
    LOURD(81,Integer.MAX_VALUE);

    private final int poidMin;
    private final int poidMax;

    Categorie(int poidMin, int poidMax) {
        this.poidMin = poidMin;
        this.poidMax = poidMax;
    }

    public Categorie getDessus(){
        Categorie rslt = null;
        switch (this) {
            case PLUME -> rslt = LEGER;
            case LEGER -> rslt = MOYEN;
            case MOYEN -> rslt = LOURD;
//            case LOURD -> rslt = null;
        }
        return rslt;
    }

    public Categorie getDessous(){
        Categorie rslt = null;
        switch (this) {
//            case PLUME -> rslt = null;
            case LEGER -> rslt = PLUME;
            case MOYEN -> rslt = LEGER;
            case LOURD -> rslt = MOYEN;
        }
        return rslt;
    }

    public int getPoidMin() {
        return poidMin;
    }

    public int getPoidMax() {
        return poidMax;
    }

}
