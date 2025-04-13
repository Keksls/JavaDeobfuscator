/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsp
 */
public class bsp_0
implements ajh_1 {
    public static final String a = "craftStepViewList";
    public static final String b = "isFreeForGuild";
    public static final String d = "stepsFallthroughEnabled";
    public static final String e = "overriddenCraftFeeViewList";
    public static final String f = "overriddenCraftFeeViewListFilter";
    public static final String g = "minFee";
    public static final String[] h = new String[]{"craftStepViewList", "isFreeForGuild", "stepsFallthroughEnabled", "overriddenCraftFeeViewList", "overriddenCraftFeeViewListFilter", "minFee"};
    @NotNull
    private final List<bsl_1> i = new ArrayList<bsl_1>();
    @NotNull
    private final List<bsz_2> j = new ArrayList<bsz_2>();
    private final fwl k = new fwl();
    @NotNull
    private final Map<ebx_0, ebz_0> l;
    @NotNull
    private final Map<Integer, Integer> m;
    private boolean n;
    private boolean o;

    public bsp_0(@NotNull ece_0 ece_02) {
        Map<ebx_0, ebz_0> map = ece_02.c();
        this.l = map.isEmpty() ? new EnumMap<ebx_0, ebz_0>(ebx_0.class) : new EnumMap<ebx_0, ebz_0>(map);
        this.m = new HashMap<Integer, Integer>(ece_02.d());
        this.n = !ece_02.e();
        this.o = ece_02.f();
        for (ebx_0 ebx_02 : ebx_0.values()) {
            eby_0<ebz_0> eby_02 = this.a(ebx_02);
            this.i.add(new bsl_1(ebx_02, eby_02.c(), eby_02.a(), this.l.containsKey((Object)ebx_02)));
        }
        this.b();
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "craftStepViewList": {
                return this.i;
            }
            case "isFreeForGuild": {
                return this.n;
            }
            case "stepsFallthroughEnabled": {
                return this.o;
            }
            case "overriddenCraftFeeViewList": {
                return this.j;
            }
            case "overriddenCraftFeeViewListFilter": {
                return this.k;
            }
            case "minFee": {
                return 0;
            }
        }
        return null;
    }

    @NotNull
    public eby_0<ebz_0> a(ebx_0 ebx_02) {
        return ebx_02.a(this.l, this.o);
    }

    public boolean a() {
        boolean bl = false;
        for (bsl_1 bsl_12 : this.i) {
            ebx_0 ebx_02 = bsl_12.a();
            eby_0<ebz_0> eby_02 = this.a(ebx_02);
            bl |= bsl_12.a(eby_02.c(), eby_02.a(), this.l.containsKey((Object)ebx_02));
        }
        if (bl) {
            this.c();
        }
        return bl;
    }

    public void b() {
        this.j.clear();
        bmr_1 bmr_12 = azu_0.j().k();
        ece_0 ece_02 = bmr_12.eX();
        for (eco_0 eco_02 : ece_02.bk_()) {
            ebz_0 ebz_02;
            if (!ecg_0.a().b(eco_02) || !eco_02.c(bmr_12)) continue;
            this.j.add(new bsz_2(eco_02, this.m.get(eco_02.e()), (ebz_02 = this.a(eco_02.g()).c()) != null ? ebz_02.a(eco_02) : 0));
        }
        this.j.sort(Comparator.comparing(bsz_2::f).thenComparing(bsz_2::c).thenComparing(bsz_2::b));
        fis_1.a().a((ajf_1)this, e);
    }

    public boolean c() {
        boolean bl = false;
        for (bsz_2 bsz_22 : this.j) {
            bl |= this.a(bsz_22);
        }
        return bl;
    }

    private boolean b(int n) {
        boolean bl = false;
        for (bsz_2 bsz_22 : this.j) {
            eco_0 eco_02 = bsz_22.g();
            if (eco_02.e() != n) continue;
            bl |= this.a(bsz_22);
        }
        return bl;
    }

    private boolean a(bsz_2 bsz_22) {
        ebz_0 ebz_02;
        eco_0 eco_02;
        return bsz_22.a(this.m.get(eco_02.e()), (ebz_02 = this.a((eco_02 = bsz_22.g()).g()).c()) != null ? ebz_02.a(eco_02) : 0);
    }

    @NotNull
    public Map<ebx_0, ebz_0> e() {
        return this.l;
    }

    @Nullable
    public ebz_0 b(@NotNull ebx_0 ebx_02) {
        return this.l.get((Object)ebx_02);
    }

    public void a(@NotNull ebx_0 ebx_02, @NotNull ebz_0 ebz_02, boolean bl) {
        this.l.put(ebx_02, ebz_02);
        if (bl) {
            this.a();
        }
    }

    public void c(@NotNull ebx_0 ebx_02) {
        this.l.remove((Object)ebx_02);
        this.a();
    }

    @NotNull
    public Map<Integer, Integer> f() {
        return this.m;
    }

    public void a(int n, int n2, boolean bl) {
        if (!ecg_0.a().a(n)) {
            return;
        }
        this.m.put(n, n2);
        if (bl) {
            this.b(n);
        }
    }

    public void a(int n) {
        if (!ecg_0.a().a(n)) {
            return;
        }
        this.m.remove(n);
        this.b(n);
    }

    public void a(boolean bl) {
        if (bl == this.n) {
            return;
        }
        this.n = bl;
        fis_1.a().a((ajf_1)this, b);
    }

    public void b(boolean bl) {
        if (bl == this.o) {
            return;
        }
        this.o = bl;
        fis_1.a().a((ajf_1)this, d);
        this.a();
    }

    public boolean g() {
        return this.n;
    }

    public boolean h() {
        return this.o;
    }
}

