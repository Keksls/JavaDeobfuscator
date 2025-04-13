/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akA
extends akk_2 {
    private static final Logger a = Logger.getLogger(akA.class);

    public akA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String b() {
        return "Positionne la cam?ra sur un point";
    }

    @Override
    public String a() {
        return "setCamera";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("zoomFactor", "Niveau de zoom d?sir? (entre 0.9 et 1.9)", akg_2.e, false), new akf_1("x", "Position x d?sir?e", akg_2.e, false), new akf_1("y", "Position y d?sir?e", akg_2.e, false), new akf_1("z", "Position z d?sir?e", akg_2.e, false), new akf_1("funcName", "Fonction a appeler lorsque la cam?ra est centr? sur le point", akg_2.c, true), new akf_1("funcParams", "Param?tres de la fonction a appeler", akg_2.h, true)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        float f2 = (float)this.e(0);
        float f3 = (float)this.e(1);
        float f4 = (float)this.e(2);
        float f5 = (float)this.e(3);
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            abY abY2 = acb_02.b();
            abY2.a(new ahf_0(f3, f4, f5));
            abY2.a(f2);
            if (n > 4) {
                akx_2 akx_22 = this.m();
                String string = this.i(4);
                akr_2[] akr_2Array = this.a(5, n);
                abY2.a(new akB(this, abY2, akx_22, string, akr_2Array));
            }
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

