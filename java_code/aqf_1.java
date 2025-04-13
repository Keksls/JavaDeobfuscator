/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqF
 */
public class aqf_1
extends aqd_1 {
    public static final String a = "t";
    private int c;
    private int d;
    private final List<int[]> e = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Zone en T (order 0: defaut, 1: pied->barre, 2: barre->pied)", new aqo_2("largeur de la barre (par rapport au centre : 1 = barre de 3 cellules)"), new aqo_2("hauteur du pied (par rapport au centre : 1 = barre de 2)")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        switch (this.a()) {
            case 1: {
                for (int k = 0; k <= this.d; ++k) {
                    aqb_2 aqb_22 = new aqb_2();
                    aqb_22.a(apz_2.a(k, 0));
                    arrayList.add(aqb_22);
                }
                int[] nArray = new int[this.c * 4];
                for (int k = 1; k <= this.c; ++k) {
                    int n = (k - 1) * 4;
                    nArray[n + 0] = this.d;
                    nArray[n + 1] = k;
                    nArray[n + 2] = this.d;
                    nArray[n + 3] = -k;
                }
                aqb_2 aqb_23 = new aqb_2();
                aqb_23.a(nArray);
                arrayList.add(aqb_23);
                break;
            }
            case 2: {
                int n;
                int[] nArray = new int[this.c * 4];
                for (int k = 1; k <= this.c; ++k) {
                    n = (k - 1) * 4;
                    nArray[n + 0] = this.d;
                    nArray[n + 1] = k;
                    nArray[n + 2] = this.d;
                    nArray[n + 3] = -k;
                }
                aqb_2 aqb_24 = new aqb_2();
                aqb_24.a(nArray);
                arrayList.add(aqb_24);
                for (n = this.d; n >= 0; --n) {
                    aqb_2 aqb_25 = new aqb_2();
                    aqb_25.a(apz_2.a(n, 0));
                    arrayList.add(aqb_25);
                }
                break;
            }
            default: {
                arrayList.add(this);
            }
        }
        return arrayList;
    }

    @Override
    public List<int[]> e() {
        return this.e;
    }

    @Override
    public String f() {
        return "t-" + this.c + "-" + this.d;
    }

    @Override
    public String g() {
        return this.c > 0 ? this.d + " x " + this.c : String.valueOf(this.d + 1);
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type T : 2 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type T : 2 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = Math.abs(nArray[0]);
        this.d = Math.abs(nArray[1]);
        this.e.clear();
        this.e.add(new int[]{0, 0});
        int n = 1;
        while (n <= this.d) {
            this.e.add(new int[]{n++, 0});
        }
        for (n = 1; n <= this.c; ++n) {
            this.e.add(new int[]{this.d, n});
            this.e.add(new int[]{this.d, -n});
        }
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.d;
    }

    public int j() {
        return this.c;
    }

    public int k() {
        return this.d;
    }

    @Override
    public aqs_1 i() {
        if (this.c == 0 && this.d == 0) {
            return aqs_1.b;
        }
        if (this.c == 0) {
            return aqs_1.c;
        }
        if (this.d == 0) {
            return aqs_1.d;
        }
        if (this.c == 1 && this.d == 1) {
            return aqs_1.p;
        }
        return aqs_1.g;
    }
}

