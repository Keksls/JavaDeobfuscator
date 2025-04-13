/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.commonIn.ChatCommand;
import com.ankamagames.wakfu.client.console.command.commonIn.GetPrivateContactCommand;
import gnu.trove.map.hash.TIntByteHashMap;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@fpw_0
public class cFS {
    private static final Logger d = Logger.getLogger(cFS.class);
    public static final String PACKAGE = "wakfu.chat";
    public static final String a = "textEditorRenderableContainer.chatInput";
    public static final String b = "%s \"%s\" ";
    public static final String c = ".*\".*\".*";
    private static String e = null;
    private static exk_2 f = null;
    private static fbf_1 g;
    private static final String h = "/w (&quot;.*&quot;|[^&quot;][\\p{L}'-]*[^&quot;])\\s+(.*)(^(.*)$)*";
    private static final String i = "/c (&quot;.*&quot;|[^&quot;][\\p{L}\\p{N}'-]*[^&quot;])\\s+(.*)(^(.*)$)*";
    private static final TIntByteHashMap j;
    private static final cGf k;
    private static final fzu l;

    public static boolean processKeyTyped(fcd_2 fcd_22, fzz fzz2, auc_0 auc_02) {
        fzz2.a();
        fit_1 fit_12 = fzz2.getProperty("chat").e("currentView");
        if (fit_12 == null) {
            return false;
        }
        fit_12.q();
        String string = auc_02.i();
        Object object = fit_12.b("input");
        if (!aul_0.a().b().c()) {
            aul_0.a().b().a((String)object);
        }
        boolean bl = fcd_22.q();
        if (fcd_22.j() == '\n') {
            fzz2.a();
            if (((String)object).isEmpty() || aul_0.a().f()) {
                aul_0.a().b(false);
                return true;
            }
            if (!((String)object).startsWith("/") && string != null && !string.isEmpty()) {
                object = string + " " + (String)object;
            }
            String string2 = cFS.a((String)object);
            dfv dfv2 = new dfv();
            dfv2.b(string2);
            dfv2.a(auc_02);
            add_2.b().a(dfv2);
            fit_12.a("input", (Object)"");
            if (((bvx_0)ans_0.D().h()).a(bWe.V)) {
                fyc_0.a().c(null);
            }
            return true;
        }
        return false;
    }

    public static boolean processKeyPressed(fcd_2 fcd_22, fzz fzz2, auc_0 auc_02) {
        fit_1 fit_12 = fzz2.getProperty("chat").e("currentView");
        if (fit_12 == null) {
            return false;
        }
        switch (fcd_22.k()) {
            case 10: {
                fzz2.a();
                String string = fit_12.b("input");
                if (string.isEmpty()) {
                    fyc_0.a().c(null);
                }
                return true;
            }
            case 27: {
                fyc_0.a().c(null);
                ((ful_0)fcd_22.e()).c("");
                return true;
            }
            case 38: {
                if (fcd_22.q()) {
                    GetPrivateContactCommand.a(false);
                    return true;
                }
                String string = aul_0.a().b().a();
                string = cFS.a(auc_02.i(), string);
                fit_12.a("input", (Object)string);
                return true;
            }
            case 40: {
                if (fcd_22.q()) {
                    GetPrivateContactCommand.a(true);
                    return true;
                }
                String string = aul_0.a().b().b();
                string = cFS.a(auc_02.i(), string);
                fit_12.a("input", (Object)string);
                return true;
            }
        }
        return false;
    }

    @NotNull
    private static String a(String string) {
        if (string.matches(c)) {
            return string;
        }
        Optional<String> optional = cFS.b(string);
        if (optional.isEmpty()) {
            return string;
        }
        String string2 = optional.get();
        return string2.length() <= 2 ? string : string.replaceFirst(string2, "\"" + string2 + "\"");
    }

    private static Optional<String> b(String string) {
        Optional<String> optional = cFS.a(string, h, aUe.b);
        if (optional.isPresent()) {
            return optional;
        }
        return cFS.a(string, i, aUe.g);
    }

    private static Optional<String> a(String string, String string2, aUe aUe2) {
        if (!string.matches(string2)) {
            return Optional.empty();
        }
        auv_0 auv_02 = aUf.a(aUe2.b());
        String string3 = auv_02.b();
        String string4 = string.replaceFirst(string3 + " ", "");
        return Optional.of(string4.substring(0, string4.indexOf(32)));
    }

