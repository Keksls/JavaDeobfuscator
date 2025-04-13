/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public final class fgT {
    public static final fgT a = new fgT();
    protected static final Logger b = Logger.getLogger(fgT.class);
    private final TIntObjectHashMap<fgv_0> c = new TIntObjectHashMap();
    private fgS d;

    private fgT() {
    }

    public fgS a() {
        return this.d;
    }

    public void a(fgS fgS2) {
        this.d = fgS2;
    }

    public fgv_0 a(int n, long l) {
        if (this.d != null) {
            return this.d.a(n, l);
        }
        return null;
    }

    public boolean a(fgv_0 fgv_02) {
        if (fgv_02 == null) {
            return false;
        }
        int n = fgv_02.e();
        fgv_0 fgv_03 = (fgv_0)this.c.get(n);
        if (fgv_03 != null && fgv_03 != fgv_02) {
            b.error((Object)"Tentative d'\u00e9crase de territoire.");
            return false;
        }
        this.c.put(n, (Object)fgv_02);
        return true;
    }

    public void b(fgv_0 fgv_02) {
        this.c.remove(fgv_02.e());
    }

    public fgv_0 a(int n) {
        return (fgv_0)this.c.get(n);
    }

    public TIntObjectHashMap<fgv_0> b() {
        return this.c;
    }

    public int[] c() {
        return this.c.keys();
    }

    public void d() {
        this.c.clear();
    }
}

