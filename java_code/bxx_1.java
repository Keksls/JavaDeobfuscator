/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bxX
 */
public class bxx_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "opened";
    public static final String d = "bonuses";
    private boolean e = false;
    private final ArrayList<bxy_1> f;
    private final int g;

    public bxx_1(int n, ArrayList<bxy_1> arrayList) {
        this.g = n;
        this.f = arrayList;
        this.e = n == 1;
    }

    public int a() {
        return this.g;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("levelParam", this.g);
        }
        if (string.equals(b)) {
            return this.e;
        }
        if (string.equals(d)) {
            return this.f;
        }
        return null;
    }

    public void b() {
        this.e = !this.e;
        fis_1.a().a((ajf_1)this, b);
    }
}

