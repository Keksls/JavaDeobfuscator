/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from azt
 */
public class azt_1
implements abq_1 {
    protected static final Logger a = Logger.getLogger(azt_1.class);
    private static final ObjectPool b = new abm_1(new azu_1());
    private int c;
    private int d;
    private int e;
    private int f;

    public static azt_1 a() {
        return azt_1.a(0, 0, 0, 0);
    }

    public static azt_1 a(int n, int n2, int n3, int n4) {
        try {
            azt_1 azt_12 = (azt_1)b.borrowObject();
            azt_12.b(n, n2, n3, n4);
            return azt_12;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un Item : ", exception);
        }
    }

    azt_1(int n, int n2, int n3, int n4) {
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    @Override
    public void release() {
        try {
            b.returnObject((Object)this);
        }
        catch (Exception exception) {
            a.error((Object)("Exception dans le release de " + this.getClass().toString() + " (normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    public azt_1 a(azt_1 azt_12) {
        int n = Math.min(this.c, azt_12.c);
        int n2 = Math.min(this.d, azt_12.d);
        int n3 = Math.max(this.c + this.e, azt_12.c + azt_12.e);
        int n4 = Math.max(this.d + this.f, azt_12.d + azt_12.f);
        return azt_1.a(n, n2, n3 - n, n4 - n2);
    }

    public void b(azt_1 azt_12) {
        int n = Math.min(this.c, azt_12.c);
        int n2 = Math.min(this.d, azt_12.d);
        int n3 = Math.max(this.c + this.e, azt_12.c + azt_12.e);
        int n4 = Math.max(this.d + this.f, azt_12.d + azt_12.f);
        this.b(n, n2, n3 - n, n4 - n2);
    }

    public azt_1 c(azt_1 azt_12) {
        azt_1 azt_13 = azt_1.a();
        azt_13.a(this, azt_12);
        return azt_13;
    }

    public void a(azt_1 azt_12, azt_1 azt_13) {
        int n = azt_12.c;
        int n2 = azt_12.d;
        int n3 = azt_13.c;
        int n4 = azt_13.d;
        long l = n;
        l += (long)azt_12.e;
        long l2 = n2;
        l2 += (long)azt_12.f;
        long l3 = n3;
        l3 += (long)azt_13.e;
        long l4 = n4;
        l4 += (long)azt_13.f;
        if (n < n3) {
            n = n3;
        }
        if (n2 < n4) {
            n2 = n4;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n2;
        if ((l -= (long)n) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        this.c = n;
        this.d = n2;
        this.e = (int)l;
        this.f = (int)l2;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n;
        int n10 = n2;
        long l = n9;
        l += (long)n3;
        long l2 = n10;
        l2 += (long)n4;
        long l3 = n5;
        l3 += (long)n7;
        long l4 = n6;
        l4 += (long)n8;
        if (n9 < n5) {
            n9 = n5;
        }
        if (n10 < n6) {
            n10 = n6;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n10;
        if ((l -= (long)n9) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        this.c = n9;
        this.d = n10;
        this.e = (int)l;
        this.f = (int)l2;
    }

    public boolean d(azt_1 azt_12) {
        int n = this.e;
        int n2 = this.f;
        int n3 = azt_12.e;
        int n4 = azt_12.f;
        if (n3 <= 0 || n4 <= 0 || n <= 0 || n2 <= 0) {
            return false;
        }
        int n5 = this.c;
        int n6 = this.d;
        int n7 = azt_12.c;
        int n8 = azt_12.d;
        n4 += n8;
        n += n5;
        n2 += n6;
        return !((n3 += n7) >= n7 && n3 <= n5 || n4 >= n8 && n4 <= n6 || n >= n5 && n <= n7 || n2 >= n6 && n2 <= n8);
    }

    public static boolean b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n3;
        int n10 = n4;
        int n11 = n7;
        int n12 = n8;
        if (n11 <= 0 || n12 <= 0 || n9 <= 0 || n10 <= 0) {
            return false;
        }
        n12 += n6;
        n9 += n;
        n10 += n2;
        return !((n11 += n5) >= n5 && n11 <= n || n12 >= n6 && n12 <= n2 || n9 >= n && n9 <= n5 || n10 >= n2 && n10 <= n6);
    }

    public void e(azt_1 azt_12) {
        this.c = azt_12.c;
        this.d = azt_12.d;
        this.e = azt_12.e;
        this.f = azt_12.f;
    }

    public void b(int n, int n2, int n3, int n4) {
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public void a(int n, int n2) {
        this.c = n;
        this.d = n2;
    }

    public void a(Dimension dimension) {
        this.b(dimension.width, dimension.height);
    }

    public void b(int n, int n2) {
        this.e = n;
        this.f = n2;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public void a(int n) {
        this.f = n;
    }

    public void b(int n) {
        this.e = n;
    }

    public void c(int n) {
        this.c = n;
    }

    public void d(int n) {
        this.d = n;
    }
}

