/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from axd
 */
public class axd_2 {
    static final double a = 1000000.0;
    static final int b = 500;
    static final float c = 2.0f;
    static final float d = 200.0f;
    static final float e = 300.0f;
    static final Comparator<axl_2> f = new axe_2();
    static final Comparator<axl_2> g = new axf_2();
    private static final THashMap<String, axc_2> i = new THashMap(10);
    private static final THashMap<String, axk_2> j = new THashMap(10);
    private static final axl_2 k;
    private static axl_2 l;
    private static axm_2 m;
    private static boolean n;
    static long h;

    public static boolean a() {
        return n && m != null;
    }

    public static void a(boolean bl) {
        n = bl;
        axd_2.d();
    }

    public static void a(String string, int n, int n2) {
        m = new axm_2(string, n, n2);
    }

    public static void a(String string, int n, float f2, float f3, float f4, float f5, double d2) {
        if (!axd_2.a()) {
            return;
        }
        axk_2 axk_22 = (axk_2)j.get((Object)string);
        if (axk_22 == null) {
            axk_22 = new axk_2();
            j.put((Object)string, (Object)axk_22);
        }
        axk_22.h[0] = f2;
        axk_22.h[1] = f3;
        axk_22.h[2] = f4;
        axk_22.h[3] = f5;
        axk_22.i = 200.0 / d2;
        axk_22.a(n);
    }

    public static void a(String string, float f2, float f3, float f4) {
        axd_2.a(string, new float[]{f2, f3, f4, 0.8f});
    }

    public static void a(String string) {
        axd_2.a(string, null);
    }

    private static void a(String string, float[] fArray) {
        if (!axd_2.a()) {
            return;
        }
        axc_2 axc_22 = (axc_2)i.get((Object)string);
        if (axc_22 == null) {
            axc_22 = new axc_2(string);
            i.put((Object)string, (Object)axc_22);
        }
        axc_22.f = h;
        axc_22.b = fArray;
        axl_2 axl_22 = null;
        int n = axd_2.l.c.size();
        for (int k = 0; k < n; ++k) {
            axl_2 axl_23 = axd_2.l.c.get(k);
            if (axl_23.a != axc_22) continue;
            axl_22 = axl_23;
            break;
        }
        if (axl_22 == null) {
            axl_22 = new axl_2(axc_22, l);
            axd_2.l.c.add(axl_22);
        }
        l = axl_22;
        axc_22.a();
    }

    public static void b() {
        if (!axd_2.a()) {
            return;
        }
        l = k;
        ++h;
        ArrayList arrayList = new ArrayList();
        i.forEachValue((TObjectProcedure)new axg_2(arrayList));
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            axc_2 axc_22 = (axc_2)i.remove(arrayList.get(k));
            axd_2.a(axd_2.k, axc_22);
        }
        j.forEachValue((TObjectProcedure)new axh_2());
    }

    private static boolean a(axl_2 axl_22, axc_2 axc_22) {
        int n;
        for (n = 0; n < axl_22.c.size(); ++n) {
            if (axl_22.c.get((int)n).a != axc_22) continue;
            axl_22.c.remove(n);
            return true;
        }
        for (n = 0; n < axl_22.c.size(); ++n) {
            if (!axd_2.a(axl_22.c.get(n), axc_22)) continue;
            return true;
        }
        return false;
    }

    private static void d() {
        h = 0L;
        i.clear();
        j.clear();
        l = k;
        axd_2.k.c.clear();
    }

    public static void c() {
        if (!axd_2.a()) {
            return;
        }
        long l = System.nanoTime();
        ((axc_2)i.get((Object)axd_2.l.a.a)).b(l);
        axd_2.l = axd_2.l.b;
    }

    public static void a(aui_2 aui_22) {
        if (!axd_2.a()) {
            return;
        }
        axd_2.b(aui_22);
        m.a(aui_22, 8, 0);
        m.a(String.format("%15s|%6s|%6s|%6s|%6s", "", "avg/call", "avg", "min", "max"));
        axl_2[] axl_2Array = new axl_2[axd_2.k.c.size()];
        axd_2.k.c.toArray(axl_2Array);
        Arrays.sort(axl_2Array, f);
        for (axl_2 axl_22 : axl_2Array) {
            axd_2.a(axl_22, 0);
        }
        m.a();
    }

    private static void b(aui_2 aui_22) {
        GL2 gL2 = aui_22.e();
        axr_2.a().d(false);
        axr_2.a().a(gL2);
        aui_22.a(Matrix44.b);
        aui_22.b(Matrix44.b);
        aui_22.b();
        float[] fArray = new float[]{0.2f, 0.2f, 0.2f, 0.9f};
        gL2.glColor4fv(fArray, 0);
        gL2.glBegin(1);
        float f2 = -500.0f;
        float f3 = -300.0f;
        gL2.glVertex2f(-500.0f, -300.0f);
        gL2.glVertex2f(500.0f, -300.0f);
        gL2.glVertex2f(-500.0f, -300.0f);
        gL2.glVertex2f(-500.0f, -100.0f);
        gL2.glEnd();
        i.forEachValue((TObjectProcedure)new axi_2(gL2));
        j.forEachValue((TObjectProcedure)new axj_2(gL2));
        m.a(aui_22, 0, (int)((float)aui_22.i() * 0.5f - 200.0f - 16.0f - 300.0f));
        m.a("10 ms", fArray);
        m.a();
    }

    private static void a(axl_2 axl_22, int n) {
        Object object = "";
        for (int k = 0; k < n; ++k) {
            object = (String)object + "_";
        }
        if (axl_22.a.f != h) {
            object = (String)object + "#";
        }
        if ((double)axl_22.a.d.b / 1000000.0 > 0.01 || n >= 2 || n == 0) {
            if ((double)axl_22.a.d.b / 1000000.0 > 0.01 || axl_22.a.a.startsWith("*")) {
                m.a(axl_22.a.a((String)object), axl_22.a.b);
            }
            axl_2[] axl_2Array = new axl_2[axl_22.c.size()];
            axl_22.c.toArray(axl_2Array);
            Arrays.sort(axl_2Array, f);
            for (axl_2 axl_23 : axl_2Array) {
                axd_2.a(axl_23, n + 1);
            }
        }
    }

    static {
        l = k = new axl_2(null, null);
        n = false;
        h = 0L;
    }
}

