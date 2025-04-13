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
 * Renamed from cbc
 */
public final class cbc_2
extends akr_1 {
    private static final String d = "Video";
    private static final String e = "Fournit les fonctions li\u00e9es \u00e0 l'utilisation de la video dans le script LUA";
    public static final cbc_2 a = new cbc_2();

    private cbc_2() {
    }

    @Override
    @Nullable
    public String a() {
        return d;
    }

    @Override
    public String b() {
        return e;
    }

    @Override
    @Nullable
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new cba_2(luaState), new cax_2(luaState), new cay_2(luaState), new cbb_2(luaState)};
    }

    @Override
    @Nullable
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

