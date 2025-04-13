/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bHQ
 */
public class bhq_0
implements ajh_1 {
    public static final String a = "quantity";
    public static final String b = "enabled";
    public static final String d = "selected";
    private final fev_0 f;
    public static final String[] e = new String[]{"quantity"};
    private final boolean g;
    private boolean h;

    public bhq_0(fev_0 fev_02, boolean bl, boolean bl2) {
        this.f = fev_02;
        this.g = bl;
        this.h = bl2;
    }

    public static Object[] a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (fev_0 fev_02 : fev_0.values()) {
            arrayList.add(bhq_0.a(fev_02));
        }
        return arrayList.toArray();
    }

    public static String a(fev_0 fev_02) {
        return "x" + fev_02.f;
    }

    public fev_0 b() {
        return this.f;
    }

    public short c() {
        return this.f.f;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public String toString() {
        return "x" + this.c();
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f.f;
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        return null;
    }
}

