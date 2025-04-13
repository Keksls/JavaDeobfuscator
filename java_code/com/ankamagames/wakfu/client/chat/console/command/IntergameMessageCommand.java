/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
package com.ankamagames.wakfu.client.chat.console.command;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntergameMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.m, arrayList.get(2));
        String string = arrayList.get(2).replaceAll("\"", "");
        String string2 = arrayList.get(3);
        if (string.contains("<")) {
            aUh.a("error.chat.privateFieldEmpty", new Object[0]);
            return;
        }
        if (!azu_0.j().z().b()) {
            aUh.a("error.chat.inter.connection", new Object[0]);
            return;
        }
        Optional<String> optional = IntergameMessageCommand.a(string);
        if (optional.isEmpty()) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null) {
            x_0 x_02 = v_0.h();
            x_02.a(bmr_12.U_());
            x_02.b(string2);
            x_02.a(optional.get());
            azu_0.j().z().a((MessageLite)x_02.i());
        }
    }

    private static Optional<String> a(String string) {
        String[] stringArray = string.split("#");
        if (stringArray.length == 1) {
            return IntergameMessageCommand.b(stringArray[0]);
        }
        if (stringArray.length == 2) {
            return IntergameMessageCommand.a(stringArray[0], stringArray[1]);
        }
        return Optional.empty();
    }

    private static Optional<String> b(String string) {
        List<String> list = aUS.a.b(string);
        if (list.isEmpty()) {
            aUh.a("error.chat.inter.unknown.recipient", new Object[]{string});
            return Optional.empty();
        }
        if (list.size() > 1) {
            aUh.a("error.chat.inter.multiple.recipient", new Object[]{string});
            return Optional.empty();
        }
        return Optional.of(list.get(0));
    }

    private static Optional<String> a(String string, String string2) {
        Optional<String> optional = aUS.a.b(string, string2);
        if (optional.isPresent()) {
            return optional;
        }
        String string3 = aUS.a(string, string2);
        aUh.a("error.chat.inter.unknown.recipient", new Object[]{string3});
        return Optional.empty();
    }

    @Override
    public boolean a() {
        return false;
    }
}

