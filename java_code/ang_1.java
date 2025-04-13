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
 * Renamed from anG
 */
public class ang_1
extends anp_2<anj_1> {
    public static final String c = "playSound";
    private static final akf_1[] d = new akf_1[]{new akf_1("soundFileId", null, akg_2.b, false), new akf_1("stopOnAnimationChange", null, akg_2.f, false), new akf_1("gainModification", null, akg_2.e, true), new akf_1("playCount", null, akg_2.e, true), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};

    public ang_1(abu abu2, LuaState luaState, Logger logger) {
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

    protected anj_1 b(int n) {
        long l = this.g(0);
        boolean bl = this.l(1);
        if (n < 3) {
            return new anj_1(bl, l);
        }
        int n2 = this.d(2);
        if (n < 4) {
            return new anj_1(bl, l, (float)n2);
        }
        int n3 = this.d(3);
        if (n < 6) {
            return new anj_1(bl, l, (float)n2, n3);
        }
        float f2 = this.f(4);
        float f3 = this.f(5);
        return new anj_1(bl, l, (float)n2, n3, f2, f3);
    }

    @Override
    public void a(anj_1 anj_12, akx_2 akx_22) {
        long l = anj_12.a();
        if (!this.a.A().a(l)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (!amU.a().a(l2, l)) {
            return;
        }
        amU.a().b(l2, l);
        boolean bl = anj_12.g();
        float f2 = anj_12.j();
        int n = anj_12.k();
        try {
            if (l != 0L) {
                amk_1 amk_12 = aki_0.h().a(l, f2 / 100.0f, anj_12.i(), n, -1L, -1L, akx_22.o());
                if (bl && amk_12 != null) {
                    this.a.a(l, amk_12.b());
                }
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

