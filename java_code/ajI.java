/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class ajI
extends akr_1 {
    private static final ajI a = new ajI();
    private acb_0 d = null;

    public acb_0 d() {
        return this.d;
    }

    public void a(acb_0 acb_02) {
        this.d = acb_02;
    }

    protected ajI() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new akA(luaState), new akI(luaState), new akv(luaState), new akE(luaState), new akw(luaState), new akG(luaState), new akt(luaState), new akD(luaState), new akH(luaState), new akC(luaState), new akx(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public static ajI e() {
        return a;
    }

    @Override
    public final String a() {
        return "Camera";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

