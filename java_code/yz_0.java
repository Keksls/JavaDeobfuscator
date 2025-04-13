/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Yz
 */
public class yz_0 {
    private static boolean b = false;
    private static boolean c = false;
    private static long d;
    private static String e;
    private static final ys_0[] f;
    private static final up_0 g;
    static final Logger h;
    private static final TLongObjectHashMap<yx_0> i;
    private static final TLongObjectHashMap<yv_0> j;
    private static final Object k;
    private static final LoadingCache<String, byte[]> l;
    private static xw_0 m;

    public static void a(short s2, short s3) {
        assert (m != null) : " Appel\u00e9 enableAsyncLoading lors de l'initialisation de l'appli";
        long l = yz_0.a(d, (long)s2, (long)s3, 0);
        m.a(l, new yb_0(s2, s3));
    }

    private yz_0() {
    }

    public static void a() {
        b = true;
    }

    public static void b() {
        assert (b);
        m = new xw_0("topology loader");
    }

    public static void a(boolean bl) {
        c = bl;
    }

    public static boolean c() {
        return b;
    }

    public static void a(String string) {
        try {
            e = gg_0.d(string).toString();
            if (!e.endsWith("/")) {
                e = e + "/";
            }
        }
        catch (IOException iOException) {
            h.error((Object)("Invalid path : " + string), (Throwable)iOException);
        }
    }

    public static long d() {
        assert (b) : "Can't get worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return d;
    }

    public static void a(long l) {
        assert (b) : "Can't set worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        d = l;
    }

    private static String b(long l, short s2, short s3) {
        assert (e != null && e.contains("%d") && e.endsWith("/"));
        return String.format(e, l) + s2 + "_" + s3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l, short s2, short s3) {
        long l2 = yz_0.a(l, (long)s2, (long)s3, 0);
        Object object = k;
        synchronized (object) {
            byte[] byArray;
            if (j.contains(l2)) {
                return;
            }
            String string = yz_0.b(l, s2, s3);
            try {
                byArray = (byte[])yz_0.l.get((Object)string);
            }
            catch (ExecutionException executionException) {
                h.error((Object)("Unable to get map (" + s2 + "; " + s3 + ";" + l + ") in CACHE"));
                throw new FileNotFoundException("Unable to get map (" + s2 + "; " + s3 + ";" + l + ") in CACHE");
            }
            if (byArray == null) {
                h.error((Object)("Unable to load map (" + string + ")"));
                return;
            }
            arf_1 arf_12 = arf_1.a(byArray);
            byte by = arf_12.a();
            yv_0 yv_02 = yw_0.a(by);
            if (yv_02 == null) {
                h.error((Object)("Unable to create map (" + s2 + "; " + s3 + ";" + l + ")"));
                return;
            }
            yv_02.a(arf_12);
            assert (XY.a(yv_02.d) == s2 && XY.b(yv_02.e) == s3);
            j.put(l2, (Object)yv_02);
        }
    }

