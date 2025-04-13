/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akw
extends akk_2 {
    private static final Logger a = Logger.getLogger(akw.class);

    public akw(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getZoomFactor";
    }

    @Override
    public String b() {
        return "R?cup?re le niveau de zoom actuel de la cam?ra";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("zoomValue", "le niveau de zoom actuel de la cam?ra, entre 0.9 et 1.9", akg_2.e, false)};
    }

    @Override
    public void a(int n) {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            float f2 = acb_02.B();
            this.a(f2);
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
            this.l();
        }
    }
}

