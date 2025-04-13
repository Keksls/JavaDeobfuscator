/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.ShowHideNameOverheadsCommand;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from dbM
 */
public class dbm_0
implements YT,
ahr_1,
ajh_1,
bmg_2 {
    private static final Logger w = Logger.getLogger(dbm_0.class);
    private static final dbm_0 x = new dbm_0();
    public static final String a = "pvpRankIconUrl";
    public static final String b = "pvpRankEnabled";
    public static final String d = "overHeadInfos";
    public static final String e = "breedIconUrl";
    public static final String f = "breedIconColor";
    public static final String g = "title";
    public static final String h = "breed";
    public static final String i = "monsters";
    public static final String j = "hooded";
    public static final String k = "resource";
    public static final String l = "attackerOverHeadInfos";
    public static final String m = "defenderOverHeadInfos";
    public static final String n = "attackerTeamTotalLevel";
    public static final String o = "defenderTeamTotalLevel";
    public static final String p = "fightStatus";
    public static final String q = "fightInfos";
    public static final String r = "isAttackerPlayerCharacter";
    public static final String s = "isDefenderPlayerCharacter";
    public static final String t = "isFightSwordElement";
    public static final String u = "ownerStatus";
    public static final String[] v = new String[]{"pvpRankEnabled", "pvpRankIconUrl", "overHeadInfos", "attackerOverHeadInfos", "defenderOverHeadInfos", "breedIconUrl", "breedIconColor", "attackerTeamTotalLevel", "defenderTeamTotalLevel", "isAttackerPlayerCharacter", "isDefenderPlayerCharacter", "fightStatus", "fightInfos", "title", "isFightSwordElement", "ownerStatus"};
    private static final int y = 88;
    private fvc_0 z;
    private fvc_0 A;
    private List<dhh> B = new ArrayList<dhh>();
    private YP C;
    private dhg D;
    private String E;
    private String F;
    private String G;
    private boolean H;
    private boolean I;
    private String J;
    private String K;
    private String L;
    private String M;
    private long N;
    private boolean O;
    private List<dhh> P = new ArrayList<dhh>();
    private List<dhh> Q = new ArrayList<dhh>();
    final TLongObjectHashMap<dbn_0> R = new TLongObjectHashMap();

    public static dbm_0 a() {
        return x;
    }

    public YP c() {
        return this.C;
    }

    public void a(YP yP) {
        if (yP != null) {
            yP.b(this);
        }
        if (yP != this.C) {
            return;
        }
        this.C = null;
        if (this.z != null) {
            this.z.setVisible(false);
        }
        if (this.A != null) {
            this.A.setVisible(false);
        }
        if (bvu_0.c() == bvu_0.a) {
            apw_0.a().e();
        }
        adi_2.a().a(this);
        if (this.C instanceof aov_0) {
            adi_2.a().a(this.N);
        }
    }

    public void b(long l) {
        if (!(this.C instanceof biI)) {
            return;
        }
        blx_1 blx_12 = ((biI)this.C).bI();
        if (!(blx_12 instanceof bnh_1)) {
            return;
        }
        if (blx_12.fc() != l) {
            return;
        }
        this.D.b().clear();
        biM.a(blx_12, this.D);
        this.B = this.D.b();
        fis_1.a().a((ajf_1)this, v);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            adh_2 adh_22 = (adh_2)adt_12;
            if (adh_22.b() == this.N) {
                this.j();
            } else {
                this.k();
            }
            return false;
        }
        if (adt_12.a() == 19888) {
            dhf dhf2 = (dhf)adt_12;
            this.a(dhf2.k());
            return false;
        }
        return true;
    }

    private void j() {
        aov_0 aov_02 = (aov_0)this.C;
        bvw_2 bvw_22 = aov_02.aM();
        aop_0.a(this.D, bvw_22);
        this.M = this.D.o();
        fis_1.a().a((ajf_1)this, q);
    }

    public void e() {
        this.C = this.D.a();
        this.C.a(this);
    }

    public void a(dhg dhg2) {
        adi_2.a().a(this);
        this.D = dhg2;
        long l = this.D.k() ? (long)this.D.l() : (azu_0.j().k().bz() != null ? 0L : (long)(((bvx_0)ans_0.D().h()).c(bWe.Q) * 1000.0f));
        this.e();
        if (l == 0L) {
            this.k();
        } else {
            adi_2.a().a(this, l, 0, 1L);
        }
    }

    private void k() {
        Object object;
        if (this.z == null) {
            return;
        }
        this.z.setVisible(false);
        this.A.setVisible(false);
        YP yP = this.D.a();
        fvc_0 fvc_02 = this.z;
        if (yP instanceof biI) {
            object = (biI)yP;
            if (((biI)object).bI().gY() == 0) {
                fvc_02 = this.A;
            }
            if (bvu_0.c() == bvu_0.a && ((biI)object).az() != 0 && !azu_0.j().c(cYZ.o())) {
                apw_0.a().a(((biI)object).a());
            }
        }
        fpm_0.b().a("overheadDialog", yP);
        fpm_0.b().a("overheadPlayerDialog", yP);
        fvc_02.getAppearance().setModulationColor(new azf_2(azf_2.e.i()));
        this.B = this.D.b();
        this.E = this.D.h();
        this.F = this.D.i().toString();
        this.P = this.D.c();
        this.Q = this.D.d();
        this.J = this.D.m();
        this.K = this.D.n();
        this.H = this.D.e();
        this.I = this.D.f();
        this.L = this.D.p();
        this.M = this.D.o();
        if (this.C instanceof aov_0) {
            this.N = adi_2.a().a(this, 1000L, 0, -1L);
        }
        this.G = this.D.j();
        fis_1.a().a((ajf_1)this, v);
        object = new azf_2(yP.h());
        ((azf_2)object).b(0.9f);
        this.z.getAppearance().setModulationColor((azj_2)object);
        if (!this.B.isEmpty()) {
            fvc_02.setVisible(true);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.z = (fvc_0)fpm_0.b().a("overheadDialog", cfi_0.a("overheadDialog"), 139265L, (short)30000);
            this.z.setVisible(false);
            this.A = (fvc_0)fpm_0.b().a("overheadPlayerDialog", cfi_0.a("overheadPlayerDialog"), 139265L, (short)30000);
            this.A.setVisible(false);
            fis_1.a().a("overHead", this);
            bmf_2.a().a(this);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.R.clear();
            fpm_0.b().o("overheadDialog");
            this.z = null;
            fpm_0.b().o("overheadPlayerDialog");
            this.A = null;
            adi_2.a().a(this);
            fis_1.a().a("overHead");
            bmf_2.a().c(this);
            ShowHideNameOverheadsCommand.a(false);
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 88L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public String[] d() {
        return v;
    }

    @Override
    public Object b(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        switch (string) {
            case "overHeadInfos": {
                return this.B;
            }
            case "attackerOverHeadInfos": {
                return this.P;
            }
            case "defenderOverHeadInfos": {
                return this.Q;
            }
            case "defenderTeamTotalLevel": {
                return this.K;
            }
            case "attackerTeamTotalLevel": {
                return this.J;
            }
            case "fightStatus": {
                return this.L;
            }
            case "fightInfos": {
                return this.M;
            }
            case "breedIconUrl": {
                return this.E;
            }
            case "breedIconColor": {
                return this.F;
            }
            case "isAttackerPlayerCharacter": {
                return this.H;
            }
            case "isDefenderPlayerCharacter": {
                return this.I;
            }
            case "title": {
                return this.G;
            }
            case "isFightSwordElement": {
                return this.C instanceof aov_0;
            }
            case "ownerStatus": {
                if (!(this.C instanceof bcu_1)) {
                    return false;
                }
                bcu_1 bcu_12 = (bcu_1)this.C;
                return bcu_12.aK();
            }
        }
        if (string.equals(a)) {
            if (this.C instanceof biI && ((epq_2)(object = ((biI)this.C).bI())).gY() == 0) {
                int n = ((epq_2)object).fE().n();
                fgY fgY2 = ((epq_2)object).fE().y();
                return azs_0.a().a("pvpRankIconsPath", "defaultIconPath", n, fgY2.c());
            }
            return null;
        }
        if (string.equals(b)) {
            if (!(this.C instanceof biI)) {
                return false;
            }
            object = ((biI)this.C).bI();
            if (((epq_2)object).gY() != 0) {
                return false;
            }
            return !faX.a(faX.i, ((epq_2)object).fE().m());
        }
        return null;
    }

    @Override
    public void a(boolean bl, YU yU) {
        if (!bl) {
            this.a(this.C);
        }
    }

    boolean a(blx_1 blx_12, bmr_1 bmr_12) {
        if (!bmr_12.dE().d()) {
            return false;
        }
        eQb eQb2 = bmr_12.dE().a();
        switch (blx_12.gY()) {
            case 0: {
                return eQb2.e(blx_12.a_()) != null;
            }
            case 5: {
                blx_1 blx_13 = blx_12.aq();
                if (blx_13 == null || blx_13.gY() == 5) {
                    return false;
                }
                return this.a(blx_13, bmr_12);
            }
        }
        return false;
    }

    boolean e(blx_1 blx_12) {
        if (!(blx_12 instanceof bnh_1)) {
            return false;
        }
        return aUL.a().e().d(aUL.a().a(blx_12.dp())) != null;
    }

    public void f() {
        bmf_2.a().b((TObjectProcedure<blx_1>)((TObjectProcedure)blx_12 -> {
            if (blx_12.f(erl_2.d)) {
                return true;
            }
            Cr.a(blx_12.gX());
            this.b((blx_1)blx_12);
            return true;
        }));
        bmr_1 bmr_12 = azu_0.j().k();
        Cr.a(bmr_12 == null ? (byte)0 : bmr_12.gX());
        dbm_0.l();
    }

    private static void l() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null || !emp_0.b(bai_02.v(), emq_0.bk)) {
            return;
        }
        ahs.d().a((TObjectProcedure<? super ahv>)((TObjectProcedure)ahv2 -> {
            if (ahv2 instanceof bcu_1) {
                ((bcu_1)ahv2).aP();
            }
            return true;
        }));
    }

    public void g() {
        this.R.forEachValue(dbn_02 -> {
            dbn_02.a();
            return true;
        });
        this.m();
    }

    private void m() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null || !emp_0.b(bai_02.v(), emq_0.bk)) {
            return;
        }
        ahs.d().a((TObjectProcedure<? super ahv>)((TObjectProcedure)ahv2 -> {
            if (ahv2 instanceof bcu_1) {
                this.a((YP)ahv2);
            }
            return true;
        }));
    }

    public void b(blx_1 blx_12) {
        dbn_0 dbn_02 = (dbn_0)this.R.remove(blx_12.a_());
        if (dbn_02 != null) {
            dbn_02.a();
        }
        dbn_0 dbn_03 = new dbn_0(this, blx_12);
        this.R.put(blx_12.a_(), (Object)dbn_03);
    }

    public void h() {
        this.O = !this.O;
        this.i();
    }

    public void i() {
        if (this.O) {
            dbm_0.n();
        } else {
            dbm_0.o();
        }
    }

    private static void n() {
        bmf_2.a().a((TLongObjectProcedure<blx_1>)((TLongObjectProcedure)(l, blx_12) -> {
            dbm_0.f(blx_12);
            return true;
        }));
    }

    private static void f(blx_1 blx_12) {
        if (blx_12.P() && !blx_12.bV() && !blx_12.aD()) {
            blx_12.i(true);
        } else {
            blx_12.i(false);
        }
    }

    private static void o() {
        bmf_2.a().a((TLongObjectProcedure<blx_1>)((TLongObjectProcedure)(l, blx_12) -> {
            blx_12.i(false);
            return true;
        }));
    }

    public void c(blx_1 blx_12) {
        if (this.O) {
            dbm_0.f(blx_12);
        }
    }

    public static void d(blx_1 blx_12) {
        blx_12.i(false);
    }

    @Override
    public void a(blx_1 blx_12) {
        if (ShowHideNameOverheadsCommand.b() && (blx_12.gY() == 5 || blx_12.gY() == 0)) {
            this.b(blx_12);
        }
        if (this.O) {
            dbm_0.f(blx_12);
        }
    }
}

