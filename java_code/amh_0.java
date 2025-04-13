/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amh
 */
public class amh_0
extends akk_2 {
    private static final Logger a = Logger.getLogger(amh_0.class);
    private static final String b = "setRemoveWhenFar";
    private static final akf_1[] c = new akf_1[]{new akf_1("id", "Id du systeme", akg_2.d, false), new akf_1("removeWhenFar", "Supprime la particule quand elle est trop loin ?", akg_2.f, false)};
    private static final akf_1[] d = null;

    public amh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return "si removeWhenFar=false, la particule ne sera pas supprim?e automatiquement quand on s'?loigne\n!!! ATTENTION!!! Penser ? la supprimer quand elle n'est plus utilis?e !!! ";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public final akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        IsoParticleSystem isoParticleSystem = aik_0.a().a(n2);
        if (isoParticleSystem == null) {
            this.a(a, "pas de system d'id " + n2);
            return;
        }
        isoParticleSystem.a(this.l(1));
    }
}

