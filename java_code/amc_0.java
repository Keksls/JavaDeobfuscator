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
 * Renamed from amc
 */
public class amc_0
extends alZ {
    private static final Logger a = Logger.getLogger(amc_0.class);
    private static final String b = "addParticleSystemToTarget";
    private static final akf_1[] c = new akf_1[]{new akf_1("particleFileId", "Id du systeme", akg_2.d, false), new akf_1("targetId", "Id du mobile", akg_2.b, false), new akf_1("level", "Niveau du systeme", akg_2.d, true)};

    public amc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return "Ajoute un systeme de particule ? un mobile";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    protected abu a(long l) {
        afv afv2 = afz_0.d().b(l);
        if (afv2 != null) {
            return afv2;
        }
        return abe_0.d().b(l);
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, abu abu2, int n) {
        freeParticleSystem.a(abu2);
        this.a(freeParticleSystem);
    }
}

