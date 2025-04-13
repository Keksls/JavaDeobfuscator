/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eMN
 */
public final class emn_2
implements emm_1,
emp_2 {
    private static final Logger c = Logger.getLogger(emn_2.class);
    public static final int b = 2;
    private final List<List<ekh_0>> d = new ArrayList<List<ekh_0>>();
    private emo_1 e;
    private boolean f = false;

    @Override
    public void a(ekh_0 ekh_02) {
        this.d(ekh_02);
    }

    void d(ekh_0 ekh_02) {
        if (ekh_02 == null) {
            return;
        }
        if (this.d.isEmpty()) {
            this.i(ekh_02);
            return;
        }
        if (this.e(ekh_02)) {
            return;
        }
        List<ekh_0> list = this.h(ekh_02);
        if (list == null) {
            this.i(ekh_02);
        } else {
            this.a(list);
        }
    }

    private void a(List<ekh_0> list) {
        Iterator<List<ekh_0>> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            List<ekh_0> list2 = iterator.next();
            if (list2 == list || !this.a(list, list2)) continue;
            iterator.remove();
        }
    }

    private boolean a(List<ekh_0> list, List<ekh_0> list2) {
        for (ekh_0 ekh_02 : list2) {
            for (ekh_0 ekh_03 : list) {
                if (!this.a(ekh_03, ekh_02)) continue;
                list.addAll(list2);
                this.b(list);
                return true;
            }
        }
        return false;
    }

    public boolean e(ekh_0 ekh_02) {
        for (List<ekh_0> list : this.d) {
            if (!list.contains(ekh_02)) continue;
            return true;
        }
        return false;
    }

    private List<ekh_0> h(ekh_0 ekh_02) {
        for (List<ekh_0> list : this.d) {
            for (ekh_0 ekh_03 : list) {
                if (!this.a(ekh_02, ekh_03)) continue;
                list.add(ekh_02);
                this.b(list);
                return list;
            }
        }
        return null;
    }

    boolean a(ekh_0 ekh_02, ekh_0 ekh_03) {
        if (ekh_02.v() != ekh_03.v()) {
            return false;
        }
        if (ekh_02.G() != ekh_03.G() && ekh_02.H() != ekh_03.H()) {
            return false;
        }
        return ekh_02.P_().e(ekh_03.P_()) <= 2;
    }

    private void i(ekh_0 ekh_02) {
        ArrayList<ekh_0> arrayList = new ArrayList<ekh_0>();
        arrayList.add(ekh_02);
        this.d.add(arrayList);
    }

    @Override
    public void f(ekh_0 ekh_02) {
        this.g(ekh_02);
        this.d(ekh_02);
        this.b();
    }

    void g(ekh_0 ekh_02) {
        List<ekh_0> list;
        Iterator<List<ekh_0>> iterator = this.d.iterator();
        Object object = null;
        while (iterator.hasNext()) {
            list = iterator.next();
            if (!list.contains(ekh_02)) continue;
            object = list;
            this.b(list);
            list.remove(ekh_02);
            iterator.remove();
        }
        if (object == null) {
            return;
        }
        list = object.iterator();
        while (list.hasNext()) {
            ekh_0 ekh_03 = (ekh_0)list.next();
            this.d(ekh_03);
        }
        this.b();
    }

    private void b(List<ekh_0> list) {
        if (list.size() >= 3) {
            this.f = true;
        }
    }

    @Override
    public List<List<ekh_0>> a() {
        return this.d;
    }

    @Override
    public void b(ekh_0 ekh_02) {
        this.d(ekh_02);
        this.b();
    }

    @Override
    public void c(ekh_0 ekh_02) {
        this.g(ekh_02);
        this.b();
    }

    @Override
    public void a(emo_1 emo_12) {
        this.e = emo_12;
    }

    private void b() {
        try {
            if (this.e != null && this.f) {
                this.e.a(this);
            }
        }
        catch (Exception exception) {
            c.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.f = false;
        }
    }
}

