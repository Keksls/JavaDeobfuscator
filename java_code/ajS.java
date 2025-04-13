/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class ajS
extends akr_1 {
    private static final ajS a = new ajS();

    private ajS() {
    }

    public static ajS d() {
        return a;
    }

    @Override
    public final String a() {
        return "Flying";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new ajT(luaState), new ajU(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

