/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import java.util.List;

public final class NextSelectedFighterCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!azu_0.j().c(cYW.a())) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        List<blx_1> list = this.a(bmr_12, bvx_22);
        if (list.isEmpty()) {
            return;
        }
        this.a(list);
        this.a(bmr_12, list);
    }

    private void a(bmr_1 bmr_12, List<blx_1> list) {
        epq_2 epq_22 = cYW.a().c();
        if (epq_22 == null || epq_22 == bmr_12) {
            this.a(list.get(0));
        } else {
            int n = list.indexOf(epq_22);
            if (n == list.size() - 1) {
                this.a((blx_1)null);
            } else {
                this.a(list.get(n + 1));
            }
        }
    }

    private void a(List<blx_1> list) {
        list.sort(new azc_0(this));
    }

    private List<blx_1> a(bmr_1 bmr_12, bvx_2 bvx_22) {
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>(bvx_22.a(enw_2.b(bmr_12.U_())));
        arrayList.remove(bmr_12);
        return arrayList;
    }

    private void a(blx_1 blx_12) {
        cYW.a().a(blx_12);
        cYW.a().d();
    }

    @Override
    public boolean a() {
        return false;
    }
}

