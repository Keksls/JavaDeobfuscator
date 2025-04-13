/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.wakfu.client.alea.graphics.particle.WakfuFreeParticleSystem;
import java.io.FileNotFoundException;

public class aPj
extends aij_0 {
    public WakfuFreeParticleSystem b(String string, int n) {
        WakfuFreeParticleSystem wakfuFreeParticleSystem = new WakfuFreeParticleSystem(false);
        try {
            this.a(string, n, (ParticleSystem)wakfuFreeParticleSystem);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error((Object)("FICHIER APS MANQUANT : " + string));
        }
        catch (Exception exception) {
            a.warn((Object)"Error during particle creation : ", (Throwable)exception);
        }
        return wakfuFreeParticleSystem;
    }

    @Override
    public boolean c(int n) {
        if (n == -1) {
            return true;
        }
        return aPc.f().a(n);
    }

    @Override
    public /* synthetic */ FreeParticleSystem a(String string, int n) {
        return this.b(string, n);
    }
}

