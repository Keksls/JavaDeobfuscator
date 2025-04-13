/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alv
 */
public final class alv_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animationName", null, akg_2.c, true), new akf_1("cellSpeed", "Time (ms) between two cells (see MovementSpeed.java)", akg_2.d, true)};

    public alv_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setCustomWalkStyle";
    }

    @Override
    public String b() {
        return "Change the walk style of the mobile (see MovementSpeed.java). Use only mobileId for reset the walk style";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (!(abu2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            return;
        }
        afe_0 afe_02 = (afe_0)abu2;
        if (n == 1) {
            afe_02.bd();
        } else {
            afe_02.a(true, afm_0.g);
            afl_0 afl_02 = (afl_0)afe_02.bk();
            afl_02.a(this.i(1));
            if (n == 3) {
                afl_02.a(this.d(2));
            }
        }
    }
}

