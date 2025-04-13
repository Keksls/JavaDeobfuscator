/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bqp
 */
public class bqp_2
extends bpc_2 {
    private static final Logger b = Logger.getLogger(bqp_2.class);
    bqs_2 c;
    final bnh_1 e;
    private int f;
    private boolean g;

    public boolean h() {
        return this.g;
    }

    public bqp_2(bnh_1 bnh_12) {
        this.e = bnh_12;
    }

    @Override
    public short ac_() {
        return 4;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void a() {
        b.info((Object)("[DEATH] Lancement de l'occupation pour le joueur " + this.e));
        this.e.a(false, true);
        assert (this.c == null);
        this.c = new bqs_2();
        this.c.a(this.e);
        if (this.e == this.d) {
            this.d.n(false);
            this.b(false);
            azu_0 azu_02 = azu_0.j();
            azu_02.a(bqv_2.a);
            bua_0.a.a(new bus_0());
            this.f = aNM.b();
        }
        this.e.a_(true);
        this.e.a(this);
    }

    private void b(boolean bl) {
        fis_1.a().a("isAlive", bl);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        b.info((Object)("[DEATH] Annulation l'occupation pour le joueur " + this.e + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        return false;
    }

    @Override
    public boolean b() {
        b.info((Object)("[DEATH] Fin de l'occupation pour le joueur " + this.e));
        if (!this.e.cX()) {
            if (this.e == this.d && bqv_2.a.a()) {
                this.j();
            } else {
                String string = "AnimTombe-Fin";
                if (this.e.bv().bs()) {
                    string = "AnimArtefact-Nager-Debut";
                } else {
                    this.i();
                }
                this.e.bv().e(string);
            }
        }
        if (this.e == this.d) {
            this.d.n(true);
            this.b(true);
            azu_0.j().b(bqv_2.a);
            aNM.a(this.f);
        }
        this.e.a_(false);
        return true;
    }

    private void i() {
        this.e.bv().a(new bqq_2(this));
    }

    private void j() {
        auy_2.a().a(new bqr_2(this));
    }

    void k() {
        biI biI2 = this.e.bv();
        biI2.c(true);
        biI2.e("AnimResurection");
        FreeParticleSystem freeParticleSystem = aij_0.a().a(this.e.cc());
        freeParticleSystem.a(biI2);
        aik_0.a().b(freeParticleSystem);
    }

    public void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.g = byteBuffer.get() == 1;
    }
}

