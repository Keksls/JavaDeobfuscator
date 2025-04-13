/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aNa
 */
public final class ana_2
extends amq_2 {
    protected static final Logger d = Logger.getLogger(ana_2.class);
    private boolean e;
    private boolean f;

    @Override
    public void d() {
        this.e = true;
    }

    @Override
    public void f() {
        this.f = true;
    }

    @Override
    public void g() {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j() {
        return this.e;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m() {
        return this.f;
    }

    @Override
    public void a(aqv_2 aqv_22) {
        ArrayList<aqx_2> arrayList;
        aqx_2 aqx_22 = aqv_22.c("aliases");
        if (aqx_22 != null && (arrayList = aqx_22.e("alias")) != null) {
            for (aqx_2 aqx_23 : arrayList) {
                aqx_2 aqx_24 = aqx_23.f("name");
                aqx_2 aqx_25 = aqx_23.f("hostname");
                if (aqx_24 != null && aqx_25 != null) {
                    afp_1.a(aqx_25.c(), aqx_24.c());
                    continue;
                }
                d.error((Object)"Parametre <name> et/ou <hostname> manquant");
            }
        }
    }
}

