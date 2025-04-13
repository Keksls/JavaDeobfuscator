/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqD
 */
public class aqd_2
extends aqd_1 {
    public static final String a = "rectangle or square";
    private int c;
    private int d;
    private final List<int[]> e = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Carr\u00e9 plein", new aqo_2("Taille d'un c\u00f4t\u00e9 (doit \u00eatre impaire)")), new apw_2("Rectangle plein", new aqo_2("Largeur (doit \u00eatre impaire)"), new aqo_2("Hauteur (doit \u00eatre impaire)")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public List<int[]> e() {
        return this.e;
    }

    @Override
    public String f() {
        return "rectangle or square-" + this.c + "x" + this.d;
    }

    @Override
    public String g() {
        if (this.c == this.d) {
            return String.valueOf(this.c);
        }
        return this.c + " x " + this.d;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type square : 1 \u00e0 2 param\u00e8tre attendu, 0 trouv\u00e9(s)");
        }
        if (nArray.length > 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type carr\u00e9 : 1 \u00e0 2 param\u00e8tre attendu, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = nArray[0];
        this.d = nArray.length == 1 ? this.c : nArray[1];
        if (this.c != 0 && this.c % 2 == 0) {
            ++this.c;
        }
        if (this.d != 0 && this.d % 2 == 0) {
            ++this.d;
        }
        int n = (this.c - 1) / 2;
        int n2 = (this.d - 1) / 2;
        for (int k = 0; k < this.c; ++k) {
            for (int i2 = 0; i2 < this.d; ++i2) {
                this.e.add(apz_2.a(k - n, i2 - n2));
            }
        }
    }

    @Override
    protected boolean c() {
        return this.c == this.d;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.f;
    }

    public int j() {
        return this.c;
    }

    public int k() {
        return this.d;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aqs_1 i() {
        if (this.d == 0 && this.c == 0) {
            return aqs_1.b;
        }
        if (this.d == this.c) {
            return aqs_1.h;
        }
        return aqs_1.j;
    }
}

