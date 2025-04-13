/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  avP$avR
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.io.FilenameFilter;
import org.apache.log4j.Logger;

/*
 * Renamed from avP
 */
public abstract class avp_1<P extends ParticleSystem>
extends agp_2<byte[]> {
    private static final Logger a = Logger.getLogger(avp_1.class);
    public static final String b = ".xps";
    public static final int c = 1;
    public final FilenameFilter d = new avq_1(this);

    protected avp_1() {
        super(0x500000L, true);
    }

    public abstract P b(String var1);

    @Override
    public String c() {
        return b;
    }

    @Override
    public final FilenameFilter d() {
        return this.d;
    }

    protected String d(int n) {
        return this.e() + n + this.c();
    }

    protected void a(int n, int n2, ParticleSystem particleSystem) {
        String string = this.d(n);
        this.a(string, n2, particleSystem);
    }

    protected void a(String string, int n, ParticleSystem particleSystem) {
        long l;
        this.a(particleSystem, string);
        this.b(string, n, particleSystem);
        particleSystem.ah();
        try {
            l = 0xDD00DD0000000000L | particleSystem.A;
        }
        catch (Exception exception) {
            a.error((Object)("The name of a particle system must be a number" + exception));
            l = 0xDD00DD0000000000L | (long)auc_1.d(gi_0.k(string));
        }
        String string2 = gi_0.m(string) + "/" + particleSystem.A + ".tga";
        ayu_2 ayu_22 = ayu_2.a();
        ays_2 ays_22 = ayu_22.a(l);
        if (ays_22 == null) {
            azk_2 azk_22 = new azk_2(string2);
            ays_22 = ayu_22.a((aui_2)auj_1.a.a(), l, azk_22, false);
            azk_22.u();
        }
        particleSystem.a(ays_22);
    }

    protected void b(String string, int n, ParticleSystem particleSystem) {
        particleSystem.Q = string;
        particleSystem.B = Co.a((Object)gi_0.k(string), 0);
        avs_1.a(string, particleSystem, n);
    }

    protected void a(ParticleSystem particleSystem, String string) {
        long l;
        int n;
        int n2 = string.lastIndexOf(47);
        int n3 = n2 > (n = string.lastIndexOf(92)) ? n2 : n;
        int n4 = string.indexOf(46, n3);
        String string2 = string.substring(n3 + 1, n4);
        try {
            l = 0xDD00DD0000000000L | (long)Integer.parseInt(string2);
        }
        catch (Exception exception) {
            l = 0xDD00DD0000000000L | (long)auc_1.d(string2);
        }
        particleSystem.a(l);
    }

    public final void a(int n, ParticleSystem particleSystem) {
        try {
            particleSystem.ag().clear();
            Emitter[] emitterArray = particleSystem.ao();
            avs_1.a(particleSystem.Q, particleSystem, n);
            int n2 = emitterArray.length;
            for (int k = 0; k < n2; ++k) {
                awn_2 awn_22 = particleSystem.ag().get(k);
                emitterArray[k].a(awn_22);
            }
            particleSystem.ai();
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
    }

    protected final avR a(byte[] byArray) {
        return new avr_1(this, byArray);
    }

    protected /* synthetic */ ags_2 b(byte[] byArray) {
        return this.a(byArray);
    }
}

