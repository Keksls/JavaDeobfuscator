/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGo {
    public static final String PACKAGE = "wakfu.contactList";

    public static void openContactPopupMenu(fcb_2 fcb_22) {
        Object object;
        if (fcb_22.x() == 3 && (object = fcb_22.j()) != null && object instanceof aUK) {
            dfz_0 dfz_02 = new dfz_0();
            dfz_02.a((aUK)object);
            dfz_02.a_(17525);
            add_2.b().a(dfz_02);
        }
    }

    public static void closeContactList(fzs fzs2) {
        dfc.d((short)19517);
    }

    public static void checkNotify(fzs fzs2, aUK aUK2) {
        if (aUK2 != null) {
            dfz_0 dfz_02 = new dfz_0();
            dfz_02.a(aUK2);
            dfz_02.a_(16949);
            add_2.b().a(dfz_02);
        }
    }

    public static void enableDisableFriendFilter(fzs fzs2) {
        dfc.d((short)18098);
    }

    public static void enableDisableIgnoreFilter(fzs fzs2) {
        dfc.d((short)17499);
    }

    public static void addFriend(fzs fzs2) {
        if (fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) {
            cGo.a(fzs2, (short)1, true);
        }
    }

    public static void addIgnore(fzs fzs2) {
        if (fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) {
            cGo.a(fzs2, (short)2, true);
        }
    }

    public static void removeIgnore(fzs fzs2) {
        cGo.a(fzs2, (short)2, false);
    }

    public static void addToGroup(fzs fzs2) {
        cGo.a(fzs2, (short)4, true);
    }

    private static void a(fzs fzs2, short s2, boolean bl) {
        dft dft2 = new dft();
        dft2.a_(bl ? 17227 : 18381);
        dft2.b(s2);
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        fug_0 fug_02 = (fug_0)fyy_02.a(s2 == 1 ? "customFriendName" : "customIgnoreName");
        if (fug_02 != null) {
            String string = fug_02.getText();
            if (string == null || string.isEmpty()) {
                return;
            }
            aUK aUK2 = aUL.a().e().a(string);
            if (aUK2 == null && (aUK2 = aUL.a().a(string)) == null) {
                aUK2 = new aUK(-1L, string, string);
            }
            dft2.a(aUK2);
            fug_02.c("");
        }
        add_2.b().a(dft2);
    }

    public static void addCommentary(fzs fzs2, aUK aUK2) {
        if (aUK2 == null) {
            return;
        }
        dfz_0 dfz_02 = new dfz_0();
        dfz_02.a(aUK2);
        dfz_02.a_(18998);
        add_2.b().a(dfz_02);
    }

    public static void validCommentary(fzs fzs2, aUK aUK2, fug_0 fug_02) {
        if (aUK2 == null) {
            return;
        }
        if (fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) {
            fyy_0 fyy_02 = fpm_0.b().h().d("contactListDialog");
            dfz_0 dfz_02 = new dfz_0();
            dfz_02.a(aUK2);
            String string = fug_02.getText();
            String string2 = cby_2.b(string);
            fug_02.c("");
            if (string2.length() == 0 && string.length() != 0) {
                cGo.a(bae.h().a("error.censoredSentence", new Object[0]), fug_02);
                return;
            }
            dfz_02.a(string2);
            dfz_02.a_(17874);
            add_2.b().a(dfz_02);
        }
    }

    private static void a(String string, fug_0 fug_02) {
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(1), 1027L, 102, 1);
        fzm_02.a(new cgp_0(fug_02));
    }

    public static void playListSound(boolean bl) {
        cdw_0.n().c(bl ? 600117L : 600118L);
    }

    public static void showIgnored(fzs fzs2) {
        fyy_0 fyy_02 = fpm_0.b().h().d("contactListDialog");
        fvE fvE2 = (fvE)fyy_02.a("ignoreList");
        boolean bl = !fvE2.getVisible();
        fvE2.setVisible(bl);
        fvE fvE3 = (fvE)fyy_02.a("ignoreButton");
        if (bl) {
            fvE3.setStyle("remove");
        } else {
            fvE3.setStyle("add");
        }
        fvE2 = (fvE)fyy_02.a("friendsOfflineList");
        fvE2.setVisible(!bl);
        fvE3 = (fvE)fyy_02.a("friendsOfflineButton");
        if (!bl) {
            fvE3.setStyle("remove");
        } else {
            fvE3.setStyle("add");
        }
        cGo.playListSound(bl);
    }

    public static void showOffline(fzs fzs2) {
        fyy_0 fyy_02 = fpm_0.b().h().d("contactListDialog");
        fvE fvE2 = (fvE)fyy_02.a("friendsOfflineList");
        boolean bl = !fvE2.getVisible();
        fvE2.setVisible(bl);
        fvE fvE3 = (fvE)fyy_02.a("friendsOfflineButton");
        if (bl) {
            fvE3.setStyle("remove");
        } else {
            fvE3.setStyle("add");
        }
        fvE2 = (fvE)fyy_02.a("ignoreList");
        fvE2.setVisible(!bl);
        fvE3 = (fvE)fyy_02.a("ignoreButton");
        if (!bl) {
            fvE3.setStyle("remove");
        } else {
            fvE3.setStyle("add");
        }
        cGo.playListSound(bl);
    }

    public static void removeFriend(fzs fzs2, aUK aUK2) {
        dft dft2 = new dft();
        dft2.a_(18381);
        dft2.b((short)1);
        dft2.a(aUK2);
        add_2.b().a(dft2);
    }

    public static void addFriendToGroup(fzs fzs2, aUK aUK2) {
        dgs_0 dgs_02 = new dgs_0();
        dgs_02.a(Xd.b);
        dgs_02.b(aUK2.j());
        add_2.b().a(dgs_02);
    }

    public static void addFriendToGuild(fzs fzs2, aUK aUK2) {
        dgx_0 dgx_02 = new dgx_0();
        dgx_02.b(aUK2.j());
        add_2.b().a(dgx_02);
    }

    public static void removeIgnore(fzs fzs2, aUK aUK2) {
        dft dft2 = new dft();
        dft2.a_(18381);
        dft2.b((short)2);
        dft2.a(aUK2);
        add_2.b().a(dft2);
    }

    public static void displayDisconnectedPlayers(fzs fzs2) {
        aUL.a().a(((fup_0)fzs2.d()).getSelected());
    }
}

