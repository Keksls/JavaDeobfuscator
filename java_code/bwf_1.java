/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from bwF
 */
public class bwf_1
implements ena_1 {
    private static final float a = 8.33333E-4f;

    @Override
    public void a() {
        bmr_1 bmr_12 = azu_0.j().k();
        boz_0 boz_02 = bmr_12.cy();
        List<sd_0> list = boz_02.c(1200);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (sd_0 sd_02 : list) {
            byte[] byArray = sd_02.aB();
            if (byArray == null) continue;
            byte[] byArray2 = flI.d(byArray);
            byte[] byArray3 = flI.a(byArray2, flI.a(bmr_12.bA()));
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray3);
            byte by = byteBuffer.get();
            emi_2 emi_22 = emi_2.a(by);
            switch (emi_22) {
                case b: {
                    bwi_1.a(byteBuffer);
                }
            }
        }
    }
}

