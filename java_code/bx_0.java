/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from BX
 */
public class bx_0 {
    private int b;
    private short c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private String[] l;
    private String m;
    private final ArrayList<by_0> n = new ArrayList(2);
    private String o;
    private boolean p;
    final /* synthetic */ bw_0 a;

    public bx_0(bw_0 bw_02) {
        this.a = bw_02;
    }

    public final void a(by_0 by_02) {
        this.n.add(by_02);
    }

    public final ArrayList<by_0> a() {
        return this.n;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.f;
    }

    public final String[] d() {
        return this.l;
    }

    public final String e() {
        return this.k;
    }

    public final String f() {
        return this.j;
    }

    public final int g() {
        return this.b;
    }

    public final String h() {
        return this.d;
    }

    public final short i() {
        return this.c;
    }

    public final String j() {
        return this.m;
    }

    public final String k() {
        return this.o;
    }

    public final String l() {
        return this.e;
    }

    public final boolean m() {
        return this.i;
    }

    public final boolean n() {
        return this.p;
    }

    public final boolean o() {
        return this.h;
    }

    public final byte[] p() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray = this.d == null ? new byte[]{} : this.d.getBytes("UTF-8");
            byte[] byArray2 = this.e == null ? new byte[]{} : this.e.getBytes("UTF-8");
            byte[] byArray3 = this.f == null ? new byte[]{} : this.f.getBytes("UTF-8");
            byte[] byArray4 = this.g == null ? new byte[]{} : this.g.getBytes("UTF-8");
            byte[] byArray5 = this.j == null ? new byte[]{} : this.j.getBytes("UTF-8");
            byte[] byArray6 = this.k == null ? new byte[]{} : this.k.getBytes("UTF-8");
            byte[] byArray7 = this.m == null ? new byte[]{} : this.m.getBytes("UTF-8");
            byte[] byArray8 = this.o == null ? new byte[]{} : this.o.getBytes("UTF-8");
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.n.size());
            int n = byArray.length + byArray2.length + byArray3.length + byArray4.length + byArray5.length + byArray6.length + byArray8.length + byArray7.length;
            if (this.l != null) {
                for (String object : this.l) {
                    n += object.getBytes("UTF-8").length + 4;
                }
            }
            for (by_0 by_02 : this.n) {
                byte[] byArray9 = by_02.j();
                n += byArray9.length + 4;
                arrayList.add(byArray9);
            }
            byteBuffer = ByteBuffer.allocate(49 + n);
            byteBuffer.putInt(this.b);
            byteBuffer.putShort(this.c);
            byteBuffer.put(this.h ? (byte)1 : 0);
            byteBuffer.put(this.i ? (byte)1 : 0);
            byteBuffer.put(this.p ? (byte)1 : 0);
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
            byteBuffer.putInt(byArray3.length);
            byteBuffer.put(byArray3);
            byteBuffer.putInt(byArray4.length);
            byteBuffer.put(byArray4);
            byteBuffer.putInt(byArray5.length);
            byteBuffer.put(byArray5);
            byteBuffer.putInt(byArray6.length);
            byteBuffer.put(byArray6);
            byteBuffer.putInt(byArray7.length);
            byteBuffer.put(byArray7);
            byteBuffer.putInt(byArray8.length);
            byteBuffer.put(byArray8);
            if (this.l != null) {
                byteBuffer.putInt(this.l.length);
                for (String string : this.l) {
                    byte[] byArray9 = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray9.length);
                    byteBuffer.put(byArray9);
                }
            } else {
                byteBuffer.putInt(0);
            }
            byteBuffer.putInt(arrayList.size());
            for (byte[] byArray11 : arrayList) {
                byteBuffer.putInt(byArray11.length);
                byteBuffer.put(byArray11);
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bw_0.B().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        return byteBuffer.array();
    }

    public final void a(boolean bl) {
        this.i = bl;
    }

    public final void a(String string) {
        this.g = string;
    }

    public final void b(String string) {
        this.f = string;
    }

    public final void a(String[] stringArray) {
        this.l = stringArray;
    }

    public final void c(String string) {
        this.k = string;
    }

    public final void d(String string) {
        this.j = string;
    }

    public final void a(int n) {
        this.b = n;
    }

    public final void e(String string) {
        this.d = string;
    }

    public final void b(boolean bl) {
        this.p = bl;
    }

    public final void a(short s2) {
        this.c = s2;
    }

    public final void c(boolean bl) {
        this.h = bl;
    }

    public final void f(String string) {
        this.m = string;
    }

    public final void g(String string) {
        this.o = string;
    }

    public final void h(String string) {
        this.e = string;
    }

    public final void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.h = byteBuffer.get() == 1;
        this.i = byteBuffer.get() == 1;
        this.p = byteBuffer.get() == 1;
        try {
            int n;
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.d = new String(byArray2, "UTF-8").intern();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.e = new String(byArray3, "UTF-8").intern();
            byte[] byArray4 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray4);
            this.f = new String(byArray4, "UTF-8").intern();
            byte[] byArray5 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray5);
            this.g = new String(byArray5, "UTF-8").intern();
            byte[] byArray6 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray6);
            this.j = new String(byArray6, "UTF-8").intern();
            byte[] byArray7 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray7);
            this.k = new String(byArray7, "UTF-8").intern();
            byte[] byArray8 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray8);
            this.m = new String(byArray8, "UTF-8").intern();
            byte[] byArray9 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray9);
            this.o = new String(byArray9, "UTF-8").intern();
            int n2 = byteBuffer.getInt();
            this.l = new String[n2];
            for (n = 0; n < n2; ++n) {
                byte[] byArray10 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray10);
                this.l[n] = new String(byArray10, "UTF-8").intern();
            }
            n = byteBuffer.getInt();
            for (int k = 0; k < n; ++k) {
                byte[] byArray11 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray11);
                by_0 by_02 = new by_0();
                by_02.a(byArray11);
                this.n.add(by_02);
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bw_0.C().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

