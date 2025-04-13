/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from ezC
 */
public enum ezc_2 implements aqk_2
{
    a(0, "Boss ultime"),
    b(1, "Donjon 3 joueurs"),
    c(2, "Donjon 2 salles"),
    d(3, "Donjon 3 salles"),
    e(4, "Donjon 4 salles"),
    f(5, "Br\u00e8che dimensionnelle"),
    g(6, "Br\u00e8che dimensionnelle ultime");

    private static final Logger h;
    private final short i;
    private final String j;

    private ezc_2(int n2, String string2) {
        this.i = (short)n2;
        this.j = string2;
    }

    public static ezc_2 a(short s2) {
        for (ezc_2 ezc_22 : ezc_2.values()) {
            if (ezc_22.i != s2) continue;
            return ezc_22;
        }
        h.warn("Unknown dungeon gameplay type " + s2 + ", defaulting to " + c);
        return c;
    }

    public short a() {
        return this.i;
    }

    @Override
    public String d() {
        return String.valueOf(this.i);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.j;
    }

    static {
        h = LoggerFactory.getLogger(ezc_2.class);
    }
}

