/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpK
 */
public class bpk_2
extends bpb_2 {
    protected static final Logger e = Logger.getLogger(bpk_2.class);
    private final bmv_1 g;

    public bpk_2(brw_1 brw_12, bmv_1 bmv_12) {
        super(brw_12);
        this.g = bmv_12;
    }

    @Override
    public short ac_() {
        return 6;
    }

    @Override
    public boolean g() {
        if (this.b == null) {
            e.error((Object)"Tried to check the validity of a null CollectAction");
            return false;
        }
        apc_2 apc_22 = this.b.i();
        bmr_1 bmr_12 = azu_0.j().k();
        assert (bmr_12 == this.d);
        if (this.d == null) {
            return false;
        }
        if (this.d.be()) {
            e.error((Object)"[COLLECT] Unable to collect resource in Haven World");
            return false;
        }
        ece_0 ece_02 = bmr_12.eX();
        if (!ece_02.e(this.b.l()) || apc_22 != null && !apc_22.b(bmr_12, this.g, null, null)) {
            e.error((Object)("le joueur ne poss\u00e8de pas ce skill " + this.b.l()));
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        super.a();
        e.info((Object)"On d\u00e9marre l'occupation de collecte d'un monstre");
        this.d.a(false, true);
        this.d.a((abz_0)this.g.bv());
        fii fii2 = fij.a().a(this.b.h());
        if (fii2 != null) {
            bOE.a(this.d.bv(), fii2);
        }
        this.d.a(this);
        this.d.do().a(this.b, this.c);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        e.info((Object)("Annulation de la collecte d'un monstre, relai au serveur " + bl2));
        super.a(bl, bl2);
        this.d.bv().e("AnimStatique");
        this.d.dl();
        bqg_2.a().e();
        return true;
    }

    @Override
    public boolean b() {
        e.info((Object)"Fin de l'occupation de collecte d'un monstre");
        super.b();
        String string = aba_0.a(this.d.bv().F(), true);
        this.d.bv().e(string);
        this.d.do().a();
        this.d.dl();
        this.c();
        return true;
    }
}

