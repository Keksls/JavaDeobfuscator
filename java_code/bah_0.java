/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Preconditions;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bah
 */
public class bah_0 {
    private static final AtomicReference<bah_0> a = new AtomicReference();
    private static final List<Runnable> b = new LinkedList<Runnable>();
    private final long c;
    private final xz_0 d;
    private final Optional<emn_0> e;
    private final oj_1 f;

    private bah_0(long l, xz_0 xz_02, Optional<emn_0> optional, oj_1 oj_12) {
        this.c = l;
        this.d = xz_02;
        this.e = optional;
        this.f = oj_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l, xz_0 xz_02, Optional<emn_0> optional, oj_1 oj_12) {
        a.set(new bah_0(l, xz_02, optional, oj_12));
        List<Runnable> list = b;
        synchronized (list) {
            for (Runnable runnable : b) {
                runnable.run();
            }
            b.clear();
        }
    }

    public static boolean a() {
        return a.get() != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(@NotNull Runnable runnable) {
        List<Runnable> list = b;
        synchronized (list) {
            if (bah_0.a()) {
                runnable.run();
            } else {
                b.add(runnable);
            }
        }
    }

    public static long b() {
        Preconditions.checkNotNull((Object)a.get());
        return bah_0.a.get().c;
    }

    public static xz_0 c() {
        Preconditions.checkNotNull((Object)a.get());
        return bah_0.a.get().d;
    }

    public static Ow d() {
        if (a.get() == null) {
            return Ow.o;
        }
        return bah_0.a.get().d.c();
    }

    public static Optional<emn_0> e() {
        Preconditions.checkNotNull((Object)a.get());
        return bah_0.a.get().e;
    }

    public static oj_1 f() {
        Preconditions.checkNotNull((Object)a.get());
        return bah_0.a.get().f;
    }

    public String toString() {
        return "DispatchAccountInformation{m_community=" + this.d + ", m_admin=" + this.e + "}";
    }
}

