/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akC
extends akk_2 {
    private static final Logger a = Logger.getLogger(akC.class);

    public akC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMoveSpeedFactor";
    }

    @Override
    public String b() {
        return "D?finit la vitesse ? laquelle la camera se d?place par rapport ? la vitesse de base";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("speedFactor", "Vitesse de d?placement", akg_2.e, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            acb_02.b().e((float)this.e(0));
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

