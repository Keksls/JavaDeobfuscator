/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bOp
implements Comparator<bOm> {
    final /* synthetic */ bOn a;

    bOp(bOn bOn2) {
        this.a = bOn2;
    }

    public int a(bOm bOm2, bOm bOm3) {
        if (bOm2.a().b() < bOm3.a().b()) {
            return -1;
        }
        if (bOm2.a().b() > bOm3.a().b()) {
            return 1;
        }
        return bOm2.a().a() - bOm3.a().a();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bOm)object, (bOm)object2);
    }
}