    public static void b(short s2, short s3) {
        assert (b) : "Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        yz_0.a(d, s2, s3);
        yz_0.b(d, s2, s3, (short)0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c(short s2, short s3) {
        assert (b) : "Can't loadMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        long l = yz_0.a(d, (long)s2, (long)s3, 0);
        if (m != null) {
            m.b(l);
        }
        Object object = k;
        synchronized (object) {
            j.remove(l);
            i.remove(l);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static yx_0 a(long l, short s2, short s3, short s4) {
        long l2 = yz_0.a(l, (long)s2, (long)s3, (int)s4);
        if (m != null) {
            m.a(l2);
        }
        Object object = k;
        synchronized (object) {
            return (yx_0)i.get(l2);
        }
    }

    public static yx_0 d(short s2, short s3) {
        assert (b) : "Can't getMap without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.a(d, s2, s3, (short)0);
    }

    public static yx_0 a(long l, int n, int n2, short s2) {
        short s3 = (short)XY.a(n);
        short s4 = (short)XY.b(n2);
        return yz_0.a(l, s3, s4, s2);
    }

    public static yx_0 a(int n, int n2) {
        assert (b) : "Can't getMapFromCell without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.a(d, n, n2, (short)0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e() {
        if (m != null) {
            m.a();
        }
        Object object = k;
        synchronized (object) {
            j.clear();
            i.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static yx_0 b(long l, short s2, short s3, short s4) {
        long l2 = yz_0.a(l, (long)s2, (long)s3, (int)s4);
        Object object = k;
        synchronized (object) {
            yx_0 yx_02 = (yx_0)i.get(l2);
            if (yx_02 != null) {
                return yx_02;
            }
            long l3 = l2 & 0xFFFFFFFFFFFF0000L;
            yv_0 yv_02 = (yv_0)j.get(l3);
            assert (yv_02 != null) : "The cell (" + s2 + "; " + s3 + ") in world " + l + " belongs to a map not loaded";
            yx_02 = new yx_0(yv_02);
            i.put(l2, (Object)yx_02);
            return yx_02;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(long l, int n, int n2, short s2) {
        long l2 = yz_0.a(l, (long)n, (long)n2, (int)s2);
        Object object = k;
        synchronized (object) {
            i.remove(l2);
        }
    }

    public static void a(long l, short s2, int n, int n2, int n3, int n4, int n5, yy_0 yy_02) {
        int n6;
        yy_02.F();
        if (n > n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 > n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        n6 = XY.a(n -= n5);
        int n7 = XY.b(n2 -= n5);
        int n8 = XY.a(n3 += n5);
        int n9 = XY.b(n4 += n5);
        for (int k = n7; k <= n9; ++k) {
            for (int i2 = n6; i2 <= n8; ++i2) {
                yx_0 yx_02 = yz_0.a(l, (short)i2, (short)k, s2);
                yy_02.a(yx_02, i2, k);
            }
        }
    }

    public static void a(long l, short s2, int n, int n2, int n3, yy_0 yy_02) {
        yz_0.a(l, s2, n, n2, n, n2, n3, yy_02);
    }

    public static void a(int n, int n2, int n3, int n4, yy_0 yy_02) {
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        yz_0.a(d, (short)0, n, n2, n3, n4, 9, yy_02);
    }

    public static void a(short s2, byte by, short s3) {
        g.a(s2, by, s3, true);
    }

    public static boolean a(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.l()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean b(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.o()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean c(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.m()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean d(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.p()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean e(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.q()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static boolean f(int n, int n2, int n3) {
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return false;
        }
        try {
            int n4 = yx_02.a().a(n, n2, f, 0);
            for (int k = 0; k < n4; ++k) {
                ys_0 ys_02 = f[k];
                if (ys_02 == null || ys_02.c != n3 || !ys_02.p()) continue;
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        return false;
    }

    public static short a(int n, int n2, short s2) {
        int n3;
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        assert (!c) : "Can't call getPossibleNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null || yx_02.a(n, n2)) {
            return Short.MIN_VALUE;
        }
        try {
            n3 = yx_02.a().a(n, n2, f, 0);
            yz_0.a(yx_02, 0, n3);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        n3 = yx_02.a().a(n, n2, f, 0);
        yz_0.a(yx_02, 0, n3);
        return yu_0.a(0, n3, f, (short)(s2 + g.b()), g.a());
    }

    public static short b(int n, int n2) {
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.c(d, n, n2, (short)0);
    }

    public static short c(long l, int n, int n2, short s2) {
        int n3;
        assert (!c) : "Can't call getHighestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s2);
        if (yx_02 == null) {
            h.error((Object)("The cell (" + n + "; " + n2 + ", instance " + l + ") belongs to a map not loaded"));
            return Short.MIN_VALUE;
        }
        if (yx_02.a(n, n2)) {
            return Short.MIN_VALUE;
        }
        try {
            n3 = yx_02.a().a(n, n2, f, 0);
            yz_0.a(yx_02, 0, n3);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            h.error((Object)"", (Throwable)arrayIndexOutOfBoundsException);
        }
        n3 = yx_02.a().a(n, n2, f, 0);
        yz_0.a(yx_02, 0, n3);
        return yu_0.a(0, n3, f, (short)Short.MAX_VALUE, g.a());
    }

    public static short b(int n, int n2, short s2) {
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.a(d, n, n2, s2, (short)0);
    }

    public static boolean c(int n, int n2, short s2) {
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return !yz_0.a(n, n2, (int)s2);
    }

    public static short a(long l, int n, int n2, short s2, short s3) {
        short s4;
        assert (!c) : "Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        if (yx_02 == null) {
            h.warn((Object)("MapInstance is null for parameters : worldId=" + l + ", pos=[" + n + ";" + n2 + "], InstanceUid=" + s3));
            return Short.MIN_VALUE;
        }
        if (yx_02.a(n, n2)) {
            return Short.MIN_VALUE;
        }
        int n3 = yx_02.a().a(n, n2, f, 0);
        yz_0.a(yx_02, 0, n3);
        int n4 = Short.MAX_VALUE;
        int s42 = Short.MIN_VALUE;
        for (int k = 0; k < n3; ++k) {
            int n5;
            ys_0 ys_02 = f[k];
            if (ys_02.z == -1 || ys_02.c == Short.MIN_VALUE || ys_02.e || (n5 = Math.abs(ys_02.c - s2)) >= n4) continue;
            n4 = (short)n5;
            s4 = ys_02.c;
        }
        return s4;
    }

    @Nullable
    public static aff_1 a(long l, short s2, aff_1 aff_12, int n) {
        return yz_0.a(l, s2, aff_12.d(), aff_12.e(), aff_12.f(), n);
    }

    @Nullable
    public static aff_1 a(long l, short s2, int n, int n2, short s3, int n3) {
        assert (!c) : "Can't call getNearestWalkableZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s2);
        if (yx_02 == null) {
            return null;
        }
        for (int k = 1; k <= n3; ++k) {
            short s4;
            int n4;
            int n5;
            int n6;
            for (n6 = 0; n6 < k; ++n6) {
                n5 = n + k - n6;
                n4 = n2 - n6;
                s4 = yz_0.a(l, n5, n4, s3, s2);
                if (s4 == Short.MIN_VALUE) continue;
                return new aff_1(n5, n4, s4);
            }
            for (n6 = 0; n6 < k; ++n6) {
                n5 = n - n6;
                n4 = n2 - k + n6;
                s4 = yz_0.a(l, n5, n4, s3, s2);
                if (s4 == Short.MIN_VALUE) continue;
                return new aff_1(n5, n4, s4);
            }
            for (n6 = 0; n6 < k; ++n6) {
                n5 = n - k + n6;
                n4 = n2 + n6;
                s4 = yz_0.a(l, n5, n4, s3, s2);
                if (s4 == Short.MIN_VALUE) continue;
                return new aff_1(n5, n4, s4);
            }
            for (n6 = 0; n6 < k; ++n6) {
                n5 = n + n6;
                n4 = n2 + k - n6;
                s4 = yz_0.a(l, n5, n4, s3, s2);
                if (s4 == Short.MIN_VALUE) continue;
                return new aff_1(n5, n4, s4);
            }
        }
        return null;
    }

    public static short d(int n, int n2, short s2) {
        assert (b) : "Can't getTopologyMapInstances without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.b(d, n, n2, s2, (short)0);
    }

    public static short b(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        if (yx_02 == null) {
            return Short.MIN_VALUE;
        }
        int n3 = yx_02.a().a(n, n2, f, 0);
        int n4 = Short.MAX_VALUE;
        short s4 = s2;
        for (int k = 0; k < n3; ++k) {
            int n5 = Math.abs(yz_0.f[k].c - s2);
            if (n5 >= n4) continue;
            n4 = (short)n5;
            s4 = yz_0.f[k].c;
        }
        return s4;
    }

    public static boolean e(int n, int n2, short s2) {
        assert (b) : "Can't isIndoor without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.c(d, n, n2, s2, (short)0);
    }

    public static boolean c(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isIndoor in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        assert (yx_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        return yx_02.b(n, n2, s2);
    }

    public static boolean f(int n, int n2, short s2) {
        assert (b) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.d(d, n, n2, s2, (short)0);
    }

    public static boolean d(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isMoboSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        assert (yx_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        ys_0 ys_02 = yz_0.a(yx_02, n, n2, s2);
        return ys_02 == null || ys_02.i();
    }

    public static boolean g(int n, int n2, short s2) {
        assert (b) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.e(d, n, n2, s2, (short)0);
    }

    public static boolean e(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isMoboSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        assert (yx_02 != null) : "The cell (" + n + "; " + n2 + ") belongs to a map not loaded";
        ys_0 ys_02 = yz_0.a(yx_02, n, n2, s2);
        return ys_02 == null || ys_02.k();
    }

    public static boolean h(int n, int n2, short s2) {
        assert (b) : "Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.f(d, n, n2, s2, (short)0);
    }

    public static boolean f(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isFightoSterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        if (yx_02 == null) {
            h.warn((Object)("On essaye d'acc\u00e9der \u00e0 une cellule dans une map pas charg\u00e9e : (" + n + ", " + n2 + ")@" + l));
            return false;
        }
        ys_0 ys_02 = yz_0.a(yx_02, n, n2, s2);
        return ys_02 == null || ys_02.h();
    }

    public static boolean i(int n, int n2, short s2) {
        assert (b) : "Can't isFightoSterile without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.g(d, n, n2, s2, (short)0);
    }

    public static boolean g(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isIESterile in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        if (yx_02 == null) {
            h.warn((Object)("On essaye d'acc\u00e9der \u00e0 une cellule dans une map pas charg\u00e9e : (" + n + ", " + n2 + ")@" + l));
            return false;
        }
        ys_0 ys_02 = yz_0.a(yx_02, n, n2, s2);
        return ys_02 == null || ys_02.j() || ys_02.k();
    }

    public static boolean j(int n, int n2, short s2) {
        assert (b) : "Can't isWalkable without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.h(d, n, n2, s2, (short)0);
    }

    public static boolean h(long l, int n, int n2, short s2, short s3) {
        assert (!c) : "Can't call isWalkable in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s3);
        if (yx_02 == null) {
            h.warn((Object)("[LD] The cell (" + n + "; " + n2 + "; " + s2 + ")  in map " + l + " belongs to a map not loaded"));
            return false;
        }
        if (yx_02.a(n, n2, s2)) {
            return false;
        }
        return yz_0.a(yx_02, n, n2, s2) != null;
    }

    public static short[] c(int n, int n2) {
        assert (b) : "Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.d(d, n, n2, (short)0);
    }

    public static short[] d(long l, int n, int n2, short s2) {
        assert (!c) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s2);
        if (yx_02 == null || yx_02.a(n, n2)) {
            return Cn.h;
        }
        int n3 = yx_02.a().a(n, n2, f, 0);
        TShortArrayList tShortArrayList = new TShortArrayList();
        for (int k = 0; k < n3; ++k) {
            if (yz_0.f[k].z == -1 || yz_0.f[k].e || yx_02.a(n, n2, yz_0.f[k].c)) continue;
            tShortArrayList.add(yz_0.f[k].c);
        }
        tShortArrayList.reverse();
        return tShortArrayList.toArray();
    }

    public static short[] d(int n, int n2) {
        assert (b) : "Can't getWalkableZ without giving worldId if not using constant world. See TopologyMapManager.enableConstantWorld for more informations";
        return yz_0.e(d, n, n2, (short)0);
    }

    public static short[] e(long l, int n, int n2, short s2) {
        assert (!c) : "Can't call getNearestZ in a 'thread safe aware' environnement. See TopologyMapManager.setLimitToThreadSafeMethods for more informations";
        yx_0 yx_02 = yz_0.a(l, n, n2, s2);
        if (yx_02 == null) {
            return Cn.h;
        }
        int n3 = yx_02.a().a(n, n2, f, 0);
        short[] sArray = new short[n3];
        for (int k = 0; k < n3; ++k) {
            sArray[k] = yz_0.f[k].c;
        }
        return sArray;
    }

    public static boolean a(int n, int n2, int n3, int n4, boolean bl) {
        int n5 = Math.abs(n3 - n);
        if (n5 > 1) {
            return false;
        }
        int n6 = Math.abs(n4 - n2);
        if (n6 > 1) {
            return false;
        }
        if (n5 != n6) {
            return true;
        }
        return bl && n5 != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l, short s2, short s3, short s4, yv_0 yv_02) {
        long l2 = yz_0.a(l, (long)s2, (long)s3, (int)s4);
        Object object = k;
        synchronized (object) {
            j.put(l2, (Object)yv_02);
            i.put(l2, (Object)new yx_0(yv_02));
        }
    }

    private static long a(long l, long l2, long l3, int n) {
        return (l2 += 32767L) << 48 | (l3 += 32767L) << 32 | (l & 0xFFFFL) << 16 | (long)(n & 0xFFFF);
    }

    private static ys_0 a(yx_0 yx_02, int n, int n2, short s2) {
        if (yx_02.a(n, n2, s2)) {
            return null;
        }
        int n3 = yx_02.a().a(n, n2, f, 0);
        for (int k = 0; k < n3; ++k) {
            if (yz_0.f[k].c != s2) continue;
            return yz_0.f[k].z == -1 ? null : f[k];
        }
        return null;
    }

    private static void a(yx_0 yx_02, int n, int n2) {
        for (int k = 0; k < n2; ++k) {
            ys_0 ys_02 = f[n + k];
            if (!yx_02.a(ys_02.a, ys_02.b, ys_02.c)) continue;
            ys_02.z = (byte)-1;
        }
    }

    public static List<aff_1> a(aff_1 aff_13, boolean bl) {
        return yz_0.a(aff_13, 1, 1, bl, (aff_1 aff_12) -> true);
    }

    public static List<aff_1> a(aff_1 aff_13, int n, int n2, boolean bl) {
        return yz_0.a(aff_13, n, n2, bl, (aff_1 aff_12) -> true);
    }

    public static List<aff_1> a(aff_1 aff_12, int n, int n2, boolean bl, Predicate<aff_1> predicate) {
        aej_2[] aej_2Array;
        ArrayList<aff_1> arrayList = new ArrayList<aff_1>();
        block0: for (aej_2 aej_22 : aej_2Array = bl ? aej_2.d() : aej_2.e()) {
            aff_1 aff_13 = new aff_1(aff_12);
            for (int k = n; k <= n2; ++k) {
                aff_13.a(aej_22);
                short s2 = yz_0.b(aff_13.d(), aff_13.e(), aff_13.f());
                if (s2 == Short.MIN_VALUE || !predicate.test(aff_13)) continue;
                aff_13.a(s2);
                arrayList.add(aff_13);
                continue block0;
            }
        }
        return arrayList;
    }

    public static void a(String[] stringArray) {
        try {
            int n = 332;
            e = "jar:file:/F:/Work/Code/Wakfu_export_data/data/wakfu/client/contents/maps/tplg/%d.jar!/";
            yz_0.a(332L, (short)0, (short)0);
            yx_0 yx_02 = yz_0.b(332L, (short)0, (short)0, (short)0);
            System.out.println("");
        }
        catch (IOException iOException) {
            h.error((Object)"", (Throwable)iOException);
        }
    }

    static {
        f = ys_0.b();
        g = new up_0(-1, 0, -1, true);
        h = Logger.getLogger(yz_0.class);
        i = new TLongObjectHashMap();
        j = new TLongObjectHashMap();
        k = new Object();
        l = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new ya_0());
    }
}

