/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from byJ
 */
public class byj_1 {
    private static final Logger j = Logger.getLogger(byj_1.class);
    private static final byj_1 k = new byj_1();
    private static final String[] l = (String[])ArrayUtils.addAll((Object[])atn_2.a("JAMBE"), (Object[])atn_2.a("PIED"));
    public static final float a = 0.7f;
    public static final float b = -6.0f;
    public static final float c = 2.0f;
    public static final float d = -0.5f;
    public static final int e = -3;
    public static final float f = 2.0f;
    public static final float g = 0.3f;
    public static final int h = -1;
    public static final float i = 2.0f;
    static long m = Long.MIN_VALUE;
    private static final long n = auc_1.d("CharacterImage-Default");
    final ach_2<ArrayList<byl_1>> o = new ach_2();
    final acg_2 p = new acg_2();
    private static final int[] q = new int[]{1036, 1037, 1038, 1039, 1040};
    private static final int[] r = new int[]{1007, 1011, 1051};
    private static final int[] s = new int[0];

    private byj_1() {
    }

    public static byj_1 a() {
        return k;
    }

    public void a(long l, byl_1 byl_12) {
        ArrayList<byl_1> arrayList = this.o.e(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o.a(l, arrayList);
        }
        if (!arrayList.contains(byl_12)) {
            arrayList.add(byl_12);
        }
    }

    public void b(long l, byl_1 byl_12) {
        ArrayList<byl_1> arrayList = this.o.e(l);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(byl_12);
        if (arrayList.isEmpty()) {
            this.o.d(l);
        }
    }

    public ays_2 a(long l) {
        return this.a(l, false);
    }

    @Nullable
    public ays_2 a(long l, boolean bl) {
        Object object;
        if (!bl && this.p.c(l) && (object = ayu_2.a().a(this.p.e(l))) != null) {
            return object;
        }
        object = bzf_1.a(l);
        if (object == null) {
            ays_2 ays_22 = ayu_2.a().a(n);
            if (ays_22 != null) {
                return ays_22;
            }
            String string = azs_0.a().a("defaultSmallMonsterIllustrationPath", "defaultIconPath", new Object[0]);
            return ayu_2.a().b((aui_2)auj_1.a.a(), n, string, false);
        }
        byj_1.a(((blx_1)object).bv(), new byk_1(this, l));
        return null;
    }

    private static void a(abu abu2, agw agw2) {
        float f2 = 0.7f;
        float f3 = -6.0f;
        float f4 = 2.0f;
        int n = Co.c(abu2.z());
        if (Arrays.binarySearch(q, n) >= 0) {
            f2 = -0.5f;
            f3 = -3.0f;
            f4 = 2.0f;
        }
        if (Arrays.binarySearch(r, n) >= 0) {
            f2 = 0.3f;
            f3 = -1.0f;
            f4 = 2.0f;
        }
        byj_1.a(abu2, (byte)1, agw2, new byt_1(f4, f2, f3), l);
    }

    public static void a(abu abu2, byte by, agw agw2, agx agx2, String ... stringArray) {
        agu agu2 = new agu(ans_0.D().e(), agx2);
        String string = Arrays.binarySearch(s, Co.c(abu2.z())) >= 0 ? by + "_AnimStatique-HorsCombat" : by + "_AnimStatique";
        atd_2 atd_22 = abu2.an();
        if (atd_22 == null) {
            Object object;
            String string2 = "";
            if (abu2 instanceof biI) {
                object = ((biI)abu2).bI();
                string2 = ((blx_1)object).toString();
            }
            j.error((Object)("Null anm while generating image for actor " + abu2.a() + " / " + string2));
            object = abu2.z();
            ((biI)abu2).c((String)object, true);
            atd_22 = abu2.an();
            if (atd_22 == null) {
                return;
            }
        }
        agu2.a(atd_22, string, stringArray);
        agu2.a("png", agw2);
    }

    public void b(long l) {
        if (this.o.c(l)) {
            this.a(l, true);
        }
    }
}

