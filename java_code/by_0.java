/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from BY
 */
public class by_0 {
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private String[] g;
    private String[] h;
    private final TIntArrayList i = new TIntArrayList(2);

    public final void a(int n) {
        this.i.add(n);
    }

    public TIntArrayList a() {
        return this.i;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String[] d() {
        return this.g;
    }

    public final String[] e() {
        return this.h;
    }

    public final String f() {
        return this.e;
    }

    public String g() {
        return this.d;
    }

    public final int h() {
        return this.b;
    }

    public final boolean i() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final byte[] j() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray;
            byte[] byArray2 = this.c == null ? new byte[]{} : this.c.getBytes("UTF-8");
            byte[] byArray3 = this.e == null ? new byte[]{} : this.e.getBytes("UTF-8");
            byte[] byArray4 = this.d == null ? new byte[]{} : this.d.getBytes("UTF-8");
            int n = byArray2.length + byArray3.length + byArray4.length;
            if (this.g != null) {
                for (String string : this.g) {
                    n += string.getBytes("UTF-8").length + 4;
                }
            }
            if (this.h != null) {
                for (String string : this.h) {
                    n += string.getBytes("UTF-8").length + 4;
                }
            }
            byteBuffer = ByteBuffer.allocate(33 + (n += 4 * this.i.size()));
            byteBuffer.putInt(this.a);
            byteBuffer.putInt(this.b);
            byteBuffer.put(this.f ? (byte)1 : 0);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
            byteBuffer.putInt(byArray3.length);
            byteBuffer.put(byArray3);
            byteBuffer.putInt(byArray4.length);
            byteBuffer.put(byArray4);
            if (this.g != null) {
                byteBuffer.putInt(this.g.length);
                for (String string : this.g) {
                    byArray = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray.length);
                    byteBuffer.put(byArray);
                }
            } else {
                byteBuffer.putInt(0);
            }
            if (this.h != null) {
                byteBuffer.putInt(this.h.length);
                for (String string : this.h) {
                    byArray = string.getBytes("UTF-8");
                    byteBuffer.putInt(byArray.length);
                    byteBuffer.put(byArray);
                }
            } else {
                byteBuffer.putInt(0);
            }
            String[] stringArray = this.i;
            synchronized (this.i) {
                byteBuffer.putInt(this.i.size());
                for (int k = 0; k < this.i.size(); ++k) {
                    byteBuffer.putInt(this.i.getQuick(k));
                }
                // ** MonitorExit[var6_7] (shouldn't be in output)
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bw_0.D().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        {
            return byteBuffer.array();
        }
    }

    public final void a(String string) {
        this.c = string;
    }

    public final void b(int n) {
        this.a = n;
    }

    public final void a(boolean bl) {
        this.f = bl;
    }

    public final void a(String[] stringArray) {
        this.g = stringArray;
    }

    public final void b(String[] stringArray) {
        this.h = stringArray;
    }

    public final void b(String string) {
        this.e = string;
    }

    public void c(String string) {
        this.d = string;
    }

    public final void c(int n) {
        this.b = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        try {
            int n;
            this.a = byteBuffer.getInt();
            this.b = byteBuffer.getInt();
            this.f = byteBuffer.get() == 1;
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.c = new String(byArray2, "UTF-8").intern();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.e = new String(byArray3, "UTF-8").intern();
            byte[] byArray4 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray4);
            this.d = new String(byArray4, "UTF-8").intern();
            int n2 = byteBuffer.getInt();
            this.g = new String[n2];
            for (n = 0; n < n2; ++n) {
                byte[] byArray5 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray5);
                this.g[n] = new String(byArray5, "UTF-8").intern();
            }
            n = byteBuffer.getInt();
            this.h = new String[n];
            for (int k = 0; k < n; ++k) {
                byte[] byArray6 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray6);
                this.h[k] = new String(byArray6, "UTF-8").intern();
            }
            TIntArrayList tIntArrayList = this.i;
            synchronized (tIntArrayList) {
                int n3 = byteBuffer.getInt();
                for (int k = 0; k < n3; ++k) {
                    this.i.add(byteBuffer.getInt());
                }
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bw_0.E().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

