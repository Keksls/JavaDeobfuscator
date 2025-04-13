/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqC
 */
public class aqc_2
extends aqd_1 {
    public static final String a = "rectangular or square ring";
    private int c;
    private int d;
    private int e;
    private int f;
    private final List<int[]> g = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Pourtour d'un carr\u00e9", new aqo_2("demi c\u00f4t\u00e9 inf\u00e9rieur (cellule comprise dedans)"), new aqo_2("demi c\u00f4t\u00e9 sup\u00e9rieur (cellule comprise dedans)")), new apw_2("Pourtour d'un rectangle", new aqo_2("demi longueur inf\u00e9rieure X (cellule comprise dedans)"), new aqo_2("demi longueur inf\u00e9rieure Y (cellule comprise dedans)"), new aqo_2("demi longueur sup\u00e9rieure X (cellule comprise dedans)"), new aqo_2("demi longueur sup\u00e9rieure Y (cellule comprise dedans)")));

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public List<int[]> e() {
        return this.g;
    }

    @Override
    public String f() {
        return "rectangular or square ring-w:" + this.c + "-" + this.d + " / h:" + this.e + "-" + this.f;
    }

    @Override
    public String g() {
        return this.c + "-" + this.d + " x " + this.e + "-" + this.f;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray == null) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : 4 param\u00e8tres attendus, 0 trouv\u00e9");
        }
        if (nArray.length != 4 && nArray.length != 2) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring :4 param\u00e8tres attendus, " + nArray.length + " trouv\u00e9(s)");
        }
        if (nArray.length == 2) {
            this.e = this.c = Math.min(nArray[0], nArray[1]);
            this.f = this.d = Math.max(nArray[0], nArray[1]);
        } else {
            this.c = nArray[0];
            this.e = nArray[1];
            this.d = nArray[2];
            this.f = nArray[3];
            if (this.e > this.f) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : innerY > outerY");
            }
            if (this.c > this.d) {
                throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type rectring : innerX > outerX");
            }
        }
        this.g.clear();
        for (int k = 0; k <= this.d; ++k) {
            for (int i2 = 0; i2 <= this.f; ++i2) {
                if (k < this.c && i2 < this.e) continue;
                if (k == 0 && i2 == 0) {
                    this.g.add(apz_2.a(k, i2));
                    continue;
                }
                if (k == 0) {
                    this.g.add(apz_2.a(k, i2));
                    this.g.add(apz_2.a(k, -i2));
                    continue;
                }
                if (i2 == 0) {
                    this.g.add(apz_2.a(k, i2));
                    this.g.add(apz_2.a(-k, i2));
                    continue;
                }
                this.g.add(apz_2.a(k, i2));
                this.g.add(apz_2.a(-k, i2));
                this.g.add(apz_2.a(k, -i2));
                this.g.add(apz_2.a(-k, -i2));
            }
        }
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.g;
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
        if (this.f == 0 && this.d == 0) {
            return aqs_1.b;
        }
        if (this.f == this.d && this.e == this.c) {
            return aqs_1.i;
        }
        return aqs_1.k;
    }
}

