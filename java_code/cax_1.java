/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cax
 */
public class cax_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(cax_1.class);

    public cax_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getFighterId";
    }

    @Override
    public String b() {
        return "Return mobile ID if present on X Y or nil if no mobile is on";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("worldX", null, akg_2.d, false), new akf_1("worldY", null, akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.m().o();
        bwh_0 bwh_02 = bwj_1.a().a(n4);
        if (bwh_02 == null) {
            a.error((Object)("fight inconnu " + n4));
            this.l();
            return;
        }
        Collection collection = bwh_02.j();
        for (blx_1 blx_12 : collection) {
            if (blx_12.G() != n2 || blx_12.H() != n3) continue;
            this.b(blx_12.a_());
            return;
        }
        this.l();
    }
}

