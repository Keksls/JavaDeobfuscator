/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

public class eEr {
    public static final eEr a = new eEr();
    private final TLongObjectHashMap<eeq_0> b = new TLongObjectHashMap();

    private eEr() {
    }

    public void a(eeq_0 eeq_02) {
        this.b.put((long)eeq_02.a(), (Object)eeq_02);
    }

    public eeq_0 a(long l) {
        return (eeq_0)this.b.get(l);
    }

    public TLongObjectHashMap<eeq_0> a() {
        return this.b;
    }
}

