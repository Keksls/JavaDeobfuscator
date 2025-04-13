/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akH
extends akk_2 {
    private static final Logger a = Logger.getLogger(akH.class);

    public akH(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setZoomSpeedFactor";
    }

    @Override
    public String b() {
        return "D?finit la vitesse ? laquelle une modification de zoom s'applique";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("speed", "Float d?finissant la vitesse ? laquelle le zoom se modifie par rapport ? la vitesse de base", akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            acb_02.b().d((float)this.e(0));
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

