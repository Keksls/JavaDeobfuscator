/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZI
 */
public final class bzi_0
extends akr_1 {
    private final baw a;

    public bzi_0(baw baw2) {
        this.a = baw2;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bZL(luaState, this.a), new bzk_0(luaState, this.a), new bzj_0(luaState, this.a)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "EffectArea";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

