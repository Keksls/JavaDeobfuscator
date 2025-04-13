/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from amf
 */
public class amf_0
extends akk_2 {
    private static final String a = "clearParticleSystemOnMobile";
    private static final akf_1[] b = new akf_1[]{new akf_1("mobileId", "L'Id unique du mobile", akg_2.b, false)};

    public amf_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "D?truit les syst?mes de particules attach?s ? un mobile";
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
        long l = this.g(0);
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null) {
            return;
        }
        aik_0.a().a(afv2);
    }
}

