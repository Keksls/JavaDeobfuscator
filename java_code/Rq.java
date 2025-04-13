/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rq
extends rg_0 {
    private static final Logger a = Logger.getLogger(Rq.class);
    private short b;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 1) {
                a.error((Object)("Unable to initialize " + this.getClass().getName() + ", not enough or too much parameters, only 1 is needed (newHeight): " + string));
                return false;
            }
            this.b = Short.parseShort(stringArray[0]);
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Unable to initialize " + this.getClass().getName() + ", invalid parameters: " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.v;
    }

    public short e() {
        return this.b;
    }
}

