/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBU
 */
class abu_2
implements Comparator<Byte> {
    abu_2() {
    }

    public int a(Byte by, Byte by2) {
        return by.compareTo(by2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Byte)object, (Byte)object2);
    }
}

