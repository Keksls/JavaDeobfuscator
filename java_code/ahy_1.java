/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aHy
 */
public final class ahy_1
implements Runnable {
    private static final Logger b = Logger.getLogger(ahy_1.class);
    private static final ahy_1 c = new ahy_1();
    private final Queue<ahx_1> d = new LinkedList<ahx_1>();
    private boolean e;
    private String f;
    private static final int g = 1000;
    private static final int h = 30000;
    public static boolean a;

    public static ahy_1 a() {
        return c;
    }

    private ahy_1() {
    }

    public void a(ahx_1 ahx_12) {
        if (!this.d.contains(ahx_12) && ahx_12.a() != null && ahx_12.a().length() != 0) {
            this.d.add(ahx_12);
        }
    }

    public Iterable<ahx_1> b() {
        return this.d;
    }

    @Nullable
    public ahx_1 a(String string) {
        for (ahx_1 ahx_12 : this.d) {
            if (!ahx_12.a().equals(string)) continue;
            return ahx_12;
        }
        return null;
    }

    public void b(String string) {
        if (!this.e) {
            this.f = string;
            this.e = true;
            if (a) {
                ado_1.a().a(this, 30000L, -1);
            }
        }
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        int n = Math.min(this.d.size(), 1000);
        ahz_1.a.a(this.f);
        for (int k = 0; k < n; ++k) {
            try {
                ahx_1 ahx_12 = this.d.poll();
                this.d.offer(ahx_12);
                String string = ahx_12.a();
                String[] stringArray = ahx_12.c();
                if (stringArray != null && stringArray.length > 0) {
                    for (String string2 : stringArray) {
                        int[] nArray = ahx_12.d();
                        if (nArray == null || nArray.length <= 0) continue;
                        for (int n2 : nArray) {
                            ahz_1.a.a(new aha_1(this.f, string, string2, n2, ahx_12.a(string2, n2), l));
                        }
                    }
                    continue;
                }
                int[] nArray = ahx_12.d();
                if (nArray == null || nArray.length <= 0) continue;
                for (int n3 : nArray) {
                    ahz_1.a.a(new aha_1(this.f, string, "", n3, ahx_12.a(null, n3), l));
                }
                continue;
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)"Exception ", (Throwable)runtimeException);
            }
        }
        ahz_1.a.a();
    }
}

