/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rz
extends rg_0 {
    private static final Logger a = Logger.getLogger(Rz.class);
    private float b;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 1) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 1 : deltaAltitude) : " + string));
                return false;
            }
            this.b = Float.parseFloat(stringArray[0]);
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas valide"));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.n;
    }

    public float e() {
        return this.b;
    }
}

