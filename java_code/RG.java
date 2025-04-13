/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class RG
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private boolean b;
    private String[] c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length < 2) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au moins 2 : visibility[true|false];parts....) : " + string));
                return false;
            }
            this.b = Boolean.parseBoolean(stringArray[0]);
            this.c = new String[stringArray.length - 1];
            System.arraycopy(stringArray, 1, this.c, 0, this.c.length);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.j;
    }

    public boolean e() {
        return this.b;
    }

    public String[] f() {
        return this.c;
    }
}

