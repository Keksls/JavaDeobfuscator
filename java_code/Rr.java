/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class Rr
extends rg_0 {
    private static final Logger a = Logger.getLogger(Rr.class);
    private String b;
    private String c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 2) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : deltaAltitude) : " + string));
                return false;
            }
            this.b = stringArray[0];
            this.c = stringArray[1];
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"));
            return false;
        }
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    @Override
    public ri_0 a() {
        return ri_0.o;
    }
}

