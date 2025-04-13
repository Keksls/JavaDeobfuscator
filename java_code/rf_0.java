/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RF
 */
public class rf_0
extends rg_0 {
    protected static final Logger a = Logger.getLogger(rf_0.class);
    private long b;

    @Override
    protected boolean a(String string) {
        try {
            this.b = Long.parseLong(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " n'est pas un id de son valide"));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.a;
    }

    public long e() {
        return this.b;
    }
}

