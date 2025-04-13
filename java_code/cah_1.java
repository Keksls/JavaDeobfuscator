/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caH
 */
public final class cah_1
extends akk_2 {
    public cah_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getTranslation";
    }

    @Override
    public String b() {
        return "Return the translation of a translation key";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("translationKey", null, akg_2.c, false), new akf_1("translationParams", null, akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("text", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        Object[] objectArray = new String[n - 1];
        for (int k = 1; k < n; ++k) {
            objectArray[k - 1] = this.i(k);
        }
        this.a(Oy.d().a(string, objectArray));
    }
}

