/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from bpL
 */
public class bpl_2
extends bpb_2 {
    protected static final Logger e = Logger.getLogger(bpl_2.class);
    private final bNK f;
    private boolean g;
    private byte h;
    aby_0 i;

    public bpl_2(brw_1 brw_12, bNK bNK2) {
        super(brw_12);
        this.f = bNK2;
    }

    @Override
    public short ac_() {
        return 3;
    }

    @Override
    public boolean g() {
        if (this.b == null) {
            e.error((Object)"Tried to check the validity of a null CollectAction");
            return false;
        }
        if (this.d == null) {
            return false;
        }
        if (this.d.be()) {
            e.error((Object)"[COLLECT] Unable to collect resource in Haven World");
            return false;
        }
        ece_0 ece_02 = this.d.eX();
        if (this.b.l() != 0 && !ece_02.e(this.b.l())) {
            e.error((Object)("le joueur ne poss\u00e8de pas ce skill " + this.b));
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        this.a(0.0);
    }

    public void a(double d2) {
        super.a();
        if (this.d.eE() != this) {
            e.info((Object)("On d\u00e9marre l'occupation de collecte sur la ressource " + this.f));
            this.d.a(false, true);
            this.d.a(this.f);
            bru_1 bru_12 = (bru_1)this.b.p();
            if (bru_12.a()) {
                this.i();
            }
            biI biI2 = this.d.bv();
            biI2.a(this.b.h(), true);
            this.d.a(this);
        } else {
            e.info((Object)("[COLLECT_DEBUG] On red\u00e9marre une occupation de collecte plut\u00f4t que de la mettre \u00e0 jour. " + aho_2.a(6)));
        }
        this.b(d2);
    }

    private void i() {
        try {
            bru_1 bru_12 = (bru_1)this.b.p();
            this.i = new aby_0(abd_1.c(), this.f.G(), this.f.H(), this.f.I());
            if (this.k()) {
                this.i.a(String.format(azs_0.a().a("ANMEquipmentPath"), "AnimHamecon"), true);
                Anm anm = atf_2.a().b(String.format(azs_0.a().a("ANMEquipmentPath"), bru_12.b()), true);
                this.i.a(anm, "Accessoire".hashCode());
            } else {
                this.i.a(String.format(azs_0.a().a("ANMEquipmentPath"), bru_12.b()), true);
            }
            this.i.g(this.f.y() + 1);
            this.i.a(String.valueOf(bru_12.b()));
            this.i.e("AnimStatique-Debut");
            abe_0.d().a(this.i);
        }
        catch (IOException iOException) {
            e.error((Object)"Impossible de charger le fichier d'animation", (Throwable)iOException);
        }
        catch (gm_0 gm_02) {
            e.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 pour le chargement d'animation", (Throwable)gm_02);
        }
    }

    private void j() {
        this.i.e("AnimStatique-Fin");
        this.i.a(new bpm_2(this));
    }

    public void b(double d2) {
        this.d.do().a(this.f, this.b, this.c, this.h, this.g, d2);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        e.info((Object)("Annulation de la collecte, relai au serveur " + bl2));
        super.a(bl, bl2);
        biI biI2 = this.d.bv();
        biI2.a(this.b.h(), false);
        this.d.dl();
        if (this.i != null) {
            this.j();
        }
        bqg_2.a().e();
        return true;
    }

    @Override
    public boolean b() {
        e.info((Object)"Fin de l'occupation de collecte");
        super.b();
        biI biI2 = this.d.bv();
        biI2.a(this.b.h(), false);
        this.d.do().a();
        this.d.dl();
        if (this.i != null) {
            this.j();
        }
        this.c();
        return true;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public void a(byte by) {
        this.h = by;
    }

    private boolean k() {
        fii fii2 = fij.a().a(this.b.h());
        if (fii2 == null) {
            return false;
        }
        return fii2.b().contains("AnimMetier-Peche");
    }

    public bNK h() {
        return this.f;
    }
}

