/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bqh
 */
public class bqh_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bqh_2.class);
    private final blx_1 b;

    public bqh_2(blx_1 blx_12) {
        this.b = blx_12;
    }

    @Override
    public short ac_() {
        return 1;
    }

    @Override
    public boolean g() {
        if (this.b.bv().bs()) {
            aUh.a("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        a.trace((Object)("Lancement de l'occupation REST pour le joueur " + this.b.a_()));
        this.b.a(false, true);
        biI biI2 = this.b.bv();
        if (!biI2.aC().c()) {
            biI2.a(biI2.aC().c(1));
        }
        biI2.e("AnimEmote-Repos");
        this.b.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (bl2) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)3);
            cpz_02.a(this.ac_());
            azu_0.j().K().c(cpz_02);
        }
        return this.b();
    }

    @Override
    public boolean b() {
        a.trace((Object)("On arrete l'occupation REST pour le joueur " + this.b.a_()));
        biI biI2 = this.b.bv();
        if (!biI2.aC().c()) {
            biI2.a(biI2.aC().c(1));
        }
        if (biI2.F().startsWith("AnimPosingAssis")) {
            String string = aba_0.a(biI2.F(), true);
            biI2.e(string);
        }
        return true;
    }
}

