/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLv
 */
public class clv_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        fvk_02.setPrefSize(new fjf_2(800, 300));
        fvk_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setInitValue(true);
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setExpandable(false);
        fso2.setNonBlocking(false);
        fso2.setPrefSize(new fjf_2(18, 100));
        fso2.setStyle("itemInventoryBarBackground");
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fso2.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fih_22.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.a);
        fvM2.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fih_2 fih_23 = new fih_2();
        fih_23.onCheckOut();
        fvM2.addBasicElement(fih_23);
        fih_23.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setOrientation(frh_0.a);
        fsM2.setStyle("bold");
        fsM2.c("Editeur de personnage");
        fih_23.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.a);
        fsM2.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 0, 20, 0));
        fqh_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("smallDelete");
        fih_23.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fii_2 fii_24 = fii_2.checkOut();
        fii_24.setElementMap(fyy_03);
        fii_24.setData(frg_0.b);
        fru_02.addBasicElement(fii_24);
        fii_24.onAttributesInitialized();
        fii_24.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(10, 0, 0, 0));
        fqd_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fih_23.onChildrenAdded();
        fvM2.onChildrenAdded();
        fih_22.onChildrenAdded();
        fso2.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setNonBlocking(false);
        fso3.setStyle("brownInventoryBackground");
        fvk_02.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(15, 5, 10, 7));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso3.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.b);
        fin_23.setHorizontal(false);
        fso5.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_03);
        fso6.setExpandable(false);
        fso5.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.d);
        fso6.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setExpandable(false);
        fsM4.setStyle("whiteTitle");
        String string = "Niveau du personnage%colon%";
        string = string.replace("%colon%", fpm_0.b().c("colon"));
        fsM4.c(string);
        fso6.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM4.onChildrenAdded();
        String string2 = "level";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fug_02);
        }
        fug_02.setExpandable(false);
        fug_02.setPrefSize(new fjf_2(150, 0));
        fug_02.setRestrict("[0-9]+");
        fug_02.setStyle("dark");
        fso6.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("level");
        fiy_12.setName("localPlayer");
        fug_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fug_02.onChildrenAdded();
        fru_0 fru_04 = new fru_0();
        fru_04.onCheckOut();
        fru_04.setElementMap(fyy_03);
        fru_04.setExpandable(false);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.adminCharacterEditor:validLevel");
        fru_04.setOnClick(fdt_13);
        fru_04.setStyle("smallValid");
        fso6.addBasicElement(fru_04);
        fru_04.onAttributesInitialized();
        fru_04.onChildrenAdded();
        fur_0 fur_02 = new fur_0();
        fur_02.onCheckOut();
        fur_02.setElementMap(fyy_03);
        fso6.addBasicElement(fur_02);
        fur_02.onAttributesInitialized();
        fur_02.onChildrenAdded();
        fru_0 fru_05 = new fru_0();
        fru_05.onCheckOut();
        fru_05.setElementMap(fyy_03);
        fru_05.setExpandable(false);
        fdt_1 fdt_14 = new fdt_1();
        fdt_14.a("wakfu.adminCharacterEditor:openCharacterColorEditor");
        fru_05.setOnClick(fdt_14);
        fru_05.setText("\u00c9diter les couleurs");
        fso6.addBasicElement(fru_05);
        fru_05.onAttributesInitialized();
        fru_0 fru_06 = fru_05;
        fqd_0 fqd_03 = (fqd_0)((fvE)fru_06).getAppearance();
        fqd_03.setElementMap(fyy_03);
        fru_05.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(2, 10, 2, 10));
        fqd_03.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 0, 0, 10));
        fqd_03.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fru_05.onChildrenAdded();
        fso6.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso7.setExpandable(false);
        fso7.setPrefSize(new fjf_2(0, 7));
        fso7.setStyle("lineSeparator");
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fso fso8 = fso7;
        fqj fqj3 = ((fvE)fso8).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso7.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(5, 0, 2, 0));
        fqj3.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqj3.onChildrenAdded();
        fso7.onChildrenAdded();
        fsM fsM5 = new fsM();
        fsM5.onCheckOut();
        fsM5.setElementMap(fyy_03);
        fsM5.setExpandable(false);
        fsM5.setStyle("whiteTitle");
        fsM5.c("Sorts (setLevel) :");
        fso5.addBasicElement(fsM5);
        fsM5.onAttributesInitialized();
        fsM5.onChildrenAdded();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_03);
        fsQ2.setCellSize(new fjf_2(350, 25));
        fsQ2.setExpandable(false);
        fsQ2.setHorizontal(false);
        fsQ2.setPrefSize(new fjf_2(350, 150));
        fso5.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("content");
        fiy_13.setName("spellsList");
        fsQ2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_03);
        fsQ2.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        faf_22.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fav_1 fav_12 = new fav_1();
        fav_12.onCheckOut();
        fav_12.setElementMap(fyy_03);
        far_22.addBasicElement(fav_12);
        fav_12.onAttributesInitialized();
        fab_2 fab_22 = new fab_2();
        fab_22.onCheckOut();
        fab_22.setElementMap(fyy_03);
        fav_12.addBasicElement(fab_22);
        fab_22.onAttributesInitialized();
        fab_22.onChildrenAdded();
        fav_12.onChildrenAdded();
        far_22.onChildrenAdded();
        String string3 = "spell";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fij_12);
        }
        faf_22.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("value");
        fij_12.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fij_12.onChildrenAdded();
        fso fso9 = fso.checkOut();
        fso9.setElementMap(fyy_03);
        faf_22.addBasicElement(fso9);
        fso9.onAttributesInitialized();
        fin_2 fin_25 = fin_2.checkOut();
        fin_25.setAlign(frs_0.d);
        fso9.addBasicElement(fin_25);
        fin_25.onAttributesInitialized();
        fin_25.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setDisplaySize(new fjf_2(26, 26));
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fsk_02.setPrefSize(new fjf_2(39, 0));
        fsk_02.setScaled(false);
        fso9.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_03);
        fir_13.setAttribute("texture");
        fir_13.setField("smallIconUrl");
        fqv2.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsM fsM6 = new fsM();
        fsM6.onCheckOut();
        fsM6.setElementMap(fyy_03);
        fsM6.setExpandable(false);
        fsM6.setPrefSize(new fjf_2(200, 0));
        fsM6.setStyle("whiteBold");
        fso9.addBasicElement(fsM6);
        fsM6.onAttributesInitialized();
        fir_1 fir_14 = new fir_1();
        fir_14.onCheckOut();
        fir_14.setElementMap(fyy_03);
        fir_14.setAttribute("text");
        fir_14.setField("name");
        fsM6.addBasicElement(fir_14);
        fir_14.onAttributesInitialized();
        fir_14.onChildrenAdded();
        fsM6.onChildrenAdded();
        String string4 = "spellLevelEditor";
        fug_0 fug_03 = new fug_0();
        fug_03.onCheckOut();
        fug_03.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fug_03);
        }
        fug_03.setExpandable(false);
        fug_03.setPrefSize(new fjf_2(50, 0));
        fug_03.setRestrict("[0-9]+");
        fug_03.setStyle("dark");
        fso9.addBasicElement(fug_03);
        fug_03.onAttributesInitialized();
        fir_1 fir_15 = new fir_1();
        fir_15.onCheckOut();
        fir_15.setElementMap(fyy_03);
        fir_15.setAttribute("text");
        fir_15.setField("level");
        fug_03.addBasicElement(fir_15);
        fir_15.onAttributesInitialized();
        fir_15.onChildrenAdded();
        fug_03.onChildrenAdded();
        fru_0 fru_07 = new fru_0();
        fru_07.onCheckOut();
        fru_07.setElementMap(fyy_03);
        fru_07.setExpandable(false);
        fdt_1 fdt_15 = new fdt_1();
        fdt_15.a("wakfu.adminCharacterEditor:validSpellLevel(spell,spellLevelEditor)");
        fru_07.setOnClick(fdt_15);
        fru_07.setStyle("smallValid");
        fso9.addBasicElement(fru_07);
        fru_07.onAttributesInitialized();
        fru_07.onChildrenAdded();
        fso9.onChildrenAdded();
        faf_22.onChildrenAdded();
        fsQ2.onChildrenAdded();
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        fso10.setExpandable(false);
        fso10.setPrefSize(new fjf_2(0, 7));
        fso10.setStyle("lineSeparator");
        fso5.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fso fso11 = fso10;
        fqj fqj4 = ((fvE)fso11).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso10.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(5, 0, 2, 0));
        fqj4.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqj4.onChildrenAdded();
        fso10.onChildrenAdded();
        fsM fsM7 = new fsM();
        fsM7.onCheckOut();
        fsM7.setElementMap(fyy_03);
        fsM7.setExpandable(false);
        fsM7.setStyle("whiteTitle");
        fsM7.c("Skills \u00e0 apprendre :");
        fso5.addBasicElement(fsM7);
        fsM7.onAttributesInitialized();
        fsM7.onChildrenAdded();
        fsQ fsQ3 = new fsQ();
        fsQ3.onCheckOut();
        fsQ3.setElementMap(fyy_03);
        fsQ3.setCellSize(new fjf_2(350, 25));
        fsQ3.setExpandable(false);
        fsQ3.setHorizontal(false);
        fsQ3.setPrefSize(new fjf_2(350, 100));
        fso5.addBasicElement(fsQ3);
        fsQ3.onAttributesInitialized();
        fsQ fsQ4 = fsQ3;
        fqr fqr2 = (fqr)((fvE)fsQ4).getAppearance();
        fqr2.setElementMap(fyy_03);
        fsQ3.addBasicElement(fqr2);
        fqr2.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 0, 10, 0));
        fqr2.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqr2.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("content");
        fiy_14.setName("craftSkillsList");
        fsQ3.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        faf_2 faf_23 = new faf_2();
        faf_23.onCheckOut();
        faf_23.setElementMap(fyy_03);
        fsQ3.addBasicElement(faf_23);
        faf_23.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_03);
        faf_23.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fav_1 fav_13 = new fav_1();
        fav_13.onCheckOut();
        fav_13.setElementMap(fyy_03);
        far_23.addBasicElement(fav_13);
        fav_13.onAttributesInitialized();
        fab_2 fab_23 = new fab_2();
        fab_23.onCheckOut();
        fab_23.setElementMap(fyy_03);
        fav_13.addBasicElement(fab_23);
        fab_23.onAttributesInitialized();
        fab_23.onChildrenAdded();
        fav_13.onChildrenAdded();
        far_23.onChildrenAdded();
        String string5 = "skill";
        fij_1 fij_13 = new fij_1();
        fij_13.onCheckOut();
        fij_13.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fij_13);
        }
        faf_23.addBasicElement(fij_13);
        fij_13.onAttributesInitialized();
        fir_1 fir_16 = new fir_1();
        fir_16.onCheckOut();
        fir_16.setElementMap(fyy_03);
        fir_16.setAttribute("value");
        fij_13.addBasicElement(fir_16);
        fir_16.onAttributesInitialized();
        fir_16.onChildrenAdded();
        fij_13.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        faf_23.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso12.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        this.a(fso12);
        this.b(fso12);
        fso12.onChildrenAdded();
        faf_23.onChildrenAdded();
        fsQ3.onChildrenAdded();
        this.c(fso5);
        this.d(fso5);
        fso5.onChildrenAdded();
        fso3.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }

    public fyo a(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.adminCharacterEditor:learnSkill(skill)");
        fru_02.setOnClick(fdt_12);
        fso2.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fru_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fru_02.onChildrenAdded();
        return fru_02;
    }

    public fyo b(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_02);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_02);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_02);
        fqo_02.setInsets(new Insets(5, 5, 5, 5));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.d);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_02);
        fsk_02.setDisplaySize(new fjf_2(26, 26));
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fsk_02.setPrefSize(new fjf_2(30, 0));
        fsk_02.setScaled(false);
        fso3.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_02);
        fir_12.setAttribute("style");
        fir_12.setField("craftIcon");
        fsk_02.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setExpandable(false);
        fsM2.setNonBlocking(true);
        fsM2.setPrefSize(new fjf_2(200, 0));
        fsM2.setStyle("bold");
        fso3.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_02);
        fir_13.setAttribute("text");
        fir_13.setField("name");
        fsM2.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso3.onChildrenAdded();
        return fso3;
    }

    public fyo c(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setExpandable(false);
        fsM2.setStyle("whiteTitle");
        fsM2.c("Skills (addXp) :");
        fso2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        return fsM2;
    }

    public fyo d(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_02);
        fsQ2.setCellSize(new fjf_2(360, 25));
        fsQ2.setExpandable(false);
        fsQ2.setHorizontal(false);
        fsQ2.setPrefSize(new fjf_2(360, 100));
        fso2.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_02);
        fiy_12.setAttribute("content");
        fiy_12.setField("craft/allKnownCrafts");
        fiy_12.setName("localPlayer");
        fsQ2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_02);
        fsQ2.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_02);
        faf_22.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fan_2 fan_22 = new fan_2();
        fan_22.onCheckOut();
        fan_22.setElementMap(fyy_02);
        far_22.addBasicElement(fan_22);
        fan_22.onAttributesInitialized();
        fav_1 fav_12 = new fav_1();
        fav_12.onCheckOut();
        fav_12.setElementMap(fyy_02);
        fan_22.addBasicElement(fav_12);
        fav_12.onAttributesInitialized();
        fab_2 fab_22 = new fab_2();
        fab_22.onCheckOut();
        fab_22.setElementMap(fyy_02);
        fav_12.addBasicElement(fab_22);
        fab_22.onAttributesInitialized();
        fab_22.onChildrenAdded();
        fav_12.onChildrenAdded();
        fav_1 fav_13 = new fav_1();
        fav_13.onCheckOut();
        fav_13.setElementMap(fyy_02);
        fav_13.setField("isUnknown");
        fan_22.addBasicElement(fav_13);
        fav_13.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_02);
        fav_13.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        fav_13.onChildrenAdded();
        fan_22.onChildrenAdded();
        far_22.onChildrenAdded();
        String string = "skill";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fij_12);
        }
        faf_22.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_02);
        fir_12.setAttribute("value");
        fij_12.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fij_12.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_02);
        faf_22.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.d);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_02);
        fsk_02.setDisplaySize(new fjf_2(26, 26));
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fsk_02.setPrefSize(new fjf_2(30, 0));
        fsk_02.setScaled(false);
        fso3.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_02);
        fir_13.setAttribute("style");
        fir_13.setField("craftIcon");
        fsk_02.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fsk_0 fsk_03 = fsk_02;
        fqp fqp2 = (fqp)((fvE)fsk_03).getAppearance();
        fqp2.setElementMap(fyy_02);
        fsk_02.addBasicElement(fqp2);
        fqp2.onAttributesInitialized();
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_02);
        fbf_12.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqp2.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fbf_12.onChildrenAdded();
        fbh_1 fbh_12 = new fbh_1();
        fbh_12.onCheckOut();
        fbh_12.setElementMap(fyy_02);
        fbh_12.setColor(new azf_2(0.2f, 0.2f, 0.2f, 1.0f));
        fbh_12.setInsets(new Insets(1, 1, 1, 1));
        fqp2.addBasicElement(fbh_12);
        fbh_12.onAttributesInitialized();
        fbh_12.onChildrenAdded();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_02);
        fqm_02.setInsets(new Insets(0, 0, 0, 9));
        fqp2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqp2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setExpandable(false);
        fsM2.setPrefSize(new fjf_2(180, 0));
        fsM2.setStyle("whiteBold");
        fso3.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fir_1 fir_14 = new fir_1();
        fir_14.onCheckOut();
        fir_14.setElementMap(fyy_02);
        fir_14.setAttribute("text");
        fir_14.setField("name");
        fsM2.addBasicElement(fir_14);
        fir_14.onAttributesInitialized();
        fir_14.onChildrenAdded();
        fsM2.onChildrenAdded();
        fsM fsM3 = new fsM();
        fsM3.onCheckOut();
        fsM3.setElementMap(fyy_02);
        fsM3.setExpandable(false);
        fsM3.setPrefSize(new fjf_2(50, 0));
        fsM3.setStyle("whiteBold");
        fso3.addBasicElement(fsM3);
        fsM3.onAttributesInitialized();
        fir_1 fir_15 = new fir_1();
        fir_15.onCheckOut();
        fir_15.setElementMap(fyy_02);
        fir_15.setAttribute("text");
        fir_15.setField("levelText");
        fsM3.addBasicElement(fir_15);
        fir_15.onAttributesInitialized();
        fir_15.onChildrenAdded();
        fsM3.onChildrenAdded();
        String string2 = "skillXpEditor";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fug_02);
        }
        fug_02.setExpandable(false);
        fug_02.setPrefSize(new fjf_2(50, 0));
        fug_02.setRestrict("[0-9]+");
        fug_02.setStyle("dark");
        fug_02.c("0");
        fso3.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fug_02.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.adminCharacterEditor:addSkillXp(skill,skillXpEditor)");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("smallValid");
        fso3.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fir_1 fir_16 = new fir_1();
        fir_16.onCheckOut();
        fir_16.setElementMap(fyy_02);
        fir_16.setAttribute("enabled");
        fir_16.setField("isConceptual");
        fru_02.addBasicElement(fir_16);
        fir_16.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_02);
        fir_16.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fau_1 fau_13 = new fau_1();
        fau_13.onCheckOut();
        fau_13.setElementMap(fyy_02);
        far_23.addBasicElement(fau_13);
        fau_13.onAttributesInitialized();
        fau_13.onChildrenAdded();
        far_23.onChildrenAdded();
        fir_16.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso3.onChildrenAdded();
        faf_22.onChildrenAdded();
        fsQ2.onChildrenAdded();
        return fsQ2;
    }
}

