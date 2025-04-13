/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aqy
 */
public class aqy_1
extends aqd_1 {
    public static final String a = "empty";
    private static final List<int[]> c = new ArrayList<int[]>(0);
    public static final aqr_2 b = new apx_2(new aqq_2[0]);

    @Override
    public aqr_2 c_() {
        return b;
    }

    @Override
    public void a(int[] nArray) {
    }

    @Override
    public aqe_1 d() {
        return aqe_1.m;
    }

    @Override
    public List<int[]> e() {
        return c;
    }

    @Override
    public String f() {
        return "empty-0";
    }

    @Override
    public String g() {
        return null;
    }

    public <T extends apq_2> Iterable<T> a(aff_1 aff_12, aff_1 aff_13, Iterator<T> iterator) {
        return new abz_1();
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public ArrayList<aqd_1> h() {
        ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
        arrayList.add(this);
        return arrayList;
    }

    @Override
    public aqs_1 i() {
        return aqs_1.a;
    }
}