    private static String a(String string, String string2) {
        if (!string.isEmpty()) {
            if (string2.matches(h) && string.matches(h)) {
                return string2.replaceFirst("(/w \"[a-zA-Z_0-9'-]+\"\\s)", "");
            }
            if (!string2.startsWith("/") || string2.startsWith(string)) {
                return string2.replaceFirst(string + " ", "");
            }
        }
        return string2;
    }

    public static void chooseChannel(fcf_2 fcf_22, auc_0 auc_02) {
        aUv aUv2 = aUxx.a().a((aUr)auc_02);
        if (aUv2 != null) {
            aUh.b(aUv2.a(), false);
        }
        if (fcf_22.l() != null) {
            dfu dfu2 = new dfu();
            dfu2.a((aUY)fcf_22.l());
            dfu2.a(auc_02);
            add_2.b().a(dfu2);
        }
    }

    public static void openCloseContactList(fzs fzs2) {
        dfc.d((short)19517);
    }

    public static void openCloseEmoteBar(fzs fzs2) {
        dfc.d((short)17197);
    }

    public static void filterButtonActivation(fck_2 fck_22, auc_0 auc_02, fil_1 fil_12) {
        if (fck_22.f() == frd_0.C) {
            fis_1.a().a("chat.popupCurrentView", (Object)auc_02, ((fyb_0)fck_22.e()).getElementMap());
            fpu_0.openClosePopup(fck_22, fil_12);
        }
    }

    public static void scrollBarDown(fzs fzs2, fue_0 fue_02) {
        fue_02.a(0.0f);
    }

    public static void notifyFocusChange(fcz_1 fcz_12, aUv aUv2) {
        fug_0 fug_02 = (fug_0)fcz_12.e();
        fyy_0 fyy_02 = fug_02.getRenderableParent().getElementMap();
        fvE fvE2 = fyc_0.a().b();
        if (fvE2 != null && fyy_02 == fvE2.getElementMap() && fvE2.getId() == fug_02.getId()) {
            return;
        }
        boolean bl = !fcz_12.j();
        int n = aUv2.a();
        j.put(n, (byte)(bl ? 1 : 0));
        if (bl) {
            fug_02.setStyle("dark");
            aUh.c(n, false);
        } else {
            fug_02.setStyle("light");
            aUh.b(n, false);
        }
    }

    public static void windowFocusChange(fcz_1 fcz_12, aUv aUv2) {
        if (fcz_12.j() && aUv2 != null) {
            dfc dfc2 = new dfc();
            dfc2.a_(16086);
            dfc2.b(aUv2.a());
            add_2.b().a(dfc2);
        }
    }

    public static void addPrivatePipe(fzs fzs2, aUK aUK2) {
        cFS.addPrivatePipe(fzs2, aUK2.j());
    }

