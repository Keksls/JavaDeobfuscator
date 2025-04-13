/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.log4j.Logger;

public class dbO
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dbO.class);
    private static final dbO b = new dbO();
    private ans_1 c;
    byp_1 d;
    private long e;

    public static dbO a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16138: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                this.b(l);
                return false;
            }
            case 17657: {
                dfc dfc3 = (dfc)adt_12;
                boolean bl = dfc3.i();
                long l = dfc3.d();
                this.d.a(l, bl);
                return false;
            }
            case 19777: {
                dfc dfc4 = (dfc)adt_12;
                String string = dfc4.h();
                this.d.a(string);
                aUh.b("group.party.invitationRequestSent", string);
                return false;
            }
            case 19495: {
                dfc dfc5 = (dfc)adt_12;
                long l = dfc5.d();
                this.c(l);
                return false;
            }
        }
        return true;
    }

    public void b(long l) {
        cct_1 cct_12;
        Object object;
        Object object2;
        bmr_1 bmr_12 = azu_0.j().k();
        byn_1 byn_12 = bmr_12.dE();
        epl_0 epl_02 = byn_12.a().e(l);
        if (epl_02 == null) {
            a.error((Object)("Can't exclude unknown party member id=" + l));
            return;
        }
        if (l == bmr_12.a_()) {
            object2 = bae.h().a("group.party.leave.warn.you", new Object[0]);
        } else {
            object = epl_02.a();
            object2 = bae.h().a("group.party.leave.warn.others", object);
        }
        object = ccs_1.a().a(bmr_12.T_());
        if (object != null && ((cct_1)object).a()) {
            if (l == bmr_12.a_()) {
                if (euw_2.a.h(bmr_12.U_()) > 1) {
                    aUh.a("group.error.cannot.exclude.hero.battleground", new Object[0]);
                    return;
                }
            } else {
                boolean bl = euw_2.a.d(bmr_12.U_(), l);
                if (bl) {
                    aUh.a("group.error.cannot.exclude.hero.battleground", new Object[0]);
                    return;
                }
            }
        }
        if ((cct_12 = ccs_1.a().a(epl_02.h())) != null && cct_12.f() == Xd.b) {
            object2 = (String)object2 + "\n" + bae.h().a("group.party.leave.warn.dungeon", new Object[0]);
        }
        fzm_0 fzm_02 = fpm_0.b().a((String)object2, cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a((int n, String string) -> {
            if (n == 8) {
                this.d.a(l);
            }
            if (azu_0.j().c(cxq_0.a)) {
                cxq_0.a.f();
            }
        });
    }

    public void c(long l) {
        byn_1 byn_12 = azu_0.j().k().dE();
        epl_0 epl_02 = byn_12.a().e(l);
        if (epl_02 != null) {
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("group.party.giveLead.warn", epl_02.a()), cfn_0.a(0), 2073L, 102, 1);
            fzm_02.a(new dbp_0(this, l));
        } else {
            a.error((Object)"On essaye de donner le lead \u00e0 un joueur non pr\u00e9sent en local");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void d(long l) {
        byr_1 byr_12 = this.d.c(l);
        if (byr_12 != null) {
            byr_12.a();
        }
    }

    public void e(long l) {
        byr_1 byr_12 = this.d.c(l);
        if (byr_12 != null) {
            byr_12.l();
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.c = string -> {
            if (string.equals("partyListDialog")) {
                azu_0.j().b(dbO.a());
            }
        };
        fpm_0.b().a(this.c);
        bmr_1 bmr_12 = null;
        if (euu_2.a()) {
            bmr_12 = bzf_1.a();
        }
        if (bmr_12 == null) {
            bmr_12 = azu_0.j().k();
        }
        byn_1 byn_12 = bmr_12.dE();
        this.d = new byp_1(byn_12);
        fis_1.a().a("partyList", this.d);
        fpm_0.b().a("partyListDialog", cfi_0.a("partyListDialog"), 8192L, (short)10000);
        fpm_0.b().a("wakfu.partyList", ciz_0.class);
        cdw_0.n().z();
        this.e = adi_2.a().a(new dbQ(this, byn_12), 4000L, 159159161);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d.b();
            this.d = null;
            fpm_0.b().b(this.c);
            fpm_0.b().o("partyListDialog");
            fis_1.a().a("partyList");
            fpm_0.b().e("wakfu.partyList");
            adi_2.a().a(this.e);
        }
    }

    public void c() {
        byn_1 byn_12;
        if (this.d == null) {
            return;
        }
        if (euu_2.a()) {
            bmr_1 bmr_12 = bzf_1.a();
            if (bmr_12 == null) {
                return;
            }
            byn_12 = bmr_12.dE();
        } else {
            byn_12 = azu_0.j().k().dE();
        }
        this.d.a(byn_12);
        if (byn_12.a() == null || byn_12.a().g()) {
            return;
        }
        Arrays.stream(byn_12.a().e().keys()).forEach(this::g);
        fis_1.a().a((ajf_1)this.d, byp_1.j);
    }

    public void f(long l) {
        byr_1 byr_12;
        if (this.d != null && (byr_12 = this.d.c(l)) != null) {
            byr_12.e();
        }
    }

    public void g(long l) {
        if (this.d == null) {
            return;
        }
        byr_1 byr_12 = this.d.c(l);
        if (byr_12 == null) {
            return;
        }
        byr_12.n();
    }

    public byp_1 d() {
        return this.d;
    }
}

