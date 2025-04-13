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
 * Renamed from dku
 */
class dku_0
extends akk_2 {
    dku_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeLandMarkNote";
    }

    @Override
    public String b() {
        return "Retire une note personnelle";
    }

    @Override
    public akf_1[] e() {
        return dir_0.l;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        if (!bup_0.a().a(n2)) {
            dir_0.a.warn((Object)("Tentative de suppression d'un landmark d'id " + n2 + " non trouv?."));
        }
    }
}

