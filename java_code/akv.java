/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class akv
extends akk_2 {
    private static final Logger a = Logger.getLogger(akv.class);

    public akv(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getWorldTarget";
    }

    @Override
    public String b() {
        return "Permet de r?cup?rer la position actuelle de la cam?ra";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("posX", "Position x", akg_2.e, false), new akf_1("posY", "Position y", akg_2.e, false), new akf_1("posZ", "Position z", akg_2.e, false)};
    }

    @Override
    public void a(int n) {
        acb_0 acb_02 = ajI.e().d();
        if (acb_02 != null) {
            abY abY2 = acb_02.b();
            this.a(abY2.e_());
            this.a(abY2.f_());
            this.a(abY2.A());
        } else {
            this.a(a, "Pas de scene associ? ? CameraFunctionsLibrary");
            this.l();
            this.l();
            this.l();
        }
    }
}

