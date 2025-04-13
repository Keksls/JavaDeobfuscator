/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amH
extends ans_2<anj_1> {
    private static final Logger b = Logger.getLogger(amH.class);
    public static final String a = "stopSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundUID", "UID du fichier son", akg_2.b, false)};

    public amH(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return a;
    }

    @Override
    public String b() {
        return "Stoppe un son au sein du monde.";
    }

    @Override
    public final akf_1[] e() {
        return c;
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    protected anj_1 b(int n) {
        long l = this.g(0);
        return new anj_1(l);
    }

    @Override
    protected void a(anj_1 anj_12, akx_2 akx_22) {
        amj_1 amj_12 = aml_1.a().b(anj_12.a());
        aki_0.h().a(anj_12.a(), amj_12);
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

