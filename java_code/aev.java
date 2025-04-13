/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.apache.log4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class aev
implements aei_0 {
    private static final Logger b = Logger.getLogger(aev.class);
    private final xw_0 c = new xw_0("LightMap loader");
    private final acy_2<aet> d = new acy_2();
    private static final int e = 30;
    private static final LoadingCache<String, byte[]> f = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new aew());
    private final Object g = new Object();
    private long h;
    private String i;
    private boolean j = true;
    private static final aev k = new aev();

    public static aev a() {
        return k;
    }

    private aev() {
    }

    public void a(String string) {
        try {
            this.i = gi_0.a(string).toString();
            if (!this.i.endsWith("/")) {
                this.i = this.i + "/";
            }
        }
        catch (IOException iOException) {
            b.error((Object)("Invalid path : " + string), (Throwable)iOException);
        }
    }

    private static String a(String string, long l, short s2, short s3) {
        assert (string != null && string.contains("%d") && string.endsWith("/"));
        return String.format(string, l) + s2 + "_" + s3;
    }

    public long b() {
        return this.h;
    }

    public aes a(int n, int n2, int n3) {
        aet aet2 = this.a(n, n2);
        return aet2 == null ? null : aet2.a(n, n2, n3);
    }

    private aet a(int n, int n2) {
        int n3 = Hw.c((float)n / 18.0f);
        int n4 = Hw.c((float)n2 / 18.0f);
        return this.d.g(Hw.d(n3, n4));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(short s2, short s3) {
        byte[] byArray;
        aet aet2 = new aet();
        String string = aev.a(this.i, this.h, s2, s3);
        try {
            byArray = (byte[])f.get((Object)string);
        }
        catch (ExecutionException executionException) {
            b.error((Object)("Unable to load map (" + s2 + ", " + s3 + ") in CACHE"));
            return;
        }
        if (byArray == null) {
            b.error((Object)("Unable to load map (" + string + ")"));
            return;
        }
        arf_1 arf_12 = arf_1.a(byArray);
        aet2.a(arf_12);
        assert (XY.a(aet2.c) == s2 && XY.b(aet2.d) == s3);
        Object object = this.g;
        synchronized (object) {
            this.d.a(Hw.c(s2, s3), aet2);
        }
        this.j = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        Object object = this.g;
        synchronized (object) {
            this.d.c();
        }
        this.c.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(float f2) {
        Object object = this.g;
        synchronized (object) {
            for (int k = this.d.d() - 1; k >= 0; --k) {
                this.d.h(k).a(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(float f2) {
        Object object = this.g;
        synchronized (object) {
            for (int k = this.d.d() - 1; k >= 0; --k) {
                this.d.h(k).b(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(short s2, short s3) {
        int n = Hw.c(s2, s3);
        Object object = this.g;
        synchronized (object) {
            this.d.f(n);
        }
        this.c.b(n);
    }

    public boolean g() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void a(long l) {
        this.h = l;
    }

    @Override
    public final int e() {
        return 400;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        aes aes2 = this.a(n, n2, n4);
        if (aes2 != null) {
            float[] fArray2 = aes2.b();
            fArray[0] = fArray[0] * fArray2[0];
            fArray[1] = fArray[1] * fArray2[1];
            fArray[2] = fArray[2] * fArray2[2];
            float[] fArray3 = aes2.c();
            if (fArray3 != null) {
                fArray[0] = fArray[0] + fArray3[0];
                fArray[1] = fArray[1] + fArray3[1];
                fArray[2] = fArray[2] + fArray3[2];
            }
        }
    }

    @Override
    public void b(int n) {
    }

    @Override
    public boolean d() {
        return false;
    }

    public void c(short s2, short s3) {
        int n = Hw.c(s2, s3);
        this.c.a(n, () -> this.a(s2, s3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(short s2, short s3, aet aet2) {
        int n = Hw.c(s2, s3);
        Object object = this.g;
        synchronized (object) {
            this.d.a(n, aet2);
        }
        this.a(true);
    }
}

