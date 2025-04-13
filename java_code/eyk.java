/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class eyk
extends esf {
    private static final Logger a = Logger.getLogger(eyk.class);
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public eyk(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    public eyk() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        if (object instanceof fgy_0) {
            n = ((fgy_0)object).E().e();
        } else if (object instanceof epq_2) {
            n = ((epq_2)object).bO();
        } else {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le territoire");
        }
        if (fkb.a.contains((long)n)) {
            return -1;
        }
        fgv_0 fgv_02 = fgT.a.a(n);
        if (fgv_02 == null) {
            return -1;
        }
        Object t = fgv_02.g();
        if (t == null) {
            return -1;
        }
        return ((fgR)t).c() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dV;
    }

    static {
        b.add(aov_1.j);
    }
}

