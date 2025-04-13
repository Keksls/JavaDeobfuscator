/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bVa
implements Comparator<bVq> {
    final /* synthetic */ bUW a;

    bVa(bUW bUW2) {
        this.a = bUW2;
    }

    public int a(bVq bVq2, bVq bVq3) {
        return bVq3.a() - bVq2.a();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVq)object, (bVq)object2);
    }
}

