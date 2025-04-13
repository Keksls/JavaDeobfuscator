/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * Renamed from ati
 */
public class ati_2
implements aqx_2 {
    public static final String a = "#text";
    public static final String b = "#cdata-section";
    public static final String c = "#comment";
    private String d;
    private String e;
    private final ArrayList<atj_2> f = new ArrayList();
    private final ArrayList<ati_2> g = new ArrayList();

    public ati_2(String string, String string2) {
        this.d = string != null ? string.intern() : null;
        this.e = string2 != null ? string2.intern() : null;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public void a(String string) {
        this.d = string != null ? string.intern() : null;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(int n) {
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public boolean d() {
        return Boolean.parseBoolean(this.e);
    }

    @Override
    public byte e() {
        return Byte.parseByte(this.e);
    }

    @Override
    public short f() {
        return Short.parseShort(this.e);
    }

    @Override
    public int g() {
        return Integer.parseInt(this.e);
    }

    @Override
    public long h() {
        return Long.parseLong(this.e);
    }

    @Override
    public float i() {
        return Float.parseFloat(this.e);
    }

    @Override
    public double j() {
        return Double.parseDouble(this.e);
    }

    @Override
    public void b(String string) {
        this.e = string != null ? string.intern() : null;
    }

    @Override
    public void a(boolean bl) {
        this.e = bl ? "true" : "false";
    }

    @Override
    public void a(byte by) {
        this.e = ("" + by).intern();
    }

    @Override
    public void b(int n) {
        this.e = ("" + n).intern();
    }

    @Override
    public void a(long l) {
        this.e = ("" + l).intern();
    }

    @Override
    public void a(float f2) {
        this.e = ("" + f2).intern();
    }

    @Override
    public void a(double d2) {
        this.e = ("" + d2).intern();
    }

    @Override
    public aqx_2 f(String string) {
        if (this.f != null) {
            int n = this.f.size();
            for (int k = 0; k < n; ++k) {
                atj_2 atj_22 = this.f.get(k);
                if (!atj_22.b().equalsIgnoreCase(string)) continue;
                return atj_22;
            }
        }
        return null;
    }

    @Override
    public boolean g(String string) {
        if (this.f != null) {
            int n = this.f.size();
            for (int k = 0; k < n; ++k) {
                atj_2 atj_22 = this.f.get(k);
                if (!atj_22.b().equalsIgnoreCase(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(aqx_2 aqx_22) {
        if (!this.f.contains(aqx_22)) {
            this.f.add((atj_2)aqx_22);
        }
    }

    public void a(ArrayList<? extends aqx_2> arrayList) {
        for (aqx_2 aqx_22 : arrayList) {
            this.c(aqx_22);
        }
    }

    @Override
    public void d(aqx_2 aqx_22) {
        this.f.remove(aqx_22);
    }

    @Override
    public <T extends aqx_2> ArrayList<T> l() {
        return this.f;
    }

    @Override
    public aqx_2 c(String string) {
        if (this.d.equalsIgnoreCase(string)) {
            return this;
        }
        for (aqx_2 aqx_22 : this.g) {
            aqx_2 aqx_23 = aqx_22.c(string);
            if (aqx_23 == null) continue;
            return aqx_23;
        }
        return null;
    }

    @Override
    public ArrayList<aqx_2> d(String string) {
        ArrayList<aqx_2> arrayList = new ArrayList<aqx_2>();
        if (this.d.equalsIgnoreCase(string)) {
            arrayList.add(this);
        } else {
            for (aqx_2 aqx_22 : this.g) {
                ArrayList<aqx_2> arrayList2 = aqx_22.d(string);
                if (arrayList2 == null) continue;
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    @Override
    public ArrayList<aqx_2> e(String string) {
        ArrayList<aqx_2> arrayList = new ArrayList<aqx_2>();
        for (aqx_2 aqx_22 : this.g) {
            if (!aqx_22.b().equalsIgnoreCase(string)) continue;
            arrayList.add(aqx_22);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    @Override
    public void a(aqx_2 aqx_22) {
        if (!this.g.contains(aqx_22)) {
            this.g.add((ati_2)aqx_22);
        }
    }

    @Override
    public void b(aqx_2 aqx_22) {
        this.g.remove(aqx_22);
    }

    @Override
    public ArrayList<? extends aqx_2> k() {
        return this.g;
    }

    public String toString() {
        if (this.f == null) {
            return this.d + " " + this.e;
        }
        return this.d + " " + this.e + " (" + this.f.stream().filter(Objects::nonNull).map(Object::toString).collect(Collectors.joining(", ")) + ")";
    }
}

