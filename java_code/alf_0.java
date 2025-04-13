/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alf
 */
public final class alf_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("deltaZ", "The value is added to the current deltaZ (can be negative)", akg_2.d, false)};

    public alf_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "incrementMobileDeltaZ";
    }

    @Override
    public String b() {
        return "Add or Subtract the value to the mobile current deltaZ. Two mobiles on the same cell will be filtered based on their deltaZ. The highest deltaZ will be at the front";
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
    protected void a(int n) {
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        int n2 = this.d(1);
        abu2.g(abu2.y() + n2);
    }
}

