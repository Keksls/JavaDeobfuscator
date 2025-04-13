/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cHL
 */
@fpw_0
public class chl_0 {
    public static final String PACKAGE = "wakfu.moderationPanel";
    static final Logger g = Logger.getLogger(chl_0.class);
    public static final int a = 255;
    public static final int b = 370;
    public static final int c = 80;
    public static final int d = 1440;
    public static final int e = 1440;
    public static final int f = -42;

    public static void backToMainPage(fzs fzs2) {
        daX.a();
        daX.a.g().a(ceo_2.a);
    }

    public static void onTPLocationChanged(fcf_2 fcf_22) {
        String string = (String)fcf_22.l();
        daX.a.g().a(string);
    }

    public static void tpToSelectedLocation(fzs fzs2) {
        cep_2 cep_22 = daX.a.g().j();
        daX.b((short)144, cep_22.b(), cep_22.c(), cep_22.a());
    }

    public static void onNationChanged(fcf_2 fcf_22) {
        String string = (String)fcf_22.l();
        daX.a.g().c(string);
    }

    public static void changeToSelectedNation(fzs fzs2) {
        cen_2 cen_22 = daX.a.g().k();
        daX.b((short)40, cen_22.a(), (byte)1);
    }

    public static void openInNala(fzs fzs2) {
        long l = daX.a.g().c().c();
        chl_0.a(l);
    }

    public static void openInNala(fzs fzs2, cej_2 cej_22) {
        chl_0.a(cej_22.e());
    }

    private static void a(long l) {
        chl_0.a("?id=" + l);
    }

    private static void a(Collection<Long> collection) {
        chl_0.a(String.format("/list?gs_account=%s&gs_param_account=account_id", collection.stream().map(String::valueOf).collect(Collectors.joining(","))));
    }

    private static void a(String string) {
        String string2 = bae.h().f().i();
        if (!"fr".equals(string2) && !"en".equals(string2)) {
            string2 = "en";
        }
        String string3 = String.format("https://nala2.ankama.com/%s/account%s", string2, string);
        aii_1.a(string3);
    }

    public static void openInBodyguard(fzs fzs2) {
        long l = daX.a.g().c().c();
        String string = "https://app.bodyguard.ai/authors?search=" + l;
        aii_1.a(string);
    }

    public static void openForumProfile(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        String string = String.valueOf(cel_22.f());
        String string2 = bae.h().f().i();
        if (!"fr".equals(string2) && !"en".equals(string2)) {
            string2 = "en";
        }
        String string3 = string2.equals("fr") ? "profil-ankama" : "ankama-profile";
        String string4 = String.format("https://account.ankama.com/%s/%s/%s-%s", string2, string3, string, cel_22.g());
        aii_1.a(string4);
    }

    public static void openGuildOfSelectedPlayer(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        if (cel_22 == null) {
            return;
        }
        long l = cel_22.a();
        daX.c((short)363, (byte)20, l);
    }

    public static void showPlayerPageOfMember(fzs fzs2, cej_2 cej_22) {
        daX.a(flz_0.b, flx_0.a, (Object)cej_22.a());
    }

    public static void setOpacityLevel(fcq_1 fcq_12) {
        float f2 = fcq_12.j();
        daX.a.g().a(f2);
        fis_1.a().a("moderationPanelView", "opacity");
        fis_1.a().a("moderationPanelView", "opacitySliderValue");
    }

    public static void selectPlayer(fzs fzs2, cel_2 cel_22) {
        daX.a.g().f(cel_22.b());
    }

    public static void removeAllPlayerTabs(fzs fzs2) {
        daX.a.g().e();
        daX.a.g().a(ceo_2.a);
    }

    public static void removePlayerTab(fzs fzs2, cel_2 cel_22) {
        daX.a.g().a(cel_22);
        daX.a.g().a(ceo_2.a);
    }

    public static void addTabPlayer(fzs fzs2, String string) {
        daX.a.g().e(string);
    }

