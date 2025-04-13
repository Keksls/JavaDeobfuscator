/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amg
 */
public class amg_0
extends akk_2 {
    private static final String a = "removeParticleSystem";
    private static final akf_1[] b = new akf_1[]{new akf_1("particleUniqueId", "L'Id unique de l'APS", akg_2.d, false), new akf_1("stopEmittersToKill", "Si true, les emetteurs seront coup?s et le syst?me ne sera supprim? que lorsqu'il n'y a plus de particules vivantes. Si false, d?truit imm?diatement.", akg_2.f, true)};

    public amg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "D?truit un systeme de particule existant";
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        boolean bl = n >= 2 && this.l(1);
        aik_0.a().a(n2, bl);
    }
}

