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
 * Renamed from caU
 */
public class cau_2
extends ans_2<anj_1> {
    public static final String a = "playSound";
    private static final akf_1[] b = new akf_1[]{new akf_1("soundFileId", null, akg_2.b, false), new akf_1("gainModification", null, akg_2.e, true), new akf_1("playCount", null, akg_2.e, true), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};
    private final cav_2 c;
    private final Logger d;

    public cau_2(cav_2 cav_22, LuaState luaState, Logger logger) {
        super(luaState);
        this.c = cav_22;
        this.d = logger;
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected anj_1 b(int n) {
        long l = this.g(0);
        if (n < 2) {
            return new anj_1(l);
        }
        float f2 = this.f(1);
        if (n < 3) {
            return new anj_1(l, f2);
        }
        int n2 = this.d(2);
        if (n < 5) {
            return new anj_1(l, f2, n2);
        }
        float f3 = this.f(3);
        float f4 = this.f(4);
        return new anj_1(l, f2, n2, f3, f4);
    }

    @Override
    protected void a(anj_1 anj_12, akx_2 akx_22) {
        long l = anj_12.a();
        float f2 = anj_12.j();
        int n = anj_12.k();
        try {
            if (l != 0L) {
                amk_1 amk_12 = aki_0.h().a(l, f2 / 100.0f, anj_12.i(), n, -1L, -1L, -1);
                if (amk_12 != null) {
                    this.c.a(amk_12.b());
                }
            } else {
                this.d.debug((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.d.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

