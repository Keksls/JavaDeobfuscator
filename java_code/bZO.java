/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class bZO
extends akr_1 {
    public static final bZO a = new bZO();
    private static final String d = "FightAction";
    private static final String e = "Librairie qui permet de manipuler les groupes d'actions";

    private bZO() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bZM(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public String a() {
        return d;
    }

    @Override
    public String b() {
        return e;
    }
}

