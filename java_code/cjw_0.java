/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJW
 */
@fpw_0
public class cjw_0 {
    public static final String PACKAGE = "wakfu.video";

    public static void play(fzs fzs2, fvp fvp2, fru_0 fru_02) {
        if (!fvp2.isInitialized() || fvp2.isPaused()) {
            fru_02.setText(bae.h().a("dialog.video.pause", new Object[0]));
            fvp2.a();
            fvp2.setPaused(false);
        } else {
            fru_02.setText(bae.h().a("dialog.video.play", new Object[0]));
            fvp2.setPaused(true);
        }
    }

    public static void updateSlider(fct_1 fct_12, fvp fvp2, fum fum2) {
        float f2 = fvp2.getVideoDuration();
        float f3 = ((Long)fct_12.j()).longValue();
        fum2.setValue(f3 / f2);
    }

    public static void seek(fck_2 fck_22, fvp fvp2, fum fum2) {
        fvp2.setPaused(true);
        if (fck_22.x() != 0) {
            float f2 = fum2.getValue();
            fvp2.a(f2);
            fct_1 fct_12 = new fct_1(fum2);
            fct_12.a((long)(f2 * (float)fvp2.getVideoDuration()));
            cjw_0.updateSlider(fct_12, fvp2, fum2);
            fvp2.a();
            fvp2.setPaused(false);
        }
    }
}

