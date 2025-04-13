/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortShortHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TShortShortHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
 * Renamed from CI
 */
public class ci_0 {
    private final Df b;
    private final de_0 c;
    private final ch_0 d;
    public static final Pattern a = Pattern.compile("([0-9]_)?(A|a)nim.*");

    public ci_0(Df df, de_0 de_02, ch_0 ch_02) {
        this.b = df;
        this.c = de_02;
        this.d = ch_02;
    }

    public fr_0 a() {
        fr_0 fr_02 = new fr_0();
        this.a(fr_02);
        this.b(fr_02);
        this.c(fr_02);
        this.d(fr_02);
        this.e(fr_02);
        this.f(fr_02);
        return fr_02;
    }

    private void a(fr_0 fr_02) {
        fl_0 fl_02 = this.b.a();
        if (this.c.a.f.a) {
            fl_02.g();
        }
        fl_02.k();
        fl_02.e();
        fl_02.i();
        fr_02.a(fl_02);
    }

    private void b(fr_0 fr_02) {
        fp_0 fp_02 = fr_02.b();
        fp_02.a(this.c.a.a.a);
        fp_02.b(this.c.a.b.a);
        if (this.c.a.f.a) {
            fp_02.p();
        }
        fp_02.a(this.c.a.c.a);
        List<String> list = this.c.c.b.stream().map(ds_02 -> ds_02.a).collect(Collectors.toList());
        fp_02.a(list);
        ArrayList<fo_0> arrayList = new ArrayList<fo_0>();
        List<di_0> list2 = this.b.c().b();
        for (di_0 object42 : list2) {
            if (object42 == null || object42.b() == null || !a.matcher(object42.b()).matches()) continue;
            fo_0 fo_02 = new fo_0();
            fo_02.a(object42.b());
            fo_02.a(fo_02.b().hashCode());
            fo_02.a((short)-1);
            arrayList.add(fo_02);
        }
        for (int k = 0; k < list.size(); ++k) {
            fr_0 fr_03 = this.d.a(list.get(k));
            List<gc_0> list3 = fr_03.f().b();
            for (gc_0 gc_02 : list3) {
                if (gc_02 == null || gc_02.b() == null || !a.matcher(gc_02.b()).matches()) continue;
                fo_0 fo_03 = new fo_0();
                fo_03.a(gc_02.b());
                fo_03.a(fo_03.b().hashCode());
                fo_03.a((short)k);
                arrayList.add(fo_03);
            }
        }
        fp_02.a(arrayList.toArray(new fo_0[arrayList.size()]));
        ArrayList<FS> arrayList2 = new ArrayList<FS>();
        for (dx_0 dx_02 : this.c.a.d) {
            FS fS = new FS(dx_02.a.hashCode(), dx_02.b.hashCode());
            arrayList2.add(fS);
        }
        fp_02.b(arrayList2);
        ArrayList<FR> arrayList3 = new ArrayList<FR>();
        for (da_0 da_02 : this.c.a.e) {
            FR fR = new FR(da_02.a, da_02.b.hashCode());
            arrayList3.add(fR);
        }
        fp_02.c(arrayList3);
        HashMap<String, Byte> hashMap = new HashMap<String, Byte>();
        for (dw_0 dw_02 : this.c.a.i) {
            hashMap.put(dw_02.a, dw_02.b);
        }
        fp_02.a(hashMap);
        dy_0 dy_02 = this.c.a.h;
        fp_02.a(new float[]{dy_02.a, dy_02.b, dy_02.c});
    }

    private void c(fr_0 fr_02) {
        ge_1 ge_12 = this.b.d();
        fr_02.a(ge_12);
    }

    private void d(fr_0 fr_02) {
        FV fV = this.b.b();
        fr_02.a(fV);
    }

    private void e(fr_0 fr_02) {
        Object object;
        TShortShortHashMap tShortShortHashMap = new TShortShortHashMap();
        List<di_0> list = this.b.c().b();
        for (di_0 object32 : list) {
            fs_0 fs_02;
            if (object32 == null || object32.h().length != 1 || object32.h()[0].a().length != 1 || (fs_02 = object32.h()[0]).b().length != 0 || ((ft_0)(object = fs_02.a()[0])).c() || ((ft_0)object).d() || ((ft_0)object).a() || ((ft_0)object).b()) continue;
            if (((ft_0)object).e() < 0) {
                if (object32.b() != null) continue;
                tShortShortHashMap.put(object32.a(), ((ft_0)object).e());
                continue;
            }
            while (tShortShortHashMap.contains(((ft_0)object).e())) {
                ((ft_0)object).a(tShortShortHashMap.get(((ft_0)object).e()));
            }
            if (object32.b() != null || ((ft_0)object).e() >= 0) continue;
            tShortShortHashMap.put(object32.a(), ((ft_0)object).e());
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (di_0 di_03 : list) {
            if (di_03 == null) continue;
            if (di_03.b() != null) {
                tIntHashSet.add((int)di_03.a());
            }
            for (fs_0 fs_03 : object = di_03.h()) {
                ft_0[] ft_0Array;
                if (fs_03 == null) continue;
                for (ft_0 ft_02 : ft_0Array = fs_03.a()) {
                    if (tShortShortHashMap.contains(ft_02.e())) {
                        ft_02.a(tShortShortHashMap.get(ft_02.e()));
                    }
                    tIntHashSet.add((int)ft_02.e());
                }
            }
        }
        List<di_0> list2 = list.stream().filter(di_02 -> di_02 != null && tIntHashSet.contains((int)di_02.a())).collect(Collectors.toList());
        cj_0 cj_02 = new cj_0();
        cj_02.a(list2);
        object = cj_02.a();
        fr_02.a((fy_0)object);
        ga_0 ga_02 = cj_02.b();
        for (gc_0 gc_02 : ga_02.b()) {
            gc_02.a((fy_0)object);
        }
        fr_02.a(ga_02);
    }

    private void f(fr_0 fr_02) {
        fr_02.a(this.b.e());
    }
}

