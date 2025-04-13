/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from atN
 */
public final class atn_2 {
    public static final int a = 1460857362;
    public static final int b = 2571426;
    public static final int c = 70353081;
    public static final int d = 2455640;
    public static final int e = 80097030;
    public static final int f = 2047106;
    public static final int g = -1157987650;
    public static final int h = -514753261;
    private static final String[] i = new String[]{"CheveuxHaut", "CheveuxBas", "CheveuxArriere"};
    private static final String[] j = new String[]{"BajouePeau", "Barbe", "Bouche", "Bouche01", "Bouche02", "Bouche03", "Bouche04", "Bouche05", "Bouche06", "Bouche07", "Bouche08", "Bouche09", "Bouche10", "Bouche11", "Bouche12", "Bouche13", "Bouche14", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Crane", "Oreille", "Joue_02", "Joue01", "Joue02", "Joue03", "Nez01", "Nez02", "Nez02Peau", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pleur", "Pleur_2", "Pupille01", "Pupille02", "Pupille03", "Reflet", "Sourcil01", "Sourcil02", "Sourcil03"};
    private static final String[] k = new String[]{"JambeVetement", "JambePeau", "CuisseVetement", "CuissePeau"};
    private static final String[] l = new String[]{"Pied01Vetement", "Pied02Vetement", "PiedPeau01", "PiedPeau02"};
    private static final String[] m = new String[]{"TroncVetement", "TroncPeau"};
    private static final String[] n = new String[]{"BrasVetement", "BrasPeau"};
    private static final String[] o = new String[]{"BrasVetement", "CuisseVetement", "EpauleVetement", "JambeVetement", "BassinVetement", "CorpsVetement", "JupeVetement", "Jupe2Vetement", "TroncVetement"};
    private static final String[] p = new String[]{"Epaulette-G", "Epaulette-D", "CorpsHabit", "Ceinture", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Bouclier", "Cape", "CapeBas"};
    private static final int q = 855858226;
    private static final String[] r = new String[]{"BrasBas", "Peau_BrasBas"};
    private static final int s = -2026252917;
    private static final String[] t = new String[]{"BrasMilieu", "Peau_BrasMilieu"};
    private static final int u = 761980122;
    private static final String[] v = new String[]{"BrasHaut", "Peau_BrasHaut"};
    private static final int w = 2422137;
    private static final String[] x = new String[]{"OeilAmovible-Blanc01", "OeilAmovible-Blanc02", "OeilAmovible-Blanc03", "OeilAmovible-Blanc04", "OeilAmovible-Blanc05", "OeilAmovible-Blanc06", "OeilAmovible-Blanc07", "OeilAmovible-Blanc08", "OeilAmovible-Blanc09", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Noir01", "OeilAmovible-Noir02", "OeilAmovible-Noir03", "OeilAmovible-Noir04", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Marque"};
    private static final int y = -2027940606;
    private static final String[] z = new String[]{"Marque"};
    private static final int A = 525252987;
    private static final String[] B = new String[]{"Oeil-Marque"};
    private static final int C = -485157885;
    private static final String[] D = new String[]{"EliatropeCoiffeBas", "EliatropeCoiffeHaut", "Barbe", "Chapeau", "Chapeau02", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pupille01", "Pupille02", "Pupille03", "Sourcil01", "Sourcil02", "Sourcil03", "Crane", "Oreille", "BassinPeau", "BrasPeau", "EpaulePeau", "JambePeau", "PiedPeau01", "PiedPeau02", "TroncPeau", "Nez02Peau", "CorpsPeau", "CuissePeau", "Main_01", "Main_02", "Main_Doigt_01", "Main_Doigt_02", "Main_Doigt_03", "Main_doigt_04", "Main_doigt_05", "Main_doigt_06", "Main_doigt_07", "Main_doigt_08", "Main_doigt_09", "Main_doigt_10", "Main_doigt_11", "Main_doigt_12", "Main_doigt_13", "Main_Paume_01", "Main_Paume_02", "Main_Paume_03", "Main_Paume_04", "Main_Paume_05", "Main_pouce_01", "Main_pouce_02", "Main_pouce_03", "Main_pouce_04", "Main_pouce_05", "Main_pouce_06", "Main_pouce_07", "Main_pouce_08", "Main_pouce_09", "Main_pouce_10", "Main_pouce_11", "Main_pouce_12", "Main_pouce_13", "Main_pouce_14", "Main_01", "Main_02", "Main_03", "Main_04", "Main_05"};
    private static final int E = -1147503697;
    private static final String[] F = new String[]{"EliatropeCoiffeBas", "EliatropeCoiffeHaut", "SacADos-C", "SacADos-G", "SacADos-D", "Barbe", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Chapeau", "Chapeau02", "Epaulette-D", "Epaulette-G", "CorpsHabit", "BrasVetement", "EpauleVetement", "TroncVetement", "Jupe2Vetement", "JupeVetement", "CorpsVetement", "BassinVetement", "CuisseVetement", "JambeVetement", "Cape", "CapeBas", "CheveuxBas"};
    private static final HashSet<String> G = new HashSet(50);

    public static String[] a(String[] stringArray) {
        for (String string : stringArray) {
            String[] stringArray2;
            for (String string2 : stringArray2 = atn_2.a(string)) {
                G.add(string2);
            }
        }
        String[] stringArray3 = new String[G.size()];
        G.toArray(stringArray3);
        return stringArray3;
    }

    public static String[] a(String string) {
        switch (string.hashCode()) {
            case 1460857362: {
                return i;
            }
            case 2571426: {
                return j;
            }
            case 70353081: {
                return k;
            }
            case 2455640: {
                return l;
            }
            case 80097030: {
                return m;
            }
            case 2047106: {
                return n;
            }
            case -1157987650: {
                return o;
            }
            case -514753261: {
                return p;
            }
            case 855858226: {
                return r;
            }
            case -2026252917: {
                return t;
            }
            case 761980122: {
                return v;
            }
            case 2422137: {
                return x;
            }
            case -2027940606: {
                return z;
            }
            case 525252987: {
                return B;
            }
            case -485157885: {
                return D;
            }
            case -1147503697: {
                return F;
            }
        }
        return new String[]{string};
    }
}

