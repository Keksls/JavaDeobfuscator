/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fKL
 */
public class fkl_2
implements fko_2 {
    private String a;
    private final ArrayList<fkm_2> b = new ArrayList();
    private boolean c = false;

    public fkl_2(aqx_2 aqx_22) {
        if (!aqx_22.b().equalsIgnoreCase("fontDefinition") || aqx_22.f("name") == null) {
            return;
        }
        aqx_2 aqx_23 = aqx_22.f("name");
        this.a = aqx_23.c();
        this.b.clear();
        ArrayList<aqx_2> arrayList = aqx_22.d("desc");
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_24 = arrayList.get(k);
            aqx_2 aqx_25 = aqx_24.f("path");
            aqx_2 aqx_26 = aqx_24.f("lang");
            aqx_2 aqx_27 = aqx_24.f("size");
            aqx_2 aqx_28 = aqx_24.f("deltaX");
            aqx_2 aqx_29 = aqx_24.f("deltaY");
            if (aqx_25 == null || aqx_26 == null) continue;
            String string = aqx_25.c();
            String string2 = aqx_26.c();
            int n2 = aqx_27 != null ? Co.a((Object)aqx_27.c(), 0) : 0;
            int n3 = aqx_28 != null ? Co.a((Object)aqx_28.c(), 0) : 0;
            int n4 = aqx_29 != null ? Co.a((Object)aqx_29.c(), 0) : 0;
            fkm_2 fkm_22 = new fkm_2();
            fkm_22.b = string2;
            fkm_22.a = string;
            fkm_22.c = n2;
            fkm_22.d = n3;
            fkm_22.e = n4;
            this.b.add(fkm_22);
        }
        this.c = true;
    }

    @Override
    public void a(fyw_0 fyw_02) {
        if (this.c) {
            int n = this.b.size();
            for (int k = 0; k < n; ++k) {
                fkm_2 fkm_22 = this.b.get(k);
                fyw_02.a(this.a, fkm_22.a(), fkm_22.b(), fkm_22.c(), fkm_22.d(), fkm_22.e());
            }
        }
    }

    @Override
    public void a(fkb_2 fkb_22) {
        if (!this.c) {
            return;
        }
        String string = fkb_22.k();
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            fkm_2 fkm_22 = this.b.get(k);
            fkb_22.a(new fkv_1(null, "loadFontDefinition", string, "\"" + this.a + "\"", "\"" + fkm_22.a() + "\"", "\"" + fkm_22.b() + "\"", String.valueOf(fkm_22.c()), String.valueOf(fkm_22.d()), String.valueOf(fkm_22.e())));
        }
    }

    @Override
    public boolean a() {
        return true;
    }
}

