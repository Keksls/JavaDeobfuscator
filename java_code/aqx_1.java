/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqx
 */
public class aqx_1
extends aqd_1 {
    public static final String a = "Directed rectangle";
    static final apx_2 b = new apx_2(new apw_2("Rectangle directionnel", new aqo_2("Distance maximale \u00e0 la ligne centrale"), new aqo_2("Longueur")));
    private ArrayList<aqd_1> c;
    private int d;
    private int e;
    private List<int[]> f;

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null || nArray.length != 2) {
            int n = nArray == null ? 0 : nArray.length;
            throw new IllegalArgumentException("Deux param\u00e8tres attendus pour une aire d'effet rectangle directionnel, " + n + " trouv\u00e9s");
        }
        if (nArray[0] < 0) {
            throw new IllegalArgumentException("Rectangle directionnel : " + b.b(2).a(0).a() + " doit \u00eatre au moins 0.");
        }
        if (nArray[1] < 1) {
            throw new IllegalArgumentException("Rectangle directionnel : " + b.b(2).a(0).a() + " doit \u00eatre au moins 1.");
        }
        this.d = nArray[0];
        this.e = nArray[1];
        this.j();
    }

    private void j() {
        this.f = new ArrayList<int[]>();
        for (int k = -this.d; k <= this.d; ++k) {
            for (int i2 = 0; i2 < this.e; ++i2) {
                this.f.add(apz_2.a(i2, k));
            }
        }
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.j;
    }

    @Override
    public List<int[]> e() {
        return this.f;
    }

    @Override
    public String f() {
        return "Directed rectangle-" + (2 * this.d + 1) + "x" + this.e;
    }

    @Override
    public String g() {
        return String.valueOf(this.e);
    }

    @Override
    public ArrayList<aqd_1> h() {
        if (this.c == null) {
            this.c = new ArrayList(1);
            this.c.add(this);
        }
        return this.c;
    }

    @Override
    public aqs_1 i() {
        if (this.e == 1) {
            return this.d == 0 ? aqs_1.b : aqs_1.d;
        }
        return this.d == 0 ? aqs_1.c : aqs_1.j;
    }
}

