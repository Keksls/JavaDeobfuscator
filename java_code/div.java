/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class div
extends akk_2 {
    div(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "close";
    }

    @Override
    public String b() {
        return "Hide an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle a fermer", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        if (n2 < 0) {
            return;
        }
        div.b(n2);
    }

    static void b(int n) {
        if (dip.a().f(n) != null) {
            fpm_0.b().o("interactiveBubbleDialog" + n);
        } else {
            zd_0.a().c(n);
            dip.a().h(n);
        }
    }
}

