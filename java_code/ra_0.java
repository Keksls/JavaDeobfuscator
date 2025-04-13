/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RA
 */
public class ra_0
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private final float[] b = new float[3];
    private float c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 4) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 4 : R G B Range) : " + string));
                return false;
            }
            this.b[0] = Float.parseFloat(stringArray[0]);
            this.b[1] = Float.parseFloat(stringArray[1]);
            this.b[2] = Float.parseFloat(stringArray[2]);
            this.c = Float.parseFloat(stringArray[3]);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.c;
    }

    public float[] e() {
        return this.b;
    }

    public float f() {
        return this.c;
    }
}

