/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajO
extends akk_2 {
    ajO(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createHeatPostProcess";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", null, akg_2.e, true), new akf_1("midDuration", null, akg_2.e, true), new akf_1("endDuration", null, akg_2.e, true), new akf_1("strength", null, akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        float f2 = 1000.0f;
        float f3 = 2000.0f;
        float f4 = 1000.0f;
        float f5 = 1.0f;
        if (n >= 1) {
            f2 = (float)this.e(0);
        }
        if (n >= 2) {
            f3 = (float)this.e(1);
        }
        if (n >= 3) {
            f4 = (float)this.e(2);
        }
        if (n == 4) {
            f5 = (float)this.e(3);
        }
        this.q(aup_1.A);
        throw new UnsupportedOperationException("TODO: post process Heat");
    }
}

