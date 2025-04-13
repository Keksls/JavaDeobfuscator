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
 * Renamed from ama
 */
public class ama_0
extends alZ {
    private static final Logger a = Logger.getLogger(ama_0.class);
    private static final String b = "addParticleSystemToIe";
    private static final akf_1[] c = new akf_1[]{new akf_1("particleFileId", "Id du systeme", akg_2.d, false), new akf_1("targetId", "Id de l'element interactif", akg_2.b, false), new akf_1("level", "Niveau du systeme", akg_2.d, true)};

    public ama_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return "Ajoute un systeme de particule ? un element interactif";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    protected abu a(long l) {
        return ahs.d().b(l);
    }

    @Override
    protected void a(FreeParticleSystem freeParticleSystem, abu abu2, int n) {
        freeParticleSystem.a(abu2);
    }
}

