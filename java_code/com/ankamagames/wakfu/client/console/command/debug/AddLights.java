/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AddLights
implements avt_0 {
    private static final Logger b = Logger.getLogger(AddLights.class);
    final ArrayList<adS> a = new ArrayList();

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() != 3) {
            if (this.a.size() != 0) {
                for (int k = 0; k < this.a.size(); ++k) {
                    aed.a.d(this.a.get(k).d());
                }
                this.a.clear();
            }
            return;
        }
        try {
            int n = Integer.valueOf(arrayList.get(2));
            aff_1 aff_12 = azu_0.j().k().P_();
            for (int k = 0; k < n; ++k) {
                azi_0 azi_02 = new azi_0(new ahf_0(aff_12.d(), aff_12.e(), aff_12.f()), Hw.a(-0.5f, 0.5f), Hw.a(-0.5f, 0.5f));
                azi_02.c(Hw.a(0.3f, 0.8f), Hw.a(0.3f, 0.8f), Hw.a(0.3f, 0.8f));
                azi_02.b(true);
                azi_02.a(3.0f);
                this.a.add(azi_02);
                aed.a.a(azi_02);
            }
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

