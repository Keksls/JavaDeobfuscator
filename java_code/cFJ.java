/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFJ {
    public static final String PACKAGE = "wakfu.boosterPackNotice";

    public static void openBoosterShop(fzs fzs2) {
        ddO.a().b("WAKFU_BOOSTER_PACK");
        fpm_0.b().o("boosterPackNoticeDialog");
        cef.a(cec.a, "boosterPackNoticeDialog", "openShop");
    }

    public static void unloadDialog(fzs fzs2, String string) {
        fpm_0.b().a("boosterPackNoticeDialog", false);
        cef.a(cec.a, "boosterPackNoticeDialog", string);
    }
}

