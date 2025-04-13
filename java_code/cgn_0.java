/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGn
 */
@fpw_0
public class cgn_0 {
    public static final String PACKAGE = "wakfu.adminConsole";

    public static void processInputKeyEvent(fcd_2 fcd_22, fug_0 fug_02) {
        switch (fcd_22.k()) {
            case 10: {
                aVn.d().c(fug_02.getText());
                fug_02.c("");
                break;
            }
            case 38: {
                fug_02.c(aVn.d().a());
                break;
            }
            case 40: {
                fug_02.c(aVn.d().b());
            }
        }
    }

    public static void clear(fzs fzs2) {
        aVr.a().b();
    }
}

