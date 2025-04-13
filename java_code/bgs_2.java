/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bgS
 */
class bgs_2
implements bho_2 {
    bgs_2() {
    }

    @Override
    public void a(bhn_2 bhn_22) {
        abz_0 abz_02 = bhn_22.q();
        if (abz_02 == null) {
            return;
        }
        ekk_0 ekk_02 = bhn_22.r();
        abz_02.g("AnimStatique");
        abz_02.a(new bgt_2(this, abz_02, ekk_02));
        dfu_0 dfu_02 = new dfu_0(ekk_02);
        dfu_02.a_(17998);
        dfu_02.a(true);
        add_2.b().a(dfu_02);
    }

    protected String a(ekk_0 ekk_02) {
        se_0 se_02;
        ani_2 ani_22 = new ani_2();
        if (ekk_02.v() != null) {
            ani_22.a((CharSequence)"[").a((CharSequence)((faU)((Object)ekk_02.v())).dp()).a((CharSequence)"] ");
        }
        ani_22.a((CharSequence)bae.h().a(6, (long)((int)ekk_02.A()), new Object[0]));
        eps_0 eps_02 = eps_0.b;
        String string = "hp.var";
        if (ekk_02.w() == ele_0.j.a()) {
            eps_02 = eps_0.M;
            string = "remaining.turns";
        } else if (ekk_02.w() == ele_0.o.a()) {
            eps_02 = bob_2.f;
            string = "hp.var.barrel";
        } else if (ekk_02.w() == ele_0.c.a()) {
            eps_02 = ekf_0.as();
            string = "hp.var.beacon";
        }
        if (ekk_02.a(eps_02)) {
            ani_22.a((CharSequence)" (");
            ani_22.a((CharSequence)bae.h().a(string, ekk_02.c(eps_02)));
            ani_22.a((CharSequence)")");
        }
        if ((se_02 = ekk_02.x_()) != null) {
            ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
            for (sd_0 sd_02 : se_02) {
                if (!(sd_02 instanceof efh_0)) continue;
                arrayList.add((efh_0)((Object)sd_02));
            }
            if (!se_02.h()) {
                ArrayList<String> arrayList2 = eDi.a(new eDr(arrayList, (int)ekk_02.A(), 0, true, eDk.b, 0));
                int n = arrayList2.size();
                for (int k = 0; k < n; ++k) {
                    ani_22.m().a((CharSequence)arrayList2.get(k));
                }
            }
        }
        return ani_22.r();
    }
}

