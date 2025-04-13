/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

public class cYb
implements ahr_1 {
    private static final cYb b = new cYb();
    protected static final Logger a = Logger.getLogger(cYb.class);
    private bsZ c;
    private int d = -1;
    private ans_1 e;

    public static cYb a() {
        return b;
    }

    private cYb() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18278: {
                anw_1 anw_12 = (anw_1)adt_12;
                int n = anw_12.c();
                this.a(n);
                return false;
            }
            case 16408: {
                anw_1 anw_13 = (anw_1)adt_12;
                this.c.a(anw_13.b());
                return false;
            }
            case 17731: {
                anw_1 anw_14 = (anw_1)adt_12;
                String string = anw_14.h();
                if (!string.equals(this.c.l())) {
                    this.c.a(string);
                }
                return false;
            }
            case 18164: {
                anw_1 anw_15 = (anw_1)adt_12;
                short s2 = anw_15.e();
                if (s2 != this.c.m()) {
                    this.c.a(s2);
                }
                return false;
            }
            case 16139: {
                anw_1 anw_16 = (anw_1)adt_12;
                short s3 = anw_16.e();
                if (s3 != this.c.n()) {
                    this.c.b(s3);
                }
                return false;
            }
            case 18941: {
                dfc dfc2 = (dfc)adt_12;
                ezc_2 ezc_22 = (ezc_2)dfc2.j();
                if (ezc_22 != this.c.o()) {
                    this.c.a(ezc_22);
                }
                return false;
            }
            case 19125: {
                anw_1 anw_17 = (anw_1)adt_12;
                boolean bl = anw_17.i();
                List list = (List)fis_1.a().e("heroesParty");
                int n = list.size();
                if (n == 0) {
                    return false;
                }
                int n2 = bl ? (this.c.f() - 1 + n) % n : (this.c.f() + 1 + n) % n;
                this.c.b(n2);
                fis_1.a().a((ajf_1)this.c, "hero");
                return false;
            }
            case 18180: {
                boolean bl = this.c.c(0);
                if (!bl) {
                    this.e(0);
                }
                return false;
            }
            case 16020: {
                int n = this.c.r();
                boolean bl = this.c.c(n);
                if (!bl) {
                    this.e(n);
                }
                return false;
            }
            case 17174: {
                int n;
                anw_1 anw_18 = (anw_1)adt_12;
                boolean bl = anw_18.i();
                int n3 = n = bl ? this.c.s() - 1 : this.c.s() + 1;
                if (bl ? !this.c.p() : !this.c.q()) {
                    return false;
                }
                boolean bl2 = this.c.c(n);
                if (!bl2) {
                    if (bl) {
                        this.c.c();
                    } else {
                        this.c.e();
                    }
                    fis_1.a().a((ajf_1)this.c, "canGoBack", "canGoForward");
                    this.e(n);
                }
                return false;
            }
            case 18264: {
                anw_1 anw_19 = (anw_1)adt_12;
                int n = anw_19.c();
                eEG eEG2 = eEG.a((byte)n);
                if (eEG2 != eEG.c) {
                    fpm_0.b().o("ladderRewardsDialog");
                }
                if (eEG2 != this.c.h()) {
                    this.c.a(eEG2);
                    this.e(0);
                }
                return false;
            }
            case 17237: {
                anw_1 anw_110 = (anw_1)adt_12;
                int n = anw_110.c();
                eEC eEC2 = eEC.a(n);
                if (eEC2 != this.c.i()) {
                    this.c.a(eEC2);
                    this.e(0);
                }
                return false;
            }
            case 18432: {
                anw_1 anw_111 = (anw_1)adt_12;
                String string = anw_111.h();
                if (this.c.i() != eEC.a) {
                    this.c.a(eEC.a);
                }
                this.a(string);
                return false;
            }
            case 18312: {
                this.e(0);
                return false;
            }
            case 19792: {
                this.c.a(((anw_1)adt_12).i());
                return false;
            }
            case 18780: {
                int n = ((anw_1)adt_12).c();
                this.c(n);
                return false;
            }
        }
        return true;
    }

    private void c(int n) {
        cqM cqM2 = new cqM(n);
        azu_0.j().K().c(cqM2);
    }

    public void a(int n) {
        this.c.a();
        this.c.b();
        this.c.a(n);
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (ezb_22 != null && ezb_22.g() || cYb.d(n)) {
            this.a(n, 0);
        }
        if (ezb_22 != null && n == 131) {
            czh_1 czh_12 = new czh_1();
            czh_12.b(n);
            czh_12.a(eEG.c.b());
            azu_0.j().K().c(czh_12);
        }
        fis_1.a().a((ajf_1)this.c, "displayRewardsInfo");
        fis_1.a().a((ajf_1)this.c, "hero");
    }

    private static boolean d(int n) {
        return ban_2.a.b(n).isPresent();
    }

    private void a(int n, int n2) {
        switch (this.c.i()) {
            case b: {
                czf_1 czf_12 = new czf_1();
                eEG eEG2 = this.c.h();
                czf_12.b(n);
                czf_12.a(eEG2.b());
                czf_12.a(azu_0.j().k().eV().d());
                azu_0.j().K().c(czf_12);
                break;
            }
            default: {
                cze_1 cze_12 = new cze_1();
                eEG eEG3 = this.c.h();
                cze_12.b(n);
                cze_12.a(eEG3.b());
                int n3 = n2 * 12;
                cze_12.c(n3);
                azu_0.j().K().c(cze_12);
            }
        }
    }

    private void a(String string) {
        czg_1 czg_12 = new czg_1();
        eEG eEG2 = this.c.h();
        int n = this.c.g();
        czg_12.a(eEG2.b());
        czg_12.a(string);
        czg_12.b(n);
        azu_0.j().K().c(czg_12);
    }

    private void e(int n) {
        int n2 = this.c.g();
        this.a(n2, n);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            int n;
            this.e = new cYc(this);
            this.c = new bsZ();
            List list = (List)fis_1.a().e("heroesParty");
            for (int k = 0; k < list.size(); ++k) {
                if (((bmr_1)list.get(k)).cX()) continue;
                this.c.b(k);
            }
            fis_1.a().a("dungeonList", this.c);
            fpm_0.b().a(this.e);
            if (this.d > 0) {
                fpm_0.b().a("dungeonDialog", cfi_0.a("dungeonDialog"), 256L, (short)10001);
            } else {
                fpm_0.b().a("dungeonDialog", cfi_0.a("dungeonDialog"), 32768L, (short)10000);
            }
            fpm_0.b().a("wakfu.dungeon", cgh_0.class);
            long l = azu_0.j().k().T_();
            Optional<ezb_2> optional = ezd_2.a.a(l);
            if (optional.isPresent()) {
                n = optional.get().a();
                this.a(n);
            } else if (this.d > 0) {
                this.a(this.d);
            } else {
                n = ban_2.a.a(l);
                if (n > 0) {
                    this.a(n);
                }
            }
            wu_0 wu_02 = wc_0.p().a();
            if (!enp_2.a.d(ens_2.bk) && wu_02.m() < eEB.c.m() && wu_02.o() <= eEB.c.o()) {
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("dungeon.ladder.date.unlock", new Object[0]), cfn_0.a(1), 17411L, 102, 2);
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.e);
            fpm_0.b().o("dungeonDialog");
            fpm_0.b().o("ladderRewardsDialog");
            fpm_0.b().e("wakfu.dungeon");
            fis_1.a().a("dungeonList");
        }
    }

    public bsZ c() {
        return this.c;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void b(int n) {
        this.d = n;
    }
}

