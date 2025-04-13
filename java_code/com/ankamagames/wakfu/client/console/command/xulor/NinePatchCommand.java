/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class NinePatchCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        NinePatchCommand.b();
    }

    public static void b() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 != null && emp_0.a(bai_02.v(), emp_0.b)) {
            return;
        }
        if (fpm_0.b().q("ninePatchDialog")) {
            fpm_0.b().o("ninePatchDialog");
            fpm_0.b().e("wakfu.ninePatch");
            fis_1.a().a("ninePatch");
        } else {
            fpm_0.b().a("ninePatchDialog", cfi_0.a("ninePatchDialog"), 32769L, (short)30000);
            fpm_0.b().a("wakfu.ninePatch", cie_0.class);
            fis_1.a().a("ninePatch", new cdy_1());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

