/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bld
 */
public class bld_0
implements ajh_1 {
    public static final String a = "defaultBuildAsList";
    public static final String b = "currentOverBuildSheet";
    public static final String d = "currentBuildSheet";
    public static final String e = "buildSheetList";
    public static final String f = "hasInvalidSheet";
    public static final String g = "canCreateNewBuild";
    public static final String h = "countAndLimit";
    public static final String i = "displayPermanentBuilds";
    public static final String j = "currentBuildsListSortId";
    public static final String[] k = new String[]{"buildSheetList", "currentOverBuildSheet", "defaultBuildAsList", "currentBuildSheet", "hasInvalidSheet", "displayPermanentBuilds", "currentBuildsListSortId", "countAndLimit", "canCreateNewBuild"};
    private bmr_1 l;
    private ezm_1 m;
    private final Map<Integer, ble_0> n = new LinkedHashMap<Integer, ble_0>();
    private bli_0 o;
    private eZb p;
    private fiR q;
    private ezy_2 r;
    private final Map<Integer, bji_1> s = new LinkedHashMap<Integer, bji_1>();
    private final Map<Integer, bPK> t = new LinkedHashMap<Integer, bPK>();
    private final Map<Integer, bkq_2> u = new LinkedHashMap<Integer, bkq_2>();
    private byte v = (byte)-2;
    private int w = -2;
    private Integer x;

    public bld_0(bmr_1 bmr_12) {
        this.l = bmr_12;
        this.m = bmr_12.dx();
    }

    public void a() {
        this.a(this.l, false);
    }

    public void a(boolean bl) {
        this.a(this.l, bl);
    }

    public void a(bmr_1 bmr_12, boolean bl) {
        this.l = bmr_12;
        this.m = this.l.dx();
        this.p = this.l.dB();
        this.q = this.l.dw();
        this.r = this.l.dA();
        this.n.clear();
        this.s.clear();
        this.t.clear();
        this.u.clear();
        if (bl) {
            this.a(this.m.e());
        }
        this.m.a().forEach((n, ezj_12) -> this.n.put((Integer)n, new ble_0((int)n, (ezj_1)ezj_12, this.l)));
        bli_0 bli_02 = new bli_0(this.n.get(this.w), this.l);
        Set<Integer> set = this.o == null ? Collections.emptySet() : this.o.a(this.n.keySet());
        for (int n2 : this.n()) {
            bli_02.a(this.n.get(n2));
        }
        bli_02.b(set);
        if (this.o != null) {
            bli_02.a(this.o);
            if (this.o.c() != bzn_2.a) {
                bli_02.a(this.o.c());
            }
        }
        this.o = bli_02;
        this.p();
        this.b();
        this.c();
        this.e();
    }

    public void b() {
        this.s.clear();
        this.p.a().forEach((n, eyz_02) -> this.s.put((Integer)n, new bji_1((int)n, (eyz_0)eyz_02, this.l.a_())));
    }

    public void c() {
        this.t.clear();
        this.q.b().forEach((n, fiO2) -> this.t.put((Integer)n, new bPK((int)n, (fiO)fiO2, this.l)));
    }

    public void e() {
        this.u.clear();
        this.r.b().forEach((n, ezx_22) -> this.u.put((Integer)n, new bkq_2(n.byteValue(), (ezx_2)ezx_22)));
    }

    public int f() {
        if (this.x != null) {
            return this.x;
        }
        return this.w;
    }

    public void a(int n) {
        this.w = n;
        this.x = null;
    }

    public void a(Integer n) {
        this.x = n;
    }

    public boolean g() {
        return this.x != null;
    }

    public int h() {
        ezj_1 ezj_12 = this.m.a(this.f());
        if (ezj_12 == null) {
            return this.l.dr();
        }
        return ezj_12.c() == -1 ? (int)this.l.dt() : ezj_12.c();
    }

    public ble_0 i() {
        return this.n.get(this.f());
    }

    public void a(byte by) {
        this.v = by;
    }

    public @Unmodifiable List<ble_0> j() {
        int n = this.f();
        return this.n.values().stream().filter(ble_02 -> ble_02.c() != n).collect(Collectors.toList());
    }

    public void a(String string) {
        this.o.a(string);
        fis_1.a().a((ajf_1)this, e, d);
    }

    public void b(boolean bl) {
        this.o.a(bl, this.l);
        fis_1.a().a((ajf_1)this, e, i, d);
    }

    public void a(@NotNull bzn_2 bzn_22) {
        if (this.o.a(bzn_22)) {
            this.o();
        }
    }

    private List<Integer> n() {
        String string = ((bvx_0)ans_0.D().h()).a(this.l).s(bWe.aT.b());
        ArrayList<Integer> arrayList = new ArrayList<Integer>(this.n.keySet());
        arrayList.remove(0);
        arrayList.sort(Integer::compareTo);
        if (string == null) {
            return arrayList;
        }
        try {
            ArrayList arrayList2 = Arrays.stream(string.split(",")).map(Integer::parseInt).distinct().filter(n -> n != 0).filter(this.n::containsKey).collect(Collectors.toCollection(ArrayList::new));
            for (int n2 : arrayList) {
                if (arrayList2.contains(n2)) continue;
                arrayList2.add(n2);
            }
            return arrayList2;
        }
        catch (NumberFormatException numberFormatException) {
            return arrayList;
        }
    }

    public void a(ble_0 ble_02) {
        if (this.o.b(ble_02)) {
            this.o();
        }
    }

    public void b(ble_0 ble_02) {
        if (this.o.c(ble_02)) {
            this.o();
        }
    }

    public void a(int n, ble_0 ble_02) {
        if (this.o.a(n, ble_02)) {
            this.o();
        }
    }

    private void o() {
        fis_1.a().a((ajf_1)this, k);
        this.p();
    }

    private void p() {
        String string = bWe.aT.b();
        ((bvx_0)ans_0.D().h()).a(this.l).d(string, this.o.b());
        ((bvx_0)ans_0.D().h()).c(string);
    }

    public bji_1 k() {
        return this.s.get(this.f());
    }

    public bji_1 b(int n) {
        return this.s.get(n);
    }

    public bPK l() {
        return this.t.get(this.f());
    }

    public bPK c(int n) {
        return this.t.get(n);
    }

    public bkq_2 m() {
        return this.u.get(this.f());
    }

    public bkq_2 d(int n) {
        return this.u.get(n);
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "defaultBuildAsList": {
                return List.of(this.n.get(0));
            }
            case "currentBuildSheet": {
                return this.i();
            }
            case "buildSheetList": {
                if (fis_1.a().c("hideDownscaling")) {
                    return Collections.emptyList();
                }
                return this.o.a();
            }
            case "hasInvalidSheet": {
                return !this.k().a(this.l) || !this.l().a(this.l) || !this.m().a(this.l);
            }
            case "currentOverBuildSheet": {
                return this.v;
            }
            case "canCreateNewBuild": {
                return !cZI.a().C() && this.m.c() < ezp_1.a();
            }
            case "countAndLimit": {
                return "(" + this.m.c() + "/" + ezp_1.a() + ")";
            }
            case "displayPermanentBuilds": {
                return this.o.d();
            }
            case "currentBuildsListSortId": {
                return this.o.c().a();
            }
        }
        return null;
    }

    @Nullable
    public ble_0 e(int n) {
        return this.n.get(n);
    }
}

