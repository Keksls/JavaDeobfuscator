/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class bZt
extends akr_1 {
    private static final String a = "Cast";
    private static final String d = "Permet de r?cup?rer des informations li?es aux actions de Cast en combat (utilisation de sort ou d'arme)";
    private final bal_0 e;

    public bZt(bal_0 bal_02) {
        this.e = bal_02;
    }

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return d;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bZu(luaState, this.e), new bZv(luaState, this.e), new bZw(luaState, this.e), new bZy(luaState, this.e), new bZz(luaState, this.e), new bZA(luaState, this.e), new bZB(luaState, this.e), new bZC(luaState, this.e), new bzd_0(luaState, this.e), new bZE(luaState, this.e), new bZF(luaState, this.e), new bzg_0(luaState, this.e), new bZH(luaState, this.e)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

