/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.display;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class HideFightOccluders
implements avt_0 {
    private static final Logger d = Logger.getLogger(HideFightOccluders.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static int e = 0;
    private static float f;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        e = (e + 1) % 3;
        HideFightOccluders.a(e);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.s, e);
    }

    @Override
    public boolean a() {
        return false;
    }

    public static int a(float f2) {
        return f2 == 0.0f ? 2 : (f2 == 1.0f ? 0 : 1);
    }

    private static int b(int n) {
        switch (n) {
            case 0: {
                return 50;
            }
            case 1: 
            case 2: {
                return 1000;
            }
        }
        d.error((Object)("state inconnu " + n));
        return 0;
    }

    public static void a(int n) {
        HideFightOccluders.a(n, 0.4f);
    }

    public static void a(int n, float f2) {
        HideFightOccluders.a(n, f2, HideFightOccluders.b(n));
    }

    public static void a(int n, float f2, int n2) {
        Object object;
        Object object2;
        boolean bl = n != 0;
        f = f2;
        e = n;
        switch (n) {
            case 0: {
                break;
            }
            case 1: {
                acz.a().a(f);
                break;
            }
            case 2: {
                acz.a().a(0.0f);
                break;
            }
            default: {
                d.error((Object)("state inconnu " + n));
            }
        }
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return;
        }
        acz.a().a(bl, n2);
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        bvx_22.p().a(f2);
        tg_0 tg_02 = bvx_22.g();
        if (tg_02 == null) {
            return;
        }
        int n3 = tg_02.z();
        int n4 = tg_02.A();
        short s2 = tg_02.m();
        short s3 = tg_02.n();
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>(64);
        Iterator<acq_0> iterator = acs_0.b().c();
        int n5 = Integer.MIN_VALUE;
        int n6 = Integer.MIN_VALUE;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object = ((acq_0)object2).d();
            for (int k = 0; k < ((DisplayedScreenElement[])object).length; ++k) {
                DisplayedScreenElement displayedScreenElement = object[k];
                ScreenElement screenElement = displayedScreenElement.d();
                if (screenElement.c() <= s2) continue;
                int n7 = screenElement.d();
                int n8 = screenElement.e();
                if (n8 < n4 || n7 < n3) continue;
                if (tg_02.c(n7, n8)) {
                    if (screenElement.c() <= s3 || screenElement.i().j()) continue;
                    arrayList2.add(displayedScreenElement);
                    continue;
                }
                if (n7 != n5 || n8 != n6) {
                    n5 = n7;
                    n6 = n8;
                    arrayList.clear();
                    acs_0.b().a(n7, n8, arrayList, acV.c);
                    for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                        for (int i3 = i2 + 1; i3 < arrayList.size(); ++i3) {
                            DisplayedScreenElement displayedScreenElement2 = arrayList.get(i2);
                            DisplayedScreenElement displayedScreenElement3 = arrayList.get(i3);
                            if (displayedScreenElement3.f() >= displayedScreenElement2.f()) continue;
                            arrayList.set(i2, displayedScreenElement3);
                            arrayList.set(i3, displayedScreenElement2);
                        }
                    }
                }
                if (arrayList.size() != 0 && screenElement.c() <= ((DisplayedScreenElement)arrayList.get(0)).d().c()) continue;
                arrayList2.add(displayedScreenElement);
            }
        }
        bNT.f().a(new aZB(n3, n4, s2, s3, arrayList2));
        object2 = ahs.d().h();
        while (object2.hasNext()) {
            object = (ahv)object2.next();
            if (((ahv)object).d() instanceof bbh_2 || !HideFightOccluders.a((abu)object, n3, n4, s2, s3)) continue;
            arrayList2.add(object);
        }
        for (acy acy2 : arrayList2) {
            acy2.l(bl);
        }
    }

    public static boolean a(abu abu2, int n, int n2, int n3, int n4) {
        if (abu2.I() + abu2.ag() <= n3) {
            return false;
        }
        return abu2.H() >= n2 && abu2.G() >= n;
    }

    public static int b() {
        return e;
    }

    public static void a(abu abu2) {
        short s2;
        short s3;
        int n;
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        tg_0 tg_02 = bvx_22.g();
        if (tg_02 == null) {
            return;
        }
        int n2 = tg_02.z();
        if (HideFightOccluders.a(abu2, n2, n = tg_02.A(), s3 = tg_02.m(), s2 = tg_02.n())) {
            abu2.l(e != 0);
        }
    }
}

