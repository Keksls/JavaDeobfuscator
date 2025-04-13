/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class amS
extends akk_2 {
    private static final Logger a = Logger.getLogger(amS.class);

    public amS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPictoLayerAlpha";
    }

    @Override
    public String b() {
        return "Modifie l'alpha d'un layer de pictos dans le monde (en faisant un fondu)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("layer", null, akg_2.d, false), new akf_1("alpha", null, akg_2.d, false), new akf_1("time", null, akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        short s2 = (short)this.d(0);
        int n2 = this.d(1);
        if (n == 3) {
            acz.a().a(s2, 1.0f, 1.0f, 1.0f, (float)n2, (float)this.d(2));
        } else {
            acz.a().a(s2, 1.0f, 1.0f, 1.0f, (float)n2);
        }
    }
}

