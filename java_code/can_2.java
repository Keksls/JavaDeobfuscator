/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from can
 */
final class can_2
extends cap_2 {
    private static final String a = "rollEcaflipDice";
    private static final String c = "Joue les visuels associ?s ? un jet de d? Ecaflip";
    private static final akf_1[] d = new akf_1[]{new akf_1("diceValue", null, akg_2.e, false)};

    can_2(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        long l = this.b.h();
        blx_1 blx_12 = bmf_2.a().c(l);
        bny_2 bny_22 = bnz_2.a.a(blx_12.a_());
        if (bny_22 != null) {
            bny_22.a((byte)n2);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

