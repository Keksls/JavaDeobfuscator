/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqj
 */
class bqj_2 {
    private static final Logger a = Logger.getLogger(bqj_2.class);
    private final fgb b;
    private final UL c;
    private final biI d;
    private FreeParticleSystem e;
    private Anm f;

    bqj_2(@NotNull fgb fgb2, @NotNull UL uL, @NotNull biI biI2) {
        this.b = fgb2;
        this.c = uL;
        this.d = biI2;
    }

    void a() {
        this.b();
        aOv aOv2 = new aOv(new aOu(this.c, this.b.b().a()));
        this.d.a(aOv2);
        this.d.cj();
    }

    void b() {
        String string = this.b.d();
        fas_0 fas_02 = this.b.b();
        try {
            this.a(this.d, string, fas_02);
        }
        catch (gm_0 gm_02) {
            a.error((Object)"Exception levee", (Throwable)gm_02);
        }
    }

    private void a(abu abu2, String string, fas_0 fas_02) {
        String string2 = "petGfxPath";
        String string3 = azs_0.a().a("petGfxPath");
        String string4 = String.format(string3, string);
        if (this.e != null) {
            aik_0.a().b(this.e.ac());
            this.e = null;
        }
        if (this.b.e() > 0) {
            this.e = aij_0.a().a(this.b.e());
            this.e.a(abu2);
            aik_0.a().b(this.e);
        }
        abu2.a(this.f);
        this.f = abu2.d(string4);
        abu2.a(this.f, () -> abu2.e(aOt.a(fas_02.a())));
    }

    void a(biI biI2) {
        if (this.f != null) {
            biI2.a(this.f);
            this.f = null;
        }
        if (this.e != null) {
            aik_0.a().b(this.e.ac());
            this.e = null;
        }
        biI2.e("AnimStatique");
        biI2.g("AnimStatique");
        biI2.a(agm.a());
        biI2.cj();
    }

    public String toString() {
        return "Ride{m_mountSkin=" + this.b + ", m_particleSystem=" + this.e + ", m_anm=" + this.f.e() + "}";
    }
}

