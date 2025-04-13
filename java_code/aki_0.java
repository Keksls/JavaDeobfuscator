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
 * Renamed from aki
 */
public class aki_0
extends akr_1 {
    protected static final Logger a = Logger.getLogger(aki_0.class);
    private static final aki_0 d = new aki_0();
    private akq_0 e;
    private akj_0 f;
    private ako_0 g = new akl_0();
    private akp_0 h = new akm_0();

    @Override
    public final String a() {
        return "Sound";
    }

    @Override
    public String b() {
        return "Main sound library";
    }

    private aki_0() {
    }

    public boolean d() {
        return this.e != null;
    }

    public void a(akq_0 akq_02) {
        this.e = akq_02;
    }

    public akj_0 e() {
        return this.f;
    }

    public void a(akj_0 akj_02) {
        this.f = akj_02;
    }

    public ako_0 f() {
        return this.g;
    }

    public void a(ako_0 ako_02) {
        this.g = ako_02;
    }

    public akp_0 g() {
        return this.h;
    }

    public void a(akp_0 akp_02) {
        this.h = akp_02;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new amA(luaState), new amD(luaState), new amC(luaState), new amj_0(luaState), new aml_0(luaState), new ams_0(luaState), new amG(luaState), new amx_0(luaState), new amz_0(luaState), new amy_0(luaState), new amn_0(luaState), new amt_0(luaState), new amw_0(luaState), new amv_0(luaState), new amq_0(luaState), new amH(luaState), new amp_0(luaState), new amF(luaState), new amo_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public static aki_0 h() {
        return d;
    }

    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2) {
        if (this.e != null) {
            return this.e.a(l, f2, n, l2, l3, n2);
        }
        a.debug((Object)"[Sound] Trying to play a sound but sound manager was not initialized");
        return null;
    }

    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2) {
        if (this.e != null) {
            return this.e.a(l, f2, f3, n, l2, l3, n2);
        }
        a.debug((Object)"[Sound] Trying to play a sound but sound manager was not initialized");
        return null;
    }

    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2, alo_1 alo_12, int n3) {
        return this.a(l, f2, n, l2, l3, n2, alo_12, n3, true);
    }

    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        if (this.e != null) {
            return this.e.a(l, f2, n, l2, l3, n2, alo_12, n3, bl);
        }
        a.debug((Object)"[Sound] Trying to play a sound but sound manager was not initialized");
        return null;
    }

    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, alo_1 alo_12, int n3) {
        return this.a(l, f2, f3, n, l2, l3, n2, alo_12, n3, true);
    }

    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        if (this.e != null) {
            return this.e.a(l, f2, f3, n, l2, l3, n2, alo_12, n3, bl);
        }
        a.debug((Object)"[Sound] Trying to play a sound but sound manager was not initialized");
        return null;
    }

    public void a(long l) {
        if (this.e != null) {
            this.e.a(l);
        }
        a.debug((Object)"[Sound] Trying to play a forced music but sound manager was not initialized");
    }

    public void a(long l, float f2) {
        if (this.e != null) {
            this.e.a(l, f2);
        }
        a.debug((Object)"[Sound] Trying to play a forced music but sound manager was not initialized");
    }

    public void b(long l) {
        if (this.e != null) {
            this.e.b(l);
        }
        a.debug((Object)"[Sound] Trying to play a fight music but sound manager was not initialized");
    }

    public void b(long l, float f2) {
        if (this.e != null) {
            this.e.b(l, f2);
        }
        a.debug((Object)"[Sound] Trying to play a fight music but sound manager was not initialized");
    }

    public void i() {
        if (this.e != null) {
            this.e.a();
        }
        a.debug((Object)"[Sound] Trying to stop a forced music but sound manager was not initialized");
    }

    public akr_0 a(byte by, byte by2) {
        if (this.e != null && this.g != null) {
            return this.g.a(by, by2);
        }
        return null;
    }

    public akr_0 a(int n, alo_1 alo_12, int n2) {
        if (this.e != null && this.f != null) {
            return this.f.a(alo_12, n, n2);
        }
        return null;
    }

    public amk_1 a(int n, int n2, float f2, alo_1 alo_12, int n3) {
        if (this.e != null && this.f != null) {
            akr_0 akr_02 = this.f.a(alo_12, n, n3);
            if (akr_02 == null) {
                a.debug((Object)"[Sound] No bark data found");
                return null;
            }
            return this.e.a(akr_02.a(), akr_02.b() * f2, 1, -1L, -1L, n2, alo_12, akr_02.e(), true);
        }
        a.debug((Object)"[Sound] Trying to play a bark sound but sound manager was not initialized");
        return null;
    }

    public void j() {
        if (this.e != null) {
            this.e.b();
        } else {
            a.debug((Object)"[Sound] Trying to reset linker mix but sound manager was not initialized");
        }
    }

    public void a(float f2, float f3) {
        if (this.e != null) {
            this.e.a(f2, f3);
        } else {
            a.debug((Object)"[Sound] Trying to set linker mix but sound manager was not initialized");
        }
    }

    public void a(long l, amj_1 amj_12) {
        this.e.a(l, amj_12);
    }
}

