/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqE
 */
public class aqe_2
extends aqd_1 {
    public static final String a = "ring";
    private int c;
    private int d;
    private final List<int[]> e = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Anneau", new aqo_2("rayon int\u00e9rieur"), new aqo_2("rayon ext\u00e9rieur")));

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
        return "ring-" + this.c + "-" + this.d;
    }

    @Override
    public String g() {
        return this.c + " - " + this.d;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type ring : 2 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type ring : 2 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        this.c = nArray[0] < nArray[1] ? nArray[0] : nArray[1];
        this.d = nArray[0] > nArray[1] ? nArray[0] : nArray[1];
        this.e.clear();
        for (int k = 0; k <= this.d; ++k) {
            for (int i2 = Math.max(this.c - k, 0); i2 <= Math.max(this.d - k, 0); ++i2) {
                this.e.add(apz_2.a(k, i2));
                if (i2 != 0) {
                    this.e.add(apz_2.a(k, -i2));
                }
                if (k == 0) continue;
                this.e.add(apz_2.a(-k, i2));
                if (i2 == 0) continue;
                this.e.add(apz_2.a(-k, -i2));
            }
        }
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.e;
    }

    public int j() {
        return this.d;
    }

    public int k() {
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
        if (this.c == 0 && this.d == 0) {
            return aqs_1.b;
        }
        if (this.c == 0) {
            return aqs_1.f;
        }
        return aqs_1.g;
    }
}

