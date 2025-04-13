/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class bPJ {
    private bPJ() {
    }

    public static void a(fiO fiO2, fiz<bpl_0> fiz2, bOw bOw2) {
        if (bOw2 == null) {
            return;
        }
        if (fiz2 == null) {
            return;
        }
        if (fiO2 == null) {
            return;
        }
        bOv bOv2 = bOw2.d((byte)0);
        bOv bOv3 = bOw2.d((byte)1);
        bOv2.i();
        bOv3.i();
        if (!fiO2.a(azu_0.j().k())) {
            return;
        }
        ArrayList<Integer> arrayList = fiO2.d();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            bpl_0 bpl_02;
            int n2 = arrayList.get(k);
            if (n2 == 0 || (bpl_02 = (bpl_0)fiz2.c(n2)) == null) continue;
            if (k < 6) {
                bOv2.a(boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n()), (short)k);
                continue;
            }
            bOv3.a(boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n()), (short)(k % 6));
        }
        bOv2.j();
        bOv3.j();
    }
}

