/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bOz
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bOz.class);
    public static final String b = "name";
    public static final String d = "iconUrl";
    private final String f;
    private final bOu g;
    public static final String[] e = new String[]{"name", "iconUrl"};

    public bOz(String string, bOu bOu2) {
        this.f = string;
        this.g = bOu2;
    }

    public String a() {
        return this.f;
    }

    public bOu b() {
        return this.g;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equalsIgnoreCase(b)) {
            return bae.h().a(this.a(), new Object[0]);
        }
        if (string.equalsIgnoreCase(d)) {
            // empty if block
        }
        return null;
    }
}

