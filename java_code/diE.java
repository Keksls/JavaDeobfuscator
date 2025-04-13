/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class diE
extends akk_2 {
    private static final Logger a = Logger.getLogger(diE.class);

    diE(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setScreenPosition";
    }

    @Override
    public String b() {
        return "D?place une bulle de dialogue";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("align", "Alignement de la bulle", akg_2.c, false), new akf_1("screenXoffset", "D?calage en pixel vers la droite", akg_2.d, false), new akf_1("screenYoffset", "D?calage en pixel vers le haut", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        ckt_2 ckt_22 = dip.a().e(n2);
        if (ckt_22 != null) {
            frk_0 frk_02 = frk_0.valueOf(this.i(1));
            int n3 = this.d(2);
            int n4 = this.d(3);
            fid_1 fid_12 = new fid_1();
            fid_12.onCheckOut();
            fid_12.setAlign(frk_02);
            fid_12.setXOffset(n3);
            fid_12.setYOffset(n4);
            ckt_22.add(fid_12);
        }
        a.info((Object)("SetScreenPosition " + ckt_22));
    }
}

