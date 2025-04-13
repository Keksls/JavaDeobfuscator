/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aAD
 */
public abstract class aad_1 {
    private static final Logger k = Logger.getLogger(aad_1.class);
    protected final Hx a = new Hx(160680L);
    private static final float l = 1.0471976f;
    public static final byte b = 9;
    protected final TIntArrayList c = new TIntArrayList();
    protected final int[][] d;
    protected int e;
    protected final float f;
    protected final float g;
    protected final boolean h;
    protected ArrayList<afq_2> i = new ArrayList();
    private static final afq_2 m = new afq_2();

    public aad_1(float f2, boolean bl) {
        this(f2, bl, true);
    }

    public aad_1(float f2, boolean bl, boolean bl2) {
        this.g = f2;
        this.h = bl;
        if (bl2) {
            this.e = (int)Math.ceil(2.0 / (4.0 * (double)f2));
            if (this.e < 2) {
                this.e = 2;
            }
            this.f = 2.0f / (float)this.e;
            this.d = new int[this.e * this.e][9];
            for (int k = 0; k < this.e; ++k) {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    for (int i3 = 0; i3 < 9; ++i3) {
                        this.d[k * this.e + i2][i3] = -1;
                    }
                }
            }
        } else {
            this.e = 0;
            this.f = 0.0f;
            this.d = null;
        }
    }

    public ArrayList<afq_2> a() {
        return this.i;
    }

    public float a(afq_2 afq_22, afq_2 afq_23) {
        m.a(afq_23);
        m.f(afq_22);
        this.b(m, m);
        return aad_1.m.a * aad_1.m.a + aad_1.m.b * aad_1.m.b;
    }

    public boolean a(afq_2 afq_22) {
        return -1.0f <= afq_22.a && -1.0f <= afq_22.b && 1.0f >= afq_22.a && 1.0f >= afq_22.b;
    }

    public afq_2 b() {
        return new afq_2(2.0f * this.a.nextFloat() - 1.0f, 2.0f * this.a.nextFloat() - 1.0f);
    }

    final void b(afq_2 afq_22, afq_2 afq_23) {
        float f2 = afq_22.a;
        float f3 = afq_22.b;
        if (this.h) {
            if (f2 < -1.0f) {
                f2 += 2.0f;
            } else if (f2 > 1.0f) {
                f2 -= 2.0f;
            }
            if (f3 < -1.0f) {
                f3 += 2.0f;
            } else if (f3 > 1.0f) {
                f3 -= 2.0f;
            }
        }
        afq_23.a(f2, f3);
    }

    final afq_2 b(afq_2 afq_22) {
        afq_2 afq_23 = new afq_2();
        this.b(afq_22, afq_23);
        return afq_23;
    }

    public int c(afq_2 afq_22) {
        int n = (int)Math.floor(0.5 * (double)(afq_22.a + 1.0f) * (double)this.e);
        if (n < 0 || n >= this.e) {
            k.warn((Object)"Internal error, point outside grid was generated, ignoring.\n");
            return -1;
        }
        return n;
    }

    public int d(afq_2 afq_22) {
        int n = (int)Math.floor(0.5 * (double)(afq_22.b + 1.0f) * (double)this.e);
        if (n < 0 || n >= this.e) {
            k.warn((Object)"Internal error, point outside grid was generated, ignoring.\n");
            return -1;
        }
        return n;
    }

    public boolean e(afq_2 afq_22) {
        if (this.d != null) {
            int n;
            int n2 = this.c(afq_22);
            int n3 = this.d(afq_22);
            int[] nArray = this.d[n3 * this.e + n2];
            for (n = 0; n < 9; ++n) {
                if (nArray[n] != -1) continue;
                nArray[n] = this.i.size();
                break;
            }
            if (n == 9) {
                k.warn((Object)"Internal error, overflowed max points per grid cell");
                return false;
            }
        }
        this.i.add(afq_22);
        return true;
    }

    public boolean f(afq_2 afq_22) {
        int n = this.i.indexOf(afq_22);
        if (this.d != null) {
            int n2;
            int n3 = this.c(afq_22);
            int n4 = this.d(afq_22);
            int[] nArray = this.d[n4 * this.e + n3];
            for (n2 = 0; n2 < 9; ++n2) {
                if (nArray[n2] != n) continue;
                System.arraycopy(nArray, n2 + 1, nArray, n2, nArray.length - n2 - 1);
                nArray[8] = -1;
                break;
            }
            if (n2 == 9) {
                return false;
            }
        }
        this.i.remove(n);
        return true;
    }

    public int a(afq_2 afq_22, float f2) {
        assert (this.d != null) : "Internal error, sampler cannot search without grid.";
        float f3 = f2 * f2;
        int n = (int)Math.ceil(f2 / this.f);
        if (n > this.e >> 1) {
            n = this.e >> 1;
            k.warn((Object)("N = " + n));
        }
        this.c.clear();
        int n2 = this.c(afq_22);
        int n3 = this.d(afq_22);
        for (int k = -n; k <= n; ++k) {
            for (int i2 = -n; i2 <= n; ++i2) {
                int n4 = (n2 + i2 + this.e) % this.e;
                int n5 = (n3 + k + this.e) % this.e;
                int[] nArray = this.d[n5 * this.e + n4];
                for (int i3 = 0; i3 < 9 && nArray[i3] != -1; ++i3) {
                    if (!(this.a(afq_22, this.i.get(nArray[i3])) < f3)) continue;
                    this.c.add(nArray[i3]);
                }
            }
        }
        return this.c.size();
    }

    public float b(afq_2 afq_22, float f2) {
        assert (this.d != null) : "Internal error, sampler cannot search without grid.";
        float f3 = f2 * f2;
        int n = (int)Math.ceil(f2 / this.f);
        if (n > this.e >> 1) {
            n = this.e >> 1;
        }
        int n2 = this.c(afq_22);
        int n3 = this.d(afq_22);
        for (int k = -n; k <= n; ++k) {
            for (int i2 = -n; i2 <= n; ++i2) {
                int n4 = (n2 + i2 + this.e) % this.e;
                int n5 = (n3 + k + this.e) % this.e;
                int[] nArray = this.d[n5 * this.e + n4];
                for (int i3 = 0; i3 < 9 && nArray[i3] != -1; ++i3) {
                    float f4 = this.a(afq_22, this.i.get(nArray[i3]));
                    if (!(f4 < f3)) continue;
                    f3 = f4;
                }
            }
        }
        return (float)Math.sqrt(f3);
    }

    public void a(int n, aal_1 aal_12) {
        assert (this.d != null) : "Internal error, sampler cannot search without grid.";
        afq_2 afq_22 = this.i.get(n);
        float f2 = 16.0f * this.g * this.g;
        int n2 = (int)Math.ceil(4.0f * this.g / this.f);
        if (n2 > this.e >> 1) {
            n2 = this.e >> 1;
        }
        int n3 = this.c(afq_22);
        int n4 = this.d(afq_22);
        int n5 = (double)(afq_22.a - (-1.0f + (float)n3 * this.f)) > (double)this.f * 0.5 ? 1 : 0;
        int n6 = (double)(afq_22.b - (-1.0f + (float)n4 * this.f)) > (double)this.f * 0.5 ? 1 : 0;
        int n7 = 1;
        for (int k = -n2; k <= n2; ++k) {
            int n8 = 1;
            if (k == 0) {
                n7 = n6;
            } else if (k == 1) {
                n7 = 0;
            }
            for (int i2 = -n2; i2 <= n2; ++i2) {
                if (i2 == 0) {
                    n8 = n5;
                } else if (i2 == 1) {
                    n8 = 0;
                }
                float f3 = afq_22.a - (-1.0f + (float)(n3 + i2 + n8) * this.f);
                float f4 = afq_22.b - (-1.0f + (float)(n4 + k + n7) * this.f);
                if (!(f3 * f3 + f4 * f4 < f2)) continue;
                int n9 = (n3 + i2 + this.e) % this.e;
                int n10 = (n4 + k + this.e) % this.e;
                int[] nArray = this.d[n10 * this.e + n9];
                for (int i3 = 0; i3 < 9 && nArray[i3] != -1; ++i3) {
                    if (nArray[i3] == n) continue;
                    afq_2 afq_23 = this.i.get(nArray[i3]);
                    afq_2 afq_24 = this.b(afq_23.e(afq_22));
                    float f5 = afq_24.a * afq_24.a + afq_24.b * afq_24.b;
                    if (!(f5 < f2)) continue;
                    float f6 = Hw.k(f5);
                    float f7 = Hw.e(afq_24.b, afq_24.a);
                    float f8 = Hw.j(0.25f * f6 / this.g);
                    aal_12.b(f7 - f8, f7 + f8);
                }
            }
        }
    }

    public void c() {
        aal_1 aal_12 = new aal_1(0.0f, 0.0f);
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            afq_2 afq_22 = this.i.get(k);
            aal_12.a(0.0f, (float)Math.PI * 2);
            this.a(k, aal_12);
            ArrayList<aam_1> arrayList = aal_12.a();
            while (arrayList.size() != 0) {
                aam_1 aam_12 = arrayList.get(Math.abs(this.a.nextInt() >> 1) % arrayList.size());
                float f2 = aam_12.a + (aam_12.b - aam_12.a) * this.a.nextFloat();
                afq_2 afq_23 = this.b(new afq_2(afq_22.a + Hw.g(f2) * 2.0f * this.g, afq_22.b + Hw.f(f2) * 2.0f * this.g));
                this.e(afq_23);
                aal_12.b(f2 - 1.0471976f, f2 + 1.0471976f);
            }
        }
    }

    public void d() {
    }

    public void a(ArrayList<afq_2> arrayList, float f2) {
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            afq_2 afq_22 = arrayList.get(k);
            this.a(afq_22, f2 * 2.0f);
            for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
                tIntHashSet.add(this.c.get(i2));
            }
        }
        ArrayList arrayList2 = new ArrayList(tIntHashSet.size());
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new aae_1(this, arrayList2));
        }
        this.i = arrayList2;
    }

    public void a(ArrayList<afq_2> arrayList, ArrayList<afq_2> arrayList2, float f2) {
        if (arrayList2 == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        if (arrayList != null) {
            for (int k = arrayList.size() - 1; k >= 0; --k) {
                afq_2 afq_22 = arrayList.get(k);
                this.a(afq_22, f2 * 2.0f);
                for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
                    tIntHashSet.add(this.c.get(i2));
                }
            }
        }
        arrayList2.ensureCapacity(tIntHashSet.size());
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new aaf_1(this, arrayList2));
        }
    }

    public void b(ArrayList<afq_2> arrayList, float f2) {
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            afq_2 afq_22 = arrayList.get(k);
            this.a(afq_22, f2 * 2.0f);
            for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
                tIntHashSet.add(this.c.get(i2));
            }
        }
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new aag_1(this));
        }
    }

    public void b(ArrayList<afq_2> arrayList, ArrayList<afq_2> arrayList2, float f2) {
        if (arrayList2 == null) {
            return;
        }
        int n = this.i.size();
        for (int k = 0; k < n; ++k) {
            arrayList2.add(this.i.get(k));
        }
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (n = arrayList.size() - 1; n >= 0; --n) {
            afq_2 afq_22 = arrayList.get(n);
            this.a(afq_22, f2 * 2.0f);
            for (int k = this.c.size() - 1; k >= 0; --k) {
                tIntHashSet.add(this.c.get(k));
            }
        }
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new aah_1(this, arrayList2));
        }
    }

    public void e() {
        this.a.setSeed(160680L);
    }
}

