/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor.property;

import java.util.ArrayList;

public class ValueCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2);
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.append(" = ");
        fit_1 fit_12 = fpm_0.b().h().a().f(string);
        if (fit_12 != null) {
            Object object = fit_12.f();
            if (object instanceof ajf_1) {
                this.a((ajf_1)object, stringBuilder);
            } else {
                this.a(object, stringBuilder);
            }
        }
        aVo.a().b(stringBuilder.toString());
    }

    @Override
    public boolean a() {
        return false;
    }

    private void a(Object object, StringBuilder stringBuilder) {
        if (object instanceof Object[]) {
            for (Object object2 : (Object[])object) {
                if (object2 instanceof ajf_1) {
                    this.a((ajf_1)object2, stringBuilder);
                } else {
                    stringBuilder.append(object2);
                }
                stringBuilder.append(',').append('\n');
            }
        } else {
            stringBuilder.append(object);
        }
    }

    private void a(ajf_1 ajf_12, StringBuilder stringBuilder) {
        String[] stringArray;
        for (String string : stringArray = ajf_12.d()) {
            stringBuilder.append('\n').append(string).append(" = ");
            this.a(ajf_12.b(string), stringBuilder);
        }
    }
}

