/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class bNN
implements afu_0<bNK> {
    final /* synthetic */ bNK a;

    bNN(bNK bNK2) {
        this.a = bNK2;
    }

    @Override
    public void a(bNK bNK2, boolean bl) {
        if (this.a.ad == null || !bNK2.at()) {
            return;
        }
        if (bl) {
            Object object;
            fvE fvE2 = fta_0.getInstance().getMouseOver();
            if (fvE2 != null && fvE2 != fta_0.getInstance()) {
                return;
            }
            aNC.a(bNK2);
            String string = this.a.aW();
            if (string.length() == 0) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            bMn bMn2 = bwy_2.h().j();
            short s2 = bNK2.aR().j();
            if (bMn2 != null && ((fgp_0)(object = bMn2.y())).j(s2)) {
                arrayList.add(azs_0.a().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
            }
            object = new dhg(bNK2, 0);
            eAJ eAJ2 = eAJ.a(s2);
            if (eAJ2 != null) {
                String string2 = null;
                try {
                    string2 = String.format(azs_0.a().a("popupIconPath"), "resource" + eAJ2.a());
                }
                catch (gm_0 gm_02) {
                    bNK.aS().error((Object)gm_02.getMessage(), (Throwable)gm_02);
                }
                ((dhg)object).a(string2);
            }
            ((dhg)object).a(string, this.a.a(bNK2), arrayList);
            dbm_0.a().a((dhg)object);
        } else {
            dbm_0.a().a(bNK2);
            aNC.c(bNK2);
        }
    }
}

