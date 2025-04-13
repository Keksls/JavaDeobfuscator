/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXu
extends akk_2 {
    public bXu(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getContentTranslation";
    }

    @Override
    public String b() {
        return "Return the translated text based on parameters";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("translationTypeId", null, akg_2.d, false), new akf_1("translationLinkedId", null, akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("string return", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        String string;
        int n2 = this.d(0);
        int n3 = this.d(1);
        bae bae2 = bae.h();
        if (bae2.a(n2, (long)n3) && !(string = bae2.a(n2, (long)n3, new Object[0])).isEmpty()) {
            this.a(string);
            return;
        }
        this.l();
    }
}

