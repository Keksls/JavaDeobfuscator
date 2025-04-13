/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.commonIn.SwitchHeroCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cIZ
 */
@fpw_0
public class ciz_0 {
    public static final String PACKAGE = "wakfu.partyList";
    private static final Logger b = Logger.getLogger(ciz_0.class);
    public static boolean a = true;

    public static void deleteMember(fzs fzs2, byr_1 byr_12) {
        dfc dfc2 = new dfc();
        dfc2.a_(16138);
        dfc2.a(byr_12.f());
        add_2.b().a(dfc2);
    }

    public static void setFollowedMember(fcp_2 fcp_22, byr_1 byr_12) {
        dfc dfc2 = new dfc();
        dfc2.a_(17657);
        dfc2.a(byr_12.f());
        dfc2.a(((fup_0)fcp_22.d()).getSelected());
        add_2.b().a(dfc2);
    }

    public static void addMember(fzs fzs2, fug_0 fug_02) {
        String string;
        if ((fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) && (string = fug_02.getText()) != null) {
            dfc dfc2 = new dfc();
            dfc2.a_(19777);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
            fug_02.c("");
        }
    }

    public static void onPlayerOver(fck_2 fck_22, byr_1 byr_12) {
        if (byr_12.k() == -1) {
            return;
        }
        byr_12.a(true);
    }

    public static void onPlayerOut(fck_2 fck_22, byr_1 byr_12) {
        if (byr_12.k() == -1) {
            return;
        }
        byr_12.a(false);
    }

    public static void onPlayerClick(fck_2 fck_22, byr_1 byr_12) {
        boolean bl;
        long l;
        bmr_1 bmr_12 = azu_0.j().k();
        if (byr_12.f() == bmr_12.a_()) {
            return;
        }
        if (fck_22.x() == 1 && byr_12.k() != -1) {
            SwitchHeroCommand.a(byr_12.f());
            return;
        }
        if (fck_22.x() != 3) {
            return;
        }
        fts_0 fts_02 = fpm_0.b().o();
        fts_02.setHotSpotPosition(frs_0.d);
        epl_0 epl_02 = byr_12.i();
        fts_02.a(epl_02.a(), null);
        boolean bl2 = byr_12.i().v();
        boolean bl3 = byr_12.i().w();
        bmr_1 bmr_13 = bzf_1.a();
        long l2 = l = bmr_13 != null ? bmr_13.a_() : 0L;
        if (bmr_12.dE().a().a() == bmr_12.a_() || (bl2 || bl3) && byr_12.i().o() == azu_0.j().n().u()) {
            fts_02.a(bae.h().a("party.deleteMember", new Object[0]), null, new cja_0(byr_12), !epl_02.s());
        }
        if (bmr_12.dE().a().a() == bmr_12.a_() && !bl2 && !bl3) {
            fts_02.a(bae.h().a("party.giveLead", new Object[0]), null, new cjb_0(byr_12), !epl_02.s());
        }
        boolean bl4 = bl = aUL.a().e().a(epl_02.o()) != null;
        if (!(bl || bl2 || bl3)) {
            fts_02.a(bae.h().a("chat.addToFriendList", new Object[0]), null, new cjc_0(epl_02), true);
        }
        if (!bl2 && !bl3) {
            boolean bl5 = blq_0.c().a(0, epl_02.f());
            if (bl5) {
                fts_02.a(bae.h().a("group.party.unFollowMember", new Object[0]), null, new cJd(epl_02), epl_02.h() == bmr_12.T_());
            } else {
                fts_02.a(bae.h().a("group.party.followMember", new Object[0]), null, new cje_0(epl_02), epl_02.h() == bmr_12.T_());
            }
        }
        if (!(bl2 || bl3 && byr_12.g() != bmr_12.R())) {
            bnh_1 bnh_12 = bmf_2.a().c(epl_02.f()) != null ? (bnh_1)bmf_2.a().c(epl_02.f()) : (bnh_1)euw_2.a.d(epl_02.f());
            byp_2 byp_22 = byp_2.a();
            if (byp_22.a(bnh_12)) {
                fts_02.a(bae.h().a("desc.mru.inviteToJoinGuild", epl_02.a()), null, new cjf_0(epl_02), true);
            }
        }
        fpm_0.b().a(fts_02, fyf_0.a().c() + 20, fyf_0.a().d());
    }

    public static void openInviteDialog(fzs fzs2) {
        fpm_0.b().a("partyListInviteDialog", cfi_0.a("partyListInviteDialog"), 257L, (short)10000);
    }

    public static void invite(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string != null) {
            azu_0.j().k().dE().a(string);
        }
        fpm_0.b().o("partyListInviteDialog");
    }

    public static void leaveParty(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16138);
        dfc2.a(azu_0.j().k().a_());
        add_2.b().a(dfc2);
    }

    public static void minimizeMaximizeDialog(fzs fzs2, fso fso2, fsk_0 fsk_02) {
        a = !a;
        fso2.setVisible(a);
        fsk_02.setStyle(a ? "yellowLeftArrow" : "yellowRightArrow");
    }
}

