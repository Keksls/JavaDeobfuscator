/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diH
extends akk_2 {
    diH(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "show";
    }

    @Override
    public String b() {
        return "Display an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle a afficher", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ckt_2 ckt_22 = dip.a().e(this.d(0));
        if (ckt_22 != null) {
            ckt_22.c();
            return;
        }
        fvy fvy2 = dip.a().g(this.d(0));
        fvy2.setBubbleIsVisible(true);
    }
}

