/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amG
extends ans_2<Void> {
    private static final Logger b = Logger.getLogger(amG.class);
    public static final String a = "stopMusic";

    public amG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return "Stop une musique en cours de lecture";
    }

    @Override
    public akf_1[] e() {
        return null;
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
        this.a(b, "stop music not yet implemented");
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

