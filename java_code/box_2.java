/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from boX
 */
public class box_2
implements bmn_2 {
    private static final Logger a = Logger.getLogger(box_2.class);
    private final bmv_1 b;
    private boolean c;
    private rx_0 d;

    public static boolean a(blx_1 blx_12) {
        return csg_1.a(blx_12.X_());
    }

    public box_2(bmv_1 bmv_12) {
        this.b = bmv_12;
    }

    @Override
    public void a(int n, Object object) {
        if (n == 301) {
            this.b();
            this.c();
        } else if (n == 300) {
            this.c = true;
        }
    }

    @Override
    public void a(tk_0 tk_02) {
        if (tk_02.a() == 101 && this.c) {
            this.c = false;
            bbZ bbZ2 = new bbZ(alc_1.q(), emd_1.ao.a(), 0, this.b);
            baa_0.a().a(this.b.bz(), (aku_1)bbZ2);
            this.c();
        }
    }

    @Override
    public void a(rx_0 rx_02) {
        if (!csg_1.a(rx_02)) {
            return;
        }
        this.d = rx_02;
        this.b();
    }

    @Override
    public void b(rx_0 rx_02) {
        if (!csg_1.a(rx_02)) {
            return;
        }
        this.a();
        this.b.a((bmn_2)null);
    }

    private void a() {
        biI biI2 = this.b.bv();
        this.b.c(0);
        this.b.aQ();
        biI2.a(biI2.am(), new boy_2(this, biI2));
    }

    private void b() {
        if (this.d == null || !csg_1.a(this.d)) {
            a.error((Object)("On essaie d'ajouter un skin encapuchonn\u00e9 \u00e0 un monstre qui n'a pas de propri\u00e9t\u00e9 correspondante" + this.d));
            return;
        }
        biI biI2 = this.b.bv();
        biI2.bQ().a(biI2);
        biI2.g("AnimStatique");
        biI2.e("AnimTransEffect-Debut");
        this.b.aQ();
        int n = (int)(Math.abs(this.b.a_()) % (long)csg_1.b(this.d));
        this.b.c(csg_1.a(n, this.d));
    }

    private void c() {
        if (this.b.ab_()) {
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(800340);
        if (freeParticleSystem == null) {
            a.error((Object)"pas d'aps 800340");
            return;
        }
        freeParticleSystem.a(this.b.bA());
        freeParticleSystem.a(this.b.G(), (float)this.b.H(), (float)this.b.I());
        aik_0.a().b(freeParticleSystem);
    }
}

