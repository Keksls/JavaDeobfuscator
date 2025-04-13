/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Date;

/*
 * Renamed from asN
 */
public class asn_1
implements Comparator<asv_1> {
    public static final asn_1 a = new asn_1();

    private asn_1() {
    }

    public int a(asv_1 asv_12, asv_1 asv_13) {
        Date date;
        int n;
        if (asv_12 == asv_13) {
            return 0;
        }
        int n2 = asv_12.f();
        if (n2 != (n = asv_13.f())) {
            return n2 - n;
        }
        Date date2 = asv_12.b();
        if (!date2.equals(date = asv_13.b())) {
            if (date2 == null) {
                return 1;
            }
            if (date == null) {
                return -1;
            }
            return date2.compareTo(date);
        }
        if (asv_12.a() != asv_13.a()) {
            return asv_12.a().compareTo(asv_13.a());
        }
        return asv_13.hashCode() - asv_12.hashCode();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((asv_1)object, (asv_1)object2);
    }
}

