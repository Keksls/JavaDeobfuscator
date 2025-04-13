/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvK
 */
public class bvk_1
implements ajh_1,
bhx_1,
fwo {
    public static final String a = "cost";
    public static final String b = "kamas";
    public static final String d = "kamasText";
    private static final String m = "hasKamas";
    private static final String n = "hasPvpMoney";
    public static final String e = "result";
    public static final String f = "criterion";
    public static final String g = "level";
    public static final String h = "enabled";
    public static final String i = "pvpMoney";
    public static final String j = "bind";
    public static final String k = "pvpMoneyDesc";
    public static final String[] l = new String[]{"cost", "kamas", "result", "criterion", "level", "pvpMoney", "pvpMoneyDesc", "kamasText", "enabled", "hasKamas", "hasPvpMoney"};
    private static final acv_1 o = new acv_1();
    private static final int p = 13126;
    private static final int q = 13127;
    private static final int r = 13128;
    final ArrayList<brk_1> s = new ArrayList();
    final ArrayList<brk_1> t = new ArrayList();
    private eve_1 u;

    public bvk_1(eve_1 eve_12) {
        eve_12.a(new bvl_1(this));
        eve_12.a(new bvm_1(this));
        this.u = eve_12;
    }

    public bvk_1(brk_1 brk_12) {
        this.t.add(brk_12);
    }

    @Override
    public String[] d() {
        return l;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.q();
        }
        if (string.equals(b)) {
            if (this.u == null) {
                return null;
            }
            int n = this.u.b();
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(i)) {
            if (this.u == null) {
                return null;
            }
            int n = this.u.c();
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(k)) {
            return this.p();
        }
        if (string.equals(f)) {
            return this.n();
        }
        if (string.equals(g)) {
            brk_1 brk_12 = this.g();
            if (brk_12 == null) {
                return null;
            }
            short s2 = brk_12.a().G();
            return bae.h().a("levelShort.custom", s2);
        }
        if (string.equals(h)) {
            return this.b();
        }
        if (string.equals(e)) {
            return this.g();
        }
        if (string.equals(d)) {
            return this.o();
        }
        if (string.equals(m)) {
            return this.l();
        }
        if (string.equals(n)) {
            return this.m();
        }
        if (string.equals(j)) {
            if (this.u == null) {
                return null;
            }
            eyh_1 eyh_12 = this.u.d().c();
            if (eyh_12 == eyh_1.a) {
                int n = this.u.d().a();
                exk_2 exk_22 = eyo_1.g().g(n);
                if (exk_22 == null || exk_22.n() == null) {
                    return null;
                }
                return bae.h().a(exk_22.n().a().h(), new Object[0]);
            }
            return bae.h().a(eyh_12.h(), new Object[0]);
        }
        return null;
    }

    private boolean l() {
        bmr_1 bmr_12 = cYF.a().c();
        if (this.u == null) {
            return true;
        }
        int n = this.u.b();
        if (n == 0) {
            return true;
        }
        return (long)n <= bmr_12.cq();
    }

    private boolean m() {
        bmr_1 bmr_12 = cYF.a().c();
        if (this.u == null) {
            return true;
        }
        int n = this.u.c();
        if (n == 0) {
            return true;
        }
        return (long)n <= bmr_12.fE().z();
    }

    @Nullable
    private String n() {
        if (this.u == null) {
            return null;
        }
        apc_2 apc_22 = this.u.f();
        if (apc_22 == null) {
            return null;
        }
        bmr_1 bmr_12 = cYF.a().c();
        boolean bl = !apc_22.b(bmr_12, this, this.u, bmr_12.Q_());
        String string = eDm.a((aot_2)apc_22);
        ani_2 ani_22 = new ani_2();
        if (bl) {
            ani_22.i().a(new azf_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ani_22.a((CharSequence)string);
        if (bl) {
            ani_22.j();
        }
        return ani_22.r();
    }

    @Nullable
    private String o() {
        if (this.u == null) {
            return null;
        }
        bmr_1 bmr_12 = cYF.a().c();
        int n = this.u.b();
        if (n == 0) {
            return null;
        }
        boolean bl = (long)n < bmr_12.cq();
        ani_2 ani_22 = new ani_2();
        if (!bl) {
            ani_22.i().a(new azf_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ani_22.d(n);
        if (!bl) {
            ani_22.j();
        }
        return ani_22.r();
    }

    @Nullable
    private String p() {
        if (this.u == null) {
            return null;
        }
        bmr_1 bmr_12 = cYF.a().c();
        long l = bmr_12.fE().z();
        int n = this.u.c();
        if (n == 0) {
            return null;
        }
        boolean bl = (long)n < l;
        ani_2 ani_22 = new ani_2();
        if (!bl) {
            ani_22.i().a(new azf_2(0.8f, 0.0f, 0.0f, 1.0f));
        }
        ani_22.a((CharSequence)(n + "x " + bae.h().a("pvpCoins", new Object[0])));
        if (!bl) {
            ani_22.j();
        }
        return ani_22.r();
    }

    private ArrayList<brk_1> q() {
        return this.s;
    }

    public boolean b() {
        boolean bl;
        if (this.u == null) {
            return true;
        }
        bmr_1 bmr_12 = cYF.a().c();
        apc_2 apc_22 = this.u.f();
        if (apc_22 != null && !apc_22.b(bmr_12, this, this.u, bmr_12.Q_())) {
            return false;
        }
        boolean bl2 = bl = !this.u.a(new bvn_1(this, bmr_12));
        if (bl) {
            return false;
        }
        if (bmr_12.dK().a() < (long)this.u.b()) {
            return false;
        }
        return bmr_12.fE().z() >= (long)this.u.c();
    }

    public long c() {
        int n;
        long l;
        if (this.u == null) {
            return 0L;
        }
        bmr_1 bmr_12 = cYF.a().c();
        apc_2 apc_22 = this.u.f();
        if (apc_22 != null && !apc_22.b(bmr_12, this, this.u, bmr_12.Q_())) {
            return 0L;
        }
        long l2 = Long.MAX_VALUE;
        bHi bHi2 = bmr_12.da();
        for (Map.Entry<Integer, Short> entry : this.u.a().entrySet()) {
            ewx_2 ewx_22;
            ewz_2 ewz_22;
            l = entry.getValue().shortValue();
            if (l <= 0L) continue;
            Integer n2 = entry.getKey();
            long l3 = bHi2.b(n2) ? (long)bHi2.h(n2) / l : ((ewz_22 = (ewx_22 = (ewx_2)bmr_12.a(ewl_1.a)).a(n2)) != null ? (long)ewz_22.b() / l : 0L);
            l2 = Math.min(l2, l3);
        }
        int n3 = this.u.b();
        if (n3 > 0) {
            long l4 = bmr_12.dK().a() / (long)n3;
            l2 = Math.min(l2, l4);
        }
        if ((n = this.u.c()) > 0) {
            l = bmr_12.fE().z() / (long)n;
            l2 = Math.min(l2, l);
        }
        return l2;
    }

    public boolean e() {
        if (this.u == null) {
            return false;
        }
        bmr_1 bmr_12 = cYF.a().c();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.u.a((TObjectProcedure<evf_1>)((TObjectProcedure)evf_12 -> {
            Object r2 = eyo_1.g().d(evf_12.a());
            eyw_1 eyw_12 = ((ezr_0)r2).p();
            if (eyw_12 == null) {
                return true;
            }
            if (!(eyw_12 instanceof bjs_2)) {
                return true;
            }
            if (!((bjs_2)((Object)eyw_12)).a(bmr_12, (ezr_0<?>)r2)) {
                atomicBoolean.set(true);
                return false;
            }
            return true;
        }));
        return atomicBoolean.get();
    }

    public boolean f() {
        if (this.u == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.u.a((TObjectProcedure<evf_1>)((TObjectProcedure)evf_12 -> {
            Object r2 = eyo_1.g().d(evf_12.a());
            eyw_1 eyw_12 = ((ezr_0)r2).p();
            if (eyw_12 == null) {
                return true;
            }
            if (eyw_12 instanceof bjs_2) {
                atomicBoolean.set(true);
                return false;
            }
            return true;
        }));
        return atomicBoolean.get();
    }

    @Nullable
    public brk_1 g() {
        if (this.t.isEmpty()) {
            return null;
        }
        return this.t.get(0);
    }

    public eve_1 h() {
        return this.u;
    }

    public int i() {
        return this.u.h();
    }

    public int j() {
        int n = 0;
        for (brk_1 brk_12 : this.s) {
            int n2 = o.g(brk_12.a().n());
            n += brk_12.b() * (n2 == 0 ? 1 : n2);
        }
        return n;
    }

    @Override
    public String getFilterableStringValue() {
        if (this.t.size() <= 0) {
            return "";
        }
        brk_1 brk_12 = this.t.get(0);
        if (brk_12.a() == null) {
            return "";
        }
        return brk_12.a().e();
    }

    @Override
    public bjw_1 a() {
        brk_1 brk_12 = this.g();
        return brk_12 != null ? brk_12.a() : null;
    }

    public bhg_0 k() {
        bjw_1 bjw_12 = this.a();
        if (bjw_12 == null) {
            return null;
        }
        exq_1 exq_12 = bjw_12.F();
        if (exq_12 == null) {
            return null;
        }
        bhg_0 bhg_02 = (bhg_0)exq_12.f();
        if (bhg_02 != null) {
            return bhg_02;
        }
        if (exq_12 instanceof bhg_0) {
            return (bhg_0)exq_12;
        }
        return null;
    }

    static {
        o.a(13126, 1);
        o.a(13127, 10);
        o.a(13128, 100);
    }
}

