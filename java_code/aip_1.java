/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.net.URL;
import java.util.Properties;

/*
 * Renamed from aIp
 */
public abstract class aip_1 {
    protected boolean a = true;
    public static final int b = -1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 21;
    public File g;
    protected aio_1 h;
    protected File i;
    private long k = 0L;
    protected long j = -1L;

    public abstract long a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract long h();

    public abstract void a(URL var1, Properties var2);

    public abstract void i();

    public abstract void a(URL var1, Properties var2, long var3, long var5, long var7);

    public abstract String j();

    public void a(URL uRL, Properties properties, long l, long l2) {
        this.a(uRL, properties, l, l2, 0L);
    }

    public void b(URL uRL, Properties properties) {
        this.a(uRL, properties, 0L, 0L, 0L);
    }

    public void a(aio_1 aio_12) {
        this.h = aio_12;
    }

    public void a(File file) {
        this.i = file;
    }

    public File v_() {
        return this.i;
    }

    public void a(long l) {
        this.k = l;
    }

    public void b(long l) {
        this.j = l;
    }

    public long l() {
        return this.k;
    }

    public File m() {
        return this.g;
    }

    public void b(File file) {
        this.g = file;
    }

    public abstract int n();

    public boolean o() {
        return this.a;
    }
}

