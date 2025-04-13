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
 * Renamed from amq
 */
public class amq_0
extends ans_2<amr_0> {
    private static final Logger b = Logger.getLogger(amq_0.class);
    public static final String a = "playLocalSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("rollOff", null, akg_2.d, false), new akf_1("soundFileId", null, akg_2.b, false), new akf_1("gain", null, akg_2.b, false), new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false), new akf_1("minPitch", null, akg_2.e, true), new akf_1("maxPitch", null, akg_2.e, true)};

    public amq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected amr_0 b(int n) {
        int n2 = this.d(0);
        long l = this.g(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        int n5 = this.d(4);
        int n6 = this.d(5);
        if (n < 8) {
            return new amr_0(n2, l, n3, n4, n5, n6);
        }
        float f2 = this.f(6);
        float f3 = this.f(7);
        return new amr_0(n2, l, n3, n4, n5, n6, f2, f3);
    }

    @Override
    protected void a(amr_0 amr_02, akx_2 akx_22) {
        try {
            if (amr_02.b() > 0L) {
                aki_0.h().a(amr_02.b(), (float)amr_02.e() / 100.0f, amr_02.i(), 1, -1L, -1L, -1, new alz_1(amr_02.f(), amr_02.g(), amr_02.h(), false, 0), amr_02.a());
            } else {
                b.warn((Object)"Pas de son sp\u00e9cifi\u00e9 (ID<=0)");
            }
        }
        catch (Exception exception) {
            this.a(b, "soundExtension or soundPath not initialized");
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

