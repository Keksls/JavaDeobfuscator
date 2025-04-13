/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class ThemeInfoCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        ThemeInfoCommand.b();
    }

    public static void b() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null || emp_0.a(bai_02.v(), emp_0.b)) {
            return;
        }
        if (fpm_0.b().q("themeInfoDialog")) {
            fpm_0.b().o("themeInfoDialog");
            fpm_0.b().e("wakfu.themeInfo");
            fis_1.a().a("themeInfo");
            fis_1.a().a("themeListFilter");
        } else {
            boolean bl = azs_0.a().a("useXmlTheme", false);
            Function<String, Stream<String>> function = bl ? string -> fpm_0.b().g().b((String)string) : string -> fpm_0.b().g().a().b((String)string);
            fis_1.a().a("themeInfo", new cdz_1(function));
            fwm fwm2 = new fwm();
            fwm2.a(string -> {
                cdz_1 cdz_12 = (cdz_1)fis_1.a().f("themeInfo").f();
                fis_1.a().a((ajf_1)cdz_12, cdz_1.a);
            });
            fis_1.a().a("themeListFilter", fwm2);
            fpm_0.b().a("themeInfoDialog", cfi_0.a("themeInfoDialog"), 32769L, (short)30000);
            fpm_0.b().a("wakfu.themeInfo", cJS.class);
            fis_1.a().a("colorPickerValue", (Object)azf_2.z, "themeInfoDialog");
            fis_1.a().a("colorPickerPreview", (Object)azf_2.z, "themeInfoDialog");
            fis_1.a().a("colorPickerHexPreview", (Object)azf_2.z.w().toUpperCase(), "themeInfoDialog");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

