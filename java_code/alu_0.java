/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alu
 */
public final class alu_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("carrierId", null, akg_2.b, false), new akf_1("carriedId", null, akg_2.b, true)};

    public alu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setCarriedMobile";
    }

    @Override
    public String b() {
        return "Set the carried mobile of the mobile. Use only carrierId to remove the carried mobile.";
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
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        if (n > 1) {
            if (afv2.aG()) {
                this.a(this.r_(), "Mobile " + l + " is already carrying");
                return;
            }
            long l2 = this.g(1);
            afv afv3 = this.a_(l2);
            if (afv3 == null || afv3.e()) {
                this.a(this.r_(), "Mobile " + l + " doesn't exist or is already carried");
                return;
            }
            afv2.c(afv3);
        } else {
            if (!afv2.aG()) {
                this.a(this.r_(), "Mobile " + l + " doesn't carry anything");
                return;
            }
            afv2.aH();
        }
    }
}

