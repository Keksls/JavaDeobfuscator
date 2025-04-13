/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fwF
 */
public class fwf_0 {
    private static final Logger a = Logger.getLogger(fwf_0.class);
    private final HashMap<fjg_1, XulorParticleSystem> b = new HashMap();

    @Nullable
    public XulorParticleSystem a(fjg_1 fjg_12) {
        String string = fjg_12.s();
        if (string == null) {
            return null;
        }
        XulorParticleSystem xulorParticleSystem = this.b.get(fjg_12);
        if (xulorParticleSystem != null) {
            return xulorParticleSystem;
        }
        return this.a(fjg_12, string);
    }

    @Nullable
    private XulorParticleSystem a(fjg_1 fjg_12, String string) {
        XulorParticleSystem xulorParticleSystem = fdp_2.a().a(string);
        if (xulorParticleSystem == null) {
            return null;
        }
        fdq_2.a.a(xulorParticleSystem);
        this.b.put(fjg_12, xulorParticleSystem);
        xulorParticleSystem.k_();
        return xulorParticleSystem;
    }

    public void a(fwh_0 fwh_02) {
        int n = fwh_02.a();
        for (int k = 0; k < n; ++k) {
            XulorParticleSystem xulorParticleSystem;
            fjg_1 fjg_12 = fwh_02.a(k);
            if (fjg_12.s() == null || (xulorParticleSystem = this.b.remove(fjg_12)) == null) continue;
            xulorParticleSystem.u();
        }
    }

    public void a() {
        for (XulorParticleSystem xulorParticleSystem : this.b.values()) {
            xulorParticleSystem.u();
        }
        this.b.clear();
    }
}

