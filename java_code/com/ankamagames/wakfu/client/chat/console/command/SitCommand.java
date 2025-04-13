/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SitCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(SitCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!this.a(aZz2)) {
            return;
        }
        SitCommand.b();
    }

    public static void b() {
        Pw pw;
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() != 1) {
            return;
        }
        biI biI2 = azu_0.j().k().bv();
        aej_2 aej_22 = biI2.aC();
        aej_2 aej_23 = null;
        switch (aej_22) {
            case c: 
            case a: {
                aej_23 = aej_2.b;
                break;
            }
            case g: 
            case e: {
                aej_23 = aej_2.f;
            }
        }
        if (aej_23 != null) {
            pw = new clf_1(aej_23);
            azu_0.j().K().c(pw);
        }
        pw = new clj_0();
        azu_0.j().K().c(pw);
    }

    private boolean a(aZz aZz2) {
        bmr_1 bmr_12 = bzf_1.a();
        bhu bhu2 = bhA.a.a(aZz2);
        if (bmr_12 == null || bhu2 == null || !bht.i.b(bhu2.k())) {
            return false;
        }
        biI biI2 = bmr_12.bv();
        return biI2.bb() == null;
    }

    @Override
    public boolean a() {
        return false;
    }
}

