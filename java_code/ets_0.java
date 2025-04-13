/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etS
 */
public class ets_0
extends esi_0 {
    private boolean a;
    private boolean b;
    private static final ArrayList<aov_1[]> c = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    @Override
    public boolean a() {
        return true;
    }

    public ets_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 != 1) {
            return;
        }
        String string = ((apd_2)arrayList.get(0)).b();
        this.a = string.equalsIgnoreCase("target");
        if (string.equals("eventTarget")) {
            this.b = true;
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (this.b) {
            ese ese2;
            if (object4 instanceof eyL) {
                ese2 = ((eyL)object4).b();
            } else if (object3 instanceof eyL) {
                ese2 = ((eyL)object3).b();
            } else {
                return -1L;
            }
            if (!(ese2 instanceof epq_2)) {
                return -1L;
            }
            return this.e() * (long)((epq_2)((Object)ese2)).dr();
        }
        epq_2 epq_22 = erQ.a(this.a, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1L;
        }
        long l = epq_22.dr();
        return this.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.aq;
    }

    static {
        c.add(esa_0.i);
        c.add(esa_0.j);
    }
}

