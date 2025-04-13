/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amd
 */
public class amd_0
extends amc_0 {
    private static final Logger a = Logger.getLogger(amd_0.class);
    private static final String b = "addParticleSystemToTargetWithOffset";
    private static final akf_1[] c = new akf_1[]{new akf_1("particleFileId", null, akg_2.d, false), new akf_1("targetId", null, akg_2.b, false), new akf_1("level", null, akg_2.d, false), new akf_1("height", null, akg_2.d, true)};

    public amd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, abu abu2, int n) {
        int n2 = n == 4 ? this.d(3) : abu2.ag();
        freeParticleSystem.a(abu2, 0.0f, n2);
        this.a(freeParticleSystem);
    }
}

