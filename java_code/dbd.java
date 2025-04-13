/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dbd
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dbd.class);
    private static final dbd b = new dbd();
    private ans_1 c;
    private String d;
    private final ArrayList<String> e = new ArrayList();
    private final ArrayList<Long> f = new ArrayList();

    public static dbd a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16200: 
            case 18326: 
            case 19784: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                long l = dfc2.d();
                cAb cAb2 = new cAb();
                cAb2.a(string);
                cAb2.a(l);
                azu_0.j().K().c(cAb2);
                fis_1.a().a("speechDirty", false);
                fis_1.a().a("speechVisualisationMode", true);
                return false;
            }
            case 18604: {
                czu_1 czu_12 = new czu_1();
                azu_0.j().K().c(czu_12);
                this.a(false);
                return false;
            }
            case 17059: {
                czr_1 czr_12 = new czr_1();
                azu_0.j().K().c(czr_12);
                this.a(false);
                return false;
            }
            case 17292: {
                czq_1 czq_12 = new czq_1();
                czq_12.a(bUW.a().g());
                azu_0.j().K().c(czq_12);
                this.a(false);
                return false;
            }
            case 16670: {
                dfc dfc3 = (dfc)adt_12;
                long l = dfc3.d();
                String string = dfc3.h();
                if (aUh.a(string, eAO.f)) {
                    return false;
                }
                czx_1 czx_12 = new czx_1();
                czx_12.a(l);
                czx_12.a(string);
                azu_0.j().K().c(czx_12);
                return false;
            }
            case 19512: {
                dfc dfc4 = (dfc)adt_12;
                long l = dfc4.d();
                String string = "governmentMemberDetailsDialog_" + l;
                if (fpm_0.b().q(string)) {
                    this.a(null, l);
                } else {
                    this.a(bUW.a().x().D().b(fcu_0.a(l)));
                }
                return false;
            }
            case 16140: {
                dfc dfc5 = (dfc)adt_12;
                long l = dfc5.d();
                faX faX2 = bUW.a().x();
                bmr_1 bmr_12 = azu_0.j().k();
                fcu_0 fcu_02 = bmr_12.fE().w();
                if (fcu_02 == null) {
                    return false;
                }
                faX2.a(fcu_02, fcu_0.a(l), fcx_0.c);
                return false;
            }
            case 16794: {
                dfc dfc6 = (dfc)adt_12;
                short s2 = dfc6.e();
                czy_1 czy_12 = new czy_1();
                czy_12.a(s2);
                azu_0.j().K().c(czy_12);
                return false;
            }
            case 18582: {
                dfc dfc7 = (dfc)adt_12;
                long l = dfc7.d();
                if (this.f.contains(l)) {
                    this.f.remove(l);
                } else {
                    this.f.add(l);
                }
                bUW.a().e();
                fis_1.a().a("lawsDirty", !this.f.isEmpty());
                return false;
            }
            case 18868: {
                if (this.f.isEmpty()) {
                    return false;
                }
                TLongHashSet tLongHashSet = bUW.a().E();
                czz_1 czz_12 = new czz_1();
                czz_12.a(tLongHashSet);
                azu_0.j().K().c(czz_12);
                this.f.clear();
                fis_1.a().a("lawsDirty", false);
                return false;
            }
            case 18911: {
                bUW.a().F();
                this.f.clear();
                bUW.a().e();
                fis_1.a().a("lawsDirty", false);
                return false;
            }
            case 16680: {
                dgZ dgZ2 = (dgZ)adt_12;
                czs_1 czs_12 = new czs_1();
                czs_12.b(dgZ2.o());
                czs_12.a(dgZ2.k());
                azu_0.j().K().c(czs_12);
                this.a(false);
                return false;
            }
            case 18105: {
                dfc dfc8 = (dfc)adt_12;
                cAe cAe2 = new cAe();
                cAe2.b(dfc8.c());
                azu_0.j().K().c(cAe2);
                this.a(false);
                return false;
            }
        }
        return true;
    }

    public void a(boolean bl) {
        fzw_0.a.a("nationLock", bl);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private fxu_0 d() {
        fxu_0 fxu_02 = new fxu_0();
        fxu_02.a("territories", new fxw_0(new dbe(this)));
        fxu_02.a("wills", new fxw_0(new dbf_0(this)));
        fxu_02.a("taxes", new fxw_0(new dbg(this)));
        fxu_02.a("cash", new fxw_0(new dbh(this)));
        return fxu_02;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            Object object;
            if (azu_0.j().k().fE().m().equals(faX.i)) {
                return;
            }
            this.c = new dbi_0(this);
            fpm_0.b().a(this.c);
            fis_1.a().a("speechDirty", false);
            fis_1.a().a("speechVisualisationMode", true);
            fis_1.a().a("lawsDirty", false);
            if (fis_1.a().f("nationCurrentPageIndex") == null) {
                fis_1.a().a("nationCurrentPageIndex", 0);
            }
            fzw_0.a.b("nationLock");
            fpm_0.b().a("nationDialog", cfi_0.a("nationDialog"), 32769L, (short)10000);
            fyy_0 fyy_02 = fpm_0.b().h().d("nationDialog");
            if (fyy_02 != null) {
                object = this.d();
                fuc_0 fuc_02 = (fuc_0)fyy_02.a("protectorTable");
                if (fuc_02 != null) {
                    fuc_02.setTableModel((fxu_0)object);
                }
            }
            object = new czw_1();
            azu_0.j().K().c(object);
            fpm_0.b().a("wakfu.nation", cht_0.class);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e();
            bUW.a().k();
            fis_1.a().a("speechDirty");
            fis_1.a().a("speechVisualisationMode");
            fis_1.a().a("nationCurrentPageIndex");
            fis_1.a().a("lawsDirty");
            fpm_0.b().o("nationDialog");
            fzw_0.a.c("nationLock");
            fpm_0.b().b(this.c);
            fpm_0.b().e("wakfu.nation");
            cdw_0.n().A();
        }
    }

    private void e() {
        for (String string : this.e) {
            fpm_0.b().o(string);
        }
        this.e.clear();
        this.c();
        this.d = null;
    }

    public void c() {
        this.f.clear();
    }

    public void a(fcq_0 fcq_02) {
        this.a(fcq_02, fcq_02.b().a());
    }

    public void a(fcq_0 fcq_02, long l) {
        String string = "governmentMemberDetailsDialog";
        String string2 = "governmentMemberDetailsDialog_" + l;
        if (!fpm_0.b().q(string2) && fcq_02 != null) {
            String string3 = this.d == null ? "nationDialog" : this.d;
            fpm_0.b().a(string2, cfi_0.a("governmentMemberDetailsDialog"), string3, "nationDialog", "governmentMemberDetailsDialog", 1L, (short)10000);
            this.d = string2;
            bUL bUL2 = new bUL(fcq_02, bUW.a().a(fcq_02.b().a()));
            fis_1.a().a("governmentMemberDetails", (Object)bUL2, string2);
            this.e.add(string2);
        } else {
            fpm_0.b().o(string2);
            this.e.remove(string2);
            if (string2.equals(this.d)) {
                this.d = null;
            }
        }
    }
}

