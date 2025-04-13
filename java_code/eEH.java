/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public enum eEH implements aqk_2
{
    a,
    b,
    c,
    d,
    e;

    private static final Logger f;

    public boolean a(eEH eEH2) {
        return this.ordinal() <= eEH2.ordinal();
    }

    public static eEH a(byte by) {
        for (eEH eEH2 : eEH.values()) {
            if (eEH2.ordinal() != by) continue;
            return eEH2;
        }
        f.error((Object)("Rang inconnu " + by));
        return e;
    }

    @Override
    public String d() {
        return String.valueOf(this.ordinal());
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.name();
    }

    static {
        f = Logger.getLogger(eEH.class);
    }
}

