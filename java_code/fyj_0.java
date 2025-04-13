/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fyJ
 */
class fyj_0
implements Comparator<ftj_0> {
    static final fyj_0 a = new fyj_0();

    private fyj_0() {
    }

    public int a(ftj_0 ftj_02, ftj_0 ftj_03) {
        return ftj_02.getTreeDepth() - ftj_03.getTreeDepth();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ftj_0)object, (ftj_0)object2);
    }
}

