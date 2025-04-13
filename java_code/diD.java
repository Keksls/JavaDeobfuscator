/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diD
extends akk_2 {
    diD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setOffset";
    }

    @Override
    public String b() {
        return "Change the offsets of an InteractiveBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("x", "Decalage en pixel vers la droite", akg_2.d, false), new akf_1("y", "Decalage en pixel vers le haut", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ckt_2 ckt_22 = dip.a().e(this.d(0));
        if (ckt_22 != null) {
            ckt_22.setOffset(this.d(1), this.d(2));
        }
    }
}

