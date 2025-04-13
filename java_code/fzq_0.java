/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fzQ
 */
public class fzq_0 {
    protected static final Logger a = Logger.getLogger(fzq_0.class);
    private static final String c = "messageBoxTitle";
    private static final String d = "messageBoxImage";
    private static final String e = "messageBoxTextView";
    public static final String b = "messageBoxTextEditor";
    private static final String f = "messageBoxButtonsContainer";
    private static final String g = "messageBoxButton";

    public static void a(fvk_0 fvk_02, fzm_0 fzm_02, fzn_0 fzn_02) {
        Object object;
        fvE fvE2;
        String string = fzn_02.h();
        long l = fzn_02.e();
        ArrayList<String> arrayList = fzn_02.f();
        fyy_0 fyy_02 = fvk_02.getElementMap();
        if (fyy_02.c(c)) {
            fvE2 = (fsM)fyy_02.a(c);
            fvE2.c(fzn_02.g());
        }
        if (fyy_02.c(d)) {
            fvE2 = (fsk_0)fyy_02.a(d);
            fyw_0 fyw_02 = fpm_0.b().g();
            if (fyw_02 != null) {
                object = null;
                if (string != null && !string.isEmpty()) {
                    object = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false);
                } else if ((l & 0x200L) == 512L) {
                    object = fyw_02.c("messageBoxInfoIcon");
                } else if ((l & 0x400L) == 1024L) {
                    object = fyw_02.c("messageBoxErrorIcon");
                } else if ((l & 0x800L) == 2048L) {
                    object = fyw_02.c("messageBoxQuestionIcon");
                } else if ((l & 0x1000L) == 4096L) {
                    object = fyw_02.c("messageBoxCautionIcon");
                }
                if (object != null) {
                    fqv fqv2 = new fqv();
                    fqv2.onCheckOut();
                    fqv2.setPixmap(new ayo_2((ays_2)object));
                    ((fsk_0)fvE2).add(fqv2);
                }
            }
        } else {
            throw new Exception("Aucun Label n'est r\u00e9f\u00e9renc\u00e9 sous l'id : messageBoxImage");
        }
        if (fyy_02.c(e)) {
            fvE2 = fzq_0.a(fvk_02, fzn_02);
            if ((l & 0x2000L) == 8192L) {
                ((frB)fvE2).setSelectable(true);
                ((ful_0)fvE2).setEnableShrinking(false);
            }
        } else {
            throw new Exception("Aucun textView n'est r\u00e9f\u00e9renc\u00e9 sous l'id : messageBoxTextView");
        }
        if (fyy_02.c(b)) {
            fvE2 = (fug_0)fyy_02.a(b);
            boolean bl = (l & 0x10000L) == 65536L;
            fvE2.setVisible(bl);
            object = fzn_02.c();
            if (object != null) {
                fvE2.setPrefSize(((fzu_0)object).d());
                ((ful_0)fvE2).setMaxWidth(((fzu_0)object).b());
                ((ful_0)fvE2).setMultiline(((fzu_0)object).c());
                ((fug_0)fvE2).setMaxCharacters(((fzu_0)object).a());
                fvE2.c(((fzu_0)object).e());
            }
        } else {
            throw new Exception("Aucun textView n'est r\u00e9f\u00e9renc\u00e9 sous l'id : messageBoxTextView");
        }
        if (!fyy_02.c(f)) {
            throw new Exception("Aucun container n'est r\u00e9f\u00e9renc\u00e9 sous l'id : messageBoxButtonsContainer");
        }
        if (!fyy_02.c(g)) {
            throw new Exception("Aucun button n'est r\u00e9f\u00e9renc\u00e9 sous l'id : messageBoxButton");
        }
        fso fso2 = (fso)fyy_02.a(f);
        object = (fru_0)fyy_02.a(g);
        fso2.removeWidget((fvE)object);
        for (Object object2 : (fqv)fzn_02.j()) {
            fzq_0.a((int)object2, l, arrayList, (fru_0)object, fzm_02, fso2, (fug_0)fvE2);
        }
        if (fvE2.isVisible()) {
            fvE2.setFocused(true);
        }
        ((fyb_0)object).destroySelfFromParent();
    }

    public static fuk_0 a(fvk_0 fvk_02, fzn_0 fzn_02) {
        fyy_0 fyy_02 = fvk_02.getElementMap();
        fuk_0 fuk_02 = (fuk_0)fyy_02.a(e);
        fuk_02.c(fzn_02.d());
        return fuk_02;
    }

    private static void a(int n, long l, ArrayList<String> arrayList, fru_0 fru_02, fzm_0 fzm_02, fso fso2, fug_0 fug_02) {
        if ((l & (long)n) == (long)n) {
            fzq_0.a(fru_02, fzm_02, fso2, n, fzq_0.a(n, arrayList), fug_02);
        }
    }

    private static fru_0 a(fru_0 fru_02, fzm_0 fzm_02, fso fso2, int n, String string, fug_0 fug_02) {
        fru_0 fru_03 = null;
        try {
            fru_03 = (fru_0)fru_02.getClass().newInstance();
            fru_03.onCheckOut();
            fru_02.copyElement(fru_03);
            fru_03.setText(string);
            fru_03.setOnClick(new fzr_0(fzm_02, n, fug_02));
            fru_03.setElementMap(fru_02.getElementMap());
            fru_03.onChildrenAdded();
            switch (n) {
                case 2: 
                case 8: {
                    fru_03.setClickSoundId(fza_0.a().m());
                    fru_03.setFocusable(true);
                    fru_03.setFocused(true);
                    break;
                }
                case 4: 
                case 16: {
                    fru_03.setClickSoundId(fza_0.a().n());
                }
            }
            fso2.add(fru_03);
        }
        catch (Exception exception) {
            a.error((Object)"Exception during addButton", (Throwable)exception);
        }
        return fru_03;
    }

    private static String a(int n, ArrayList<String> arrayList) {
        switch (n) {
            case 2: {
                return fpm_0.b().c("ok");
            }
            case 4: {
                return fpm_0.b().c("cancel");
            }
            case 8: {
                return fpm_0.b().c("yes");
            }
            case 16: {
                return fpm_0.b().c("no");
            }
            case 32: {
                if (arrayList == null || arrayList.size() < 1) {
                    return "";
                }
                return arrayList.get(0);
            }
            case 64: {
                if (arrayList == null || arrayList.size() < 2) {
                    return "";
                }
                return arrayList.get(1);
            }
            case 128: {
                if (arrayList == null || arrayList.size() < 3) {
                    return "";
                }
                return arrayList.get(2);
            }
            case 256: {
                if (arrayList == null || arrayList.size() < 4) {
                    return "";
                }
                return arrayList.get(3);
            }
        }
        return "";
    }
}

