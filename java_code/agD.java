/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;
import org.apache.log4j.Logger;

public class agD {
    private static final Logger e = Logger.getLogger(agD.class);
    public static final byte a = 1;
    public static final byte b = 2;
    private static final short f = 16;
    private static final short g = 32;
    private static final short h = 64;
    private static final short i = 128;
    private static final short j = 15;
    protected final agC c;
    private final int k;
    private final short l;
    private final short m;
    private final short n;
    private final short o;
    private final short p;
    private final short q;
    private final int r;
    private final byte s;
    private final byte t;
    private final byte u;
    private final byte v;
    private final TextureCoords w;
    private final byte x;
    private byte y;

    public agD(int n, short s2, short s3, short s4, short s5, short s6, short s7, int n2, boolean bl, byte by, byte by2, boolean bl2, boolean bl3, boolean bl4, byte by3, byte by4, byte by5, agC agC2, byte by6) {
        this.k = n;
        this.l = s2;
        this.m = s3;
        this.p = s4;
        this.q = s5;
        this.n = s6;
        this.o = s7;
        this.r = n2;
        this.s = by2;
        assert (by <= 15);
        byte by7 = by;
        by7 = (byte)(by7 | (bl ? 16 : 0));
        by7 = (byte)(by7 | (bl2 ? 32 : 0));
        by7 = (byte)(by7 | (bl3 ? 64 : 0));
        this.x = by7 = (byte)(by7 | (bl4 ? 128 : 0));
        this.t = by3;
        this.u = by4;
        this.v = by5;
        this.c = agC2;
        this.w = this.c == null ? agD.a((int)this.n, this.o, this.g()) : null;
        this.y = by6;
    }

    agD(DataInput dataInput) {
        this.k = dataInput.readInt();
        this.l = dataInput.readShort();
        this.m = dataInput.readShort();
        this.p = dataInput.readShort();
        this.q = dataInput.readShort();
        this.n = dataInput.readShort();
        this.o = dataInput.readShort();
        this.r = dataInput.readInt();
        this.x = dataInput.readByte();
        this.s = dataInput.readByte();
        this.t = dataInput.readByte();
        this.u = dataInput.readByte();
        this.v = dataInput.readByte();
        boolean bl = this.g();
        this.c = agH.a(dataInput, bl);
        this.w = this.c == null ? agD.a((int)this.n, this.o, bl) : null;
        this.y = dataInput.readByte();
    }

    public void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.k);
        dataOutput.writeShort(this.l);
        dataOutput.writeShort(this.m);
        dataOutput.writeShort(this.p);
        dataOutput.writeShort(this.q);
        dataOutput.writeShort(this.n);
        dataOutput.writeShort(this.o);
        dataOutput.writeInt(this.r);
        dataOutput.writeByte(this.x);
        dataOutput.writeByte(this.s);
        dataOutput.writeByte(this.t);
        dataOutput.writeByte(this.u);
        dataOutput.writeByte(this.v);
        if (this.c == null) {
            dataOutput.writeByte(0);
        } else {
            this.c.a(dataOutput);
        }
        dataOutput.writeByte(this.y);
    }

    public int a() {
        return this.k;
    }

    public int b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public int d() {
        return this.p;
    }

    public int e() {
        return this.q;
    }

    public int f() {
        return this.r;
    }

    public boolean g() {
        return (this.x & 0x10) == 16;
    }

    public byte h() {
        return (byte)(this.x & 0xF);
    }

    public int i() {
        return this.s;
    }

    public boolean j() {
        return (this.x & 0x20) == 32;
    }

    public byte k() {
        return this.y;
    }

    public boolean l() {
        return (this.x & 0x40) == 64;
    }

    public boolean m() {
        return (this.x & 0x80) == 128;
    }

    public byte n() {
        return this.t;
    }

    public byte o() {
        return this.u;
    }

    public byte p() {
        return this.v;
    }

    public boolean q() {
        return this.c != null;
    }

    public float r() {
        return (float)this.o / (float)this.q;
    }

    public float s() {
        return (float)this.n / (float)this.p;
    }

    public TextureCoords a(short s2) {
        if (this.w != null) {
            assert (this.c == null);
            return this.w;
        }
        return ((agH)this.c).a(s2);
    }

    private static TextureCoords a(int n, int n2, boolean bl) {
        float f2 = Hw.e(n);
        float f3 = (float)Hw.e(n2) - 0.5f;
        float f4 = (float)n / f2;
        float f5 = (float)n2 / f3;
        if (bl) {
            return new TextureCoords(f4, f5, 0.0f, 0.0f);
        }
        return new TextureCoords(0.0f, f5, f4, 0.0f);
    }

    public static agD a(int n, boolean bl, boolean bl2) {
        return new agD(n, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, bl, false, bl2, 0, 0, 0, null, 0);
    }
}

