/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cah
 */
final class cah_2
extends cap_2 {
    private static final String a = "getPosition";
    private static final String c = "Retourne les coordonn?es de la position de la cible de l'effet si elle existe, sinon retourne celles de la cellule cible";
    private static final akf_1[] d = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};

    cah_2(LuaState luaState, bbo_0 bbo_02) {
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
    public void a(int n) {
        aff_1 aff_12 = this.b.z();
        this.q(aff_12.d());
        this.q(aff_12.e());
        this.q(aff_12.f());
    }

    @Override
    public String b() {
        return c;
    }
}

