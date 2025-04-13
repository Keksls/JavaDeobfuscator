/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYN
 */
public class byn_0
extends akr_1 {
    final bbs a;

    @Override
    public final String a() {
        return "MonsterAction";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public byn_0(bbs bbs2) {
        this.a = bbs2;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bYO(this, luaState), new bYP(this, luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

