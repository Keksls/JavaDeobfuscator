/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akM
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("equipmentFileId", null, akg_2.e, false)};

    public akM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "applyEquipment";
    }

    @Override
    public String b() {
        return "Apply equipment parts from a file to a mobile";
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
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        int n2 = this.d(1);
        afv2.h(n2);
    }
}

