/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class Yj {
    protected static final Logger a = Logger.getLogger(Yj.class);
    private static final float b = 0.25f;
    private static final float c = 0.583f;
    private final HashMap<wy_0, Yb> d = new HashMap();
    private final ArrayList<yk_0> e = new ArrayList();
    private final Yg f;

    public Yj(Yb yb, Yb yb2, Yb yb3, Yb yb4) {
        this.d.put(wy_0.b, yb);
        this.d.put(wy_0.c, yb2);
        this.d.put(wy_0.d, yb3);
        this.d.put(wy_0.a, yb4);
        this.f = new Yg(this);
    }

    public void a(yk_0 yk_02) {
        if (!this.e.contains(yk_02)) {
            this.e.add(yk_02);
        }
    }

    public Yb a(wy_0 wy_02) {
        return this.d.get((Object)wy_02);
    }

    public Yg a() {
        return this.f;
    }

    @Nullable
    public Ye a(wu_0 wu_02) {
        wy_0 wy_02 = wy_0.a(wu_02);
        Yb yb = this.d.get((Object)wy_02);
        if (yb == null) {
            return null;
        }
        int n = wy_0.c(wu_02);
        return yb.a(n);
    }

    public void a(wu_0 wu_02, float f2) {
        float f3;
        float f4;
        float f5;
        Ye ye;
        Yb yb;
        wy_0 wy_02;
        wu_0 wu_03;
        wy_0 wy_03 = wy_0.a(wu_02);
        Yb yb2 = this.d.get((Object)wy_03);
        if (yb2 == null) {
            return;
        }
        int n = wy_0.c(wu_02);
        Ye ye2 = yb2.a(n);
        if (f2 <= 0.25f) {
            wu_03 = wu_02.t();
            wy_02 = wy_0.a(wu_03);
            yb = this.d.get((Object)wy_02);
            if (yb != null) {
                ye = yb.b();
                f5 = (ye.e() + ye2.d()) * 0.5f;
            } else {
                f5 = (float)((double)ye2.d() + Math.random() * (double)(ye2.e() - ye2.d()));
            }
            f4 = ye2.d();
            f3 = f2 / 0.25f;
        } else if (f2 <= 0.583f) {
            f5 = ye2.d();
            f4 = ye2.e();
            f3 = (f2 - 0.25f) / 0.333f;
        } else {
            wu_03 = wu_02.u();
            wy_02 = wy_0.a(wu_03);
            yb = this.d.get((Object)wy_02);
            if (yb != null) {
                ye = yb.c();
                f4 = (ye.d() + ye2.e()) * 0.5f;
            } else {
                f4 = (float)((double)ye2.d() + Math.random() * (double)(ye2.e() - ye2.d()));
            }
            f5 = ye2.e();
            f3 = (f2 - 0.583f) / 0.417f;
        }
        float f6 = Hw.a(f5, f4, f3);
        ye2.d(f6);
        ye2.e(f2);
        this.f.a(wy_03);
        this.f.a(wu_02);
        try {
            this.f.b();
        }
        catch (Exception exception) {
            a.error((Object)"Error during history update", (Throwable)exception);
        }
        int n2 = this.e.size();
        for (int k = 0; k < n2; ++k) {
            this.e.get(k).a();
        }
    }
}

