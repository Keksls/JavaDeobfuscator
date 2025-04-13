/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZJ
 */
final class bzj_0
extends akk_2 {
    private static final String a = "getAreaId";
    private static final String b = "Permet de r?cup?rer l'id de la zone associ?e de l'action";
    private static final akf_1[] c = new akf_1[]{new akf_1("areaId", null, akg_2.b, false)};
    private final baw d;

    bzj_0(LuaState luaState, baw baw2) {
        super(luaState);
        this.d = baw2;
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
        return c;
    }

    @Override
    public void a(int n) {
        this.b(this.d.f());
    }

    @Override
    public String b() {
        return b;
    }
}

