/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpN
 */
public class bpn_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bpn_2.class);
    private final bgq_1 b;
    private final eco_0 c;
    private final long e;
    private static final Runnable f = new bpo_2();

    public bpn_2(bgq_1 bgq_12, eco_0 eco_02, long l) {
        this.b = bgq_12;
        this.c = eco_02;
        this.e = l;
    }

    @Override
    public short ac_() {
        return 8;
    }

    @Override
    public boolean g() {
        if (this.d.ab_() || this.d.ak()) {
            a.warn((Object)("Le joueur " + this.d + " est mort ou en combat et ne peut utiliser de machine de craft"));
            return false;
        }
        if (!this.b.a(this.c.e(), this.c.b())) {
            a.warn((Object)("Le joueur " + this.d + " essaye d'utiliser la recette " + this.c + " du m\u00e9tier " + this.b.Z() + " sur la machine " + this.b + " alors qu'elle n'est pas autoris\u00e9e"));
            return false;
        }
        fii fii2 = fij.a().a(this.b.aL_());
        if (!this.a(fii2)) {
            a.warn((Object)("Le joueur " + this.d + " essaye d'utiliser la recette " + this.c + " du m\u00e9tier " + this.b.Z() + " sur la machine " + this.b + " alors qu'il n'a pas l'objet requis dans le visuel"));
            return false;
        }
        if (!this.d.a(this.c)) {
            a.warn((Object)("Le joueur " + this.d + " essaye d'utiliser la recette " + this.c + " du m\u00e9tier " + this.b.Z() + " sur la machine " + this.b + " alors qu'il n'a pas les ingr\u00e9dients"));
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        a.info((Object)("[CRAFTOCC] Craft START id=" + this.b.Z()));
        fii fii2 = fij.a().a(this.b.aL_());
        this.d.bv().a(fii2.a(), true);
        cXC.a().b(this.e);
        ado_1.a().a(f, this.e, 1);
    }

    @Override
    public boolean b() {
        a.info((Object)("[CRAFTOCC] Craft FINISHED id=" + this.b.Z()));
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)2);
        cpz_02.a((short)8);
        azu_0.j().K().c(cpz_02);
        fii fii2 = fij.a().a(this.b.aL_());
        this.d.bv().a(fii2.a(), false);
        return true;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)"[CRAFTOCC] Craft CANCELED");
        ado_1.a().b(f);
        if (this.b == null) {
            return true;
        }
        fii fii2 = fij.a().a(this.b.aL_());
        if (fii2 == null) {
            return true;
        }
        this.d.bv().a(fii2.a(), false);
        cXC.a().f();
        if (bl2) {
            this.h();
        }
        return true;
    }

    public void h() {
        a.info((Object)"[CRAFTOCC] Craft CANCEL request");
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)3);
        cpz_02.a((short)8);
        azu_0.j().K().c(cpz_02);
    }
}

