/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akD
extends akk_2 {
    private static final Logger a = Logger.getLogger(akD.class);

    public akD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setUserZoomLocked";
    }

    @Override
    public String b() {
        return "Emp?che l'utilisation de la molette pour zoomer";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("zoomLocked", "True pour bloquer, false sinon", akg_2.f, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 == null) {
            this.a(a, "pas de scene associ? ? CameraFunctionsLibrary");
            return;
        }
        abY abY2 = acb_02.b();
        if (abY2 == null) {
            this.a(a, "pas de camera associ? ? la scene");
            return;
        }
        abY2.b(this.l(0));
    }
}

