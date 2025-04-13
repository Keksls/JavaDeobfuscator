/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eXm
 */
public abstract class exm_2 {
    protected static final Logger a = Logger.getLogger(eyo_1.class);
    private final TLongObjectHashMap<tr_0> b = new TLongObjectHashMap();

    protected exm_2() {
    }

    public void a(long l, tr_0 tr_02) {
        this.b.put(l, (Object)tr_02);
    }

    public TLongObjectHashMap<tr_0> b() {
        return this.b;
    }

    public tr_0 a(long l) {
        return (tr_0)this.b.get(l);
    }

    public tr_0 b(long l) {
        return (tr_0)this.b.remove(l);
    }

    public void c() {
        this.b.clear();
    }
}

