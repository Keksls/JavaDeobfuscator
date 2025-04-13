/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 */
import org.keplerproject.luajava.LuaException;

/*
 * Renamed from caQ
 */
class caq_1
implements rv_0 {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ epa_1 c;
    final /* synthetic */ cap_1 d;

    caq_1(cap_1 cap_12, String string, boolean bl, epa_1 epa_12) {
        this.d = cap_12;
        this.a = string;
        this.b = bl;
        this.c = epa_12;
    }

    @Override
    public void a(rs_0 rs_02) {
        try {
            cap_1.a(this.d).d(this.a);
            if (this.b) {
                this.c.b(this);
            }
        }
        catch (LuaException luaException) {
            cap_1.a.error((Object)"Exception raised", (Throwable)luaException);
        }
    }
}

