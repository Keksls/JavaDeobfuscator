/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class afq
implements Comparator<amb_1> {
    static final afq a = new afq();

    private afq() {
    }

    public int a(amb_1 amb_12, amb_1 amb_13) {
        return amb_12.e() - amb_13.e();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((amb_1)object, (amb_1)object2);
    }
}

