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
 * Renamed from caL
 */
public class cal_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(cal_1.class);

    public cal_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isCellBlockedByObstacle";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("worldX", null, akg_2.d, false), new akf_1("worldY", null, akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("cellBlockedByObstacle", null, akg_2.f, false)};
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        bwh_0 bwh_02 = bwj_1.a().a(this.m().o());
        if (bwh_02 == null) {
            this.a(a, "No fight found");
            this.l();
            return;
        }
        ti_0 ti_02 = bwh_02.g().g(n2, n3);
        this.a(ti_02 != null);
    }
}

