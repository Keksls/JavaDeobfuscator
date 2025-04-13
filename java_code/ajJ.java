/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class ajJ
extends akr_1 {
    private static final ajJ a = new ajJ();
    private ahg_0 d;

    public static ajJ d() {
        return a;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new ajQ(luaState), new ajR(luaState), new ajP(luaState), new ajM(luaState), new ajL(luaState), new ajO(luaState), new ajK(luaState), new ajN(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public final void a(ahg_0 ahg_02) {
        this.d = ahg_02;
    }

    public ahg_0 e() {
        return this.d;
    }

    private ajJ() {
    }

    static ahq_0 f() {
        return ajJ.a.d.s();
    }

    @Override
    public final String a() {
        return "Effect";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static void a(int n, int n2, int n3, adf_0 adf_02, ahq_0 ahq_02) {
        adf_02.a(ahq_02);
        if (n2 == -1) {
            adf_02.a(new adK(n));
        } else {
            adf_02.a(new adO(n, n2, n3));
        }
    }
}

