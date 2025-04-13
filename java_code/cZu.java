/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cZu
extends ahs_1 {
    protected static final Logger a = Logger.getLogger(cZu.class);
    private static final cZu b = new cZu();
    private ans_1 c;
    private final List<blv_0> d = new ArrayList<blv_0>();

    public static cZu a() {
        return b;
    }

    private cZu() {
        super(new deB(), new dec_0(), new ded_0(), new deE(), new def_0(), new dep_0(), new deG(), new dei_0(), new deJ(), new deK(), new deL(), new dem_0(), new den_0(), new deq_0(), new des_0(), new deu_0(), new deA());
    }

    private void d() {
        fpm_0.b().a("wakfu.guildManagement", cHl.class);
        fpm_0.b().a("wakfu.guildImprovement", cHj.class);
        fpm_0.b().a("wakfu.guildHavenWorld", chi_0.class);
    }

    private void e() {
        fpm_0.b().e("wakfu.guildManagement");
        fpm_0.b().e("wakfu.guildImprovement");
        fpm_0.b().e("wakfu.guildHavenWorld");
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private fxu_0 f() {
        fxu_0 fxu_02 = new fxu_0();
        fxu_02.a("rank", new fxw_0(new czv_0(this)));
        fxu_02.a("name", new fxw_0(new czw_0(this)));
        fxu_02.a("level", new fxw_0(new cZx(this)));
        fxu_02.a("guildPoints", new fxw_0(new cZy(this)));
        return fxu_02;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            Object object;
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.eZ()) {
                return;
            }
            bua_2.a.a(bmr_12.fc());
            this.c = new cZz(this);
            boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.U);
            byp_2.a().e(bl2);
            fpm_0.b().a(this.c);
            fpm_0.b().a("guildManagementDialog", cfi_0.a("guildManagementDialog"), 32769L, (short)10000);
            fyy_0 fyy_02 = fpm_0.b().h().d("guildManagementDialog");
            if (fyy_02 != null) {
                object = this.f();
                fuc_0 fuc_02 = (fuc_0)fyy_02.a("guildTable");
                if (fuc_02 != null) {
                    fuc_02.setTableModel((fxu_0)object);
                }
            }
            byp_2.a().c();
            this.d();
            fis_1.a().a("rankModificationDirty", false);
            fis_1.a().a("draggedGuildRank", (Object)null);
            fis_1.a().a("currentPage", (Object)0, "guildManagementDialog");
            fis_1.a().a("guild", byp_2.a());
            object = new cnt();
            azu_0.j().K().c(object);
            cdw_0.n().c(600012L);
            bua_0.a.a(new buh_2());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("guildManagementDialog");
            this.e();
            fis_1.a().a("guild");
            cdw_0.n().c(600013L);
        }
    }

    public void a(blv_0 blv_02) {
        this.d.add(blv_02);
    }

    public void b(blv_0 blv_02) {
        this.d.remove(blv_02);
    }

    public void c() {
        for (int k = this.d.size() - 1; k >= 0; --k) {
            dbo_0.a.a(this.d.get(k));
        }
        this.d.clear();
    }
}

