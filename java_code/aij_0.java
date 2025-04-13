/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from aiJ
 */
public class aij_0
extends avp_1<IsoParticleSystem> {
    protected static final Logger a = Logger.getLogger(aij_0.class);
    private static aij_0 g = new aij_0();

    public static aij_0 a() {
        return g;
    }

    public static void a(aij_0 aij_02) {
        g = aij_02;
    }

    public final FreeParticleSystem a(int n) {
        return this.a(this.d(n));
    }

    public final FreeParticleSystem a(int n, int n2) {
        return this.a(this.d(n), n2);
    }

    public final FreeParticleSystem a(String string) {
        return this.a(string, 1);
    }

    public FreeParticleSystem a(String string, int n) {
        return this.a(string, n, false);
    }

    public FreeParticleSystem a(String string, int n, boolean bl) {
        FreeParticleSystem freeParticleSystem = new FreeParticleSystem(bl);
        try {
            this.a(string, n, (ParticleSystem)freeParticleSystem);
        }
        catch (Exception exception) {
            a.error((Object)("particle " + string), (Throwable)exception);
        }
        return freeParticleSystem;
    }

    public final CellParticleSystem b(int n) {
        return this.b(n, 1);
    }

    public CellParticleSystem b(int n, int n2) {
        try {
            CellParticleSystem cellParticleSystem = this.b();
            this.a(n, n2, (ParticleSystem)cellParticleSystem);
            if (cellParticleSystem.ae() != 0) {
                a.error((Object)("Le systeme de particule attach\u00e9 \u00e0 la cellule " + cellParticleSystem.e() + "/" + cellParticleSystem.f() + " poss\u00e8de une dur\u00e9e."));
            }
            return cellParticleSystem;
        }
        catch (Exception exception) {
            a.error((Object)("Impossible de charger le syst\u00e8me de particule : " + n + " " + this.d(n)), (Throwable)exception);
            return null;
        }
    }

    protected CellParticleSystem b() {
        return new CellParticleSystem(false);
    }

    public boolean c(int n) {
        return true;
    }

    @Override
    public /* synthetic */ ParticleSystem b(String string) {
        return this.a(string);
    }
}

