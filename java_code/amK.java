/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class amK
extends akk_2 {
    public amK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removePictoAlpha";
    }

    @Override
    public String b() {
        return "Retire les modifications d'alpha d'un picto dans le monde selon ces coordonn\u00e9es";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false), new akf_1("z", null, akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        long l = aii_0.a(n2, n3, n4);
        acz.a().b(l);
    }
}

