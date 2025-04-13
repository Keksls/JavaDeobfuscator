/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class bZB
extends bZs {
    private static final String b = "getPosition";
    private static final String c = "Permet de r?cup?rer les coordonn?es de la cellule cibl?e par l'action";
    private static final akf_1[] d = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};

    bZB(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        this.q(this.a.t());
        this.q(this.a.u());
        this.q(this.a.v());
    }

    @Override
    public String b() {
        return c;
    }
}

