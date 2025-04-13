/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqu
 */
public class aqu_1
extends aqd_1 {
    public static final String a = "cross";
    private int c;
    private int d;
    private int e;
    private int f;
    private final List<int[]> g = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Croix (deux barres de tailles identiques)", new aqo_2("distance centre -> extr\u00e9mit\u00e9")), new apw_2("Croix (deux barres de tailles diff\u00e9rentes)", new aqo_2("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi"), new aqo_2("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9")), new apw_2("Croix (4 barres de tailles diff\u00e9rentes)", new aqo_2("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi vers le haut"), new aqo_2("distance centre -> extr\u00e9mit\u00e9 face \u00e0 soi vers le bas"), new aqo_2("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9 vers la gauche"), new aqo_2("distance centre -> extr\u00e9mit\u00e9 sur le c\u00f4t\u00e9 vers la droite")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public void a(int[] nArray) {
        int n;
        if (nArray == null || nArray.length == 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length != 1 && nArray.length != 2 && nArray.length != 4) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cross : 1 ou 2 ou 4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = nArray[0];
        if (nArray.length == 2) {
            this.f = nArray[1];
            this.e = this.c;
            this.d = this.f;
        } else if (nArray.length == 4) {
            this.e = nArray[1];
            this.f = nArray[2];
            this.d = nArray[3];
        } else {
            this.f = this.c;
            this.e = this.c;
            this.d = this.c;
        }
        this.g.clear();
        this.g.add(apz_2.a(0, 0));
        for (n = 1; n <= this.f; ++n) {
            this.g.add(apz_2.a(0, -n));
        }
        for (n = 1; n <= this.d; ++n) {
            this.g.add(apz_2.a(0, n));
        }
        for (n = 1; n <= this.c; ++n) {
            this.g.add(apz_2.a(n, 0));
        }
        for (n = 1; n <= this.e; ++n) {
            this.g.add(apz_2.a(-n, 0));
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
        return "cross-h" + this.c + "b" + this.e + "-g" + this.f + "d" + this.d;
    }

    @Override
    public String g() {
        return String.valueOf(Math.min(Math.min(this.f, this.d), Math.min(this.c, this.e)));
    }

    @Override
    public aqe_1 d() {
        return aqe_1.c;
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
        return aqs_1.e;
    }
}

