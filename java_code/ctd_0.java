/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTD
 */
public class ctd_0
extends cSS {
    private static final Logger a = Logger.getLogger(ctd_0.class);

    @Override
    public cSY n() {
        return cSY.ac;
    }

    @Override
    public String q() {
        if (!(this.l instanceof blx_1)) {
            return null;
        }
        blx_1 blx_12 = (blx_1)this.l;
        ani_2 ani_22 = new ani_2().a().a((CharSequence)bae.h().a("desc.mru." + this.r(), blx_12.dp())).b();
        return ani_22.r();
    }

    @Override
    public String r() {
        return "followPlayer";
    }

    @Override
    protected int t() {
        return cUL.ax.aH;
    }

    @Override
    public void o() {
        if (!this.c()) {
            a.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        if (bnh_12.bv().at()) {
            dhI.a().b(bnh_12.a_());
            azu_0.j().a(dhI.a());
        }
    }

    @Override
    public boolean d() {
        return super.d();
    }

    @Override
    public boolean c() {
        if (this.l == null) {
            return false;
        }
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        return dhI.a(bnh_12);
    }

    @Override
    public cSS v() {
        return new ctd_0();
    }
}

