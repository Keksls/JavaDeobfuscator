/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * Renamed from etW
 */
public class etw_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etw_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        Calendar calendar = Calendar.getInstance();
        return (long)calendar.get(2) + 1L;
    }

    @Override
    public Enum c() {
        return eyO.ap;
    }

    static {
        a.add(esa_0.i);
    }
}

