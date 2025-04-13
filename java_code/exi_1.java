/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eXi
 */
class exi_1
implements Comparator<exg_2> {
    exi_1() {
    }

    public int a(exg_2 exg_22, exg_2 exg_23) {
        return exg_22.e() - exg_23.e();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((exg_2)object, (exg_2)object2);
    }
}

