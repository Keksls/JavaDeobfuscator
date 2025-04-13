/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.strategy.HashingStrategy
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.strategy.HashingStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from CJ
 */
final class cj_0 {
    private static final Logger a = Logger.getLogger(cj_0.class);
    static final HashingStrategy<float[]> b = new cl_0();
    static final HashingStrategy<short[]> c = new cm_0();
    private static final int d = 4;
    private static final int e = 2;
    private static final int f = 4;
    private final cn_0 g = new cn_0();
    private final ArrayList<ck_0> h = new ArrayList();

    cj_0() {
    }

    public void a(List<di_0> list) {
        this.h.ensureCapacity(list.size());
        this.g.a();
        a.info((Object)("\tSprites = " + list.size()));
        for (di_0 di_02 : list) {
            this.h.add(this.a(di_02));
        }
        a.info((Object)("\tTranslations = " + this.g.b.size()));
        a.info((Object)("\tRotations = " + this.g.a.size()));
        a.info((Object)("\tColors = " + this.g.c.size()));
        a.info((Object)("\tActions = " + this.g.d.size()));
    }

    private ck_0 a(di_0 di_02) {
        ck_0 ck_02 = new ck_0(di_02);
        fs_0[] fs_0Array = di_02.h();
        int n = fs_0Array.length;
        ck_02.f = new short[n][];
        ck_02.g = new short[n][];
        ck_02.h = new TIntArrayList[n];
        for (int k = 0; k < n; ++k) {
            int n2;
            TIntArrayList tIntArrayList;
            fs_0 fs_02 = fs_0Array[k];
            ft_0[] ft_0Array = fs_02.a();
            int n3 = ft_0Array.length;
            ck_02.f[k] = new short[n3];
            ck_02.h[k] = tIntArrayList = new TIntArrayList(2000);
            for (int i2 = 0; i2 < n3; ++i2) {
                ft_0 ft_02 = ft_0Array[i2];
                ck_02.f[k][i2] = ft_0Array[i2].e();
                n2 = 0;
                if (ft_02.c()) {
                    n2 = (byte)(n2 | 8);
                }
                if (ft_02.d()) {
                    n2 = (byte)(n2 | 4);
                }
                if (ft_02.a()) {
                    n2 = (byte)(n2 | 1);
                }
                if (ft_02.b()) {
                    n2 = (byte)(n2 | 2);
                }
                tIntArrayList.add(n2);
                if (ft_02.c()) {
                    tIntArrayList.add(4 * this.g.c(ft_02.l(), ft_02.m(), ft_02.n(), ft_02.o()));
                }
                if (ft_02.d()) {
                    tIntArrayList.add(4 * this.g.c(ft_02.p(), ft_02.q(), ft_02.r(), ft_02.s()));
                }
                if (ft_02.a()) {
                    tIntArrayList.add(4 * this.g.a(ft_02.f(), ft_02.g(), ft_02.h(), ft_02.i()));
                }
                if (!ft_02.b()) continue;
                tIntArrayList.add(2 * this.g.b(ft_02.j(), ft_02.k()));
            }
            Fz[] fzArray = fs_02.b();
            ck_02.g[k] = new short[fzArray.length];
            if (fzArray.length == 0) continue;
            for (int i3 = 0; i3 < fzArray.length; ++i3) {
                n2 = this.g.a(fzArray[i3]);
                if (n2 > 65535) {
                    throw new IllegalStateException("Too many actions in frame");
                }
                ck_02.g[k][i3] = (short)n2;
            }
        }
        return ck_02;
    }

    public fy_0 a() {
        fy_0 fy_02 = new fy_0();
        Float[] floatArray = (Float[])this.g.g.stream().flatMap(fArray -> Lists.newArrayList((Object[])Cg.a(fArray)).stream()).toArray(Float[]::new);
        fy_02.a(Cg.a(floatArray));
        Float[] floatArray2 = (Float[])this.g.e.stream().flatMap(fArray -> Lists.newArrayList((Object[])Cg.a(fArray)).stream()).toArray(Float[]::new);
        fy_02.b(Cg.a(floatArray2));
        Float[] floatArray3 = (Float[])this.g.f.stream().flatMap(fArray -> Lists.newArrayList((Object[])Cg.a(fArray)).stream()).toArray(Float[]::new);
        fy_02.c(Cg.a(floatArray3));
        fy_02.a(this.g.h.toArray(new Fz[this.g.h.size()]));
        return fy_02;
    }

