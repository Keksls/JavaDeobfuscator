/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class AutoCompleteContactCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        fug_0 fug_02 = AutoCompleteContactCommand.b();
        String string = fug_02.getText();
        if (string == null || string.isEmpty()) {
            return;
        }
        int n = fug_02.getTextBuilder().k().u();
        boolean bl = AutoCompleteContactCommand.a(fug_02, n, string);
        if (!bl && n != -1) {
            AutoCompleteContactCommand.a(fug_02, string, n);
        }
    }

    private static boolean a(fug_0 fug_02, int n, String string) {
        String string2;
        if (!aul_0.a().b().j().a(string, (byte)127)) {
            return false;
        }
        int n2 = string.indexOf(32);
        if (n2 == -1 || n2 >= string.length()) {
            return true;
        }
        String string3 = string.substring(n2 + 1);
        int n3 = string3.lastIndexOf(34) + 1;
        if (string3.indexOf(34) == -1 || string3.indexOf(34) == n3) {
            n3 = string3.indexOf(32);
        }
        if (n3 == -1) {
            n3 = string3.length();
        }
        if (n - (string.length() - string3.length()) > n3) {
            return false;
        }
        string3 = string3.substring(0, n3);
        String string4 = string3.replaceAll("\"", "");
        if ((string4 = string4.trim()).isEmpty()) {
            return true;
        }
        avs_0 avs_02 = avs_0.a();
        if (avs_02.c() == null || !avs_02.c(string4)) {
            avs_02.a(string4);
        }
        fug_02.c(string.replaceFirst(string3, (String)((string2 = avs_02.b()).equalsIgnoreCase(avs_02.c()) ? string2 : "\"" + string2 + "\"")));
        fyc_0.a().c(fug_02);
        return true;
    }

    private static void a(fug_0 fug_02, String string, int n) {
        int n2;
        String string2;
        int n3 = string.indexOf(32, n);
        if (n3 == -1) {
            n3 = string.length();
        }
        if ((string2 = string.substring(n2 = string.substring(0, n).lastIndexOf(32) + 1, n3)).isEmpty()) {
            return;
        }
        boolean bl = false;
        if (string2.charAt(0) == '\"') {
            ++n2;
            string2 = string2.substring(1);
            bl = true;
            if (string2.isEmpty()) {
                return;
            }
        }
        if (string2.charAt(string2.length() - 1) == '\"') {
            --n3;
            string2 = string2.substring(0, string2.length() - 1);
            bl = false;
            if (string2.isEmpty()) {
                return;
            }
        }
        if ((string2 = string2.trim()).isEmpty()) {
            return;
        }
        avs_0 avs_02 = avs_0.a();
        if (avs_02.c() == null || !avs_02.c(string2)) {
            avs_02.a(string2);
        }
        String string3 = avs_02.b();
        abo_2<fxH, fxF> abo_22 = fug_02.getTextBuilder().b(0, 0);
        fxH fxH2 = abo_22.a();
        if (fxH2 == null) {
            return;
        }
        fug_02.getTextBuilder().a(fxH2.h(), n2);
        fug_02.getTextBuilder().b(fxH2.h(), n3);
        fug_02.getTextBuilder().d((String)(bl ? string3 + "\"" : string3));
    }

    private static fug_0 b() {
        fvE fvE2 = fyc_0.a().b();
        if (fvE2 instanceof fug_0) {
            return (fug_0)fvE2;
        }
        int n = aUxx.a().f().a();
        String string = dey.a(n);
        return (fug_0)fpm_0.b().h().d(string).a("textEditorRenderableContainer.chatInput");
    }

    @Override
    public boolean a() {
        return false;
    }
}

