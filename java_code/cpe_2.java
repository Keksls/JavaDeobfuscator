/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cPE
 */
public class cpe_2
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
        fvk_02.setPack(true);
        fvk_02.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fvk_02.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso2.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setStyle("windowNew");
        fvk_02.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(10, 5, 12, 5));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.b);
        fin_22.setHorizontal(false);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fvM2.setExpandable(false);
        fso3.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fvM fvM3 = fvM2;
        fqj fqj3 = ((fvE)fvM3).getAppearance();
        fqj3.setElementMap(fyy_03);
        fvM2.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 10, 0, 10));
        fqj3.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj3.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setStyle("titleBar");
        fvM2.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fso fso6 = fso5;
        fqj fqj4 = ((fvE)fso6).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso5.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(3, 20, 3, 20));
        fqj4.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqj4.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setHorizontal(false);
        fso5.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setEnableAutoZoomShrink(true);
        fuk_02.setExpandable(true);
        fuk_02.setMaxSize(new fjf_2(100, 100));
        fuk_02.setMaxWidth(100);
        fuk_02.setNonBlocking(true);
        fuk_02.setShrinkable(true);
        fuk_02.setStyle("titleName16");
        fso7.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 0, 0, 5));
        fqh_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultLightColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("name");
        fiy_12.setLocal(true);
        fiy_12.setName("monsterDetail");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso7.onChildrenAdded();
        fso5.onChildrenAdded();
        fvM2.onChildrenAdded();
        fso fso8 = fso.checkOut();
        fso8.setElementMap(fyy_03);
        fso3.addBasicElement(fso8);
        fso8.onAttributesInitialized();
        fso fso9 = fso8;
        fqj fqj5 = ((fvE)fso9).getAppearance();
        fqj5.setElementMap(fyy_03);
        fso8.addBasicElement(fqj5);
        fqj5.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 12, 0, 12));
        fqj5.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj5.onChildrenAdded();
        String string = "windowContentContainer";
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso10);
        }
        fso8.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setHorizontal(false);
        fso10.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso11 = fso10;
        fqj fqj6 = ((fvE)fso11).getAppearance();
        fqj6.setElementMap(fyy_03);
        fso10.addBasicElement(fqj6);
        fqj6.onAttributesInitialized();
        fqo_0 fqo_04 = new fqo_0();
        fqo_04.onCheckOut();
        fqo_04.setElementMap(fyy_03);
        fqo_04.setInsets(new Insets(0, 0, 0, 3));
        fqj6.addBasicElement(fqo_04);
        fqo_04.onAttributesInitialized();
        fqo_04.onChildrenAdded();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 0, 0, 3));
        fqj6.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqj6.onChildrenAdded();
        String string2 = "creature";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fij_12);
        }
        fso10.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("value");
        fiy_13.setLocal(true);
        fiy_13.setName("monsterDetail");
        fij_12.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fij_12.onChildrenAdded();
        String string3 = "mainContainer";
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fso12);
        }
        fso12.setPrefSize(new fjf_2(200, 220));
        fso10.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fin_2 fin_25 = fin_2.checkOut();
        fin_25.setHorizontal(false);
        fso12.addBasicElement(fin_25);
        fin_25.onAttributesInitialized();
        fin_25.onChildrenAdded();
        fso fso13 = fso.checkOut();
        fso13.setElementMap(fyy_03);
        fso13.setExpandable(false);
        fso12.addBasicElement(fso13);
        fso13.onAttributesInitialized();
        fso fso14 = fso13;
        fqj fqj7 = ((fvE)fso14).getAppearance();
        fqj7.setElementMap(fyy_03);
        fso13.addBasicElement(fqj7);
        fqj7.onAttributesInitialized();
        fqo_0 fqo_05 = new fqo_0();
        fqo_05.onCheckOut();
        fqo_05.setElementMap(fyy_03);
        fqo_05.setInsets(new Insets(2, 2, 2, 2));
        fqj7.addBasicElement(fqo_05);
        fqo_05.onAttributesInitialized();
        fqo_05.onChildrenAdded();
        fqj7.onChildrenAdded();
        String string4 = "creatureName";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fug_02);
        }
        fug_02.setExpandable(false);
        fug_02.a(25);
        fug_02.setMaxWidth(160);
        fug_02.setMinWidth(160);
        fug_02.setPrefSize(new fjf_2(160, 12));
        fug_02.setRestrict("[\\p{L} '\\-\\u00b7]+");
        fso13.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("enabled");
        fiy_14.setName("isInFight");
        fug_02.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fiy_14.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_03);
        far_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_14.onChildrenAdded();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("focusable");
        fiy_15.setName("isInFight");
        fug_02.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_03);
        fiy_15.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fau_1 fau_13 = new fau_1();
        fau_13.onCheckOut();
        fau_13.setElementMap(fyy_03);
        far_23.addBasicElement(fau_13);
        fau_13.onAttributesInitialized();
        fau_13.onChildrenAdded();
        far_23.onChildrenAdded();
        fiy_15.onChildrenAdded();
        fug_02.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.osamodasSymbiot:setCreatureName(creature,creatureName)");
        fru_02.setOnClick(fdt_12);
        String string5 = "%rename%";
        string5 = string5.replace("%rename%", fpm_0.b().c("rename"));
        fru_02.setText(string5);
        fso13.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fiy_1 fiy_16 = fiy_1.checkOut();
        fiy_16.setElementMap(fyy_03);
        fiy_16.setAttribute("enabled");
        fiy_16.setName("isInFight");
        fru_02.addBasicElement(fiy_16);
        fiy_16.onAttributesInitialized();
        far_2 far_24 = new far_2();
        far_24.onCheckOut();
        far_24.setElementMap(fyy_03);
        fiy_16.addBasicElement(far_24);
        far_24.onAttributesInitialized();
        fau_1 fau_14 = new fau_1();
        fau_14.onCheckOut();
        fau_14.setElementMap(fyy_03);
        far_24.addBasicElement(fau_14);
        fau_14.onAttributesInitialized();
        fau_14.onChildrenAdded();
        far_24.onChildrenAdded();
        fiy_16.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso13.onChildrenAdded();
        fso fso15 = fso.checkOut();
        fso15.setElementMap(fyy_03);
        fso15.setExpandable(false);
        fso15.setPrefSize(new fjf_2(0, 7));
        fso15.setStyle("lineSeparator");
        fso12.addBasicElement(fso15);
        fso15.onAttributesInitialized();
        fso15.onChildrenAdded();
        fso fso16 = fso.checkOut();
        fso16.setElementMap(fyy_03);
        fso16.setExpandable(false);
        fso12.addBasicElement(fso16);
        fso16.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fso16.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setEnableAutoZoomShrink(true);
        fsM2.setMaxWidth(220);
        fsM2.setStyle("titleNameBold");
        fso16.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlignment(frs_0.e);
        fsM2.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(5, 5, 5, 5));
        fqh_03.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fiy_1 fiy_17 = fiy_1.checkOut();
        fiy_17.setElementMap(fyy_03);
        fiy_17.setAttribute("text");
        fiy_17.setField("breedAndLevel");
        fiy_17.setLocal(true);
        fiy_17.setName("monsterDetail");
        fsM2.addBasicElement(fiy_17);
        fiy_17.onAttributesInitialized();
        fiy_17.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso16.onChildrenAdded();
        fso fso17 = fso.checkOut();
        fso17.setElementMap(fyy_03);
        fso17.setPrefSize(new fjf_2(125, 200));
        fso12.addBasicElement(fso17);
        fso17.onAttributesInitialized();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fso17.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setStyle("DIMENSIONALBAGAPPEARANCEMANAGERBACKGROUND");
        fso17.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.o);
        fsk_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso fso18 = fso.checkOut();
        fso18.setElementMap(fyy_03);
        fso18.setExpandable(false);
        fso17.addBasicElement(fso18);
        fso18.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.o);
        fid_15.setYOffset(37);
        fso18.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        String string6 = "localPlayerDisplay";
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, frO2);
        }
        frO2.setAnimName("AnimStatique");
        frO2.setDirection(3);
        frO2.setOffsetX(0.0f);
        frO2.setOffsetY(-45.0f);
        frO2.setPrefSize(new fjf_2(125, 125));
        fso18.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        fiy_1 fiy_18 = fiy_1.checkOut();
        fiy_18.setElementMap(fyy_03);
        fiy_18.setAttribute("animatedElement");
        fiy_18.setField("actorDescriptorLibrary");
        fiy_18.setLocal(true);
        fiy_18.setName("monsterDetail");
        frO2.addBasicElement(fiy_18);
        fiy_18.onAttributesInitialized();
        fiy_18.onChildrenAdded();
        fiy_1 fiy_19 = fiy_1.checkOut();
        fiy_19.setElementMap(fyy_03);
        fiy_19.setAttribute("scale");
        fiy_19.setField("actorStandardScale");
        fiy_19.setLocal(true);
        fiy_19.setName("monsterDetail");
        frO2.addBasicElement(fiy_19);
        fiy_19.onAttributesInitialized();
        fiy_19.onChildrenAdded();
        frO2.onChildrenAdded();
        fso18.onChildrenAdded();
        fso17.onChildrenAdded();
        fso fso19 = fso.checkOut();
        fso19.setElementMap(fyy_03);
        fso19.setExpandable(false);
        fso12.addBasicElement(fso19);
        fso19.onAttributesInitialized();
        fin_2 fin_26 = fin_2.checkOut();
        fin_26.setAlign(frs_0.f);
        fso19.addBasicElement(fin_26);
        fin_26.onAttributesInitialized();
        fin_26.onChildrenAdded();
        fso fso20 = fso19;
        fqj fqj8 = ((fvE)fso20).getAppearance();
        fqj8.setElementMap(fyy_03);
        fso19.addBasicElement(fqj8);
        fqj8.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 0, 2, 0));
        fqj8.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqj8.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.osamodasSymbiot:freeCreature(creature)");
        fru_03.setOnClick(fdt_13);
        fde_2 fde_22 = new fde_2();
        fde_22.a("popup(osaFreePopup)");
        fru_03.setOnPopupDisplay(fde_22);
        fdf_2 fdf_22 = new fdf_2();
        fdf_22.a("closePopup");
        fru_03.setOnPopupHide(fdf_22);
        String string7 = "%desc.mru.osaFree%";
        string7 = string7.replace("%desc.mru.osaFree%", fpm_0.b().c("desc.mru.osaFree"));
        fru_03.setText(string7);
        fso19.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        String string8 = "osaFreePopup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fil_12);
        }
        fil_12.setAlign(frs_0.b);
        fil_12.setHotSpotPosition(frs_0.h);
        fru_03.addBasicElement(fil_12);
        fil_12.onAttributesInitialized();
        fso fso21 = fso.checkOut();
        fso21.setElementMap(fyy_03);
        fso21.setPrefSize(new fjf_2(10, 0));
        fso21.setStyle("popup");
        fil_12.addBasicElement(fso21);
        fso21.onAttributesInitialized();
        this.a(fso21);
        this.b(fso21);
        fso21.onChildrenAdded();
        fil_12.onChildrenAdded();
        this.a(fru_03);
        fru_03.onChildrenAdded();
        fso19.onChildrenAdded();
        fso12.onChildrenAdded();
        fso10.onChildrenAdded();
        fso8.onChildrenAdded();
        fso3.onChildrenAdded();
        this.a(fvk_02);
        this.b(fvk_02);
        this.c(fvk_02);
        fvk_02.onChildrenAdded();
        return fvk_02;
    }

    public fyo a(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        return null;
    }

    public fyo b(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_02);
        fuk_02.setEnableShrinking(false);
        fuk_02.setExpandable(false);
        fuk_02.setStyle("white");
        String string = "%desc.osaFree%";
        string = string.replace("%desc.osaFree%", fpm_0.b().c("desc.osaFree"));
        fuk_02.c(string);
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_02);
        fqh_02.setAlignment(frs_0.e);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fuk_02.onChildrenAdded();
        return fuk_02;
    }

    public fyo a(fru_0 fru_02) {
        fyy_0 fyy_02 = this.a.peek();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_02);
        fiy_12.setAttribute("enabled");
        fiy_12.setName("isInFight");
        fru_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_02);
        fiy_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_02);
        far_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_12.onChildrenAdded();
        return fiy_12;
    }

    public fyo a(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_02);
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }

    public fyo b(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        fru_02.setExpandable(false);
        fru_02.setStyle("close");
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fru_02.setOnClick(fdt_12);
        fvk_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.e);
        fid_12.setSize(new fjf_2(-2, -2));
        fid_12.setXOffset(-18);
        fid_12.setYOffset(-12);
        fru_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fru_02.onChildrenAdded();
        return fru_02;
    }

    public fyo c(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setInitValue(true);
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        return fid_12;
    }
}

