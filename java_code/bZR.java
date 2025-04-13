/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class bZR
extends akr_1 {
    private static final String a = "WakfuScriptedAction";
    private static final String d = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions de Wakfu";
    private final akx_1 e;

    public bZR(akx_1 akx_12) {
        this.e = akx_12;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bZP(luaState, this.e), new bzq_0(luaState, this.e)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return d;
    }
}

