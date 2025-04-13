/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boa
 */
public final class boa_2 {
    public static final int a = 20;

    public static void a(bnh_1 bnh_12) {
        String string = "timelineCellDialog" + bnh_12.a_();
        fyb_0 fyb_02 = fpm_0.b().k(string);
        if (!(fyb_02 instanceof fvc_0)) {
            return;
        }
        fvc_0 fvc_02 = (fvc_0)fyb_02;
        if (bnh_12.a(eoz_1.bc)) {
            fvc_02.setOffset(Hw.e((long)fvc_02.getXOffset()), Hw.e((long)(fvc_02.getYOffset() + 20)));
        } else {
            fvc_02.setOffset(Hw.e((long)fvc_02.getXOffset()), Hw.e((long)(fvc_02.getYOffset() - 20)));
        }
    }
}

