/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from bwq
 */
public final class bwq_1 {
    final ctt_2 a;

    public bwq_1(ctt_2 ctt_22) {
        this.a = ctt_22;
    }

    public void a() {
        blx_1 blx_12;
        bwh_0 bwh_02 = bwj_1.a().a(this.a.d());
        if (!(bwh_02 instanceof bvw_2)) {
            return;
        }
        bvw_2 bvw_22 = (bvw_2)bwh_02;
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            return;
        }
        if (bmr_12.f(erl_2.ak)) {
            return;
        }
        byn_1 byn_12 = bmr_12.dE();
        if (!byn_12.d()) {
            return;
        }
        eQb eQb2 = byn_12.a();
        Iterator<blx_1> iterator = bvw_22.j().iterator();
        while (!(!iterator.hasNext() || eQb2.f((blx_12 = iterator.next()).a_()) && this.a(bvw_22, blx_12))) {
        }
    }

    private boolean a(bvw_2 bvw_22, blx_1 blx_12) {
        bwq_0 bwq_02 = bwo_1.b(bvw_22, blx_12);
        if (bwq_02.ah_() != ema_1.a) {
            aUh.c("party.notice.partyMemberJoinIFight.error", blx_12.dp());
            return false;
        }
        if (bwq_02.d()) {
            this.a(bvw_22);
            return true;
        }
        if (((bvx_0)ans_0.D().h()).a(bWe.ar)) {
            ema_1 ema_12 = bwq_02.ag_();
            if (ema_12 == ema_1.a) {
                aUh.c("fight.autojoin.confirm", new Object[0]);
                return true;
            }
            bQG.a();
            bQG.a(ema_12.a(), blx_12);
        } else {
            byte by = bvw_22.af_().a();
            Object object = bae.h().a("party.question.joinPartyMemberInFight", String.format("<b>%s</b>", blx_12.dp()), by);
            cTR cTR2 = new cTR();
            cTR2.a(blx_12);
            String string = cTR2.h();
            if (string != null) {
                object = (String)object + "\n" + string;
            }
            cTR2 = null;
            fzm_0 fzm_02 = fpm_0.b().a((String)object, cfn_0.a(5), 2073L, 102, 1);
            bvw_22.b(fzm_02);
            fzm_02.a(new bwr_1(this, bvw_22, fzm_02, bwq_02, blx_12));
        }
        return true;
    }

    private void a(bvw_2 bvw_22) {
        Collection<blx_1> collection = bvw_22.j();
        for (blx_1 blx_12 : collection) {
            bmv_1 bmv_12;
            bMn bMn2;
            if (blx_12.gY() != 1 || !(blx_12 instanceof bmv_1) || (bMn2 = (bmv_12 = (bmv_1)blx_12).cB()) == null) continue;
            cqk_0 cqk_02 = new cqk_0(bMn2.B());
            azu_0.j().K().c(cqk_02);
            return;
        }
    }
}