    public ga_0 b() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (ck_0 ck_02 : this.h) {
            Object object;
            int n = ck_02.f.length;
            if (n == 1) {
                fv_0 fv_02;
                gc_0 gc_02;
                object = ck_02.f[0];
                if (((Object)object).length == 1) {
                    if (ck_02.g[0].length == 0) {
                        gc_02 = new fz_0();
                        ((fz_0)gc_02).a(ck_02.a);
                        ((fz_0)gc_02).a(ck_02.e);
                        if ((ck_02.e & 0x40) != 0) {
                            ((fz_0)gc_02).a(ck_02.b);
                        }
                        ((fz_0)gc_02).a(ck_02.c);
                        ((fz_0)gc_02).b(ck_02.d);
                        ((fz_0)gc_02).b((short)object[0]);
                        fv_02 = new fv_0(ck_02.h[0].toArray());
                        ((fz_0)gc_02).a(fv_02);
                        arrayList.add(gc_02);
                        continue;
                    }
                    gc_02 = new fx_0();
                    ((fx_0)gc_02).a(ck_02.a);
                    ((fx_0)gc_02).a(ck_02.e);
                    if ((ck_02.e & 0x40) != 0) {
                        ((fx_0)gc_02).a(ck_02.b);
                    }
                    ((fx_0)gc_02).a(ck_02.c);
                    ((fx_0)gc_02).b(ck_02.d);
                    ((fx_0)gc_02).b((short)object[0]);
                    ((fx_0)gc_02).a(ck_02.g[0]);
                    fv_02 = new fv_0(ck_02.h[0].toArray());
                    ((fx_0)gc_02).a(fv_02);
                    arrayList.add(gc_02);
                    continue;
                }
                gc_02 = new FY();
                ((FY)gc_02).a(ck_02.a);
                ((FY)gc_02).a(ck_02.e);
                if ((ck_02.e & 0x40) != 0) {
                    ((FY)gc_02).a(ck_02.b);
                }
                ((FY)gc_02).a(ck_02.c);
                ((FY)gc_02).b(ck_02.d);
                ((FY)gc_02).b((short[])object);
                ((FY)gc_02).a(ck_02.g[0]);
                fv_02 = new fv_0(ck_02.h[0].toArray());
                ((FY)gc_02).a(fv_02);
                arrayList.add(gc_02);
                continue;
            }
            object = new FW();
            ((FW)object).a(ck_02.a);
            ((FW)object).a(ck_02.e);
            if ((ck_02.e & 0x40) != 0) {
                ((FW)object).a(ck_02.b);
            }
            ((FW)object).a(ck_02.c);
            ((FW)object).b(ck_02.d);
            boolean bl = Arrays.stream(ck_02.g).anyMatch(sArray -> ((short[])sArray).length > 0);
            int n2 = bl ? 3 : 2;
            int[] nArray = new int[n * n2];
            TIntArrayList tIntArrayList = new TIntArrayList();
            ck_02.i.clear();
            for (int k = 0; k < n; ++k) {
                if (ck_02.i.contains((Object)ck_02.h[k])) {
                    nArray[k * n2] = ck_02.i.get((Object)ck_02.h[k]);
                    continue;
                }
                nArray[k * n2] = tIntArrayList.size();
                tIntArrayList.add(ck_02.h[k].toArray());
                ck_02.i.put((Object)ck_02.h[k], nArray[k * n2]);
            }
            ck_02.j.clear();
            TShortArrayList tShortArrayList = new TShortArrayList();
            for (int k = 0; k < n; ++k) {
                if (ck_02.j.contains((Object)ck_02.f[k])) {
                    nArray[k * n2 + 1] = ck_02.j.get((Object)ck_02.f[k]);
                    continue;
                }
                nArray[k * n2 + 1] = tShortArrayList.size();
                tShortArrayList.add((short)ck_02.f[k].length);
                tShortArrayList.add(ck_02.f[k]);
                ck_02.j.put((Object)ck_02.f[k], nArray[k * n2 + 1]);
            }
            TShortArrayList tShortArrayList2 = new TShortArrayList();
            if (bl) {
                ck_02.j.clear();
                for (int k = 0; k < n; ++k) {
                    if (ck_02.j.contains((Object)ck_02.g[k])) {
                        nArray[k * n2 + 2] = ck_02.j.get((Object)ck_02.g[k]);
                        continue;
                    }
                    nArray[k * n2 + 2] = tShortArrayList2.size();
                    tShortArrayList2.add((short)ck_02.g[k].length);
                    tShortArrayList2.add(ck_02.g[k]);
                    ck_02.j.put((Object)ck_02.g[k], nArray[k * n2 + 2]);
                }
            }
            ((FW)object).a(nArray);
            ((FW)object).a(tShortArrayList.toArray());
            ((FW)object).b(tShortArrayList2.toArray());
            short[] sArray2 = ((FW)object).l();
            for (int k = 0; k < sArray2.length; ++k) {
                if (sArray2[k] > ((FW)object).g()) {
                    ((FW)object).c(sArray2[k]);
                }
                k += sArray2[k];
            }
            fv_0 fv_03 = new fv_0(tIntArrayList.toArray());
            ((FW)object).a(fv_03);
            arrayList.add(object);
        }
        ga_0 ga_02 = new ga_0();
        ga_02.a(arrayList.toArray(new gc_0[arrayList.size()]));
        return ga_02;
    }
}

