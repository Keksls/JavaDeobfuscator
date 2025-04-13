/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diF
extends akk_2 {
    diF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setShakingMode";
    }

    @Override
    public String b() {
        return "Specify to WakfuBubble to shake";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", null, akg_2.d, false), new akf_1("enable", null, akg_2.f, true)};
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
        fvy fvy2 = dip.a().g(n2);
        if (fvy2 != null) {
            boolean bl = true;
            if (n > 1) {
                bl = this.l(1);
            }
            fvy2.setShakingBubble(bl);
        }
    }
}

