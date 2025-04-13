/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from acM
 */
public class acm_0 {
    public static final int a = 86;
    public static final int b = 43;
    public static final int c = 10;
    private static final int f = 5;
    private static final int g = 7;
    private static final int h = 35;
    private static final float i = 9.765625E-4f;
    private static final float j = 0.0017361111f;
    private static final Logger k = Logger.getLogger(acm_0.class);
    final acy_2<aci_0> d = new acy_2();
    private final ArrayList<aci_0> l = new ArrayList();
    protected final acz_0 e = new acz_0();
    private float m;
    private float n;
    private final acn_0 o = new acn_0();

    public void a(int n) {
        this.d.a(n);
    }

    public void a() {
        for (aci_0 aci_02 : this.d) {
            if (aci_02 == null) continue;
            aci_02.a();
        }
        this.d.c();
        this.l.clear();
        this.e.a();
        this.o.a();
    }

    boolean b() {
        return this.o.e;
    }

    float c() {
        return this.m;
    }

    float d() {
        return this.n;
    }

    public int e() {
        return this.d.d();
    }

    void a(String string, int n, int n2, int n3, int n4, @NotNull Ya ya) {
        int n5;
        int n6;
        if (!this.o.a(n = Hw.d((float)n * 0.0017361111f), n3 = Hw.c((float)n3 * 0.0017361111f), n2 = Hw.c((float)n2 * 9.765625E-4f), n4 = Hw.d((float)n4 * 9.765625E-4f))) {
            this.e.a(this.m, this.n, 35, this.l);
            return;
        }
        this.m = (float)(n2 + n4) / 2.0f;
        this.n = (float)(n + n3) / 2.0f;
        this.l.clear();
        if (n2 <= Short.MIN_VALUE || n4 >= Short.MAX_VALUE || n3 <= Short.MIN_VALUE || n >= Short.MAX_VALUE) {
            k.error((Object)("on ne devrait pas \u00eatre l\u00e0!! chargement de la map: " + n + "," + n2));
        } else {
            int n7;
            n6 = n4 - n2;
            if (n6 > 5) {
                n7 = (n6 - 5) / 2;
                n4 -= n7;
                n2 += n7;
            }
            if ((n7 = n - n3) > 7) {
                n5 = (n7 - 7) / 2;
                n -= n5;
                n3 += n5;
            }
            for (n5 = n3 - 1; n5 <= n; ++n5) {
                for (int k = n2; k <= n4; ++k) {
                    int n8 = Hw.d(k, n5);
                    if (!ya.a(k, n5)) continue;
                    aci_0 aci_02 = (aci_0)this.e.a(n8);
                    if (aci_02 == null) {
                        aci_02 = this.a(string, k, n5);
                        this.e.a(n8, aci_02);
                    }
                    this.l.add(aci_02);
                }
            }
        }
        this.d.c();
        for (n6 = this.l.size() - 1; n6 >= 0; --n6) {
            try {
                aci_0 aci_03 = this.l.get(n6);
                n5 = Hw.c(aci_03.d, aci_03.e);
                this.d.a(n5, aci_03);
                continue;
            }
            catch (Exception exception) {
                k.error((Object)"Probl\u00e8me avec la map ", (Throwable)exception);
            }
        }
    }

    protected aci_0 a(String string, int n, int n2) {
        aci_0 aci_02 = new aci_0(n, n2);
        try {
            aci_02.a(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            k.error((Object)("file not found to load map (" + n + "; " + n2 + ")"));
        }
        catch (IOException iOException) {
            k.error((Object)("Unable to load map (" + n + "; " + n2 + ")"), (Throwable)iOException);
        }
        return aci_02;
    }

    public void a(String string) {
        Iterator<aci_0> iterator = this.d.iterator();
        int[] nArray = new int[4];
        int[] nArray2 = new int[nArray.length];
        int[] nArray3 = new int[nArray.length];
        int[] nArray4 = new int[nArray.length];
        Arrays.fill(nArray4, Integer.MAX_VALUE);
        while (iterator.hasNext()) {
            aci_0 aci_02 = iterator.next();
            nArray[3] = aci_02.a(string, nArray);
            nArray[0] = aci_02.c.size();
            for (int k = 0; k < nArray.length; ++k) {
                int n = k;
                nArray3[n] = nArray3[n] + nArray[k];
                if (nArray[k] < nArray4[k]) {
                    nArray4[k] = nArray[k];
                }
                if (nArray[k] <= nArray2[k]) continue;
                nArray2[k] = nArray[k];
            }
        }
        float f2 = this.d.d();
        k.info((Object)("exportPath = " + string + " mapCount=" + f2));
        k.info((Object)("Num elements = " + nArray3[0] + "\tsize= " + nArray3[3] + "octets"));
        k.info((Object)("Avg elements by maps = " + (float)nArray3[0] / f2 + "\tsize = " + (float)nArray3[3] / f2 + "\tNum Groupe = " + (float)nArray3[1] / f2 + "\tnumColors = " + (float)nArray3[2] / f2));
        k.info((Object)("Max elements by maps = " + nArray2[0] + "\tsize = " + nArray2[3] + "\tNum Groupe = " + nArray2[1] + "\tnumColors = " + nArray2[2]));
        k.info((Object)("Min elements by maps = " + nArray4[0] + "\tsize = " + nArray4[3] + "\tNum Groupe = " + nArray4[1] + "\tnumColors = " + nArray4[2]));
    }

    public static int a(int n, int n2) {
        return (int)((float)((n - n2) * 86) * 0.5f);
    }

    public static int a(int n, int n2, int n3) {
        return (int)((float)(-(n + n2)) * 21.5f) + n3 * 10;
    }

    public static float b(int n, int n2) {
        return Hw.c((float)((n - n2) * 86) * 0.5f);
    }

    public static float b(int n, int n2, int n3) {
        float f2 = Math.abs(n) % 2 == Math.abs(n2) % 2 ? 0.0f : 0.5f;
        return (float)(Hw.c((float)(-(n + n2)) * 21.5f) + n3 * 10) + f2;
    }

    public void a(int n, int n2, ScreenElement screenElement) {
        acm_0.a(this.d, n, n2, screenElement);
    }

    protected static aci_0 a(acy_2<aci_0> acy_22, int n, int n2, ScreenElement screenElement) {
        int n3 = Hw.d(n, n2);
        aci_0 aci_02 = acy_22.g(n3);
        if (aci_02 == null) {
            aci_02 = new aci_0(n, n2);
            acy_22.a(n3, aci_02);
        }
        aci_02.a(screenElement);
        return aci_02;
    }
}

