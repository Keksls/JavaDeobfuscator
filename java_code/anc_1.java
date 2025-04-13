/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anC
 */
public class anc_1
extends anq_2<anh_1<String>> {
    public static final String c = "playMountSound";
    private static final akf_1[] d = new akf_1[]{new akf_1("soundType", null, akg_2.c, false)};

    public anc_1(abu abu2, LuaState luaState, Logger logger) {
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

    protected anh_1<String> b(int n) {
        String string = this.i(0);
        return new anh_1<String>(string);
    }

    @Override
    public void a(anh_1<String> anh_12, akx_2 akx_22) {
        String string = anh_12.h();
        Byte by = this.a.bv();
        Integer n = this.a.bw();
        if (by == null || n == null) {
            this.b.error((Object)("playMountSound call while AnimatedObject has no mount info " + this.a));
            return;
        }
        akp_0 akp_02 = aki_0.h().g();
        akr_0 akr_02 = akp_02.a(by, n, string);
        long l = akr_02.a();
        try {
            if (l == 0L) {
                this.b.error((Object)("Null sound ID for mountType " + by + " and mountSkinId " + n));
                return;
            }
            Optional<amk_1> optional = this.a(akr_02, akx_22.o());
            optional.ifPresent(amk_12 -> this.a.a(l, amk_12.b()));
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

