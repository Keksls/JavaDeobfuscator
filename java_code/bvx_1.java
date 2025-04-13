/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bvx
 */
public class bvx_1
implements ajh_1 {
    public static final String a = "description";
    public static final String b = "value";
    private byte d;
    private static bvx_1[] e;

    public static bvx_1[] a() {
        return e;
    }

    public static bvx_1 a(byte by) {
        for (bvx_1 bvx_12 : e) {
            if (bvx_12.d != by) continue;
            return bvx_12;
        }
        return null;
    }

    public bvx_1(byte by) {
        this.d = by;
    }

    public byte b() {
        return this.d;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("calendar.event.type." + this.d, new Object[0]);
        }
        if (string.equals(b)) {
            return String.valueOf(this.d);
        }
        return null;
    }

    static {
        ArrayList<bvx_1> arrayList = new ArrayList<bvx_1>();
        arrayList.add(new bvx_1(1));
        arrayList.add(new bvx_1(2));
        arrayList.add(new bvx_1(3));
        e = new bvx_1[arrayList.size()];
        e = arrayList.toArray(e);
    }
}

