/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public class CloseCombatCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(CloseCombatCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.get(2).length() >= 1) {
            byte by;
            exk_2 exk_23;
            Object object;
            blx_1 blx_12 = azu_0.j().l();
            if (blx_12 == null) {
                return;
            }
            bOw bOw2 = blx_12.cg();
            fib fib2 = null;
            if (bOw2.b() == fid.c) {
                return;
            }
            switch (arrayList.get(2).charAt(0)) {
                case 'l': {
                    fib2 = bOw2.A();
                    break;
                }
                case 'r': {
                    fib2 = bOw2.B();
                    break;
                }
            }
            if (fib2.aT_() == 2145) {
                object = eyo_1.g().d(2145);
                exk_2 exk_24 = new exk_2(-1L);
                exk_24.b((ezr_0)object);
                exk_24.a((short)1);
                exk_23 = exk_24;
                by = 15;
            } else {
                object = blx_12.dC().b(fib2.a());
                by = ((Optional)object).map(exk_22 -> {
                    exh_2 exh_22 = blx_12.cG().a(exk_22.a());
                    return exh_22 != null ? (byte)exh_22.a() : (byte)-1;
                }).orElse((byte)-1);
                exk_23 = ((Optional)object).orElse(null);
            }
            if (exk_23 == null) {
                a.error((Object)("impossible de retrouver l'item d'id " + fib2.a() + " suppos\u00e9 plac\u00e9 dans les mains du personnage"));
                return;
            }
            if (!exk_23.aU_()) {
                return;
            }
            if (by < 0) {
                return;
            }
            object = new dgm_0();
            ((dgm_0)object).a(exk_23, by);
            ((anw_1)object).a_(18450);
            add_2.b().a((adt_1)object);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

