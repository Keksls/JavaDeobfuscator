/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqw
 */
public class aqw_1
extends aqd_1 {
    public static final String a = "crossRing";
    private int c;
    private int d;
    private final List<int[]> e = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new apw_2("Cross (inner and outer radius)", new aqo_2("inner"), new aqo_2("outer")));

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
        return "crossRing-" + this.c + "-" + this.d;
    }

    @Override
    public String g() {
        return this.c + "-" + this.d;
    }

    @Override
    public void a(int[] nArray) {
        int n;
        if (nArray == null) {
            throw new IllegalArgumentException("Invalid parameters for cross ring type AOE : 2 parameters awaited, 0 found");
        }
        if (nArray.length != 2) {
            throw new IllegalArgumentException("Invalid parameters for cross ring type AOE : 2 parameters awaited, " + nArray.length + " found");
        }
        this.c = Math.min(nArray[0], nArray[1]);
        this.d = Math.max(nArray[0], nArray[1]);
        this.e.clear();
        for (n = this.c; n <= this.d; ++n) {
            this.e.add(apz_2.a(0, -n));
        }
        for (n = this.c; n <= this.d; ++n) {
            this.e.add(apz_2.a(0, n));
        }
        for (n = this.c; n <= this.d; ++n) {
            this.e.add(apz_2.a(n, 0));
        }
        for (n = this.c; n <= this.d; ++n) {
            this.e.add(apz_2.a(-n, 0));
        }
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.l;
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
            return aqs_1.e;
        }
        return aqs_1.n;
    }
}

