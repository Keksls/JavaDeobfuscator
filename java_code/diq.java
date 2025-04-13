/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class diq
extends akr_1 {
    private static final diq a = new diq();

    private diq() {
        fpm_0.b().a(new dis());
        zd_0.a().a(new dir());
    }

    public static diq d() {
        return a;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new dil_0(luaState), new dix(luaState), new diy(luaState), new diG(luaState), new diu(luaState), new diD(luaState), new dik(luaState), new dil(luaState), new diI(luaState), new diH(luaState), new div(luaState), new diw(luaState), new diE(luaState), new din(luaState), new diz(luaState), new diB(luaState), new diA(luaState), new diF(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public void e() {
        dip.a().b();
    }

    @Override
    public final String a() {
        return "BubbleText";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

