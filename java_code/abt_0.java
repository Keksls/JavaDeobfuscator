/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from abT
 */
public class abt_0 {
    protected static final Logger a = Logger.getLogger(abt_0.class);
    private static final ArrayList<DisplayedScreenElement> b = new ArrayList(64);

    public static ArrayList<DisplayedScreenElement> a(int n, int n2, aej_2 aej_22, abw_0 abw_02, aaq_1 aaq_12) {
        abw_02.b();
        int n3 = aaq_12.d();
        int n4 = aaq_12.e();
        b.clear();
        switch (aej_22) {
            case b: {
                int n5 = n - aaq_12.a();
                int n6 = n2 - aaq_12.b();
                for (int k = 0; k < n3; ++k) {
                    int n7 = n5 + k;
                    for (int i2 = 0; i2 < n4; ++i2) {
                        if (!aaq_12.c(k, i2)) continue;
                        abt_0.a(n7, n6 + i2);
                    }
                }
                break;
            }
            case d: {
                int n8 = n - aaq_12.b() + aaq_12.e() - 1;
                int n9 = n2 - aaq_12.a();
                for (int k = 0; k < n3; ++k) {
                    int n10 = n9 + k;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        if (!aaq_12.c(k, i3)) continue;
                        abt_0.a(n8 - i3, n10);
                    }
                }
                break;
            }
            case f: {
                int n11 = n - aaq_12.a() + aaq_12.d() - 1;
                int n12 = n2 - aaq_12.b() + aaq_12.e() - 1;
                for (int k = 0; k < n3; ++k) {
                    int n13 = n11 - k;
                    for (int i4 = 0; i4 < n4; ++i4) {
                        if (!aaq_12.c(k, i4)) continue;
                        abt_0.a(n13, n12 - i4);
                    }
                }
                break;
            }
            case h: {
                int n14 = n - aaq_12.b();
                int n15 = n2 + aaq_12.a();
                for (int k = 0; k < n3; ++k) {
                    int n16 = n15 - k;
                    for (int i5 = 0; i5 < n4; ++i5) {
                        if (!aaq_12.c(k, i5)) continue;
                        abt_0.a(n14 + i5, n16);
                    }
                }
                break;
            }
        }
        abw_02.a(b);
        return abw_02.c();
    }

    private static void a(int n, int n2) {
        acs_0.b().a(n, n2, b, acV.c);
    }

    public static ArrayList<DisplayedScreenElement> a(int n, int n2, aej_2 aej_22, abw_0 abw_02, List<int[]> list) {
        abw_02.b();
        int n3 = n;
        int n4 = n2;
        b.clear();
        switch (aej_22) {
            case b: 
            case k: {
                for (int[] nArray : list) {
                    abt_0.a(n3 + nArray[0], n4 + nArray[1]);
                }
                break;
            }
            case d: {
                for (int[] nArray : list) {
                    abt_0.a(n3 - nArray[1], n4 + nArray[0]);
                }
                break;
            }
            case f: {
                for (int[] nArray : list) {
                    abt_0.a(n3 - nArray[0], n4 - nArray[1]);
                }
                break;
            }
            case h: {
                for (int[] nArray : list) {
                    abt_0.a(n3 + nArray[1], n4 - nArray[0]);
                }
                break;
            }
            default: {
                a.error((Object)("Impossible de selectionner des cellules dans cette direction :" + aej_22));
            }
        }
        abw_02.a(b);
        return abw_02.c();
    }
}

