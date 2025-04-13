/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akI
extends akk_2 {
    private static final Logger a = Logger.getLogger(akI.class);

    public akI(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String b() {
        return "Zoom sur un point pendant un certain temps puis revient ? sa position d'origine";
    }

    @Override
    public String a() {
        return "zoomOn";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("zoomFactor", "Niveau de zoom de la cam?ra (compris entre 0.9 et 1.9)", akg_2.e, false), new akf_1("time", "Temps au bout duquel la cam?ra devra revenir ? sa position d'origine", akg_2.d, false), new akf_1("x", "Position x", akg_2.e, false), new akf_1("y", "Position y", akg_2.e, false), new akf_1("z", "Position z", akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        float f2 = this.f(0);
        int n2 = this.d(1);
        float f3 = this.f(2);
        float f4 = this.f(3);
        float f5 = this.f(4);
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            abY abY2 = acb_02.b();
            ahh_0 ahh_02 = abY2.u();
            float f6 = ahh_02.J();
            float f7 = ahh_02.K();
            float f8 = ahh_02.L();
            float f9 = abY2.f();
            abY2.a(new ahf_0(f3, f4, f5));
            acb_02.i(f2);
            akx_2 akx_22 = this.m();
            if (ahh_02 instanceof afv) {
                long l = ((afv)ahh_02).a();
                akr_2[] akr_2Array = new akr_2[]{new akr_2(l)};
                akx_22.a(n2, 1, "Camera.attachCameraToMobile", akr_2Array);
                akr_2[] akr_2Array2 = new akr_2[]{new akr_2(Float.valueOf(f9))};
                akx_22.a(n2, 1, "Camera.setZoomFactor", akr_2Array2);
            } else {
                akr_2[] akr_2Array = new akr_2[]{new akr_2(Float.valueOf(f9)), new akr_2(Float.valueOf(f6)), new akr_2(Float.valueOf(f7)), new akr_2(Float.valueOf(f8))};
                akx_22.a(n2, 1, "Camera.setCamera", akr_2Array);
            }
        } else {
            this.a(a, "pas de camera associ?e ? CameraFunctionsLibrary");
        }
    }
}

