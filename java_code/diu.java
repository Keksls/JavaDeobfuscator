/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class diu
extends akk_2 {
    diu(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "changeToLayer";
    }

    @Override
    public String b() {
        return "Change the layer of an InteractiveBubble";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("bubbleId", "Id de la bulle", akg_2.d, false), new akf_1("layerValue", "valeur du layer (cf LayeredContainer)", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ckt_2 ckt_22 = dip.a().e(this.d(0));
        if (ckt_22 != null) {
            fta_0.getInstance().getLayeredContainer().removeWidget(ckt_22);
            ckt_22.setModalLevel((short)Short.MAX_VALUE);
            fta_0.getInstance().getLayeredContainer().a(ckt_22, this.d(1));
        }
    }
}

