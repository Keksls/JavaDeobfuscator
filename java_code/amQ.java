/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amQ
extends akk_2 {
    private static final Logger a = Logger.getLogger(amQ.class);

    public amQ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPictoAlpha";
    }

    @Override
    public String b() {
        return "Modifie l'alpha d'un picto dans le monde selon ces coordonn?es (en faisant un fondu)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false), new akf_1("z", null, akg_2.d, false), new akf_1("alpha", null, akg_2.d, false), new akf_1("time", null, akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        long l = aii_0.a(n2, n3, n4);
        int n5 = this.d(3);
        if (n == 5) {
            acz.a().a(l, 1.0f, 1.0f, 1.0f, (float)n5, (float)this.d(4));
        } else {
            acz.a().a(l, 1.0f, 1.0f, 1.0f, (float)n5);
        }
    }
}

