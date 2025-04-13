/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diA
extends akk_2 {
    diA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeOnClose";
    }

    @Override
    public String b() {
        return "DO NOT USE";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", null, akg_2.d, false)};
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
        ckt_2 ckt_22 = dip.a().e(n2);
        if (ckt_22 != null) {
            int n3 = ("interactiveBubbleDialog" + n2).hashCode();
            dip.a().b(n3);
        } else {
            dip.a().c(n2);
        }
    }
}