    public static void searchPlayer(fzs fzs2, fuh_0 fuh_02) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        String string = fuh_02.getText().strip();
        if (string.matches("[0-9]+")) {
            long l = Long.parseLong(string);
            daX.a(flz_0.b, flx_0.b, (Object)l);
        } else if (string.matches(".+#[0-9]{4}")) {
            daX.a(flz_0.b, flx_0.c, (Object)string);
        } else {
            daX.a(flz_0.b, flx_0.a, (Object)string);
        }
    }

    public static void searchGuild(fzs fzs2, fuh_0 fuh_02) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        String string = fuh_02.getText().strip();
        if (string.matches("[0-9]+")) {
            long l = Long.parseLong(string);
            daX.c((short)363, (byte)20, l);
        } else {
            daX.c((short)363, (byte)21, string);
        }
    }

    public static void eTargetable(fzs fzs2, String string) {
        daX.b((short)45, "1".equals(string) ? 1 : 0);
    }

    public static void dnd(fzs fzs2, String string) {
        daX.a((short)299, "1".equals(string) ? (byte)1 : 0);
    }

    public static void staffMode(fzs fzs2, String string) {
        daX.b((short)30, "1".equals(string) ? (byte)1 : 0);
    }

    public static void setVisibility(fzs fzs2, String string) {
        daX.b((short)485, "1".equals(string) ? (byte)1 : 0);
    }

    public static void sanction(fzs fzs2, cet_2 cet_22) {
        cel_2 cel_22 = daX.a.g().c();
        Object object = cet_22.b("id");
        String string = cel_22.b();
        long l = cel_22.c();
        String string3 = bae.h().a("moderation.sanction.confirmation.popup", string, String.valueOf(l), cet_22.b("sanctionText"));
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(bae.h().a("yesAndDeleteMessages", new Object[0]));
        fzn_0 fzn_02 = new fzn_0(102, 0, string3, null, cfn_0.a(0), 56L, arrayList, 0);
        fzn_02.a(8, 32, 16);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string2) -> {
            if (n != 8 && n != 32) {
                return;
            }
            daX.a((short)397, object, l, cel_22.e(), string, n == 32);
        });
    }

    public static void redMessage(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Type a red message to send :", 65542L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new cHM());
    }

    public static void redMessageToPlayer(fzs fzs2) {
        String string = daX.a.g().c().b();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Type a red message to send to player " + string + " :", 65542L);
        fzn_02.a(chl_0.a());
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string2) -> {
            if (n != 2) {
                return;
            }
            if (string2.isEmpty()) {
                return;
            }
            int n2 = Cz.a(string2).length;
            if (n2 > 255) {
                chl_0.a(n2);
                return;
            }
            daX.a((short)441, string, string2);
        });
    }

    private static fzu_0 a() {
        fzu_0 fzu_02 = new fzu_0();
        fzu_02.a(255);
        fzu_02.a(true);
        fzu_02.a(new fjf_2(370, 80));
        fzu_02.b(370);
        return fzu_02;
    }

    private static void a(int n) {
        daX.a.g().i(chl_0.b() + "Incorrect message size (" + n + " > 255), try again.");
    }

    public static void havenBagKick(fzs fzs2) {
        String string = daX.a.g().c().b();
        long l = daX.a.g().c().e();
        daX.a((short)23, (short)342, string, l);
    }

    public static void pum(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Type a message for the PopUp (0 < size < 255) :", 65542L);
        fzn_02.a(chl_0.a());
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 2) {
                return;
            }
            if (string.isEmpty()) {
                return;
            }
            int n2 = Cz.a(string).length;
            if (n2 > 255) {
                chl_0.a(n2);
                return;
            }
            daX.a((short)458, string, daX.a.g().c().b());
        });
    }

    public static void toggleLocalizedSysMsg(fzs fzs2) {
        daX.f();
    }

    public static void refreshSendEnabled(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        boolean bl = string != null && !string.isEmpty();
        daX.a.a(bl);
    }

    public static void sendLocalizedSystemMessage(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04, fug_0 fug_05) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        HashMap<Byte, String> hashMap = new HashMap<Byte, String>();
        String string = fug_02.getText();
        hashMap.put(Ow.b.c(), string);
        String string2 = fug_03.getText();
        hashMap.put(Ow.a.c(), string2);
        String string3 = fug_04.getText();
        hashMap.put(Ow.c.c(), string3);
        String string4 = fug_05.getText();
        hashMap.put(Ow.d.c(), string4);
        daX.a(hashMap);
    }

    public static void jail(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Enter jailing duration (in minutes) 0=1440 (1 day), default=10\nWARNING: the values are not the same when using the console!", 65542L);
        fzu_0 fzu_02 = new fzu_0();
        fzu_02.a(10);
        fzu_02.a(new fjf_2(50, 20));
        fzn_02.a(fzu_02);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(chl_0::a);
    }

    private static void a(int n, String string) {
        if (n != 2) {
            return;
        }
        if (string.length() > 10) {
            daX.a.g().i(chl_0.b() + "Incorrect message size, try again.");
            return;
        }
        try {
            int n2 = chl_0.b(string);
            if (n2 == -42) {
                daX.a((short)23, (short)72, daX.a.g().c().b());
                return;
            }
            daX.a((short)23, (short)168, daX.a.g().c().b(), n2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            daX.a.g().i(chl_0.b() + "Incorrect duration, number should be between 0 and 1440");
        }
    }

    private static int b(String string) {
        if (Cz.f(string)) {
            return 1440;
        }
        int n = Integer.parseInt(string);
        if (n == 0) {
            return 1440;
        }
        if (n == -1) {
            return -42;
        }
        if (n < 0 || n > 1440) {
            throw new IllegalArgumentException();
        }
        return n;
    }

    public static void restrictLanguages(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Restrict the access of " + cel_22.b() + " to their default language channels ?", null, cfn_0.a(0), 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 8) {
                return;
            }
            daX.a((short)231, cel_22.c(), cel_22.b(), true);
        });
    }

    public static void unrestrictLanguages(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Cancel the restriction of " + cel_22.b() + " to access their default language channels ?", null, cfn_0.a(0), 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 8) {
                return;
            }
            daX.a((short)231, cel_22.c(), cel_22.b(), false);
        });
    }

    public static void kickPlayer(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Do you really want to kick " + cel_22.b() + " from the game ?", null, cfn_0.a(0), 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 8) {
                return;
            }
            daX.a((short)34, cel_22.b());
        });
    }

    public static void unbanPlayer(fzs fzs2) {
        cel_2 cel_22 = daX.a.g().c();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Do you really want to unban " + cel_22.b() + " ?", null, cfn_0.a(0), 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 8) {
                return;
            }
            daX.d((short)256, cel_22.c(), false, 0);
        });
    }

    public static void tpCoords(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Type coords with format \"x y <instance>\" (instance facultative) :", 65542L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new chn_0());
    }

    public static void tpToPlayer(fzs fzs2) {
        daX.a((short)23, (short)364, daX.a.g().c().b());
    }

    public static void tpToMe(fzs fzs2) {
        daX.a((short)23, (short)200, daX.a.g().c().b());
    }

    public static void freedom(fzs fzs2) {
        daX.a((short)23, (short)138, daX.a.g().c().b());
    }

    public static void hiddenMute(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Hidden mute duration in minute (-1 to cancel)", 65542L);
        fzu_0 fzu_02 = new fzu_0();
        fzu_02.a(9);
        fzn_02.a(fzu_02);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new cHO());
    }

    public static void addNote(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("moderationPanel.addNote.explanation", new Object[0]), 65542L);
        fzu_0 fzu_02 = new fzu_0();
        fzu_02.a(100);
        fzn_02.a(fzu_02);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new chp_0());
    }

    public static void removeNote(fzs fzs2, cer_2 cer_22) {
        if (!cer_22.f()) {
            return;
        }
        flu_0 flu_02 = cer_22.g();
        fzn_0 fzn_02 = new fzn_0(102, 0, "Do you really want to remove " + flu_02.b() + "'s note \"" + cer_22.e() + "\" ?", 24L);
        fpm_0.b().a(fzn_02).a((n, string) -> {
            if (n != 8) {
                return;
            }
            int n2 = (int)(flu_02.f().getTime() / 1000L);
            daX.a((short)266, flu_02.a(), n2);
        });
    }

    public static void copyPenalView(fzs fzs2) {
        daX.a.c();
    }

    public static void copyPlayerIntervention(fzs fzs2) {
        daX.a.d();
    }

    public static void switchContainerVisibility(fzs fzs2, fru_0 fru_02, fso fso2) {
        boolean bl = !fso2.isVisible();
        fso2.setVisible(bl);
        fru_02.setStyle(bl ? "arrowCollapseUp" : "arrowCollapseDown");
    }

    public static void changeBackgroundColor(fck_2 fck_22, fbf_1 fbf_12) {
        fbf_12.setColor(fck_22.f() == frd_0.y ? new azf_2(0.5f, 0.5f, 0.5f, 0.1f) : new azf_2(0.5f, 0.5f, 0.5f, 0.0f));
    }

    public static void minimizeOrMaximize(fck_2 fck_22) {
        daX.a.g().i();
        fis_1.a().a("moderationPanelView", "maximized");
    }

    @NotNull
    private static String b() {
        wu_0 wu_02 = wn_0.a.a();
        return "[" + wu_02.k() + ":" + wu_02.l() + "] ";
    }

    public static void copyAccount(fzs fzs2, cej_2 cej_22) {
        if (!ca_0.a(String.valueOf(cej_22.e()))) {
            cfn_1.a("Cannot automatically copy account id \"" + cej_22.e() + "\" to clipboard, permission denied");
        }
    }

    public static void renameGuild(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "New guild name:", 65542L);
        fzu_0 fzu_02 = new fzu_0();
        fzu_02.a(30);
        fzn_02.a(fzu_02);
        long l = daX.a.g().l().a();
        fpm_0.b().a(fzn_02).a((n, string) -> {
            if (n != 2 || string.isEmpty()) {
                return;
            }
            daX.c((short)178, (byte)0, l, string);
        });
    }

    public static void removeGuildDescription(fzs fzs2) {
        chl_0.a("Do you really want to delete the guild description?", (byte)1, null);
    }

    public static void removeGuildMessage(fzs fzs2) {
        chl_0.a("Do you really want to delete the guild description?", (byte)2, null);
    }

    public static void resetGuildRanksName(fzs fzs2) {
        chl_0.a("Do you really want to reset ALL the guild ranks name?", (byte)3, null);
    }

    public static void setGuildRandomBlazon(fzs fzs2) {
        chl_0.a("Do you really want to reset the guild blazon to a random one?", (byte)4, bxp_1.a().b().h().e());
    }

    private static void a(String string2, byte by, Object object) {
        fzn_0 fzn_02 = new fzn_0(102, 0, string2, 24L);
        long l = daX.a.g().l().a();
        fpm_0.b().a(fzn_02).a((n, string) -> {
            if (n != 8) {
                return;
            }
            if (object != null) {
                daX.c((short)178, by, l, object);
            } else {
                daX.c((short)178, by, l);
            }
        });
    }

    public static void togglePanelFile(fzs fzs2) {
        daX.e();
    }

    public static void muteZone(fzs fzs2) {
        fzn_0 fzn_02 = new fzn_0(102, 0, "Confirm the mute of this zone (90x90 cells) ?", 24L);
        fpm_0.b().a(fzn_02).a((n, string) -> {
            if (n == 8) {
                new axq_0(2, List.of(Integer.valueOf(fjy_0.a.a()))).b();
            }
        });
    }

    public static void unmuteZone(fzs fzs2) {
        new ayq_0().b();
    }

    public static void refreshMainPageInfos(fzs fzs2) {
        daX.a();
    }

    public static void clearConsole(fzs fzs2) {
        daX.a.g().g();
    }

    public static void copyAllMembersInfo(fzs fzs2) {
        String string = daX.a.g().l().b();
        ca_0.a(string);
    }

    public static void openAllMembersInNala(fzs fzs2) {
        List<Long> list = daX.a.g().l().c();
        chl_0.a(list);
    }
}

