/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLB
 */
public class alb_1
extends akr_1 {
    private static final String a = "ScriptedAction";
    private static final String d = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions";
    private final akx_1 e;

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return d;
    }

    public alb_1(akx_1 akx_12) {
        this.e = akx_12;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new alx_2(luaState, this.e), new als_2(luaState, this.e), new alv_2(luaState, this.e), new alu_2(luaState, this.e), new aly_2(luaState, this.e), new ala_1(luaState, this.e), new alz_2(luaState, this.e), new alw_2(luaState, this.e), new alt_2(luaState, this.e)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