    public static void addPrivatePipe(fzs fzs2, String string) {
        dfc dfc2 = new dfc();
        dfc2.a_(17113);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void closeChat(fzs fzs2, aUv aUv2) {
        fpm_0.b().o(dey.a(aUv2.a()));
        dfc dfc2 = new dfc();
        dfc2.a_(16511);
        dfc2.b(aUv2.a());
        add_2.b().a(dfc2);
    }

    public static void insertItem(fcv_2 fcv_22, auc_0 auc_02) {
        fyy_0 fyy_02;
        cgo_0.onDropItem();
        aUv aUv2 = aUxx.a().f();
        if (auc_02 == null) {
            auc_02 = aUv2.h();
        }
        if ((fyy_02 = fpm_0.b().h().d(dey.a(aUv2.a()))) == null) {
            return;
        }
        fug_0 fug_02 = (fug_0)fyy_02.a("chatInput");
        if (fug_02 == null) {
            return;
        }
        aUi.a(auc_02, fcv_22.n());
        if (!fug_02.equals(fyc_0.a().b())) {
            fyc_0.a().c(fug_02);
        }
    }

    public static void processLinkAction(fzs fzs2) {
        cFS.processLinkAction(fzs2, null, null);
    }

    public static void processLinkAction(fzs fzs2, auc_0 auc_02) {
        cFS.processLinkAction(fzs2, null, auc_02);
    }

    public static void processLinkAction(fzs fzs2, fvk_0 fvk_02, auc_0 auc_02) {
        String[] stringArray;
        String string;
        fxQ fxQ2;
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        if (fxH2 != null && fxH2.g() == fxI.b && (fxQ2 = fxH2.h()).b() == ane_2.b && (string = ((fxS)fxQ2).p()) != null && string.length() > 0 && (stringArray = string.split("_")).length == 2) {
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (string2 == null || string2.length() == 0) {
                return;
            }
            if (fzs2.f() == frd_0.C) {
                cFS.a((fck_2)fzs2, fvk_02, auc_02, string2, string3, fxQ2.d());
            } else if (fzs2.f() == frd_0.u) {
                cFS.a(fzs2, fvk_02, auc_02, string2, string3, fxQ2.d());
            }
        }
    }

    private static void a(fck_2 fck_22, fvk_0 fvk_02, auc_0 auc_02, String string, String string2, String string3) {
        eAN eAN2 = eAN.a(string);
        if (eAN2 != null) {
            if (eAN2.d()) {
                cFS.a(fck_22, fvk_02, string2, eAN2);
            } else if (eAN2 == eAN.e) {
                dfc dfc2 = new dfc(16337);
                dfc2.a(Long.parseLong(string2));
                add_2.b().a(dfc2);
            }
        } else if (string.equals("state")) {
            int n = Integer.parseInt(string2);
            short s2 = Hw.b(n);
            short s3 = Hw.c(n);
            bpe_0 bpe_02 = (bpe_0)fih_0.a().a(s2);
            if (bpe_02.c() != s3) {
                bpe_02 = bpe_02.b(s3);
            }
            dgo_0 dgo_02 = new dgo_0();
            dgo_02.a(bpe_02);
            dgo_02.a(((fyb_0)fck_22.e()).getElementMap().c());
            add_2.b().a(dgo_02);
        } else if (string.equals("characterName")) {
            String string4;
            bmr_1 bmr_12 = azu_0.j().k();
            long l = Long.parseLong(string2.split(";")[0]);
            String string5 = string4 = string2.contains(";") ? string2.split(";")[1] : string3;
            if (string4 == null || string4.equals(bmr_12.dp())) {
                return;
            }
            if (fck_22.x() == 3) {
                boolean bl;
                if (fck_22.t() && emp_0.b(azu_0.j().n().v(), emq_0.a)) {
                    daX.a.g().f(string4);
                    if (!azu_0.j().c(daX.a)) {
                        azu_0.j().a(daX.a);
                    }
                    return;
                }
                fts_0 fts_02 = fpm_0.b().o();
                fts_02.a(string4, null);
                blx_1 blx_12 = afz_0.d().b(l) == null ? bmf_2.a().b(string4) : bmf_2.a().c(l);
                boolean bl2 = bl = l < 0L;
                if (!bl) {
                    Object object;
                    if (!emp_0.a(azu_0.j().n().v(), emp_0.b)) {
                        fts_02.a(bae.h().a("desc.mru.openModerationPanel", new Object[0]), null, new cft_0(string4), true);
                    }
                    fts_02.a(bae.h().a("desc.mru.createPrivateChat", string4), null, new cFX(string4), true);
                    if (aUL.a().e().a(l) == null) {
                        fts_02.a(bae.h().a("chat.addToFriendList", new Object[0]), null, new cFY(string4), true);
                    }
                    if (aUL.a().f().a(l) == null) {
                        fts_02.a(bae.h().a("chat.addToIgnoreList", new Object[0]), null, new cFZ(string4), true);
                    }
                    boolean bl3 = true;
                    if (bmr_12.dE().d() && (object = bmr_12.dE().a()).a(string4)) {
                        bl3 = false;
                    }
                    if (bl3) {
                        fts_02.a(bae.h().a("desc.mru.invitToJoinGroup", string4), null, new cGa(bmr_12, string4), true);
                    }
                    object = (bnh_1)blx_12;
                    byp_2 byp_22 = byp_2.a();
                    if (byp_22.a((bnh_1)object)) {
                        fts_02.a(bae.h().a("desc.mru.inviteToJoinGuild", string4), null, new cgb_0(string4), true);
                    }
                }
                if (blx_12 != null) {
                    fts_02.a(bae.h().a("desc.show", new Object[0]), null, new cgc_0(string4), true);
                }
                fts_02.a(fyf_0.a().c() + 50, fyf_0.a().d() + 10);
            } else if (fck_22.x() == 1) {
                if (fck_22.t()) {
                    dfc dfc3 = new dfc();
                    dfc3.a_(17113);
                    dfc3.a(string4);
                    add_2.b().a(dfc3);
                    return;
                }
                auc_02.a("input", (Object)cFS.a(string4, aUe.b));
                fis_1.a().a((ajf_1)auc_02, "input");
                fug_0 fug_02 = (fug_0)cww_0.c().d().getElementMap().a(a);
                if (fug_02 == null) {
                    return;
                }
                if (!fug_02.equals(fyc_0.a().b())) {
                    fyc_0.a().c(fug_02);
                }
            }
        } else if ("accountName".equals(string)) {
            if (fck_22.x() == 1) {
                auc_02.a("input", (Object)cFS.a(string3, aUe.g));
                fis_1.a().a((ajf_1)auc_02, "input");
                fug_0 fug_03 = (fug_0)cww_0.c().d().getElementMap().a(a);
                if (fug_03 == null) {
                    return;
                }
                if (!fug_03.equals(fyc_0.a().b())) {
                    fyc_0.a().c(fug_03);
                }
            } else if (fck_22.x() == 3) {
                fts_0 fts_03 = fpm_0.b().o();
                fts_03.a(string3, null);
                fts_03.a(bae.h().a("desc.mru.createPrivateChat", string3), null, new cGd(string3), true);
                fts_03.a(fyf_0.a().c() + 50, fyf_0.a().d() + 10);
            }
        } else if ("fileExplorer".equals(string)) {
            try {
                Desktop.getDesktop().open(new File(string2));
            }
            catch (IOException | IllegalArgumentException exception) {
                d.error((Object)("Failed to open the screenshot located at " + string2), (Throwable)exception);
            }
        }
    }

    private static void a(fck_2 fck_22, fvk_0 fvk_02, String string, eAN eAN2) {
        exk_2 exk_22 = aUi.a().a(eAN2, string);
        if (fck_22.x() == 3) {
            if (f != null) {
                cfq_0.sendCloseItemDetailMessage(fvk_02.getElementMap().c(), f, true);
            }
            cfq_0.sendOpenCloseItemDetailMessage(fvk_02.getElementMap().c(), f, false);
        }
    }

    private static String a(String string, aUe aUe2) {
        auv_0 auv_02 = aUf.a(aUe2.b());
        String string2 = auv_02.b();
        return String.format(b, string2, string);
    }

    private static void a(fzs fzs2, fvk_0 fvk_02, auc_0 auc_02, String string, String string2, String string3) {
        eAN eAN2;
        if (string2.equals(e)) {
            return;
        }
        if (f != null) {
            cfq_0.sendCloseItemDetailMessage(fvk_02.getElementMap().c(), f, true);
        }
        if ((eAN2 = eAN.a(string)) != null && eAN2.d()) {
            exk_2 exk_22;
            f = exk_22 = aUi.a().a(eAN2, string2);
            e = string2;
            cfq_0.sendOpenItemDetailMessage(fvk_02.getElementMap().c(), exk_22, true);
        }
    }

    public static void onMouseExitSelectableText(fzs fzs2, fvk_0 fvk_02) {
        if (f != null) {
            cfq_0.sendCloseItemDetailMessage(fvk_02.getElementMap().c(), f, true);
        }
        f = null;
        e = null;
    }

    public static void setPrivateName(fzs fzs2, aUr aUr2) {
        if (fzs2 instanceof fcz_1 && aUr2.g() != null) {
            fcz_1 fcz_12 = (fcz_1)fzs2;
            fug_0 fug_02 = (fug_0)fzs2.e();
            if (fcz_12.e() == fcz_12.d() && !fcz_12.j()) {
                aUr2.a(aUr.e(fug_02.getText()));
            } else if (fcz_12.j() && fug_02.getText().contains("<")) {
                aUr2.a(aUr.e(""));
            }
        }
    }

    public static void onClickView(fck_2 fck_22, aUv aUv2, aUr aUr2, fug_0 fug_02) {
        if (fck_22.x() == 2) {
            if (!aUr2.p() && !aUr2.l()) {
                cFS.deleteView(aUr2);
            }
            return;
        }
        cFS.selectView(fck_22, aUv2, aUr2, fug_02);
    }

    public static void selectView(fck_2 fck_22, aUv aUv2, aUr aUr2, fug_0 fug_02) {
        if (aUv2 != null) {
            aUh.a(aUv2.a(), false);
        }
        if (fck_22.x() == 3) {
            if (aUr2.p() || aUr2.l()) {
                return;
            }
            fis_1.a().a("chat.editedView", aUr2);
            fyc_0.a().c(fug_02);
        } else {
            aUv2.a((auc_0)aUr2);
            fis_1.a().a("chat", "currentView", ((fyb_0)fck_22.e()).getElementMap());
        }
    }

    public static void selectView(aUr aUr2) {
        aUv aUv2 = aUxx.a().a(aUr2);
        if (aUv2 == null) {
            return;
        }
        aUh.a(aUv2.a(), false);
        aUv2.a((auc_0)aUr2);
        fyy_0 fyy_02 = fpm_0.b().h().d(dey.a(aUv2.a()));
        fis_1.a().a("chat", "currentView", fyy_02);
        ChatCommand.a(fyy_02);
    }

    public static void dropView(fcv_2 fcv_22, aUv aUv2, aUr aUr2) {
    }

    public static void dragView(fcp_1 fcp_12, aUv aUv2) {
        aUh.b(aUv2.a(), false);
    }

    public static void dropView(fcx_1 fcx_12, aUv aUv2) {
        cFS.dropView((aUr)fcx_12.l(), fcx_12, aUv2);
    }

    public static void dropView(fcv_2 fcv_22) {
        if (!(fcv_22.m() instanceof aUr)) {
            return;
        }
        aUr aUr2 = (aUr)fcv_22.m();
        cFS.dropView(aUr2, fcv_22, aUxx.a().a(aUr2));
    }

    public static void dropView(aUr aUr2, fck_2 fck_22, aUv aUv2) {
        Object object;
        int n = fck_22.v();
        int n2 = fck_22.w();
        aUv aUv3 = cww_0.c().a(fck_22);
        if (aUv3 != null && g != null) {
            g.setColor(azf_2.b);
        }
        int n3 = aUv2.a();
        if (aUv3 == aUv2) {
            object = cww_0.c().c(fck_22);
            if (aUr2 != object && object != null) {
                int n4 = ((auc_0)object).f();
                aUv2.a(aUr2, false);
                aUv2.a(aUr2, n4);
                aUv2.a((auc_0)aUr2);
                aUxx.a().r();
                aUxx.a().o();
                return;
            }
        } else if (aUv3 != null && aUv3.j() < 4) {
            aUxx.a().a(aUr2, n3, aUv3.a());
            fvk_0 fvk_02 = cww_0.c().b(aUv3.a());
            fvk_02.a(new cGe(fvk_02, aUv3));
            aUxx.a().o();
            aUh.a(aUv3.a(), false);
            aUh.c(n3, false);
            return;
        }
        if (aUv2.j() == 1) {
            object = cww_0.c().b(aUv2.a());
            ((fvE)object).setPosition(n - 50, n2 + 10 - ((fvE)object).getHeight());
            aUh.c(n3, false);
            return;
        }
        if (aUv3 == aUv2) {
            return;
        }
        object = aUxx.a().a(aUr2, n3, -1);
        fvk_0 fvk_03 = (fvk_0)cww_0.c().a((aUv)object, null);
        fvk_03.a(new cFU(fvk_03, n, n2, (aUv)object));
        fvk_0 fvk_04 = cww_0.c().b(n3);
        fvk_04.a(new cFV(fvk_04, aUv2));
        aUxx.a().o();
        aUh.c(n3, false);
        aUh.c(((aUv)object).a(), false);
    }

    public static void createView(fzs fzs2, aUv aUv2) {
        aUv2.b();
        aUxx.a().o();
    }

    public static void openChatOptions(fzs fzs2) {
        azu_0.j().a(cxb_0.a());
    }

    public static void deleteView(aUr aUr2) {
        aUv aUv2 = aUxx.a().b(aUxx.a().b(aUr2));
        aUxx.a().a(aUv2, aUr2, -1);
        fis_1.a().a((ajf_1)aUxx.a(), aUxx.d);
        fis_1.a().a((ajf_1)aUxx.a(), aUxx.d);
        fis_1.a().a((ajf_1)aUv2, aUv.h);
        aUxx.a().o();
        fis_1.a().a("chat.editedView", (Object)null);
    }

    public static void setViewName(fzs fzs2, fug_0 fug_02, aUv aUv2) {
        aUr aUr2 = (aUr)fis_1.a().e("chat.editedView");
        if (aUr2 == null) {
            return;
        }
        aUr2.c(fug_02.getText());
        aUr2.b(true);
        fis_1.a().a((ajf_1)aUr2, aUr.j);
        fis_1.a().a((ajf_1)aUv2, aUv.h);
        aUxx.a().o();
        if (fzs2 instanceof fcz_1 && !((fcz_1)fzs2).j() || fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() == 10) {
            fis_1.a().a("chat.editedView", (Object)null);
            fyc_0.a().c(null);
        }
    }

    public static void activateDisactivateFilter(fzs fzs2, aUr aUr2, String string) {
        aUv aUv2 = aUxx.a().a(aUr2);
        if (aUv2 != null) {
            aUh.c(aUv2.a(), false);
        }
        fup_0 fup_02 = (fup_0)fzs2.d();
        boolean bl = fup_02.getSelected();
        aup_0 aup_02 = aul_0.a().a(string).a();
        cFS.toggleFilter(aUr2, aup_02, bl);
    }

    public static void toggleFilter(aUr aUr2, aup_0 aup_02, boolean bl) {
        eog_0 eog_02;
        if (aup_02 == aup_0.a) {
            return;
        }
        if (aUr2.a(aup_02, bl) && (eog_02 = aup_02.j()) != null) {
            if (bl && aUf.a(aup_02, aup_02.k())) {
                aUf.a(eog_02);
            } else if (!bl && aUf.a(aup_02)) {
                aUf.b(eog_02);
            }
        }
        aUr2.a();
        aUxx.a().o();
    }

    public static void deleteView(fzs fzs2, aUr aUr2) {
        cFS.deleteView(aUr2);
    }

    public static void toggleChatInline(fzs fzs2, fvk_0 fvk_02, aUv aUv2) {
        fis_1 fis_12 = fis_1.a();
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        boolean bl = aUv2.k();
        aUv2.b(!bl);
        if (bl) {
            Integer n = aUv2.l();
            if (n != null) {
                fvk_02.setHeight(n);
                aUv2.a((Integer)null);
                aUxx.a().o();
            }
            if (fvk_02.getSize().getHeight() < (double)aug_0.b.height) {
                fvk_02.setHeight(aug_0.b.height);
            }
            fis_1.a().a("chat.minDimension", (Object)aug_0.b, fvk_02.getElementMap());
        } else {
            aUv2.a((Integer)((int)fvk_02.getSize().getHeight()));
            fvk_02.setHeight(aug_0.c.height);
            aUxx.a().o();
            fis_1.a().a("chat.minDimension", (Object)aug_0.c, fvk_02.getElementMap());
        }
    }

    public static void onMouseEnterChat(fzs fzs2) {
    }

    public static void onMouseExitChat(fzs fzs2) {
    }

    public static void onMouseEnterIntersection(fzs fzs2) {
    }

    public static void onMouseExitIntersection(fzs fzs2) {
    }

    public static void setOverIntersection(fyb_0 fyb_02, boolean bl) {
    }

    public static void goDownText(fzs fzs2, fue_0 fue_02) {
        cFS.goDownText(fzs2, fue_02, true);
    }

    public static void goDownText(fzs fzs2, fue_0 fue_02, boolean bl) {
        if (bl && k.a()) {
            return;
        }
        k.a(fue_02);
        k.a((Boolean)false);
        k.a(true);
        k.run();
        if (bl) {
            ado_1.a().a(k, 100L);
            fta_0.getInstance().addEventListener(frd_0.B, l, true);
        }
    }

    public static void goUpText(fzs fzs2, fue_0 fue_02) {
        cFS.goUpText(fzs2, fue_02, true);
    }

    public static void goUpText(fzs fzs2, fue_0 fue_02, boolean bl) {
        if (bl && k.a()) {
            return;
        }
        k.a(fue_02);
        k.a((Boolean)true);
        k.a(true);
        k.run();
        if (bl) {
            ado_1.a().a(k, 100L);
            fta_0.getInstance().addEventListener(frd_0.B, l, true);
        }
    }

    public static void goDownBundaryText(fzs fzs2, fue_0 fue_02) {
        float f2 = 0.0f;
        fue_02.setVerticalScrollBarPosition(0.0f);
        fis_1.a().a("chat.scrollOffset", (Object)Float.valueOf(fue_02.getVerticalScrollBar().getValue()), ((fyb_0)fzs2.d()).getElementMap().c());
    }

    static void a() {
        ado_1.a().b(k);
        k.a(false);
        fta_0.getInstance().removeEventListener(frd_0.B, l, true);
    }

    static {
        j = new TIntByteHashMap();
        k = new cGf();
        l = new cFW();
    }
}

