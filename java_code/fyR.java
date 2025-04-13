/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.Comparator;

class fyR
implements Comparator<fyo> {
    public static final Comparator<fyo> a = new fyR();

    private fyR() {
    }

    public int a(fyo fyo2, fyo fyo3) {
        if (fyo2 == null) {
            return -1;
        }
        if (fyo3 == null) {
            return 1;
        }
        return Ints.compare((int)fyo2.getTreePosition(), (int)fyo3.getTreePosition());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fyo)object, (fyo)object2);
    }
}

