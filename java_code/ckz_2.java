/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cKz
 */
public class ckz_2
implements Comparator<csb_1> {
    static final ckz_2 a = new ckz_2();

    public int a(csb_1 csb_12, csb_1 csb_13) {
        int n = csb_12.k() - csb_13.k();
        if (n != 0) {
            return n;
        }
        return csb_12.j() - csb_13.j();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((csb_1)object, (csb_1)object2);
    }
}

