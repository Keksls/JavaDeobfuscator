/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

public enum fkd {
    a(1),
    b(2);

    private static final TByteObjectHashMap<fkd> c;
    private byte d;

    private fkd(byte by) {
        this.d = by;
    }

    public byte a() {
        return this.d;
    }

    public static fkd a(byte by) {
        return (fkd)((Object)c.get(by));
    }

    static {
        c = new TByteObjectHashMap();
        for (fkd fkd2 : fkd.values()) {
            c.put(fkd2.a(), (Object)fkd2);
        }
    }
}

