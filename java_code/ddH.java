/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

public class ddH
implements ahr_1,
Runnable {
    protected static final Logger a = Logger.getLogger(ddH.class);
    private static final ddH b = new ddH();
    private afb_0 c;
    private int d;
    private ans_1 e;
    private final bUD f = bUD.a();
    private final TIntHashSet g = new TIntHashSet();

    public static ddH a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17628: {
                dgY dgY2 = (dgY)adt_12;
                bmr_1 bmr_12 = azu_0.j().k();
                bUH bUH2 = (bUH)bmr_12.fE();
                if (bmr_12.dt() < 1) {
                    String string = bae.h().a("nation.vote.not.level.required", (short)1);
                    aul_0.a().e(string);
                    return false;
                }
                if (!this.f.b(bUH2)) {
                    String string = bae.h().a("nation.rank.unauthorized.for.vote", new Object[0]);
                    aul_0.a().e(string);
                    return false;
                }
                fgo fgo2 = (fgo)ena_0.a().a(bmr_12.U_(), end_0.p).orElse(new fgo());
                if (fgo2.a()) {
                    String string = bae.h().a("nation.error.alreadyVoted", new Object[0]);
                    aul_0.a().e(string);
                    return false;
                }
                faX faX2 = bUH2.m();
                faX2.a(bUH2.o(), dgY2.k().a().a());
                fcf fcf2 = (fcf)dgY2.k().a();
                String string = bmr_12.a_() == fcf2.a() ? bae.h().a("nation.vote.voteFor.voteDoneForMe", new Object[0]) : bae.h().a("nation.vote.voteFor.voteDoneForSomeone", fcf2.f());
                aul_0.a().e(string);
                bUH2.a(true);
                this.e();
                return false;
            }
            case 16513: {
                int n;
                bUH bUH3 = (bUH)azu_0.j().k().fE();
                faX faX3 = bUH3.m();
                --this.d;
                int n2 = n = faX3.v() ? faX3.A() : faX3.C().a();
                if (n < 3) {
                    return false;
                }
                if (this.d < 0) {
                    this.d = (int)Math.floor(((float)n - 1.0f) / 3.0f);
                }
                if (!faX3.v() && this.g.contains(this.d)) {
                    bUW.a().w();
                    return false;
                }
                this.g.add(this.d);
                this.e();
                return false;
            }
            case 19930: {
                int n;
                bUH bUH4 = (bUH)azu_0.j().k().fE();
                faX faX4 = bUH4.m();
                ++this.d;
                int n3 = n = faX4.v() ? faX4.A() : faX4.C().a();
                if (n < 3) {
                    return false;
                }
                if (n <= this.d() * 3) {
                    this.d = 0;
                }
                if (!faX4.v() && this.g.contains(this.d)) {
                    bUW.a().w();
                    return false;
                }
                this.g.add(this.d);
                this.e();
                return false;
            }
            case 17139: {
                dfc dfc2 = (dfc)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                bUH bUH5 = (bUH)bmr_13.fE();
                if (!this.f.a(bUH5)) {
                    String string = bae.h().a("nation.rank.unauthorized.for.registration", new Object[0]);
                    aul_0.a().e(string);
                    return false;
                }
                faX faX5 = bUH5.m();
                String string = dfc2.h().replace("\r\n", " ").replace("\n", " ");
                faX5.a(bmr_13.a_(), string);
                bUH5.g();
                this.e();
                return false;
            }
        }
        return true;
    }

    public int c() {
        return 3 + (this.d == 0 ? 1 : 0);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = azu_0.j().k();
            this.c = new ddI(this);
            bmr_12.bv().a(this.c);
            this.e = new ddj_0(this);
            fpm_0.b().a(this.e);
            fpm_0.b().a("voteInformationDialog", cfi_0.a("voteInformationDialog"), 32769L, (short)10000);
            bUH bUH2 = (bUH)bmr_12.fE();
            faX faX2 = bUH2.m();
            if (faX2.v()) {
                ado_1.a().a(this, 1000L);
                fis_1.a().a("electionSloganDirty", false);
            }
            fis_1.a().a("voteInscription.feeWarning", (Object)bae.h().a("nation.vote.eligible.warning", faX2.I()));
            this.d = 0;
            this.g.add(this.d);
            this.e();
            fpm_0.b().a("wakfu.voteInformation", cjz_0.class);
        }
    }

    private void e() {
        cAc cAc2 = new cAc();
        cAc2.b(this.d() * 3);
        azu_0.j().K().c(cAc2);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bUW.a().o();
            bmr_1 bmr_12 = azu_0.j().k();
            bmr_12.bv().b(this.c);
            this.c = null;
            this.g.clear();
            faX faX2 = bmr_12.fE().m();
            if (!faX2.v()) {
                faX2.C().e();
            } else {
                fis_1.a().a("voteInscription.feeWarning");
                fis_1.a().a("electionSloganDirty");
            }
            ado_1.a().b(this);
            fpm_0.b().b(this.e);
            fpm_0.b().o("voteInformationDialog");
            fis_1.a().a("voteList");
            fpm_0.b().e("wakfu.voteInformation");
        }
    }

    @Override
    public void run() {
        fis_1.a().a((ajf_1)bUW.a(), "electionClosureDescription");
    }

    public int d() {
        return this.d;
    }
}

