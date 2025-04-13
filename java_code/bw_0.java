/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;

/*
 * Renamed from BW
 */
public final class bw_0
extends ars_1 {
    private static final short b = 1;
    private int c;
    private short d;
    private boolean e;
    private byte f;
    private boolean g;
    @ary_1(a="is_challenge")
    private boolean h;
    private boolean i;
    private boolean j;
    private short k;
    private wt_0 l;
    private short m;
    private short n;
    private long[] o;
    private boolean p;
    private String q;
    private String r;
    private String s = "";
    private String t;
    private String[] u;
    private final ArrayList<bx_0> v = new ArrayList(2);
    private final ArrayList<bz_0> w = new ArrayList(2);

    public bw_0() {
        super((short)1);
    }

    public void a(bx_0 bx_02) {
        this.v.add(bx_02);
    }

    public void a(bz_0 bz_02) {
        this.w.add(bz_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s2) {
        this.e(n);
        if (s2 == 1) {
            int n2;
            Object object;
            byte[] byArray;
            this.c = byteBuffer.getInt();
            this.f = byteBuffer.get();
            this.d = byteBuffer.getShort();
            this.e = byteBuffer.get() == 1;
            this.g = byteBuffer.get() == 1;
            this.h = byteBuffer.get() == 1;
            this.i = byteBuffer.get() == 1;
            this.p = byteBuffer.get() == 1;
            this.j = byteBuffer.get() == 1;
            this.m = byteBuffer.getShort();
            this.n = byteBuffer.getShort();
            this.k = byteBuffer.getShort();
            long l = byteBuffer.getLong();
            this.l = l != 0L ? wt_0.b(l) : null;
            int n3 = byteBuffer.getInt();
            if (n3 > 0) {
                this.o = new long[n3];
                for (int k = 0; k < n3; ++k) {
                    this.o[k] = byteBuffer.getLong();
                }
            }
            try {
                byte[] byArray2 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray2);
                this.q = new String(byArray2, "UTF-8").intern();
                byte[] byArray3 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray3);
                this.s = new String(byArray3, "UTF-8").intern();
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                this.r = new String(byArray, "UTF-8").intern();
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                this.t = new String((byte[])object, "UTF-8").intern();
                int n4 = byteBuffer.getInt();
                this.u = new String[n4];
                for (int k = 0; k < n4; ++k) {
                    byte[] byArray4 = new byte[byteBuffer.getInt()];
                    byteBuffer.get(byArray4);
                    this.u[k] = new String(byArray4, "UTF-8").intern();
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            int n5 = byteBuffer.getInt();
            for (n2 = 0; n2 < n5; ++n2) {
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                object = new bx_0(this);
                object.a(byArray);
                this.v.add((bx_0)object);
            }
            n2 = byteBuffer.getInt();
            for (int k = 0; k < n2; ++k) {
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                bz_0 bz_02 = new bz_0();
                bz_02.a((byte[])object);
                this.w.add(bz_02);
            }
        } else {
            a.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public ars_1 a() {
        return new bw_0();
    }

    public by_0 b() {
        return new by_0();
    }

    public bx_0 c() {
        return new bx_0(this);
    }

    public bz_0 d() {
        return new bz_0();
    }

    public ArrayList<bx_0> g() {
        return this.v;
    }

    @Override
    public byte[] e() {
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        try {
            byArray = this.q.getBytes("UTF-8");
            byArray2 = this.s.getBytes("UTF-8");
            byArray3 = this.r.getBytes("UTF-8");
            byArray4 = this.t.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            a.error((Object)"UnsupportedEncodingException during getBinaryData", (Throwable)unsupportedEncodingException);
        }
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.v.size());
        ArrayList<byte[]> arrayList2 = new ArrayList<byte[]>(this.w.size());
        int n = 4 + byArray.length;
        n += 4 + byArray2.length;
        n += 4 + byArray3.length;
        n += 4 + byArray4.length;
        n += 4;
        try {
            for (String string : this.u) {
                n += 4 + string.getBytes("UTF-8").length;
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        for (bx_0 bx_02 : this.v) {
            byte[] byArray5 = bx_02.p();
            n += byArray5.length + 4;
            arrayList.add(byArray5);
        }
        for (bz_0 bz_02 : this.w) {
            byte[] byArray6 = bz_02.k();
            n += byArray6.length + 4;
            arrayList2.add(byArray6);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(31 + (this.o != null ? this.o.length : 0) * 8 + 4 + 4 + n);
        byteBuffer.putInt(this.c);
        byteBuffer.put(this.f);
        byteBuffer.putShort(this.d);
        byteBuffer.put(this.e ? (byte)1 : 0);
        byteBuffer.put(this.g ? (byte)1 : 0);
        byteBuffer.put(this.h ? (byte)1 : 0);
        byteBuffer.put(this.i ? (byte)1 : 0);
        byteBuffer.put(this.p ? (byte)1 : 0);
        byteBuffer.put(this.j ? (byte)1 : 0);
        byteBuffer.putShort(this.m);
        byteBuffer.putShort(this.n);
        byteBuffer.putShort(this.k);
        if (this.l != null) {
            byteBuffer.putLong(this.l.h());
        } else {
            byteBuffer.putLong(0L);
        }
        if (this.o != null) {
            byteBuffer.putInt(this.o.length);
            long[] lArray = this.o;
            int n2 = lArray.length;
            for (int k = 0; k < n2; ++k) {
                Long object = lArray[k];
                byteBuffer.putLong(object);
            }
        } else {
            byteBuffer.putInt(0);
        }
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putInt(byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putInt(byArray3.length);
        byteBuffer.put(byArray3);
        byteBuffer.putInt(byArray4.length);
        byteBuffer.put(byArray4);
        try {
            byteBuffer.putInt(this.u.length);
            for (String string : this.u) {
                byte[] byArray5 = string.getBytes("UTF-8");
                byteBuffer.putInt(byArray5.length);
                byteBuffer.put(byArray5);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        byteBuffer.putInt(arrayList.size());
        for (byte[] byArray8 : arrayList) {
            byteBuffer.putInt(byArray8.length);
            byteBuffer.put(byArray8);
        }
        byteBuffer.putInt(arrayList2.size());
        for (byte[] byArray9 : arrayList2) {
            byteBuffer.putInt(byArray9.length);
            byteBuffer.put(byArray9);
        }
        return byteBuffer.array();
    }

    @Override
    public int f() {
        return enK.aj.a();
    }

    public short h() {
        return this.k;
    }

    public wt_0 i() {
        return this.l;
    }

    public int j() {
        return this.c;
    }

    public String k() {
        return this.q;
    }

    public short l() {
        return this.d;
    }

    public short m() {
        return this.m;
    }

    public short n() {
        return this.n;
    }

    public String o() {
        return this.t;
    }

    public ArrayList<bz_0> p() {
        return this.w;
    }

    public byte q() {
        return this.f;
    }

    public String[] r() {
        return this.u;
    }

    public String s() {
        return this.r;
    }

    public String t() {
        return this.s;
    }

    public long[] u() {
        return this.o;
    }

    public boolean v() {
        return this.g;
    }

    public boolean w() {
        return this.h;
    }

    public boolean x() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public boolean y() {
        return this.j;
    }

    public boolean z() {
        return this.p;
    }

    public boolean A() {
        return this.e;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public void a(short s2) {
        this.k = s2;
    }

    public void a(Date date) {
        this.l = date != null ? wt_0.a(date) : null;
    }

    public void a(int n) {
        this.c = n;
    }

    public void a(String string) {
        this.q = string;
    }

    public void b(short s2) {
        this.d = s2;
    }

    public void c(short s2) {
        this.m = s2;
    }

    public void d(short s2) {
        this.n = s2;
    }

    public void b(String string) {
        this.t = string;
    }

    public void d(boolean bl) {
        this.j = bl;
    }

    public void e(boolean bl) {
        this.p = bl;
    }

    public void f(boolean bl) {
        this.e = bl;
    }

    public void a(byte by) {
        this.f = by;
    }

    public void a(String[] stringArray) {
        this.u = stringArray;
    }

    public void c(String string) {
        this.r = string;
    }

    public void d(String string) {
        this.s = string;
    }

    public void a(long[] lArray) {
        this.o = lArray;
    }

    static /* synthetic */ Logger B() {
        return a;
    }

    static /* synthetic */ Logger C() {
        return a;
    }

    static /* synthetic */ Logger D() {
        return a;
    }

    static /* synthetic */ Logger E() {
        return a;
    }

    static /* synthetic */ Logger F() {
        return a;
    }
}

