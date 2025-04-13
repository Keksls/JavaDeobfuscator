/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rv
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private String b;
    private String[] c;
    private int d;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray;
            boolean bl = string.endsWith("!");
            if (bl) {
                string = string.substring(0, string.length() - 1);
            }
            if ((stringArray = Cz.a(string, ';')) != null && stringArray.length >= 1) {
                this.b = stringArray[0].intern();
                int n = 1 + this.a(stringArray);
                this.c = bl ? null : Rv.a(stringArray, n);
                return true;
            }
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au moins 2 : AppearanceId;parts...., ou un seul, mais avec un ! \u00e0 la fin) : " + string));
            return false;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    private static String[] a(String[] stringArray, int n) {
        String[] stringArray2 = new String[stringArray.length - n];
        for (int k = 0; k < stringArray2.length; ++k) {
            String string = stringArray[k + n];
            stringArray2[k] = string != null ? string.intern() : null;
        }
        return stringArray2;
    }

    private int a(String[] stringArray) {
        if (stringArray.length <= 1) {
            return 0;
        }
        try {
            this.d = Integer.parseInt(stringArray[1].replace("!", ""));
            return 1;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.f;
    }

    public String e() {
        return this.b;
    }

    public String[] f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }
}

