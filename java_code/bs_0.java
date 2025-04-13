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
 * Renamed from BS
 */
public final class bs_0
extends ars_1 {
    private static final short b = 1;
    private int c;
    private byte d;
    private byte e;
    private boolean f;
    @ary_1(a="is_challenge")
    private boolean g;
    private boolean h;
    private short i;
    private wu_0 j;
    private short k;
    private short l;
    private String m;
    private String n;
    private String[] o;
    private String p;
    private final ArrayList<bt_0> q = new ArrayList(2);
    private final ArrayList<bu_0> r = new ArrayList(2);

    public bs_0() {
        super((short)1);
    }

    public void a(bt_0 bt_02) {
        this.q.add(bt_02);
    }

    public void a(bu_0 bu_02) {
        this.r.add(bu_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n, short s2) {
        this.e(n);
        if (s2 == 1) {
            Object object;
            int n2;
            byte[] byArray;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.get();
            this.e = byteBuffer.get();
            this.f = byteBuffer.get() == 1;
            this.g = byteBuffer.get() == 1;
            this.h = byteBuffer.get() == 1;
            this.i = byteBuffer.getShort();
            this.k = byteBuffer.getShort();
            this.l = byteBuffer.getShort();
            long l = byteBuffer.getLong();
            this.j = l != 0L ? wt_0.b(l) : null;
            try {
                byte[] byArray2 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray2);
                this.p = new String(byArray2, "UTF-8").intern();
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            try {
                int n3 = byteBuffer.getInt();
                this.o = new String[n3];
                for (int k = 0; k < n3; ++k) {
                    byArray = new byte[byteBuffer.getInt()];
                    byteBuffer.get(byArray);
                    this.o[k] = new String(byArray, "UTF-8").intern();
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            try {
                byte[] byArray3 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray3);
                this.m = new String(byArray3, "UTF-8").intern();
                byte[] byArray4 = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray4);
                this.n = new String(byArray4, "UTF-8").intern();
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.error((Object)"UnsupportedEncodingException during build", (Throwable)unsupportedEncodingException);
            }
            int n4 = byteBuffer.getInt();
            for (n2 = 0; n2 < n4; ++n2) {
                byArray = new byte[byteBuffer.getInt()];
                byteBuffer.get(byArray);
                object = new bt_0();
                ((bt_0)object).a(byArray);
                this.q.add((bt_0)object);
            }
            n2 = byteBuffer.getInt();
            for (int k = 0; k < n2; ++k) {
                object = new byte[byteBuffer.getInt()];
                byteBuffer.get((byte[])object);
                bu_0 bu_02 = new bu_0();
                bu_02.a((byte[])object);
                this.r.add(bu_02);
            }
        } else {
            a.error((Object)"Tentative de d\u00e9s\u00e9rialisation d'un objet avec une version non prise en charge");
        }
    }

    @Override
    public ars_1 a() {
        return new bs_0();
    }

    public bt_0 b() {
        return new bt_0();
    }

    public bu_0 c() {
        return new bu_0();
    }

    public ArrayList<bt_0> d() {
        return this.q;
    }

    @Override
    public byte[] e() {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(this.q.size());
        ArrayList<byte[]> arrayList2 = new ArrayList<byte[]>(this.r.size());
        int n = 0;
        n += 4;
        try {
            for (String string : this.o) {
                n += 4 + string.getBytes("UTF-8").length;
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            n += 8;
            n += this.m != null ? this.m.getBytes("UTF-8").length : 0;
            n += this.n != null ? this.n.getBytes("UTF-8").length : 0;
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        for (bt_0 bt_02 : this.q) {
            byte[] byArray = bt_02.g();
            n += byArray.length + 4;
            arrayList.add(byArray);
        }
        for (bu_0 bu_02 : this.r) {
            byte[] byArray = bu_02.k();
            n += byArray.length + 4;
            arrayList2.add(byArray);
        }
        try {
            n += 4;
            n += this.p != null ? this.p.getBytes("UTF-8").length : 0;
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(31 + n);
        byteBuffer.putInt(this.c);
        byteBuffer.put(this.d);
        byteBuffer.put(this.e);
        byteBuffer.put(this.f ? (byte)1 : 0);
        byteBuffer.put(this.g ? (byte)1 : 0);
        byteBuffer.put(this.h ? (byte)1 : 0);
        byteBuffer.putShort(this.i);
        byteBuffer.putShort(this.k);
        byteBuffer.putShort(this.l);
        if (this.j != null) {
            byteBuffer.putLong(this.j.h());
        } else {
            byteBuffer.putLong(0L);
        }
        try {
            if (this.p != null) {
                byte[] byArray = this.p.getBytes("UTF-8");
                byteBuffer.putInt(byArray.length);
                byteBuffer.put(byArray);
            } else {
                byteBuffer.putInt(0);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            byteBuffer.putInt(this.o.length);
            for (String string : this.o) {
                byte[] byArray = string.getBytes("UTF-8");
                byteBuffer.putInt(byArray.length);
                byteBuffer.put(byArray);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        try {
            Object object;
            if (this.m != null) {
                object = this.m.getBytes("UTF-8");
                byteBuffer.putInt(((String[])object).length);
                byteBuffer.put((byte[])object);
            } else {
                byteBuffer.putInt(0);
            }
            if (this.n != null) {
                object = this.n.getBytes("UTF-8");
                byteBuffer.putInt(((Object)object).length);
                byteBuffer.put((byte[])object);
            } else {
                byteBuffer.putInt(0);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception during getBinaryData", (Throwable)exception);
        }
        byteBuffer.putInt(arrayList.size());
        for (byte[] byArray : arrayList) {
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
        }
        byteBuffer.putInt(arrayList2.size());
        for (byte[] byArray : arrayList2) {
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
        }
        return byteBuffer.array();
    }

    @Override
    public int f() {
        return enK.aj.a();
    }

    public short g() {
        return this.i;
    }

    public wu_0 h() {
        return this.j;
    }

    public int i() {
        return this.c;
    }

    public ArrayList<bu_0> j() {
        return this.r;
    }

    public byte k() {
        return this.d;
    }

    public byte l() {
        return this.e;
    }

    public String[] m() {
        return this.o;
    }

    public String n() {
        return this.m;
    }

    public String o() {
        return this.n;
    }

    public boolean p() {
        return this.f;
    }

    public boolean q() {
        return this.g;
    }

    public boolean r() {
        return this.h;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public void a(short s2) {
        this.i = s2;
    }

    public void b(short s2) {
        this.k = s2;
    }

    public short s() {
        return this.k;
    }

    public short t() {
        return this.l;
    }

    public void c(short s2) {
        this.l = s2;
    }

    public void a(Date date) {
        this.j = date != null ? wt_0.a(date) : null;
    }

    public void a(int n) {
        this.c = n;
    }

    public void a(byte by) {
        this.d = by;
    }

    public void b(byte by) {
        this.e = by;
    }

    public void a(String[] stringArray) {
        this.o = stringArray;
    }

    public void a(String string) {
        this.m = string;
    }

    public void b(String string) {
        this.n = string;
    }

    public void c(String string) {
        this.p = string;
    }

    public String u() {
        return this.p;
    }

    static /* synthetic */ Logger v() {
        return a;
    }

    static /* synthetic */ Logger w() {
        return a;
    }

    static /* synthetic */ Logger x() {
        return a;
    }
}

