/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXv
extends akk_2 {
    public bXv(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getKeyTranslation";
    }

    @Override
    public String b() {
        return "Return the translated text based on parameters";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("translationKeyName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("string return", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        String string;
        String string2 = this.i(0);
        Oy oy = Oy.d();
        Object[] objectArray = new String[n - 1];
        for (int k = 0; k < objectArray.length; ++k) {
            String string3 = this.k(k + 1);
            objectArray[k] = string3;
        }
        if (oy.d(string2) && !(string = oy.a(string2, objectArray)).isEmpty()) {
            this.a(string);
            return;
        }
        this.l();
    }
}

