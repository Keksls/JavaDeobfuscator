/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cZr
 */
public class czr_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(czr_0.class);
    private static final czr_0 b = new czr_0();
    private fbx_1 c;
    private ArrayList<fqt> d;
    byb_2 e;
    eqn_0 f = eqn_0.d;
    private ans_1 g;

    public static czr_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18948: {
                short s2 = (short)(this.e.a() - 1);
                this.a(s2);
                return false;
            }
            case 18163: {
                short s3 = (short)(this.e.a() + 1);
                this.a(s3);
                return false;
            }
        }
        return true;
    }

    private fxu_0 e() {
        fxu_0 fxu_02 = new fxu_0();
        fxu_02.a(new czs_0(this));
        return fxu_02;
    }

    public void a(short s2) {
        cnu cnu2 = new cnu();
        cnu2.a(s2);
        cnu2.a(this.f == null ? eqn_0.d.b() : this.f.b());
        azu_0.j().K().c(cnu2);
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
            if (this.e == null) {
                a.error((Object)"Impossible de charger l'affichage du ladder de guilde, il manque les donn\u00e9es !");
                return;
            }
            this.g = new czt_0(this);
            fpm_0.b().a(this.g);
            fis_1.a().a("guildLadder", this.e);
            fis_1.a().a("dungeonLadderBackgroundImage", (Object)azs_0.a().w(bka_2.e.a()));
            fpm_0.b().a("guildLadderDialog", cfi_0.a("guildLadderDialog"), 256L, (short)30000);
            this.f();
            fyy_0 fyy_02 = fpm_0.b().h().d("guildLadderDialog");
            if (fyy_02 != null) {
                fxu_0 fxu_02 = this.e();
                fuc_0 fuc_02 = (fuc_0)fyy_02.a("ladderTable");
                if (fuc_02 != null) {
                    fuc_02.setTableModel(fxu_02);
                }
            }
            fpm_0.b().a("wakfu.guildLadder", chk_0.class);
            cdw_0.n().c(600120L);
        }
    }

    private void f() {
        fyy_0 fyy_02 = fpm_0.b().h().d("guildLadderDialog");
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        fvE fvE2 = (fvE)fyy_02.a("background");
        if (fvE2 != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a("closeButton")) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if (fvE2 != null) {
            azf_2 azf_22 = new azf_2(azf_2.b.i());
            azf_2 azf_23 = new azf_2(azf_2.e.i());
            fvE2.addTween(new fjo_2(azf_22, azf_23, arrayList, 0, 500, 1, fjw_2.b));
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e = null;
            this.f = null;
            fpm_0.b().b(this.g);
            fis_1.a().a("guildLadder");
            fis_1.a().a("dungeonLadderBackgroundImage");
            fpm_0.b().o("guildLadderDialog");
            fpm_0.b().e("wakfu.guildLadder");
            cdw_0.n().c(600121L);
        }
    }

    public void a(byb_2 byb_22) {
        this.e = byb_22;
        azu_0.j().a(czr_0.a());
    }

    public byb_2 c() {
        return this.e;
    }

    public eqn_0 d() {
        return this.f;
    }
}

