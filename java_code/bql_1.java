/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from bQl
 */
public class bql_1
extends bpx_0
implements erk_1 {
    private bqp_1 q;
    private final Map<Integer, Boolean> r;

    public bql_1(Map<Integer, Boolean> map, ery_1 ery_12, long l) {
        this.a(ery_12);
        this.r = map;
        this.p = l;
        for (erv_1 erv_12 : erv_1.values()) {
            this.n.add(new bqg_1(erv_12));
        }
        this.o = this.n.isEmpty() ? null : (bpy_0)this.n.get(0);
        bmr_1 bmr_12 = azu_0.j().k();
        erg_1 erg_12 = ((bot_2)bmr_12.eV()).f();
        if (erg_12 != null) {
            erg_12.a(this);
        }
    }

    public boolean f(int n) {
        return this.r.containsKey(n);
    }

    public boolean g(int n) {
        Boolean bl = this.r.get(n);
        return bl != null && bl != false;
    }

    @Override
    protected String f() {
        return bae.h().a("guild.storageBox", new Object[0]);
    }

    @Override
    protected fjf_2 g() {
        return new fjf_2(400, 160);
    }

    @Override
    protected int h() {
        return 10;
    }

    @Override
    protected int i() {
        return 4;
    }

    @Override
    protected boolean j() {
        return true;
    }

    @Override
    protected boolean k() {
        return enp_2.a.d(ens_2.bE);
    }

    @Override
    protected boolean l() {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        if (erl_12 == null) {
            return false;
        }
        boolean bl = enp_2.a.d(ens_2.bD);
        if (!bl) {
            return false;
        }
        ern_1 ern_12 = bos_22.c(erl_12.d());
        return ern_12 != null && ern_12.a(eQt.h);
    }

    @Override
    protected ajf_1 m() {
        return this.q;
    }

    public final void a(ery_1 ery_12) {
        this.q = new bqp_1(ery_12);
        fis_1.a().a((ajf_1)this, "history");
    }

    @Override
    public int n() {
        return this.r.size();
    }

    @Override
    public void b(long l) {
        if (!this.k()) {
            String string = bae.h().a("error.guild.cannotDepositMoney", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 1, string, 2L);
            fpm_0.b().a(fzn_02);
            return;
        }
        cnz_0 cnz_02 = new cnz_0(Math.abs(l));
        azu_0.j().K().c(cnz_02);
    }

    @Override
    public void c(long l) {
        if (!this.l()) {
            String string = bae.h().a("error.guild.cannotWithdrawMoney", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 1, string, 2L);
            fpm_0.b().a(fzn_02);
            return;
        }
        cnz_0 cnz_02 = new cnz_0(-Math.abs(l));
        azu_0.j().K().c(cnz_02);
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }

    @Override
    public void a(short s2) {
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void b(int n) {
    }

    @Override
    public void a(ern_1 ern_12) {
    }

    @Override
    public void b(ern_1 ern_12) {
    }

    @Override
    public void c(ern_1 ern_12) {
    }

    @Override
    public void a(erl_1 erl_12) {
    }

    @Override
    public void b(erl_1 erl_12) {
    }

    @Override
    public void b(erh_1 erh_12) {
    }

    @Override
    public void a(erh_1 erh_12) {
    }

    @Override
    public void d(ern_1 ern_12) {
        fis_1.a().a((ajf_1)this, "canTakeMoney");
    }

    @Override
    public void c(erl_1 erl_12) {
        fis_1.a().a((ajf_1)this, "canTakeMoney");
    }

    @Override
    public void c(erh_1 erh_12) {
    }

    @Override
    public void c(int n) {
    }

    @Override
    public void d(int n) {
    }

    @Override
    public void q() {
        super.q();
        bmr_1 bmr_12 = azu_0.j().k();
        erg_1 erg_12 = ((bot_2)bmr_12.eV()).f();
        if (erg_12 != null) {
            erg_12.b(this);
        }
    }
}

