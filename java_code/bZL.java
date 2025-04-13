/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class bZL
extends akk_2 {
    private static final String a = "getTarget";
    private static final String b = "Permet de r?cup?rer l'id du personnage qui a activ? la zone";
    private static final akf_1[] c = new akf_1[]{new akf_1("targetId", null, akg_2.b, false)};
    private final baw d;

    bZL(LuaState luaState, baw baw2) {
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
        this.b(this.d.h());
    }

    @Override
    public String b() {
        return b;
    }
}

