/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akE
extends akk_2 {
    private static final Logger a = Logger.getLogger(akE.class);

    public akE(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setWorldTarget";
    }

    @Override
    public String b() {
        return "permet de d?finir la position de la cam?ra";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("coordX", "Position x", akg_2.e, false), new akf_1("coordY", "Position y", akg_2.e, false), new akf_1("altitude", "Position z", akg_2.e, false), new akf_1("funcName", "Fonction a appeler lorsque la cam?ra est centr?", akg_2.c, true), new akf_1("funcParams", "Param?tres de la fonction a appeler", akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        float f2 = this.f(0);
        float f3 = this.f(1);
        float f4 = this.f(2);
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            abY abY2 = acb_02.b();
            abY2.a(new ahf_0(f2, f3, f4));
            if (n > 3) {
                akx_2 akx_22 = this.m();
                String string = this.i(3);
                akr_2[] akr_2Array = this.a(4, n);
                abY2.a(new akF(this, abY2, akx_22, string, akr_2Array));
            }
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

