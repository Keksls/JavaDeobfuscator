/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGR {
    public static final String PACKAGE = "wakfu.eventsCalendar";

    public static void closeDialog(fzs fzs2) {
        if (azu_0.j().c(cYA.a())) {
            azu_0.j().b(cYA.a());
        } else {
            azu_0.j().a(cYA.a());
        }
    }

    public static void changeCurrentMonth(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bvv_1 bvv_12 = (bvv_1)fcf_22.l();
            bvt_2.a().a(bvv_12.a());
        }
    }

    public static void changeCurrentYear(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            Integer n = (Integer)fcf_22.l();
            bvt_2.a().b(n);
        }
    }

    public static void changeEditableCurrentMonth(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bvr_2 bvr_22 = (bvr_2)fis_1.a().e("calendar.editable");
            bvv_1 bvv_12 = (bvv_1)fcf_22.l();
            bvr_22.b(bvv_12.a());
        }
    }

    public static void changeEditableCurrentYear(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bvr_2 bvr_22 = (bvr_2)fis_1.a().e("calendar.editable");
            Integer n = (Integer)fcf_22.l();
            bvr_22.c(n);
        }
    }

    public static void displayEventDescriptionPopup(fcb_2 fcb_22, fil_1 fil_12) {
        fis_1.a().a("calendar.event.detail", fcb_22.j());
        fpu_0.popup(fil_12, (fvE)fcb_22.e());
    }

    public static void hideEventDescriptionPopup(fzs fzs2, fil_1 fil_12) {
        fpu_0.closePopup(fzs2, fil_12);
    }

    public static void openCreateEventDialog(fzs fzs2) {
        dfc.d((short)17249);
    }

    public static void openEditEventDialog(fcb_2 fcb_22) {
        dgc dgc2 = new dgc();
        dgc2.a_(19515);
        dgc2.a((bvw_1)fcb_22.j());
        add_2.b().a(dgc2);
    }

    public static void selectStartDate(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16206);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void selectEndDate(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16206);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void closeCalendar(fzs fzs2) {
        dfc.d((short)16206);
    }

    public static void selectDate(fzs fzs2, fsb fsb2, fvk fvk2, fvk fvk3) {
        dfc dfc2 = new dfc();
        dfc2.a_(19786);
        dfc2.a((byte)fsb2.getDayOver());
        dfc2.a((short)fsb2.getMonthOver());
        dfc2.b(fsb2.getYearOver());
        dfc2.a(fvk2.getValue());
        dfc2.a((float)fvk3.getValue());
        add_2.b().a(dfc2);
    }

    public static void setParticipantsLimited(fcp_2 fcp_22) {
        bvw_1 bvw_12 = (bvw_1)fis_1.a().e("calendar.event.editable");
        bvw_12.a(fcp_22.j());
    }

    public static void changeMaxParticipants(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        String string = fug_02.getText();
        if (string.length() == 0 || string.equals("0")) {
            fug_02.c(String.valueOf(2));
        }
    }

    public static void changeMaxRegistrations(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        String string = fug_02.getText();
        if (string.length() == 0 || string.equals("0")) {
            fug_02.c(String.valueOf(2));
        }
    }

    public static void closeCreateEventDialog(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(19727);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void closeEditEventDialog(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16188);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void createEvent(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04, fug_0 fug_05) {
        String string = fug_02.getText();
        String string2 = fug_03.getText();
        if (string.length() == 0) {
            fpm_0.b().a(bae.h().a("calendar.event.creation.formIncomplete", new Object[0]), cfn_0.a(1), 2L, 102, 1000);
            return;
        }
        byte by = Co.a((Object)fug_05.getText(), (byte)0);
        byte by2 = Co.a((Object)fug_04.getText(), (byte)0);
        dgb dgb2 = new dgb(string, string2, by2, by);
        dgb2.a_(19727);
        dgb2.a(true);
        add_2.b().a(dgb2);
    }

    public static void editEvent(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04, fug_0 fug_05) {
        String string = fug_02.getText();
        String string2 = fug_03.getText();
        if (string.length() == 0 || string2.length() == 0) {
            fpm_0.b().a(bae.h().a("calendar.event.creation.formIncomplete", new Object[0]), cfn_0.a(1), 2L, 102, 1000);
            return;
        }
        byte by = Co.a((Object)fug_05.getText(), (byte)-1);
        byte by2 = Co.a((Object)fug_04.getText(), (byte)-1);
        dgb dgb2 = new dgb(string, string2, by2, by);
        dgb2.a_(16188);
        dgb2.a(true);
        add_2.b().a(dgb2);
    }

    public static void registerEvent(fzs fzs2) {
        dfc.d((short)17746);
    }

    public static void unregisterEvent(fzs fzs2) {
        dfc.d((short)17421);
    }

    public static void setEventType(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        byte by = Byte.parseByte(ftI2.getValue());
        bvw_1 bvw_12 = (bvw_1)fis_1.a().e("calendar.event.editable");
        bvw_12.c(by);
        if (!fcp_22.j()) {
            bvw_12.a(false);
        }
    }

    public static void setGuildEvent(fcp_2 fcp_22) {
        byte by = fcp_22.j() ? (byte)2 : 1;
        bvw_1 bvw_12 = (bvw_1)fis_1.a().e("calendar.event.editable");
        bvw_12.c(by);
        if (!fcp_22.j()) {
            bvw_12.a(false);
        }
    }

    public static void validate(fzs fzs2, fsQ fsQ2) {
        bvq_2 bvq_22 = (bvq_2)fsQ2.getSelectedValue();
        if (bvq_22 != null) {
            dfc dfc2 = new dfc();
            dfc2.a_(19464);
            dfc2.a(bvq_22.b());
            add_2.b().a(dfc2);
        }
    }

    public static void unvalidate(fzs fzs2, fsQ fsQ2) {
        bvq_2 bvq_22 = (bvq_2)fsQ2.getSelectedValue();
        if (bvq_22 != null) {
            dfc dfc2 = new dfc();
            dfc2.a_(17033);
            dfc2.a(bvq_22.b());
            add_2.b().a(dfc2);
        }
    }

    public static void inviteAllParticipants(fzs fzs2) {
        dfc.d((short)19235);
    }

    public static void inviteToEvent(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string.length() == 0) {
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(19430);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void deleteEvent(fzs fzs2) {
        dfc.d((short)19073);
    }
}

