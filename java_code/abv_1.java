/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aBv
 */
public class abv_1<V extends abu_1> {
    protected static final Logger a = Logger.getLogger(abv_1.class);
    protected V b;
    protected long c;

    public abv_1() {
        this.a();
    }

    public void a(V v) {
        this.b = v;
        this.c = v != null ? v.a_() : 0L;
    }

    public void a() {
        this.b = null;
        this.c = 0L;
    }

    public boolean b() {
        if (this.b == null) {
            return false;
        }
        if (this.c == 0L) {
            return false;
        }
        return this.b.a_() == this.c;
    }

    public V c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

