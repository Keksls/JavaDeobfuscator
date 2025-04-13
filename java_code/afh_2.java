/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aFH
 */
public class afh_2
implements afg_1 {
    protected static final float[][] a = new float[][]{{2.0f, -3.0f, 0.0f, 1.0f}, {2.0f, 3.0f, 0.0f, 0.0f}, {1.0f, -2.0f, 1.0f, 0.0f}, {1.0f, -1.0f, 0.0f, 0.0f}};
    private static final afr_2 f = new afr_2();
    private static final afr_2 g = new afr_2();
    protected final ArrayList<afi_2> b;
    protected float c;
    protected long d;
    protected long e;

    public afh_2(List<afe_2> list, long l) {
        Object object;
        this.e = l;
        this.c = 0.0f;
        this.d = 0L;
        this.b = new ArrayList();
        if (list.size() == 1) {
            object = list.get(0);
            List<afe_2> list2 = ((afe_2)object).a(((afe_2)object).h() / 2.0);
            list.clear();
            list.addAll(list2);
        }
        object = null;
        for (int k = 0; k < list.size(); ++k) {
            afj_2 afj_22 = list.get(k);
            afi_2 afi_22 = new afi_2();
            afi_22.b(afj_22.a());
            if (k != 0) {
                ((afi_2)object).a(((afi_2)object).b().e(afi_22.b()).f());
                this.c += ((afi_2)object).c();
            }
            this.d += afj_22.g();
            this.b.add(afi_22);
            object = afi_22;
            if (k != list.size() - 1) continue;
            afi_2 afi_23 = new afi_2();
            afi_23.b(afj_22.b());
            ((afi_2)object).a(((afi_2)object).b().e(afi_23.b()).f());
            this.c += ((afi_2)object).c();
            this.b.add(afi_23);
        }
        this.e();
    }

    protected void e() {
        afr_2 afr_22;
        Object object;
        afi_2 afi_22;
        Object object2;
        afi_2 afi_23;
        for (int k = 1; k < this.b.size() - 1; ++k) {
            afi_23 = this.b.get(k - 1);
            object2 = this.b.get(k);
            afi_22 = this.b.get(k + 1);
            object = afi_22.b().e(((afi_2)object2).b());
            ((afr_2)object).h();
            afr_22 = afi_23.b().e(((afi_2)object2).b());
            afr_22.h();
            afr_2 afr_23 = ((afr_2)object).e(afr_22);
            afr_23.h();
            ((afi_2)object2).a(afr_23);
        }
        afi_2 afi_24 = this.b.get(0);
        afi_23 = this.b.get(1);
        object2 = afi_23.b().e(afi_24.b());
        ((afr_2)object2).a((double)(1.0f / afi_24.c()));
        ((afr_2)object2).a(3.0);
        ((afr_2)object2).c(afi_23.a());
        ((afr_2)object2).a(0.5);
        afi_24.a((afr_2)object2);
        afi_22 = this.b.get(this.b.size() - 1);
        object = this.b.get(this.b.size() - 2);
        afr_22 = afi_22.b().e(((afi_2)object).b());
        afr_22.a((double)(1.0f / ((afi_2)object).c()));
        afr_22.a(3.0);
        afr_22.c(((afi_2)object).a());
        afr_22.a(0.5);
        afi_22.a(afr_22);
    }

    @Override
    public afr_2 a(long l) {
        int n;
        if (l >= this.e + this.d) {
            return this.b.get(this.b.size() - 1).b();
        }
        if (l < this.e) {
            return this.b.get(0).b();
        }
        long l2 = l - this.e;
        float f2 = (float)l2 / (float)this.d;
        float f3 = f2 * this.c;
        float f4 = 0.0f;
        for (n = 0; n < this.b.size() - 1 && f4 + this.b.get(n).c() < f3; ++n) {
            f4 += this.b.get(n).c();
        }
        float f5 = f3 - f4;
        afi_2 afi_22 = this.b.get(n);
        afi_2 afi_23 = this.b.get(n + 1);
        f.a(afi_22.a());
        f.a((double)afi_22.c());
        g.a(afi_23.a());
        g.a((double)afi_22.c());
        return this.a(afi_22.b(), f, afi_23.b(), g, f5 /= afi_22.c());
    }

    protected afr_2 a(afr_2 afr_22, afr_2 afr_23, afr_2 afr_24, afr_2 afr_25, float f2) {
        float f3 = 2.0f * afr_22.a() - 2.0f * afr_24.a() + afr_23.a() + afr_25.a();
        float f4 = 2.0f * afr_22.b() - 2.0f * afr_24.b() + afr_23.b() + afr_25.b();
        float f5 = 2.0f * afr_22.c() - 2.0f * afr_24.c() + afr_23.c() + afr_25.c();
        float f6 = -3.0f * afr_22.a() + 3.0f * afr_24.a() - 2.0f * afr_23.a() - afr_25.a();
        float f7 = -3.0f * afr_22.b() + 3.0f * afr_24.b() - 2.0f * afr_23.b() - afr_25.b();
        float f8 = -3.0f * afr_22.c() + 3.0f * afr_24.c() - 2.0f * afr_23.c() - afr_25.c();
        float f9 = afr_23.a();
        float f10 = afr_23.b();
        float f11 = afr_23.c();
        float f12 = afr_22.a();
        float f13 = afr_22.b();
        float f14 = afr_22.c();
        float f15 = f2;
        float f16 = f2 * f2;
        float f17 = f16 * f2;
        return new afr_2(f3 * f17 + f6 * f16 + f9 * f15 + f12, f4 * f17 + f7 * f16 + f10 * f15 + f13, afr_22.c());
    }

    @Override
    public afr_2 a(long l, aej_2 aej_22, apl_1 apl_12) {
        return afd_2.a(this, l, aej_22, apl_12);
    }

    @Override
    public void c(long l) {
        this.e += l;
    }

    @Override
    public afr_2 a() {
        return this.b.get(0).b();
    }

    @Override
    public afr_2 b() {
        return this.b.get(this.b.size() - 1).b();
    }

    @Override
    public long c() {
        return this.e + this.d;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public boolean b_(long l) {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TimeUniformSpline={");
        for (afi_2 afi_22 : this.b) {
            stringBuilder.append("( position=").append(afi_22.b()).append(" velocity=").append(afi_22.a()).append(", length=").append(afi_22.c()).append(" ), ");
        }
        return stringBuilder.append("}").toString();
    }

    public ArrayList<afi_2> f() {
        return this.b;
    }

    public long g() {
        return this.d;
    }

    public double h() {
        return this.c;
    }
}

