/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amR
extends akk_2 {
    private static final Logger a = Logger.getLogger(amR.class);

    public amR(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPictoColor";
    }

    @Override
    public String b() {
        return "Modifie la couleur d'un picto dans le monde selon ces coordonn?es (en faisant un fondu)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false), new akf_1("z", null, akg_2.d, false), new akf_1("r", null, akg_2.e, false), new akf_1("g", null, akg_2.e, false), new akf_1("b", null, akg_2.e, false), new akf_1("alpha", null, akg_2.e, false), new akf_1("time", null, akg_2.d, true)};
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
        float f2 = this.f(3);
        float f3 = this.f(4);
        float f4 = this.f(5);
        float f5 = this.f(6);
        if (n == 8) {
            acz.a().a(l, f2, f3, f4, f5, (float)this.d(7));
        } else {
            acz.a().a(l, f2, f3, f4, f5);
        }
    }
}

