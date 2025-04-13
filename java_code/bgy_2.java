/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bgY
 */
class bgy_2
extends bgs_2 {
    bgy_2() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected String a(ekk_0 ekk_02) {
        Iterable<efh_0> iterable;
        ani_2 ani_22 = new ani_2();
        Su su = ekk_02.v();
        if (su instanceof epq_2) {
            ani_22.a((CharSequence)"[").a((CharSequence)((blx_1)su).dp()).a((CharSequence)"] ");
        }
        ani_22.a((CharSequence)bae.h().a(6, (long)((int)ekk_02.A()), new Object[0]));
        if (ekk_02 instanceof bgx_2) {
            iterable = (bgx_2)ekk_02;
            if (ekk_02.a(eps_0.b)) {
                ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("hp.var", ekk_02.c(eps_0.b))).a((CharSequence)")");
            }
            switch (((ekl_0)iterable).au()) {
                case 1: {
                    int n;
                    if (ekk_02.a(eps_0.c) && (n = ekk_02.c(eps_0.c)) > 0) {
                        ani_22.a((CharSequence)"\n . ").a((CharSequence)bae.h().a("xelors.dial.ap.var", n));
                    }
                    if (!ekk_02.a(eps_0.B) || (n = ekk_02.c(eps_0.B)) <= 0) break;
                    ani_22.a((CharSequence)"\n . ").a((CharSequence)bae.h().a("xelors.dial.init.var", n));
                    break;
                }
                case 4: {
                    ani_22.a((CharSequence)" (");
                    if (((ekk_0)iterable).d_(1467L)) {
                        ani_22.a((CharSequence)bae.h().a("microbot.is.activated", new Object[0]));
                    } else {
                        ani_22.a((CharSequence)bae.h().a("microbot.is.not.activated", new Object[0]));
                    }
                    ani_22.a(')');
                }
            }
        }
        if ((iterable = ekk_02.x_()) != null) {
            ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
            for (sd_0 sd_02 : iterable) {
                if (!(sd_02 instanceof efh_0)) continue;
                arrayList.add((efh_0)((Object)sd_02));
            }
            if (!((se_0)iterable).h()) {
                void var7_10;
                ArrayList<String> arrayList2 = eDi.a(new eDr(arrayList, (int)ekk_02.A(), 0, true, eDk.b, 0));
                boolean k = false;
                int n = arrayList2.size();
                while (var7_10 < n) {
                    ani_22.m().a((CharSequence)arrayList2.get((int)var7_10));
                    ++var7_10;
                }
            }
        }
        return ani_22.r();
    }
}

