/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class bZw
extends bZs {
    private static final Logger b = Logger.getLogger(bZw.class);
    private static final String c = "getCasterInformation";
    private static final String d = "Permet de r?cup?rer un objet contenant des informations sur le lanceur";
    private static final akf_1[] g = new akf_1[]{new akf_1("casterInfo", null, akg_2.a, false)};

    bZw(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return g;
    }

    @Override
    public String b() {
        return d;
    }

    @Override
    public void a(int n) {
        blx_1 blx_12 = this.a.d(this.a.f());
        if (blx_12 != null) {
            bZx bZx2;
            switch (blx_12.gY()) {
                case 2: {
                    bZx2 = new bZx(blx_12.Z_(), blx_12.W(), blx_12.gd(), blx_12.gX(), blx_12.gY(), 0);
                    break;
                }
                case 0: {
                    bZx2 = new bZx(blx_12.Z_(), blx_12.W(), blx_12.gd(), blx_12.gX(), blx_12.gY(), 0);
                    break;
                }
                case 1: 
                case 5: {
                    bZx2 = new bZx(blx_12.Z_(), blx_12.W(), blx_12.gd(), blx_12.gX(), blx_12.gY(), ((bmv_1)blx_12).cI());
                    break;
                }
                default: {
                    bZx2 = null;
                }
            }
            if (bZx2 != null) {
                this.a(bZx2);
            } else {
                b.error((Object)"pas de caster");
                this.l();
            }
        }
    }
}

