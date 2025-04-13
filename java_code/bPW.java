/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class bPW
implements ajh_1 {
    private final evv_1 m;
    private final bFf n;
    private final List<bPT> o;
    private final List<bPU> p;
    private bPS q;
    public static final String a = "isActive";
    public static final String b = "name";
    public static final String d = "difficulties";
    public static final String e = "difficultiesSelected";
    public static final String f = "rewardTiers";
    public static final String g = "difficultyWeightSum";
    public static final String h = "difficultyWeightNotSelected";
    public static final String i = "isPreview";
    public static final String j = "hasSelectedFreeRewards";
    public static final String k = "cost";
    public static final String l = "canPay";

    public bPW(evv_1 evv_12, bFf bFf2, List<bPU> list, List<bPT> list2) {
        this.n = bFf2;
        this.m = evv_12;
        this.p = list;
        this.o = list2;
        this.q = new bPS();
    }

    @Override
    public String[] d() {
        return new String[]{d, e, f, g, k, l, b, a, h, i};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(d)) {
            return this.o;
        }
        if (string.equals(e)) {
            return this.o.stream().filter(bPT::a).collect(Collectors.toList());
        }
        if (string.equals(f)) {
            return this.p;
        }
        if (string.equals(b)) {
            return bPR.a(this.m.m());
        }
        if (string.equals(g)) {
            return this.i();
        }
        if (string.equals(h)) {
            return this.g() - this.i();
        }
        if (string.equals(k)) {
            bae bae2 = bae.h();
            if (this.h()) {
                return bae2.a("stele.already.active", new Object[0]);
            }
            List<Integer> list = this.b();
            if (!this.a(list)) {
                Map<Integer, Integer> map = bPR.a(this.m, this.p, list);
                int n = map.values().stream().mapToInt(Integer::intValue).sum();
                return bae2.a("stele.reward.remaining", n);
            }
            StringBuilder stringBuilder = new StringBuilder(bae2.a("stele.pay", new Object[0])).append(' ');
            String string2 = this.q.a() > 0L ? this.q.a() + " $, " : "";
            String string3 = this.q.b().entrySet().stream().map(entry -> bae2.a(15, (long)((Integer)entry.getKey()).intValue(), new Object[0]) + " x" + entry.getValue()).collect(Collectors.joining(", "));
            return stringBuilder.append(string2).append(string3).toString();
        }
        if (string.equals(a)) {
            return this.h();
        }
        if (string.equals(l)) {
            bmr_1 bmr_12 = bzf_1.a();
            if (bmr_12 == null) {
                return false;
            }
            List<Integer> list = this.b();
            if (list.isEmpty()) {
                return false;
            }
            if (!this.a(list)) {
                return false;
            }
            return this.a(bmr_12);
        }
        if (string.equals(i)) {
            return this.j();
        }
        if (string.equals(j)) {
            List<Integer> list = this.b();
            return this.a(list) && !list.isEmpty();
        }
        return null;
    }

    private int g() {
        return this.o.stream().mapToInt(bPT::c).sum();
    }

    private boolean h() {
        return this.n != null && this.n.B() == 1;
    }

    private int i() {
        int n = 0;
        for (bPT bPT2 : this.o) {
            if (!bPT2.a()) continue;
            n += bPT2.c();
        }
        return n;
    }

    public long a() {
        return this.m.m();
    }

    public List<Integer> b() {
        return this.o.stream().filter(bPT::a).map(bPT::b).collect(Collectors.toList());
    }

    public List<Integer> c() {
        int n = this.i();
        return this.p.stream().filter(bPU2 -> bPU2.a() <= n).flatMap(bPU2 -> bPU2.b().stream()).collect(Collectors.toList());
    }

    public void a(bPT bPT2, boolean bl) {
        if (this.h()) {
            return;
        }
        if (this.j()) {
            return;
        }
        bPT2.a(bl);
        this.e();
        fis_1.a().a((ajf_1)this, e, g, h, j);
    }

    public void e() {
        int n = this.i();
        for (bPU bPU2 : this.p) {
            bPU2.a(bPU2.a() <= n);
        }
    }

    public void a(bPV bPV2) {
        if (this.j()) {
            return;
        }
        if (this.h()) {
            return;
        }
        for (bPU bPU2 : this.p) {
            if (!bPU2.a(bPV2)) continue;
            bPU2.a(bPV2.a());
            fis_1.a().a((ajf_1)this, j);
            return;
        }
    }

    private boolean j() {
        return this.n == null;
    }

    public void f() {
        bPS bPS2 = new bPS();
        evy_1 evy_12 = this.m.e();
        bPS2.b(evy_12.b());
        evy_12.a().forEach(bPS2::a);
        for (bPU bPU2 : this.p) {
            List<Integer> list = bPU2.b();
            int n = bPR.a(this.m, bPU2.e());
            int n2 = list.size() - n;
            if (n2 <= 0) continue;
            this.a(bPS2, n2);
        }
        this.q = bPS2;
        fis_1.a().a((ajf_1)this, k, l, a);
    }

    private void a(bPS bPS2, int n) {
        evy_1 evy_12 = this.m.f();
        for (int k = 0; k < n; ++k) {
            bPS2.a(evy_12.b());
            evy_12.a().forEach(bPS2::a);
        }
    }

    public boolean a(bmr_1 bmr_12) {
        if (this.j()) {
            return false;
        }
        if (bmr_12.cq() < this.q.a()) {
            return false;
        }
        return this.q.b().entrySet().stream().noneMatch(entry -> bmr_12.da().a((Integer)entry.getKey()) < (Integer)entry.getValue());
    }

    public boolean a(List<Integer> list) {
        int n = bPR.a(this.m, list);
        return bPR.a(n, this.p).noneMatch(bPU2 -> bPR.a(this.m, bPU2.e()) > bPU2.b().size());
    }
}

