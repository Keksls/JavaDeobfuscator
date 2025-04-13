/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.BitSet;
import org.apache.log4j.Logger;

/*
 * Renamed from aHD
 */
public abstract class ahd_1
implements afm_2 {
    private Logger e = null;
    public static final String a = ";";
    public static final long b = 3000L;
    protected long c = 0L;
    protected long d = 3000L;
    private int f;
    private String g;

    protected ahd_1() {
    }

    public String a() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }

    public final void a(Logger logger) {
        this.e = logger;
    }

    public final long b() {
        return this.c;
    }

    public final void a(long l) {
        this.c = l;
    }

    public final long c() {
        return this.d;
    }

    public final void b(long l) {
        this.d = l;
    }

    public final void d() {
        this.c(a);
    }

    public final void c(String string) {
        if (this.e != null) {
            this.e.info((Object)this.a(string));
        }
    }

    public void a(BitSet bitSet) {
    }

    void e() {
    }

    public abstract void h();

    protected abstract String a(String var1);

    @Override
    public String f() {
        return this.getClass().getName();
    }

    @Override
    public int g() {
        return this.f;
    }

    @Override
    public void a(int n) {
        this.f = n;
    }
}

