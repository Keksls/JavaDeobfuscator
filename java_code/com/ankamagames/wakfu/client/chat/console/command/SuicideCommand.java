/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public final class SuicideCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null || bmr_12.ak()) {
            return;
        }
        if (bmr_12.ab_()) {
            return;
        }
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.a()) {
            aUh.a("action.error.notInBattleground", new Object[0]);
            return;
        }
        if (cct_12 != null && eoe_0.k.contains(cct_12.a)) {
            aUh.a("error.tutorial.suicide.forbidden", new Object[0]);
            return;
        }
        if (bmr_12.bv().bb() != null) {
            bmr_12.bv().aW();
        }
        clm_0 clm_02 = new clm_0();
        azu_0.j().K().c(clm_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

