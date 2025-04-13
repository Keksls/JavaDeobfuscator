/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteByteHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteByteHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from RT
 */
public abstract class rt_0<T extends rx_0>
implements abo_1,
gq_1<xp_2> {
    protected static final Logger a = Logger.getLogger(rt_0.class);
    protected final TByteByteHashMap b = new TByteByteHashMap();

    @Override
    public void onCheckOut() {
        this.b.clear();
    }

    @Override
    public void onCheckIn() {
        this.b.clear();
    }

    @Override
    public boolean a(T t) {
        Byte by = this.b.get(t.b());
        return by != null && by != 0;
    }

    public byte b(T t) {
        Byte by = this.b.get(t.b());
        if (by == null) {
            return 0;
        }
        return by;
    }

    public void a(T t, byte by) {
        this.b.put(t.b(), by);
    }

    public byte c(T t) {
        if (this.b.containsKey(t.b())) {
            byte by = (byte)(this.b.get(t.b()) + 1);
            this.b.put(t.b(), by);
            return by;
        }
        this.b.put(t.b(), (byte)1);
        return 1;
    }

    public byte[] a() {
        return this.b.keys();
    }

    public byte d(T t) {
        if (this.b.containsKey(t.b())) {
            byte by = (byte)(this.b.get(t.b()) - 1);
            if (by <= 0) {
                this.b.remove(t.b());
                return 0;
            }
            this.b.put(t.b(), by);
            return by;
        }
        return 0;
    }

    public void e(T t) {
        this.b.remove(t.b());
    }

    public void b() {
        this.b.clear();
    }

    public TByteByteHashMap c() {
        return this.b;
    }

    public boolean d() {
        return this.b.isEmpty();
    }
}

