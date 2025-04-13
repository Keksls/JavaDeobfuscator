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
 * Renamed from anD
 */
public class and_1
extends ano_2<ani_1<anj_1>> {
    public static final String c = "playRandomSound";
    private static final akf_1[] d = new akf_1[]{new akf_1("stopOnAnimationChange", null, akg_2.f, false), new akf_1("soundId, gain", null, akg_2.h, true)};

    public and_1(abu abu2, LuaState luaState, Logger logger) {
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

    protected ani_1<anj_1> b(int n) {
        boolean bl = this.l(0);
        List<anj_1> list = this.a(1, n, false);
        return new ani_1<anj_1>(bl, list);
    }

    @Override
    public void a(ani_1<anj_1> ani_12, akx_2 akx_22) {
        anj_1 anj_12 = this.a(ani_12.c());
        long l = anj_12.a();
        int n = (int)anj_12.j();
        if (!this.a.A().a(l)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (!amU.a().a(l2, l)) {
            return;
        }
        amU.a().b(l2, l);
        try {
            if (l != 0L) {
                amk_1 amk_12 = aki_0.h().a(l, (float)n / 100.0f, anj_12.i(), 1, -1L, -1L, akx_22.o());
                if (ani_12.b() && amk_12 != null) {
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

