/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aMY
 */
public final class amy_2
extends amq_2 {
    private final ArrayList<abp_2<String, String, adh_1>> d = new ArrayList();
    private boolean e;
    private boolean f;

    @Override
    public void d() {
        this.e = true;
        for (abp_2<String, String, adh_1> abp_22 : this.d) {
            adh_1 adh_12 = (adh_1)ams_2.d(abp_22.b());
            if (adh_12 != null) {
                abp_22.c(adh_12);
                continue;
            }
            c.error((Object)("Classe d'EventsStorage introuvable : " + abp_22.b()));
            this.e = false;
            return;
        }
    }

    @Override
    public void f() {
        for (abp_2<String, String, adh_1> abp_22 : this.d) {
            adh_1 adh_12 = abp_22.c();
            adh_12.a(abp_22.a());
            adb_1.a().a(adh_12);
        }
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
        ArrayList<aqx_2> arrayList = aqv_22.d("logger");
        if (arrayList != null) {
            for (aqx_2 aqx_22 : arrayList) {
                aqx_2 aqx_23 = aqx_22.f("name");
                ArrayList<aqx_2> arrayList2 = aqx_22.d("storage");
                if (arrayList2 != null) {
                    for (aqx_2 aqx_24 : arrayList2) {
                        aqx_2 aqx_25 = aqx_24.f("location");
                        aqx_2 aqx_26 = aqx_24.f("class");
                        if (aqx_25 != null && aqx_26 != null) {
                            this.d.add(new abp_2<String, String, Object>(aqx_25.c(), aqx_26.c(), null));
                            continue;
                        }
                        c.error((Object)"Un ou plusieurs parametres manquants pour l'event");
                    }
                    continue;
                }
                c.error((Object)("Pas de storage d\u00e9finit pour ce logger : " + aqx_23.c()));
            }
        }
    }
}

