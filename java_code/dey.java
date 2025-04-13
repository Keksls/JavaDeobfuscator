/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dey {
    private static final Logger b = Logger.getLogger(dey.class);

    private dey() {
    }

    public static fyb_0 a(aUv aUv2, String string) {
        String string2 = dey.a(aUv2.a());
        if (fpm_0.b().q(string2)) {
            fpm_0.b().o(string2);
        }
        fyb_0 fyb_02 = string == null ? fpm_0.b().a(string2, cfi_0.a("chatDialog"), 9217L, (short)10000) : fpm_0.b().a(string2, cfi_0.a("chatDialog"), string, string, "chatDialog", 9217L, (short)10000);
        fis_1.a().a("chat", (Object)aUv2, string2);
        fis_1.a().a("chat.channels.list.displayed", (Object)false, string2);
        fis_1.a().a("chat.scrollOffset", (Object)Float.valueOf(-1.0f), string2);
        boolean bl = aUv2.k();
        fis_1.a().a("chat.minDimension", (Object)(bl ? aug_0.c : aug_0.b), string2);
        return fyb_02;
    }

    public static String a(int n) {
        return "chatDialog" + n;
    }

    public static void a(int n, dep dep2, boolean bl) {
        fsQ fsQ2;
        fyy_0 fyy_02;
        fvk_0 fvk_02 = dep2.a();
        if (!bl && fvk_02 != null) {
            fis_1.a().a("chat.channels.list.displayed", (Object)false, fvk_02.getElementMap());
        }
        if ((fyy_02 = fpm_0.b().h().d(dey.a(n))) == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("textEditorRenderableContainer.chatInput");
        fvE fvE3 = fyc_0.a().b();
        if (fvE3 != null && (fvE3 == fvE2 || "viewNameEditor".equals(fvE3.getId())) && !bl) {
            return;
        }
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        ArrayList<fqt> arrayList2 = new ArrayList<fqt>();
        ArrayList<fqt> arrayList3 = new ArrayList<fqt>();
        ArrayList<fqt> arrayList4 = new ArrayList<fqt>();
        dey.a(fyy_02, "chatMainContainer", arrayList2);
        aUv aUv2 = aUxx.a().b(n);
        if (aUv2 == null || aUv2.h() == null) {
            b.error((Object)("Erreur au fade de la fenetre de chat d'id=" + n));
            return;
        }
        if (!aUv2.h().l()) {
            fsQ2 = (fsQ)fyy_02.a("filterList");
            dey.a(fsQ2, bl);
        }
        if (fvE2 == null) {
            b.warn((Object)"le textEditor n'existe pas");
        } else {
            arrayList3.add(fvE2.getAppearance());
        }
        dey.a(fyy_02, "alphaCorner", arrayList2);
        dey.a(fyy_02, "addButton", arrayList);
        dey.a(fyy_02, "addLabel", arrayList);
        fsQ2 = (fsQ)fyy_02.a("viewsList");
        for (ftj_0 ftj_02 : fsQ2.getRenderables()) {
            fyy_0 fyy_03 = ftj_02.getInnerElementMap();
            if (fyy_03 == null) continue;
            Object object = ftj_02.getItemValue();
            if (object != null && object.equals(aUv2.h())) {
                dey.a(fyy_03, "viewLabel", arrayList4);
            } else {
                dey.a(fyy_03, "viewLabel", arrayList3);
            }
            dey.a(fyy_03, "viewButton", arrayList2);
            dey.a(fyy_03, "viewDeleteButton", arrayList2);
        }
        dey.a(bl, fvk_02, arrayList, arrayList2, arrayList3, arrayList4);
        dey.a(fyy_02, !bl);
    }

    private static void a(fab_1 fab_12, boolean bl) {
        ArrayList<ftj_0> arrayList = fab_12.getRenderables();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            auxx_0 auxx_02;
            ftj_0 ftj_02 = arrayList.get(k);
            fyy_0 fyy_02 = ftj_02.getInnerElementMap();
            if (fyy_02 == null || (auxx_02 = (auxx_0)ftj_02.getItemValue()) == null) continue;
            fvE fvE2 = (fvE)fyy_02.a("filterBg");
            fvE fvE3 = (fvE)fyy_02.a("filterBtn");
            fvE2.removeTweensOfType(fjp_2.class);
            fvE3.removeTweensOfType(fjp_2.class);
            if (bl) {
                fvE2.addTween(new fjp_2(azf_2.b, azf_2.e, fvE2.getAppearance(), 0, 1000, 1, false, fjw_2.b));
                fvE3.addTween(new fjp_2(azf_2.b, auxx_02.a(), fvE3.getAppearance(), 0, 1000, 1, false, fjw_2.b));
                continue;
            }
            fvE2.addTween(new fjp_2(azf_2.e, azf_2.b, fvE2.getAppearance(), 0, 1000, 1, false, fjw_2.b));
            fvE3.addTween(new fjp_2(auxx_02.a(), azf_2.b, fvE3.getAppearance(), 0, 1000, 1, false, fjw_2.b));
        }
    }

    public static void a(fvk_0 fvk_02) {
        fru_0 fru_02 = (fru_0)fvk_02.getElementMap().a("downBundaryButton");
        azf_2 azf_22 = azf_2.d;
        azf_2 azf_23 = new azf_2(azf_2.e.i());
        fqd_0 fqd_02 = fru_02.getAppearance();
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fqd_02, 0, 500, 3, fjw_2.b);
        fqd_02.addTween(fjp_22);
    }

    public static void a() {
        int n = aUxx.a().t();
        if (n == -1) {
            b.error((Object)"on tente de fermer la vue de chat d'\u00e9change alors qu'elle n'est pas initialis\u00e9e");
            return;
        }
        aUxx.a().a(n, -1);
        aUxx.a().g(-1);
    }

    public static void b() {
        int n = aUxx.a().u();
        if (n == -1) {
            b.error((Object)"on tente de fermer la vue de chat de moderation alors qu'elle n'est pas initialis\u00e9e");
            return;
        }
        aUxx.a().a(n, -1);
        aUxx.a().h(-1);
    }

    public static void a(boolean bl, fvk_0 fvk_02, ArrayList<fqt> arrayList, ArrayList<fqt> arrayList2, ArrayList<fqt> arrayList3, ArrayList<fqt> arrayList4) {
        fvk_02.removeTweensOfType(fjo_2.class);
        dey.a(arrayList, bl, azf_2.b, fvk_02);
        dey.a(arrayList2, bl, azf_2.d, fvk_02);
        dey.a(arrayList3, bl, azf_2.c, fvk_02);
        dey.a(arrayList4, bl, azf_2.q, fvk_02);
    }

    private static void a(ArrayList<fqt> arrayList, boolean bl, azj_2 azj_22, fvk_0 fvk_02) {
        int n;
        int n2;
        if (arrayList.isEmpty()) {
            return;
        }
        fqt fqt2 = arrayList.get(0);
        if (bl) {
            if (fqt2.getModulationColor() == null) {
                return;
            }
            n2 = fqt2.getModulationColor().i();
            n = azf_2.e.i();
        } else {
            n2 = azf_2.e.i();
            n = azj_22.i();
        }
        if (n2 != n) {
            if (bl) {
                cdw_0.n().z();
            } else {
                cdw_0.n().A();
            }
            azf_2 azf_22 = new azf_2(n2);
            azf_2 azf_23 = new azf_2(n);
            fvk_02.addTween(new fjo_2(azf_22, azf_23, arrayList, 0, 1000, 1, fjw_2.b));
        }
    }

    public static void a(fyy_0 fyy_02, boolean bl) {
        dey.a(fyy_02, "addButton", bl);
        dey.a(fyy_02, "resizePoint0", bl);
        dey.a(fyy_02, "resizePoint1", bl);
        dey.a(fyy_02, "resizePoint2", bl);
        dey.a(fyy_02, "resizePoint3", bl);
        dey.a(fyy_02, "resizePoint4", bl);
        dey.a(fyy_02, "resizePoint5", bl);
        dey.a(fyy_02, "resizePoint6", bl);
        dey.a(fyy_02, "resizePoint7", bl);
    }

    private static void a(fyy_0 fyy_02, String string, boolean bl) {
        ((fvE)fyy_02.a(string)).setNonBlocking(bl);
    }

    private static void a(fyy_0 fyy_02, String string, ArrayList<fqt> arrayList) {
        fyb_0 fyb_02 = fyy_02.a(string);
        if (fyb_02 == null) {
            b.warn((Object)("la propri\u00e9t\u00e9 " + string + " n'existe pas."));
            return;
        }
        assert (fyb_02 instanceof fvE);
        fqj fqj2 = ((fvE)fyb_02).getAppearance();
        fqj2.removeTweensOfType(fjp_2.class);
        arrayList.add(fqj2);
    }

    public static void a(aUr aUr2) {
        aUv aUv2 = aUxx.a().a(aUr2);
        if (aUv2 == null || aUv2.h() == aUr2) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(dey.a(aUv2.a()));
        if (fyy_02 == null) {
            return;
        }
        fsQ fsQ2 = (fsQ)fyy_02.a("viewsList");
        ftj_0 ftj_02 = fsQ2.getRenderableByOffset(aUr2.f());
        if (ftj_02 == null) {
            return;
        }
        fyy_0 fyy_03 = ftj_02.getInnerElementMap();
        if (fyy_03 == null) {
            b.error((Object)"innerElementMap is null, can't blink");
            return;
        }
        fru_0 fru_02 = (fru_0)fyy_03.a("viewButton");
        if (fru_02 == null) {
            b.error((Object)"viewButton is null, can't blink");
            return;
        }
        azf_2 azf_22 = new azf_2(azf_2.d.i());
        azf_2 azf_23 = new azf_2(azf_2.e.i());
        fqj fqj2 = ((fvE)fru_02).getAppearance();
        fqj2.removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fqj2, 0, 500, 10, true, fjw_2.b);
        fqj2.addTween(fjp_22);
    }
}

