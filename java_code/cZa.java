/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cZa
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cZa.class);
    private static final cZa b = new cZa();
    private blx_1 c;
    private blx_1 d;
    private cux_0 e;
    private dih_0 f;

    public static cZa a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18517: {
                bOw bOw2 = azu_0.j().m();
                if (bOw2 != null) {
                    bOw2.q();
                }
                return false;
            }
            case 16126: {
                bOw bOw3 = azu_0.j().m();
                if (bOw3 != null) {
                    bOw3.r();
                }
                return false;
            }
            case 16279: {
                bvx_2 bvx_22 = this.d.bz();
                if (bvx_22 == null) {
                    return false;
                }
                if (!bvx_22.w()) {
                    return false;
                }
                bvx_22.e(this.d);
                bua_0.a.a(new bup_2());
                return false;
            }
            case 19549: {
                dgn_0 dgn_02 = (dgn_0)adt_12;
                byte by = dgn_02.p();
                exk_2 exk_22 = dgn_02.o();
                bpl_0 bpl_02 = dgn_02.k();
                if (bpl_02 != null && exk_22 != null) {
                    bpl_0 bpl_03 = cYZ.o().p();
                    if (azu_0.j().c(cyy_0.o()) && bpl_03 != null && bpl_03.equals(bpl_02)) {
                        azu_0.j().b(cyy_0.o());
                    } else {
                        if (azu_0.j().c(cYS.o())) {
                            azu_0.j().b(cYS.o());
                        }
                        if (azu_0.j().c(cYZ.o())) {
                            azu_0.j().b(cYZ.o());
                        }
                        if (this.d.bz().a((epq_2)this.d, exk_22, bpl_02, null) == fir_0.a) {
                            cyy_0.o().a(bpl_02);
                            cyy_0.o().a(this.d);
                            cyy_0.o().e();
                            cyy_0.o().a(exk_22, by);
                            cyy_0.o().a(this.d);
                            cyy_0.o().e();
                            cyy_0.o().l();
                            this.e = cyy_0.o();
                            azu_0.j().a(cyy_0.o());
                        }
                    }
                }
                return false;
            }
            case 16245: {
                dhb_0 dhb_02 = (dhb_0)adt_12;
                bpl_0 bpl_04 = dhb_02.k();
                if (bpl_04 != null) {
                    if (this.f != null) {
                        this.f.a();
                        if (this.f.b()) {
                            return false;
                        }
                    }
                    bpl_0 bpl_05 = cYZ.o().p();
                    if (azu_0.j().c(cYZ.o()) && bpl_05 != null && bpl_05.equals(bpl_04)) {
                        azu_0.j().b(cYZ.o());
                    } else {
                        if (azu_0.j().c(cYS.o())) {
                            azu_0.j().b(cYS.o());
                        }
                        if (azu_0.j().c(cyy_0.o())) {
                            azu_0.j().b(cyy_0.o());
                        }
                        bOB bOB2 = new bOB();
                        bOB2.a(this.d.bz());
                        if (bOB2.a(this.d, bpl_04, null, true) == fir_0.a) {
                            cYZ.o().a(bpl_04);
                            cYZ.o().a(this.d);
                            cYZ.o().e();
                            cYZ.o().l();
                            this.e = cYZ.o();
                            azu_0.j().a(cYZ.o());
                        }
                    }
                }
                return false;
            }
            case 18450: {
                dgm_0 dgm_02 = (dgm_0)adt_12;
                exk_2 exk_23 = dgm_02.k();
                byte by = dgm_02.o();
                if (exk_23 != null) {
                    exk_2 exk_24 = cYS.o().p();
                    if (azu_0.j().c(cYS.o()) && exk_24 != null && exk_24.equals(exk_23)) {
                        azu_0.j().b(cYS.o());
                        fzd_0.a().d();
                        fyt_0.a().c();
                    } else {
                        if (azu_0.j().c(cYZ.o())) {
                            azu_0.j().b(cYZ.o());
                        }
                        if (azu_0.j().c(cyy_0.o())) {
                            azu_0.j().b(cyy_0.o());
                        }
                        if (this.d.bz().a((epq_2)this.d, exk_23, null, true) == fir_0.a) {
                            cYS.o().a(exk_23, by);
                            cYS.o().a(this.d);
                            cYS.o().e();
                            cYS.o().l();
                            this.e = cYS.o();
                            azu_0.j().a(cYS.o());
                        }
                    }
                }
                return false;
            }
            case 17753: {
                dgm_0 dgm_03 = (dgm_0)adt_12;
                a.info((Object)"UIFightTurnFrame : onMessage : Methode a compl\u00e9ter (LIM)");
                return false;
            }
            case 16836: {
                cna cna2 = new cna();
                cna2.a(this.d.a_());
                cna2.a(aej_2.h);
                azu_0.j().K().c(cna2);
                return false;
            }
            case 18819: {
                cna cna3 = new cna();
                cna3.a(this.d.a_());
                cna3.a(aej_2.f);
                azu_0.j().K().c(cna3);
                return false;
            }
            case 19266: {
                cna cna4 = new cna();
                cna4.a(this.d.a_());
                cna4.a(aej_2.b);
                azu_0.j().K().c(cna4);
                return false;
            }
            case 19380: {
                cna cna5 = new cna();
                cna5.a(this.d.a_());
                cna5.a(aej_2.d);
                azu_0.j().K().c(cna5);
                return false;
            }
        }
        return true;
    }

    private short h() {
        bvx_2 bvx_22 = this.d.bz();
        if (bvx_22 == null) {
            return 0;
        }
        bxo_2 bxo_22 = bvx_22.A();
        if (bxo_22 == null) {
            return 0;
        }
        return bxo_22.u();
    }

    public void c() {
        if (this.d != null) {
            cdw_0.n().c(600128L);
        }
    }

    private static blx_1 a(blx_1 blx_12, blx_1 blx_13) {
        if (blx_12.a(eoz_1.aw)) {
            return blx_12;
        }
        if (blx_12.a(eoz_1.ai)) {
            return blx_13;
        }
        if (blx_13.a(eoz_1.ai)) {
            return blx_12;
        }
        return blx_13;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fyy_0 fyy_02;
            bmr_1 bmr_12 = azu_0.j().k();
            try {
                this.d = bmr_12.bz().A().H();
                this.c = cZa.a(this.d, (blx_1)bmr_12);
                if (!this.d.bp()) {
                    a.warn((Object)"Frame de tour de combattant pouss\u00e9 pour le localPlayer alors que ce n'est pas lui le propri\u00e9taire de ce combattant");
                    this.d = null;
                }
                if (this.d != null && this.d.gk()) {
                    a.warn((Object)"frame de tour pouss\u00e9, pour le combattant local, mais pourtant g\u00e9r\u00e9 par l'IA");
                }
                cZa.a(this.d);
                if (!this.d.a(eoz_1.b)) {
                    dlx.a().a(new dlw(dly.f, bae.h().a("fight.yourTurn.0", new Object[0]), 2000));
                }
            }
            catch (Exception exception) {
                a.error((Object)"Frame de tour de combat pouss\u00e9 alors qu'un param\u00e8tre est null (combat ou combattant)", (Throwable)exception);
            }
            if (!azu_0.j().c(cYT.a())) {
                azu_0.j().a(cYT.a());
            }
            azu_0.j().a(cyo_0.a());
            cxu_0.a().a(true);
            this.d.bg().b();
            bOw bOw2 = this.d.cg();
            if (bOw2 != null) {
                if (cZa.a(this.d, bmr_12)) {
                    this.d.a(eps_0.c, eps_0.b, eps_0.d, eps_0.e);
                }
                cZa.a(bOw2, this.d, true);
            }
            if ((fyy_02 = fpm_0.b().h().d("inventoryDialog")) != null) {
                fis_1.a().a("itemDetail", "usableNow", fyy_02);
            }
        }
    }

    public static void a(blx_1 blx_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        azu_0.j().a(blx_12);
        boolean bl = cZa.a(blx_12, bmr_12);
        bOw bOw2 = blx_12.cg();
        if (bOw2 == null) {
            return;
        }
        bOw2.f();
        if (blx_12.bl()) {
            bOw2.a(blx_12.bg().e());
        } else {
            bmr_12.a(eps_0.c, eps_0.b, eps_0.d, eps_0.e);
        }
        if (bl && blx_12.gO() == epn_2.d.s() && azu_0.j().c(dbJ.a())) {
            dbJ.a().a((bmr_1)euw_2.a.d(blx_12.a_()));
        }
        cZa.a(bOw2, blx_12, true);
    }

    private static void a(@NotNull bOw bOw2, @NotNull blx_1 blx_12, boolean bl) {
        if (!blx_12.bl()) {
            bPJ.a(blx_12.dz(), blx_12.aZ(), bOw2);
        }
        bOw2.b(fid.b);
        bOw2.a((byte)fid.b.e(), true);
        bOw2.z();
        dcj_0.a().a(bOw2);
        if (bl) {
            if (blx_12 instanceof bmr_1) {
                fis_1.a().a((ajf_1)blx_12, bmr_1.bt);
            } else if (blx_12 instanceof bnh_1) {
                fis_1.a().a((ajf_1)blx_12, bnh_1.ct);
            } else if (blx_12 instanceof bmv_1) {
                fis_1.a().a((ajf_1)blx_12, bmv_1.am);
            } else {
                fis_1.a().a((ajf_1)blx_12, blx_1.W);
            }
        }
        fis_1.a().a((ajf_1)blx_12, "shortcutBarManager");
        dcj_0.a().f();
    }

    private static boolean a(blx_1 blx_12, bmr_1 bmr_12) {
        Object t = euw_2.a.d(blx_12.a_());
        return t != null && ((epq_2)t).U_() == bmr_12.U_();
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.d = null;
        if (!bl) {
            cyp_0.g().m();
            this.e = null;
            fzd_0.a().d();
            fyt_0.a().c();
            cxu_0.a().a(false);
            azu_0.j().b(cYZ.o());
            azu_0.j().b(cYS.o());
            azu_0.j().b(cyy_0.o());
            azu_0.j().b(cyo_0.a());
            azu_0.j().b(cYT.a());
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public blx_1 d() {
        return this.d;
    }

    public cux_0 e() {
        return this.e;
    }

    public void a(dih_0 dih_02) {
        this.f = dih_02;
    }

    public dih_0 f() {
        return this.f;
    }

    public void g() {
        this.c = null;
    }
}

