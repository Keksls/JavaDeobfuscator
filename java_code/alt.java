/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.keplerproject.luajava.LuaState;

public final class alt
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("partName", null, akg_2.c, false)};

    public alt(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removePartColor";
    }

    @Override
    public String b() {
        return "Remove the color on a part of the mobile";
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
        String string = this.i(1);
        int n2 = Anm.b(string);
        if (n2 == 0) {
            this.a(this.r_(), "partName invalid " + string);
            return;
        }
        abu2.an().g(n2);
    }
}

