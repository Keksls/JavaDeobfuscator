/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from auc
 */
public class auc_1 {
    public ays_2 a;
    public ays_2 b;
    public static final float c = 0.004f;
    private static final auc_1 f = new auc_1();
    private boolean g = false;
    private ath_2 h;
    private String i;
    protected static final Logger d = Logger.getLogger(auc_1.class);

    public static auc_1 a() {
        return f;
    }

    public static boolean a(float f2, float f3) {
        return Hw.c(f2, f3, 0.004f);
    }

    public void a(InputStream inputStream) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        try {
            atg_22.a(inputStream);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
        }
        catch (Exception exception) {
            d.error((Object)"Exception during loadConfig", (Throwable)exception);
        }
        this.h = ath_22;
    }

    public void a(String string) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        try {
            atg_22.a(string);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
        }
        catch (Exception exception) {
            d.error((Object)("Exception during loadConfig(" + string + ")"), (Throwable)exception);
        }
        this.h = ath_22;
    }

    public void b(String string) {
        assert (this.h != null) : "You must call loadConfig before";
        aqx_2 aqx_22 = this.h.a().c("engine");
        auc_1.a(aqx_22, string);
        ayu_2 ayu_22 = ayu_2.a();
        avx_2 avx_22 = auj_1.a.a();
        this.i = string;
        this.a = ayu_22.a((aui_2)avx_22, -1296775008915292159L, string + "textures/maskAlpha.tga", false);
        this.a.k_();
        this.b = ayu_22.a((aui_2)avx_22, -1296775008915292158L, string + "textures/perturb.tga", false);
        this.b.k_();
        this.g = true;
    }

    public final boolean b() {
        return this.g;
    }

    public final String c() {
        return this.i;
    }

    private auc_1() {
    }

    private static void a(aqx_2 aqx_22, String string) {
        assert (aqx_22 != null) : "Unable to find engine node";
        aqx_2 aqx_23 = aqx_22.c("effects");
        assert (aqx_23 != null) : "Unable to find shaders node";
        ArrayList<aqx_2> arrayList = aqx_23.d("effect");
        assert (arrayList != null) : "Unable to find effect nodes";
        for (aqx_2 aqx_24 : arrayList) {
            aqx_2 aqx_25 = aqx_24.f("name");
            assert (aqx_25 != null) : "Unable to find name parameter and it's not optionnal";
            aqx_2 aqx_26 = aqx_24.f("file");
            assert (aqx_26 != null) : "Unable to find file parameter and it's not optionnal";
            aqx_2 aqx_27 = aqx_24.f("class");
            String string2 = aqx_27 == null ? null : aqx_27.c();
            String string3 = string + aqx_26.c();
            aui_1.a().a(aqx_25.c(), string3, string2);
        }
    }

    public static int c(String string) {
        return string.hashCode();
    }

    public static int d(String string) {
        return string.hashCode();
    }

    public static int[] a(String ... stringArray) {
        int n = stringArray.length;
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = stringArray[k].hashCode();
        }
        return nArray;
    }

    public void a(ath_2 ath_22) {
        this.h = ath_22;
    }
}

