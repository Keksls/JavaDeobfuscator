/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caR
 */
public class car_2
extends anr_2<List<anj_1>> {
    public static final String a = "playRandomSound";
    private static final akf_1[] b = new akf_1[]{new akf_1("soundId, gain", null, akg_2.h, true)};
    private final cav_2 c;
    private final Logger d;

    public car_2(cav_2 cav_22, LuaState luaState, Logger logger) {
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

    protected List<anj_1> b(int n) {
        return this.a(0, n, false);
    }

    @Override
    protected void a(List<anj_1> list, akx_2 akx_22) {
        anj_1 anj_12 = this.a(list);
        long l = anj_12.a();
        int n = (int)anj_12.j();
        try {
            if (l != 0L) {
                amk_1 amk_12 = aki_0.h().a(l, (float)n / 100.0f, anj_12.i(), 1, -1L, -1L, -1);
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

