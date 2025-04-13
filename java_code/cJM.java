/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJM {
    public static final String PACKAGE = "wakfu.stateDetails";

    public static void setStateLevel(fzs fzs2) {
        if (fzs2 instanceof fcq_1) {
            short s2 = (short)((fcq_1)fzs2).j();
            fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
            if (fyy_02 == null) {
                return;
            }
            cJM.a(s2, fyy_02);
        }
    }

    public static void keyType(fzs fzs2, fug_0 fug_02) {
        short s2;
        if (fug_02.getText().length() == 0) {
            return;
        }
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        bou_0 bou_02 = (bou_0)fis_1.a().d("describedState", fyy_02.c());
        if (bou_02 == null) {
            return;
        }
        short s3 = Co.h(fug_02.getText());
        if (s3 > (s2 = bou_02.a())) {
            s3 = s2;
        }
        cJM.a(s3, fyy_02);
    }

    public static void restore(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.d()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        short s2 = (short)fis_1.a().c("describedStateLevel", fyy_02.c());
        cJM.a(s2, fyy_02);
    }

    private static void a(short s2, fyy_0 fyy_02) {
        bou_0 bou_02 = (bou_0)fis_1.a().d("describedState", fyy_02.c());
        if (bou_02 != null) {
            bou_02.a(s2);
        }
    }
}

