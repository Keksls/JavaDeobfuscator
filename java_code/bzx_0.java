/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZX
 */
final class bzx_0
extends cap_2 {
    private static final String a = "getBearerPosition";
    private static final String c = "Retourne les coordonn?es de la position du porteur de l'effet (le propri?taire du manager d'effet dans lequel est stock? l'effet)";
    private static final akf_1[] d = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};

    bzx_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        aff_1 aff_12 = this.b.H();
        if (aff_12 == null) {
            return;
        }
        this.q(aff_12.d());
        this.q(aff_12.e());
        this.q(aff_12.f());
    }

    @Override
    public String b() {
        return c;
    }
}

