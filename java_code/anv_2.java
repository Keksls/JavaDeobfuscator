/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anv
 */
public class anv_2
extends anq_2<anh_1<anw_2>> {
    public static final String c = "playBark";
    private static final akf_1[] d = new akf_1[]{new akf_1("barkId", null, akg_2.d, false), new akf_1("gain", null, akg_2.d, true), new akf_1("breedId", null, akg_2.d, true)};

    public anv_2(abu abu2, LuaState luaState, Logger logger) {
        super(abu2, luaState, logger);
    }

    @Override
    public String a() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected anh_1<anw_2> b(int n) {
        int n2 = this.d(0);
        if (n < 2) {
            return new anh_1<anw_2>(new anw_2(n2));
        }
        int n3 = this.d(1);
        if (n < 3) {
            return new anh_1<anw_2>(new anw_2(n2), n3);
        }
        int n4 = this.d(2);
        return new anh_1<anw_2>(new anw_2(n2, n4), n3);
    }

    @Override
    public void a(anh_1<anw_2> anh_12, akx_2 akx_22) {
        int n = anh_12.h().a();
        int n2 = (int)anh_12.j();
        int n3 = anh_12.h().b();
        try {
            if (n != 0) {
                akr_0 akr_02 = aki_0.h().a(n, this.a, n3);
                if (akr_02 == null) {
                    this.b.debug((Object)"Impossible de trouver de BarkData ad\u00e9quat");
                    return;
                }
                this.a(akr_02, akx_22.o(), n2);
            } else {
                this.b.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.b.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

