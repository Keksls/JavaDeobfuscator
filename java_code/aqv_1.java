/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqv
 */
public final class aqv_1
extends aqd_1 {
    public static final String a = "crossDiag";
    private int c;
    private int d;
    private int e;
    private int f;
    private final List<int[]> g = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Croix (deux barres de tailles identiques)", new aqo_2("distance centre -> extr\u00e9mit\u00e9")), new apw_2("Croix (deux barres de tailles diff\u00e9rentes)", new aqo_2("distance centre -> Nord/Sud"), new aqo_2("distance centre -> Est/Ouest")), new apw_2("Croix (4 barres de tailles diff\u00e9rentes)", new aqo_2("distance centre -> Nord"), new aqo_2("distance centre -> Est"), new aqo_2("distance centre -> Sud"), new aqo_2("distance centre -> Ouest")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length != 1 && nArray.length != 2 && nArray.length != 4) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 ou 2 ou 4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = nArray[0];
        if (nArray.length == 2) {
            this.d = nArray[1];
            this.e = this.c;
            this.f = this.d;
        } else if (nArray.length == 4) {
            this.d = nArray[1];
            this.e = nArray[2];
            this.f = nArray[3];
        } else {
            this.f = this.c;
            this.e = this.c;
            this.d = this.c;
        }
        this.g.clear();
        this.g.add(apz_2.a(0, 0));
        this.a(this.f, aej_2.e);
        this.a(this.d, aej_2.a);
        this.a(this.c, aej_2.g);
        this.a(this.e, aej_2.c);
    }

    private void a(int n, aej_2 aej_22) {
        for (int k = 1; k <= n; ++k) {
            this.g.add(apz_2.a(aej_22.m * k, aej_22.n * k));
        }
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public List<int[]> e() {
        return this.g;
    }

    @Override
    public String f() {
        return "crossDiag-h" + this.c + "b" + this.e + "-g" + this.f + "d" + this.d;
    }

    @Override
    public String g() {
        return String.valueOf(Math.min(Math.min(this.f, this.d), Math.min(this.c, this.e)));
    }

    @Override
    public aqe_1 d() {
        return aqe_1.k;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aqs_1 i() {
        if (this.e == 0 && this.c == 0 && this.f == 0 && this.d == 0) {
            return aqs_1.b;
        }
        if (this.e == 0 && this.c == 0) {
            return aqs_1.c;
        }
        if (this.f == 0 && this.d == 0) {
            return aqs_1.d;
        }
        return aqs_1.m;
    }
}

