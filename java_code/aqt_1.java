/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqt
 */
public class aqt_1
extends aqd_1 {
    public static final String a = "circle";
    private int c;
    private final List<int[]> d = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Cercle", new aqo_2("rayon")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public List<int[]> e() {
        return this.d;
    }

    @Override
    public String f() {
        return "circle-" + this.c;
    }

    @Override
    public String g() {
        return String.valueOf(this.c);
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null || nArray.length != 1) {
            if (nArray == null || nArray.length == 0) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cercle : 1 param\u00e8tre attendu, 0 trouv\u00e9(s)");
            }
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type cercle : 1 param\u00e8tre attendu, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = nArray[0];
        this.d.clear();
        for (int k = -this.c; k <= this.c; ++k) {
            int n = this.c - Math.abs(k);
            for (int i2 = -n; i2 <= n; ++i2) {
                this.d.add(apz_2.a(k, i2));
            }
        }
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.b;
    }

    public int j() {
        return this.c;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aqs_1 i() {
        if (this.c == 0) {
            return aqs_1.b;
        }
        return aqs_1.f;
    }
}

