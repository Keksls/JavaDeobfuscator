/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class CinematicsSelectorCommand
implements avt_0 {
    protected static cdx_1 a;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        CinematicsSelectorCommand.b();
    }

    public static void b() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null || emp_0.a(bai_02.v(), emp_0.b)) {
            return;
        }
        if (fpm_0.b().q("cinematicsSelectorDialog")) {
            fpm_0.b().o("cinematicsSelectorDialog");
            fpm_0.b().e("wakfu.cinematicsSelector");
            fis_1.a().a("cinematicsInfo");
        } else {
            if (a == null) {
                a = new cdx_1();
            }
            fis_1.a().a("cinematicsInfo", a);
            fpm_0.b().a("cinematicsSelectorDialog", cfi_0.a("cinematicsSelectorDialog"), 32769L, (short)30000);
            fpm_0.b().a("wakfu.cinematicsSelector", cGh.class);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public static cdx_1 c() {
        return a;
    }
}

