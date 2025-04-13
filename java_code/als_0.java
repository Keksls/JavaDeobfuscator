/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from als
 */
public final class als_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("listener", "Listener to remove", akg_2.a, false)};

    public als_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeOnPathEndedListener";
    }

    @Override
    public String b() {
        return "Remove a PathListener of the mobile";
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
        afv afv2 = this.a_(l);
        if (!(afv2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            return;
        }
        Object object = this.h(1);
        if (!(object instanceof afy_0)) {
            this.a(this.r_(), "Listener is not a MobileEndPathListener " + object);
            return;
        }
        afe_0 afe_02 = (afe_0)afv2;
        afe_02.c((afy_0)object);
    }
}

