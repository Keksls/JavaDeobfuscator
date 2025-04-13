/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.keplerproject.luajava.LuaState;

public final class alU
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("partName", null, akg_2.c, false), new akf_1("red", "0 to 255", akg_2.d, false), new akf_1("green", "0 to 255", akg_2.d, false), new akf_1("blue", "0 to 255", akg_2.d, false), new akf_1("alpha", "0 to 255", akg_2.d, false)};

    public alU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPartColorByte";
    }

    @Override
    public String b() {
        return "Set the color of a part of the mobile";
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
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        String string = this.i(1);
        int n2 = Anm.b(string);
        if (n2 == 0) {
            this.a(this.r_(), "partName invalid " + string);
            return;
        }
        float f2 = (float)this.d(2) / 255.0f;
        float f3 = (float)this.d(3) / 255.0f;
        float f4 = (float)this.d(4) / 255.0f;
        float f5 = (float)this.d(5) / 255.0f;
        abu2.a(n2, new float[]{f2, f3, f4, f5});
    }
}

