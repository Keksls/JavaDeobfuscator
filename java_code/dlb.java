/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dlb
extends akk_2 {
    dlb(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "systemMessage";
    }

    @Override
    public String b() {
        return "Affiche un message admin NON LOCALIS? sur l'?cran";
    }

    @Override
    public akf_1[] e() {
        return dir_0.q;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        int n2 = n >= 2 ? this.d(1) : 5000;
        dlx.a().a(new dlw(dly.b, string, n2));
    }
}

