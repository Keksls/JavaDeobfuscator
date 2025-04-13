/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class amF
extends ans_2<Void> {
    public static final String a = "stopForcedMusic";
    private static final akf_1[] b = new akf_1[0];

    public amF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Ne force plus la musique courante";
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    protected Void b(int n) {
        return null;
    }

    @Override
    protected void a(Void void_, akx_2 akx_22) {
        aki_0.h().i();
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

