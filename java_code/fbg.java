/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public enum fbg implements aqk_2
{
    a(0, "Sp\u00e9cialiste des combats de protecteur"),
    b(1, "Gestionnaire de protecteur"),
    c(2, "Chasseur de hors la loi");

    private static final TByteObjectHashMap<fbg> d;
    private final byte e;
    private final String f;

    private fbg(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    public byte a() {
        return this.e;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.f;
    }

    @Override
    public String f() {
        return null;
    }

    public static fbg a(byte by) {
        return (fbg)d.get(by);
    }

    static {
        d = new TByteObjectHashMap();
        for (fbg fbg2 : fbg.values()) {
            d.put(fbg2.a(), (Object)fbg2);
        }
    }
}

