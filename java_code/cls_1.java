/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLs
 */
public class cls_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "mainContainer";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.controlCenter:openAchievementsDialog(achievement)");
        fso2.setOnClick(fdt_12);
        fso2.setPrefSize(new fjf_2(311, 135));
        fso2.setStyle("AchievementUnlockedSplashScaled");
        fso2.onAttributesInitialized();
        String string2 = "achievement";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fij_12);
        }
        fso2.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("value");
        fiy_12.setName("unlockedAchievement");
        fij_12.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fij_12.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.c);
        fid_12.setYOffset(-50);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(0, 25, 0, 75));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setExpandable(false);
        fso4.setNonBlocking(true);
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.d);
        fso4.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fso fso5 = fso4;
        fqj fqj3 = ((fvE)fso5).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso4.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 35, 0, 0));
        fqj3.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj3.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.d);
        fso4.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        String string3 = "splashContainer";
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fso6);
        }
        fso6.setExpandable(false);
        fso6.setNonBlocking(true);
        fso6.setPrefSize(new fjf_2(45, 40));
        fso4.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        String string4 = "icon";
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fsk_02);
        }
        fsk_02.setDisplaySize(new fjf_2(40, 40));
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fso6.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fsk_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("texture");
        fiy_13.setField("iconUrl");
        fiy_13.setName("unlockedAchievement");
        fqv2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso6.onChildrenAdded();
        String string5 = "text";
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fsM2);
        }
        fsM2.setExpandable(false);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("title");
        fso4.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultLightColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 10, 0, 0));
        fqh_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("text");
        fiy_14.setField("isQuest");
        fiy_14.setName("unlockedAchievement");
        fsM2.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        String string6 = "%achievement.achievementUnlocked%";
        string6 = string6.replace("%achievement.achievementUnlocked%", fpm_0.b().c("achievement.achievementUnlocked"));
        far_22.setElseValue(string6);
        String string7 = "%achievement.questUnlocked%";
        string7 = string7.replace("%achievement.questUnlocked%", fpm_0.b().c("achievement.questUnlocked"));
        far_22.setValue(string7);
        fiy_14.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fai_1 fai_12 = new fai_1();
        fai_12.onCheckOut();
        fai_12.setElementMap(fyy_03);
        far_22.addBasicElement(fai_12);
        fai_12.onAttributesInitialized();
        fai_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_14.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso4.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso7.setExpandable(false);
        fso7.setNonBlocking(true);
        fso2.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.d);
        fso7.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso8 = fso7;
        fqj fqj4 = ((fvE)fso8).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso7.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(5, 25, 0, 0));
        fqj4.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj4.onChildrenAdded();
        String string8 = "starIcon";
        fsk_0 fsk_03 = new fsk_0();
        fsk_03.onCheckOut();
        fsk_03.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fsk_03);
        }
        fsk_03.setExpandable(false);
        fsk_03.setNonBlocking(true);
        fsk_03.setStyle("valid");
        fso7.addBasicElement(fsk_03);
        fsk_03.onAttributesInitialized();
        fsk_03.onChildrenAdded();
        String string9 = "nameText";
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        if (fyy_03 != null && string9 != null) {
            fyy_03.a(string9, fsM4);
        }
        fsM4.setExpandable(false);
        fsM4.setNonBlocking(true);
        fsM4.setStyle("bold");
        fso7.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM fsM5 = fsM4;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlignment(frs_0.d);
        fsM4.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 5, 0, 0));
        fqh_03.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("defaultLightColor"));
        fqh_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("text");
        fiy_15.setField("name");
        fiy_15.setName("unlockedAchievement");
        fsM4.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        fiy_15.onChildrenAdded();
        fsM4.onChildrenAdded();
        fso7.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

