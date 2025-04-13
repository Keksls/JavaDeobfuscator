/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bVb
implements Comparator<bVq> {
    final /* synthetic */ bUW a;

    bVb(bUW bUW2) {
        this.a = bUW2;
    }

    public int a(bVq bVq2, bVq bVq3) {
        if (bVq3.b() == bVq2.b()) {
            return bVq2.a() - bVq3.a();
        }
        return bVq3.b() - bVq2.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVq)object, (bVq)object2);
    }
}

