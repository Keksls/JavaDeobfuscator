/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZG
 */
final class bzg_0
extends bZs {
    private static final String b = "isCritical";
    private static final String c = "Permet de r?cup?rer savoir si l'action a d?clench? un coup critique";
    private static final akf_1[] d = new akf_1[]{new akf_1("criticalHit", null, akg_2.f, false)};

    bzg_0(LuaState luaState, bal_0 bal_02) {
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
    public akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        this.a(this.a.r());
    }

    @Override
    public String b() {
        return c;
    }
}

