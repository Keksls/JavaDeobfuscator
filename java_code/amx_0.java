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
 * Renamed from amx
 */
public class amx_0
extends anr_2<List<anj_1>> {
    private static final Logger b = Logger.getLogger(amA.class);
    public static final String a = "playRandomSound";
    private static final akf_1[] c = new akf_1[]{new akf_1("soundId, gain", null, akg_2.h, true)};

    public amx_0(LuaState luaState) {
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

    protected List<anj_1> b(int n) {
        return this.a(0, n, false);
    }

    @Override
    protected void a(List<anj_1> list, akx_2 akx_22) {
        anj_1 anj_12 = this.a(list);
        try {
            if (anj_12.a() != 0L) {
                aki_0.h().a(anj_12.a(), anj_12.j() / 100.0f, 1, -1L, -1L, akx_22.o());
            } else {
                b.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(b, "soundExtension or soundPath not initialized " + exception);
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

