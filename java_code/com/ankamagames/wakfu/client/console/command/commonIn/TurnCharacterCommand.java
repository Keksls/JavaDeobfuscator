/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TurnCharacterCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(TurnCharacterCommand.class);
    private static final long b = 500L;
    private static long c = -1L;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aej_2 aej_22 = null;
        if (!arrayList.isEmpty()) {
            try {
                aej_22 = aej_2.a(Integer.parseInt(arrayList.get(2)));
            }
            catch (NumberFormatException numberFormatException) {
                a.error((Object)"Mauvais argument", (Throwable)numberFormatException);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)"Exception \u00e0 la r\u00e9cuperation de la direction", (Throwable)runtimeException);
            }
        }
        if (aej_22 == null) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() != 1) {
            return;
        }
        if (azu_0.j().c(cXC.a())) {
            return;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 != null) {
            if (!TurnCharacterCommand.c()) {
                return;
            }
            cgr_0.fightSetDirection(bvx_22, aej_22);
        } else {
            if (!TurnCharacterCommand.c()) {
                azu_0.j().k().e().a(aej_22);
                return;
            }
            azu_0.j().K().c(new clf_1(aej_22));
        }
        TurnCharacterCommand.b();
    }

    public static void b() {
        c = System.currentTimeMillis();
    }

    public static boolean c() {
        return System.currentTimeMillis() - c >= 500L;
    }

    @Override
    public boolean a() {
        return false;
    }
}

