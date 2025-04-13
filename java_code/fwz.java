/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import java.util.ArrayList;

public class fwz {
    private final ArrayList<fww> a = new ArrayList();
    private final fwA b;
    private int c;
    private int d = Integer.MAX_VALUE;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private ayo_2 j;

    public fwz(fwA fwA2) {
        this.c = Integer.MAX_VALUE;
        this.f = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.b = fwA2;
    }

    public fwA a() {
        return this.b;
    }

    public void a(fww fww2) {
        this.a.add(fww2);
    }

    public void b(fww fww2) {
        this.a.remove(fww2);
    }

    public ArrayList<fww> b() {
        return this.a;
    }

    public void a(float f2) {
        this.i = f2;
    }

    public fwx a(int n, int n2) {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            fwx fwx2;
            fww fww2 = this.a.get(k);
            if (!fww2.x() || (fwx2 = fww2.b(n, n2)) == null) continue;
            return fwx2;
        }
        return null;
    }

    public void c() {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            fww fww2 = this.a.get(k);
            if (!fww2.x()) continue;
            this.c = Math.min(this.c, fww2.d());
            this.d = Math.min(this.d, fww2.f());
            this.e = Math.max(this.e, fww2.e());
            this.f = Math.max(this.f, fww2.g());
        }
    }

    public void a(int n) {
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            fww fww2 = this.a.get(k);
            fww2.b(n);
        }
    }

    public float[] d() {
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        int n = (int)((float)this.b.aY_() * 10.0f);
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            fww fww2 = this.a.get(k);
            if (!fww2.x()) continue;
            for (int i2 = fww2.d() - 1; i2 < fww2.e() + 1; ++i2) {
                for (int i3 = fww2.f() - 1; i3 < fww2.g() + 1; ++i3) {
                    boolean bl;
                    fwx fwx2 = fww2.b(i2, i3);
                    boolean bl2 = fww2.b(i2, i3 + 1) == null && this.a(i2, i3 + 1) != null;
                    boolean bl3 = bl = fww2.b(i2 + 1, i3) == null && this.a(i2 + 1, i3) != null;
                    if (fwx2 == null) continue;
                    if (bl2) {
                        tFloatArrayList.add(fwx2.a);
                        tFloatArrayList.add(fwx2.b + (float)n);
                        tFloatArrayList.add(fwx2.g);
                        tFloatArrayList.add(fwx2.h + (float)n);
                    }
                    if (!bl) continue;
                    tFloatArrayList.add(fwx2.e);
                    tFloatArrayList.add(fwx2.f + (float)n);
                    tFloatArrayList.add(fwx2.g);
                    tFloatArrayList.add(fwx2.h + (float)n);
                }
            }
        }
        return tFloatArrayList.toArray();
    }

    public float[] e() {
        float f2 = 1.0f / this.i;
        float f3 = f2 / 2.0f;
        int n = (int)((float)this.b.aY_() * 10.0f);
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int k = this.c; k < this.e + 1; ++k) {
            for (int i2 = this.d; i2 < this.f + 1; ++i2) {
                fwx fwx2 = this.a(k, i2);
                if (fwx2 == null) continue;
                fwx fwx3 = this.a(k + 1, i2);
                fwx fwx4 = this.a(k, i2 + 1);
                fwx fwx5 = this.a(k, i2 - 1);
                fwx fwx6 = this.a(k - 1, i2);
                fwx fwx7 = this.a(k + 1, i2 - 1);
                fwx fwx8 = this.a(k + 1, i2 + 1);
                fwx fwx9 = this.a(k - 1, i2 - 1);
                fwx fwx10 = this.a(k - 1, i2 + 1);
                float f4 = fwx2.a + 2.0f * f2 + (fwx6 != null ? -f2 : 0.0f) + (fwx4 != null ? -f2 : 0.0f);
                float f5 = fwx2.b + (float)n + (fwx6 != null ? f3 : 0.0f) + (fwx4 != null ? -f3 : 0.0f);
                float f6 = fwx2.e - 2.0f * f2 - (fwx3 != null ? -f2 : 0.0f) - (fwx5 != null ? -f2 : 0.0f);
                float f7 = fwx2.f + (float)n - (fwx3 != null ? f3 : 0.0f) - (fwx5 != null ? -f3 : 0.0f);
                float f8 = fwx2.c + (fwx6 != null ? -f2 : 0.0f) + (fwx5 != null ? f2 : 0.0f);
                float f9 = fwx2.d + (float)n - 2.0f * f3 + (fwx6 != null ? f3 : 0.0f) + (fwx5 != null ? f3 : 0.0f);
                float f10 = fwx2.g + (fwx3 != null ? f2 : 0.0f) + (fwx4 != null ? -f2 : 0.0f);
                float f11 = fwx2.h + (float)n + 2.0f * f3 - (fwx3 != null ? f3 : 0.0f) - (fwx4 != null ? f3 : 0.0f);
                if (fwx5 == null) {
                    if (fwx7 != null && fwx3 != null) {
                        f6 = fwx2.e;
                        f7 = fwx2.f - 2.0f * f3 + (float)n;
                    }
                    if (fwx9 != null && fwx6 != null) {
                        f8 = fwx2.c - 2.0f * f2;
                        f9 = fwx2.d + (float)n;
                    }
                }
                if (fwx4 == null) {
                    if (fwx10 != null && fwx6 != null) {
                        f4 = fwx2.a;
                        f5 = fwx2.b + 2.0f * f3 + (float)n;
                    }
                    if (fwx8 != null && fwx3 != null) {
                        f10 = fwx2.g + 2.0f * f2;
                        f11 = fwx2.h + (float)n;
                    }
                }
                if (fwx6 == null) {
                    if (fwx9 != null && fwx5 != null) {
                        f8 = fwx2.c + 2.0f * f2;
                        f9 = fwx2.d + (float)n;
                    }
                    if (fwx10 != null && fwx4 != null) {
                        f4 = fwx2.a;
                        f5 = fwx2.b - 2.0f * f3 + (float)n;
                    }
                }
                if (fwx3 == null) {
                    if (fwx7 != null && fwx5 != null) {
                        f6 = fwx2.e;
                        f7 = fwx2.f + 2.0f * f3 + (float)n;
                    }
                    if (fwx8 != null && fwx4 != null) {
                        f10 = fwx2.g - 2.0f * f2;
                        f11 = fwx2.h + (float)n;
                    }
                }
                if (fwx4 == null) {
                    tFloatArrayList.add(f4);
                    tFloatArrayList.add(f5);
                    tFloatArrayList.add(f10);
                    tFloatArrayList.add(f11);
                }
                if (fwx5 == null) {
                    tFloatArrayList.add(f8);
                    tFloatArrayList.add(f9);
                    tFloatArrayList.add(f6);
                    tFloatArrayList.add(f7);
                }
                if (fwx3 == null) {
                    tFloatArrayList.add(f6);
                    tFloatArrayList.add(f7);
                    tFloatArrayList.add(f10);
                    tFloatArrayList.add(f11);
                }
                if (fwx6 != null) continue;
                tFloatArrayList.add(f8);
                tFloatArrayList.add(f9);
                tFloatArrayList.add(f4);
                tFloatArrayList.add(f5);
            }
        }
        return tFloatArrayList.toArray();
    }

    public azj_2 f() {
        return this.b.aX_();
    }

    public int g() {
        return this.b.m();
    }

    public ayo_2 h() {
        return this.j;
    }

    public void a(ayo_2 ayo_22) {
        this.j = ayo_22;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public void k() {
        for (int k = this.a.size() - 1; k >= 0; --k) {
            fww fww2 = this.a.get(k);
            if (fww2 == null || fww2.u() == null || fww2.u().a() == null) continue;
            fww2.v();
        }
    }
}

