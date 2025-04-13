/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dka
 */
class dka_0
extends akk_2 {
    dka_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "loadGuideDialog";
    }

    @Override
    public String b() {
        return "Affiche une popup de guide";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bd;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)("Not enough args for LoadGuideMessageDialog : " + n));
            return;
        }
        dfc dfc2 = new dfc(19004);
        dfc2.b(this.d(0));
        add_2.b().a(dfc2);
    }
}

