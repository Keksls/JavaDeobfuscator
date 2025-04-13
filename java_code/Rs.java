/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rs
extends rg_0 {
    private static final Logger a = Logger.getLogger(Rs.class);
    private static final float b = 0.4f;
    private static final float c = 2.0f;
    private float d;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 1) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : scale) : " + string));
                return false;
            }
            this.d = Hw.b(Float.parseFloat(stringArray[0]), 0.4f, 2.0f);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"), (Throwable)numberFormatException);
            return false;
        }
    }

    public float e() {
        return this.d;
    }

    @Override
    public ri_0 a() {
        return ri_0.t;
    }
}

