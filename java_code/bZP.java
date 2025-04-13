/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bZP
extends akk_2 {
    private static final int a = emd_1.d.a();
    private static final String b = "executeSpellCost";
    private static final String c = "Execute les effets de type ActionCost pr?sents dans le groupe d'actions";
    private final akx_1 d;

    public bZP(LuaState luaState, akx_1 akx_12) {
        super(luaState);
        this.d = akx_12;
    }

    @Override
    public final String a() {
        return b;
    }

    @Override
    public final akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("actionExists", null, akg_2.f, false)};
    }

    @Override
    public final void a(int n) {
        boolean bl = false;
        aku_1[] aku_1Array = new aku_1[this.d.a().size()];
        this.d.a().toArray(aku_1Array);
        for (aku_1 aku_12 : aku_1Array) {
            int n2;
            if (aku_12.d() != a || (n2 = aku_12.e()) != efc_0.a.a()) continue;
            this.d.a(aku_12, false);
            bl = true;
        }
        this.a(bl);
    }

    @Override
    public String b() {
        return c;
    }
}

