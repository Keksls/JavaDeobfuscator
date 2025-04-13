/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akG
extends akk_2 {
    private static final Logger a = Logger.getLogger(akG.class);

    public akG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setZoomFactor";
    }

    @Override
    public String b() {
        return "D?fini le niveau de zoom de la cam?ra";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("zoomValue", "Float compris entre 0.9 et 1.9 indiquant le nouveau niveau de zoom de la cam?ra", akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        float f2 = this.f(0);
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            acb_02.i(f2);
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

