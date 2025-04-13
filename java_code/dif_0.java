/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dif
 */
public class dif_0
extends akr_1 {
    private static final dif_0 a = new dif_0();

    private dif_0() {
    }

    public static dif_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "Pixmap";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new dig_0(luaState)};
    }
}

