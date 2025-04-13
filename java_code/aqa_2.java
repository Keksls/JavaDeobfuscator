/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aqA
 */
public class aqa_2
extends aqd_1 {
    public static final String a = "point";
    private static final aqa_2 c = new aqa_2();
    private final List<int[]> d = new ArrayList<int[]>(1);
    public static final aqr_2 b = new apx_2(new aqq_2[0]);

    @Override
    public aqr_2 c_() {
        return b;
    }

    public static aqa_2 j() {
        return c;
    }

    @Override
    public List<int[]> e() {
        return this.d;
    }

    @Override
    public String f() {
        return a;
    }

    @Override
    public String g() {
        return null;
    }

    @Override
    public void a(int[] nArray) {
        if (nArray != null && nArray.length > 0) {
            throw new IllegalArgumentException("Param\u00e8tres invalides pour une AOE de type Point : 0 attendu, " + nArray.length + " fourni(s)");
        }
        this.d.clear();
        this.d.add(apz_2.a(0, 0));
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public aqe_1 d() {
        return aqe_1.a;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aqs_1 i() {
        return aqs_1.b;
    }
}

