/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajK
extends akk_2 {
    ajK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createBloomPostProcess";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", null, akg_2.e, true), new akf_1("midDuration", null, akg_2.e, true), new akf_1("endDuration", null, akg_2.e, true), new akf_1("minValue", null, akg_2.e, true), new akf_1("red", null, akg_2.e, true), new akf_1("green", null, akg_2.e, true), new akf_1("blue", null, akg_2.e, true), new akf_1("alpha", null, akg_2.e, true), new akf_1("blurX", null, akg_2.e, true), new akf_1("blurY", null, akg_2.e, true)};
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
        float f5 = 0.7f;
        float f6 = 0.3f;
        float f7 = 0.3f;
        float f8 = 0.3f;
        float f9 = 1.0f;
        int n2 = 16;
        int n3 = 16;
        if (n >= 1) {
            f2 = (float)this.e(0);
        }
        if (n >= 2) {
            f3 = (float)this.e(1);
        }
        if (n >= 3) {
            f4 = (float)this.e(2);
        }
        if (n >= 4) {
            f5 = (float)this.e(3);
        }
        if (n >= 5) {
            f6 = (float)this.e(4);
        }
        if (n >= 6) {
            f7 = (float)this.e(5);
        }
        if (n >= 7) {
            f8 = (float)this.e(6);
        }
        if (n >= 8) {
            f9 = (float)this.e(7);
        }
        if (n >= 9) {
            n2 = this.d(8);
        }
        if (n == 10) {
            n3 = this.d(9);
        }
        this.q(aup_1.z);
        throw new UnsupportedOperationException("TODO: post process Bloom");
    }
}

