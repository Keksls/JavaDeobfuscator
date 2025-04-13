/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bdm
 */
class bdm_1
implements Comparator<aQj> {
    static final bdm_1 a = new bdm_1();

    bdm_1() {
    }

    public int a(aQj aQj2, aQj aQj3) {
        return aQj2.b() - aQj3.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aQj)object, (aQj)object2);
    }
}

