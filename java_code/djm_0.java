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
 * Renamed from djm
 */
class djm_0
extends akk_2 {
    djm_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "characterDisplayerChangeLinkage";
    }

    @Override
    public String b() {
        return "Change l'animation d'un perso dans une interface";
    }

    @Override
    public akf_1[] e() {
        return dir_0.H;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        String string = this.i(1);
        String string2 = dir_0.a(n2);
        String string3 = string.substring(2);
        int n3 = Integer.parseInt(string.substring(0, 1));
        fis_1.a().a("animName", (Object)string3, string2);
        fis_1.a().a("direction", (Object)n3, string2);
    }
}

