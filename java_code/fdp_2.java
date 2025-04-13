/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from fDP
 */
public class fdp_2
extends avp_1<XulorParticleSystem> {
    private static final fdp_2 a = new fdp_2();
    private static final Logger g = Logger.getLogger(fdp_2.class);

    public static fdp_2 a() {
        return a;
    }

    public final XulorParticleSystem a(String string) {
        return this.a(string, 1);
    }

    public XulorParticleSystem a(String string, int n) {
        XulorParticleSystem xulorParticleSystem = new XulorParticleSystem();
        try {
            this.a(string, n, (ParticleSystem)xulorParticleSystem);
        }
        catch (Exception exception) {
            g.error((Object)("erreur de cr\u00e9ation de particule " + string), (Throwable)exception);
            return null;
        }
        return xulorParticleSystem;
    }

    @Override
    public /* synthetic */ ParticleSystem b(String string) {
        return this.a(string);
    }
}

