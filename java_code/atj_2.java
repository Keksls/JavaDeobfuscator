/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from atj
 */
public class atj_2
implements aqx_2 {
    private String a;
    private String b;

    public atj_2(String string, String string2) {
        this.a = string != null ? string.intern() : null;
        this.b = string2 != null ? string2.intern() : null;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(int n) {
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public void a(String string) {
        this.a = string != null ? string.intern() : null;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public boolean d() {
        return Boolean.parseBoolean(this.b);
    }

    @Override
    public byte e() {
        return Byte.parseByte(this.b);
    }

    @Override
    public short f() {
        return Short.parseShort(this.b);
    }

    @Override
    public int g() {
        return Integer.parseInt(this.b);
    }

    @Override
    public long h() {
        return Long.parseLong(this.b);
    }

    @Override
    public float i() {
        return Float.parseFloat(this.b);
    }

    @Override
    public double j() {
        return Double.parseDouble(this.b);
    }

    @Override
    public void b(String string) {
        this.b = string != null ? string.intern() : null;
    }

    @Override
    public void a(boolean bl) {
        this.b = bl ? "true" : "false";
    }

    @Override
    public void a(byte by) {
        this.b = ("" + by).intern();
    }

    @Override
    public void b(int n) {
        this.b = ("" + n).intern();
    }

    @Override
    public void a(long l) {
        this.b = ("" + l).intern();
    }

    @Override
    public void a(float f2) {
        this.b = ("" + f2).intern();
    }

    @Override
    public void a(double d2) {
        this.b = ("" + d2).intern();
    }

    @Override
    public void a(aqx_2 aqx_22) {
    }

    @Override
    public void b(aqx_2 aqx_22) {
    }

    @Override
    public ArrayList<? extends aqx_2> k() {
        return null;
    }

    @Override
    public aqx_2 c(String string) {
        return null;
    }

    @Override
    public ArrayList<aqx_2> d(String string) {
        return null;
    }

    @Override
    public ArrayList<aqx_2> e(String string) {
        return null;
    }

    @Override
    public aqx_2 f(String string) {
        return null;
    }

    @Override
    public boolean g(String string) {
        return false;
    }

    @Override
    public void c(aqx_2 aqx_22) {
    }

    @Override
    public void d(aqx_2 aqx_22) {
    }

    @Override
    public <T extends aqx_2> ArrayList<T> l() {
        return null;
    }

    public String toString() {
        return this.a + "=" + this.b;
    }
}

