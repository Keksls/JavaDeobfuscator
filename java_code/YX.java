/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class YX {
    private static final Logger b = Logger.getLogger(YX.class);
    private static TIntArrayList c = new TIntArrayList(25);
    private static TIntArrayList d = new TIntArrayList(25);
    private static TIntArrayList e = new TIntArrayList(25);
    private static int f = Integer.MIN_VALUE;
    private static int g = Integer.MIN_VALUE;
    private static int h = Integer.MIN_VALUE;
    private static long i = -32768L;
    private static final boolean j = true;
    private static final aew_0 k = aew_0.a();
    private static final acs_0 l = acs_0.b();
    private static final aev m = aev.a();
    private static final ArrayList<Runnable> n = new ArrayList();
    private static YW o;

    public static void a(acb_0 acb_02, int n, int n2, short s2) {
        abY abY2 = acb_02.b();
        ahh_0 ahh_02 = abY2.u();
        YX.a(n, n2, 2);
        ahh_02.b(n, n2, s2);
        abY2.s();
        acb_02.m();
        l.a(abY2.n());
    }

    public static void a(int n, int n2, int n3) {
        short s2;
        short s3;
        int n4;
        int n5;
        assert (i != -32768L) : "Il faut d'abord appeler setWorldId";
        int n6 = XY.a(n);
        int n7 = XY.b(n2);
        int n8 = n3 * 2 + 1;
        if (n6 == f && n7 == g && h >= n8) {
            return;
        }
        f = n6;
        g = n7;
        h = n8;
        n6 -= n3;
        n7 -= n3;
        TIntArrayList tIntArrayList = c;
        c = e;
        d = tIntArrayList;
        d.clear();
        for (n5 = 0; n5 < n8; ++n5) {
            for (n4 = 0; n4 < n8; ++n4) {
                s3 = (short)(n6 + n5);
                s2 = (short)(n7 + n4);
                int n9 = Hw.c(s3, s2);
                if (!o.a(s3, s2)) continue;
                d.add(n9);
                if (c.contains(n9)) continue;
                o.b(s3, s2);
            }
        }
        for (n5 = 0; n5 < c.size(); ++n5) {
            n4 = c.getQuick(n5);
            if (d.contains(n4)) continue;
            s3 = Hw.b(n4);
            s2 = Hw.c(n4);
            YX.c(s3, s2);
        }
        tIntArrayList = e;
        e = d;
        d = tIntArrayList;
    }

    private static void c(short s2, short s3) {
        k.c(s2, s3);
        m.b(s2, s3);
        yz_0.c(s2, s3);
    }

    public static void a(short s2, short s3) {
        int n = Hw.c(s2, s3);
        ahx_2.a(e, n);
        YX.c(s2, s3);
        f = Integer.MIN_VALUE;
        g = Integer.MIN_VALUE;
        h = Integer.MIN_VALUE;
    }

    public static void a(long l, YW yW) {
        if (i == l) {
            return;
        }
        YX.b();
        o = yW;
        yW.a(k, YX.l, m);
        i = l;
        int n = YX.n.size();
        for (int k = 0; k < n; ++k) {
            YX.n.get(k).run();
        }
        YX.n.clear();
        o.a(l);
        yz_0.a(l);
        k.a(l);
        YX.l.a(l);
        m.a(l);
        o.b(l);
    }

    public static long a() {
        return i;
    }

    public static void a(long l) {
        YX.a(l, YV.a());
    }

    public static void b() {
        f = Integer.MIN_VALUE;
        g = Integer.MIN_VALUE;
        h = Integer.MIN_VALUE;
        i = -32768L;
        c.clear();
        d.clear();
        e.clear();
        k.b();
        k.c();
        m.c();
        yz_0.e();
        k.c();
        m.c();
        l.d();
        o.b();
    }

    public static Ya a(short s2) {
        return YV.a().a(s2);
    }

    public static void a(@NotNull String string, @NotNull String string2) {
        YV.a().a(string, string2);
    }

    public static boolean b(short s2, short s3) {
        return o.a(s2, s3);
    }

    static {
        YV.a().a(k, l, m);
        o = YV.a();
    }
}

