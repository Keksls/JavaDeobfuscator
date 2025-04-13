/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from iq
 */
public final class iq_0
extends GeneratedMessageV3
implements it_0 {
    private static final long C = 0L;
    int D;
    public static final int a = 1;
    ByteString E;
    public static final int b = 10;
    int F;
    public static final int c = 11;
    int G;
    public static final int d = 12;
    int H;
    public static final int e = 13;
    long I;
    public static final int f = 14;
    int J;
    public static final int g = 15;
    ik_0 K;
    public static final int h = 16;
    int L;
    public static final int i = 17;
    boolean M;
    public static final int j = 18;
    boolean N;
    public static final int k = 19;
    int O;
    public static final int l = 20;
    int P;
    public static final int m = 21;
    long Q;
    public static final int n = 22;
    long R;
    public static final int o = 23;
    ik_0 S;
    public static final int p = 24;
    float T;
    public static final int q = 25;
    int U;
    public static final int r = 30;
    boolean V;
    public static final int s = 31;
    boolean W;
    public static final int t = 32;
    boolean X;
    public static final int u = 33;
    boolean Y;
    public static final int v = 34;
    boolean Z;
    public static final int w = 35;
    boolean aa;
    public static final int x = 38;
    boolean ab;
    public static final int y = 50;
    long ac;
    public static final int z = 70;
    ig_0 ad;
    public static final int A = 71;
    zt_2 ae;
    private byte af = (byte)-1;
    private static final iq_0 ag = new iq_0();
    @Deprecated
    public static final Parser<iq_0> B = new ir_0();

    iq_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iq_0() {
        this.E = ByteString.EMPTY;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0L;
        this.J = 0;
        this.L = 0;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = 0L;
        this.R = 0L;
        this.T = 0.0f;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.ab = false;
        this.ac = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iq_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block36: while (!bl2) {
                GeneratedMessageV3.Builder builder2;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block36;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block36;
                        bl2 = true;
                        continue block36;
                    }
                    case 10: {
                        this.D |= 1;
                        this.E = codedInputStream.readBytes();
                        continue block36;
                    }
                    case 80: {
                        this.D |= 2;
                        this.F = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 88: {
                        this.D |= 4;
                        this.G = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 96: {
                        this.D |= 8;
                        this.H = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 104: {
                        this.D |= 0x10;
                        this.I = codedInputStream.readInt64();
                        continue block36;
                    }
                    case 112: {
                        this.D |= 0x20;
                        this.J = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 122: {
                        builder2 = null;
                        if ((this.D & 0x40) == 64) {
                            builder2 = this.K.j();
                        }
                        this.K = (ik_0)codedInputStream.readMessage(ik_0.d, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.K);
                            this.K = builder2.k();
                        }
                        this.D |= 0x40;
                        continue block36;
                    }
                    case 128: {
                        this.D |= 0x80;
                        this.L = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 136: {
                        this.D |= 0x100;
                        this.M = codedInputStream.readBool();
                        continue block36;
                    }
                    case 144: {
                        this.D |= 0x200;
                        this.N = codedInputStream.readBool();
                        continue block36;
                    }
                    case 152: {
                        this.D |= 0x400;
                        this.O = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 160: {
                        this.D |= 0x800;
                        this.P = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 168: {
                        this.D |= 0x1000;
                        this.Q = codedInputStream.readInt64();
                        continue block36;
                    }
                    case 176: {
                        this.D |= 0x2000;
                        this.R = codedInputStream.readInt64();
                        continue block36;
                    }
                    case 186: {
                        builder2 = null;
                        if ((this.D & 0x4000) == 16384) {
                            builder2 = this.S.j();
                        }
                        this.S = (ik_0)codedInputStream.readMessage(ik_0.d, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.S);
                            this.S = builder2.k();
                        }
                        this.D |= 0x4000;
                        continue block36;
                    }
                    case 197: {
                        this.D |= 0x8000;
                        this.T = codedInputStream.readFloat();
                        continue block36;
                    }
                    case 200: {
                        this.D |= 0x10000;
                        this.U = codedInputStream.readInt32();
                        continue block36;
                    }
                    case 240: {
                        this.D |= 0x20000;
                        this.V = codedInputStream.readBool();
                        continue block36;
                    }
                    case 248: {
                        this.D |= 0x40000;
                        this.W = codedInputStream.readBool();
                        continue block36;
                    }
                    case 256: {
                        this.D |= 0x80000;
                        this.X = codedInputStream.readBool();
                        continue block36;
                    }
                    case 264: {
                        this.D |= 0x100000;
                        this.Y = codedInputStream.readBool();
                        continue block36;
                    }
                    case 272: {
                        this.D |= 0x200000;
                        this.Z = codedInputStream.readBool();
                        continue block36;
                    }
                    case 280: {
                        this.D |= 0x400000;
                        this.aa = codedInputStream.readBool();
                        continue block36;
                    }
                    case 304: {
                        this.D |= 0x800000;
                        this.ab = codedInputStream.readBool();
                        continue block36;
                    }
                    case 400: {
                        this.D |= 0x1000000;
                        this.ac = codedInputStream.readInt64();
                        continue block36;
                    }
                    case 562: {
                        builder2 = null;
                        if ((this.D & 0x2000000) == 0x2000000) {
                            builder2 = this.ad.g();
                        }
                        this.ad = (ig_0)codedInputStream.readMessage(ig_0.b, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.ad);
                            this.ad = builder2.h();
                        }
                        this.D |= 0x2000000;
                        continue block36;
                    }
                    case 570: 
                }
                builder2 = null;
                if ((this.D & 0x4000000) == 0x4000000) {
                    builder2 = this.ae.g();
                }
                this.ae = (zt_2)codedInputStream.readMessage(zt_2.b, extensionRegistryLite);
                if (builder2 != null) {
                    builder2.a(this.ae);
                    this.ae = builder2.h();
                }
                this.D |= 0x4000000;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return io_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.l.ensureFieldAccessorsInitialized(iq_0.class, is.class);
    }

    @Override
    public boolean b() {
        return (this.D & 1) == 1;
    }

    @Override
    public ByteString c() {
        return this.E;
    }

    @Override
    public boolean d() {
        return (this.D & 2) == 2;
    }

    @Override
    public int e() {
        return this.F;
    }

    @Override
    public boolean f() {
        return (this.D & 4) == 4;
    }

    @Override
    public int g() {
        return this.G;
    }

    @Override
    public boolean h() {
        return (this.D & 8) == 8;
    }

    @Override
    public int i() {
        return this.H;
    }

    @Override
    public boolean j() {
        return (this.D & 0x10) == 16;
    }

    @Override
    public long k() {
        return this.I;
    }

    @Override
    public boolean l() {
        return (this.D & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.J;
    }

    @Override
    public boolean n() {
        return (this.D & 0x40) == 64;
    }

    @Override
    public ik_0 o() {
        return this.K == null ? ik_0.k() : this.K;
    }

    @Override
    public in_0 p() {
        return this.K == null ? ik_0.k() : this.K;
    }

    @Override
    public boolean q() {
        return (this.D & 0x80) == 128;
    }

    @Override
    public int r() {
        return this.L;
    }

    @Override
    public boolean s() {
        return (this.D & 0x100) == 256;
    }

    @Override
    public boolean t() {
        return this.M;
    }

    @Override
    public boolean u() {
        return (this.D & 0x200) == 512;
    }

    @Override
    public boolean v() {
        return this.N;
    }

    @Override
    public boolean w() {
        return (this.D & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.O;
    }

    @Override
    public boolean y() {
        return (this.D & 0x800) == 2048;
    }

    @Override
    public int z() {
        return this.P;
    }

    @Override
    public boolean A() {
        return (this.D & 0x1000) == 4096;
    }

    @Override
    public long B() {
        return this.Q;
    }

    @Override
    public boolean C() {
        return (this.D & 0x2000) == 8192;
    }

    @Override
    public long D() {
        return this.R;
    }

    @Override
    public boolean E() {
        return (this.D & 0x4000) == 16384;
    }

    @Override
    public ik_0 F() {
        return this.S == null ? ik_0.k() : this.S;
    }

    @Override
    public in_0 G() {
        return this.S == null ? ik_0.k() : this.S;
    }

    @Override
    public boolean H() {
        return (this.D & 0x8000) == 32768;
    }

    @Override
    public float I() {
        return this.T;
    }

    @Override
    public boolean J() {
        return (this.D & 0x10000) == 65536;
    }

    @Override
    public int K() {
        return this.U;
    }

    @Override
    public boolean L() {
        return (this.D & 0x20000) == 131072;
    }

    @Override
    public boolean M() {
        return this.V;
    }

    @Override
    public boolean N() {
        return (this.D & 0x40000) == 262144;
    }

    @Override
    public boolean O() {
        return this.W;
    }

    @Override
    public boolean P() {
        return (this.D & 0x80000) == 524288;
    }

    @Override
    public boolean Q() {
        return this.X;
    }

    @Override
    public boolean R() {
        return (this.D & 0x100000) == 0x100000;
    }

    @Override
    public boolean S() {
        return this.Y;
    }

    @Override
    public boolean T() {
        return (this.D & 0x200000) == 0x200000;
    }

    @Override
    public boolean U() {
        return this.Z;
    }

    @Override
    public boolean V() {
        return (this.D & 0x400000) == 0x400000;
    }

    @Override
    public boolean W() {
        return this.aa;
    }

    @Override
    public boolean X() {
        return (this.D & 0x800000) == 0x800000;
    }

    @Override
    public boolean Y() {
        return this.ab;
    }

    @Override
    public boolean Z() {
        return (this.D & 0x1000000) == 0x1000000;
    }

    @Override
    public long aa() {
        return this.ac;
    }

    @Override
    public boolean ab() {
        return (this.D & 0x2000000) == 0x2000000;
    }

    @Override
    public ig_0 ac() {
        return this.ad == null ? ig_0.h() : this.ad;
    }

    @Override
    public ij_0 ad() {
        return this.ad == null ? ig_0.h() : this.ad;
    }

    @Override
    public boolean ae() {
        return (this.D & 0x4000000) == 0x4000000;
    }

    @Override
    public zt_2 af() {
        return this.ae == null ? zt_2.h() : this.ae;
    }

    @Override
    public zw_2 ag() {
        return this.ae == null ? zt_2.h() : this.ae;
    }

    public final boolean isInitialized() {
        byte by = this.af;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (this.n() && !this.o().isInitialized()) {
            this.af = 0;
            return false;
        }
        if (this.E() && !this.F().isInitialized()) {
            this.af = 0;
            return false;
        }
        if (this.ab() && !this.ac().isInitialized()) {
            this.af = 0;
            return false;
        }
        if (this.ae() && !this.af().isInitialized()) {
            this.af = 0;
            return false;
        }
        this.af = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.D & 1) == 1) {
            codedOutputStream.writeBytes(1, this.E);
        }
        if ((this.D & 2) == 2) {
            codedOutputStream.writeInt32(10, this.F);
        }
        if ((this.D & 4) == 4) {
            codedOutputStream.writeInt32(11, this.G);
        }
        if ((this.D & 8) == 8) {
            codedOutputStream.writeInt32(12, this.H);
        }
        if ((this.D & 0x10) == 16) {
            codedOutputStream.writeInt64(13, this.I);
        }
        if ((this.D & 0x20) == 32) {
            codedOutputStream.writeInt32(14, this.J);
        }
        if ((this.D & 0x40) == 64) {
            codedOutputStream.writeMessage(15, (MessageLite)this.o());
        }
        if ((this.D & 0x80) == 128) {
            codedOutputStream.writeInt32(16, this.L);
        }
        if ((this.D & 0x100) == 256) {
            codedOutputStream.writeBool(17, this.M);
        }
        if ((this.D & 0x200) == 512) {
            codedOutputStream.writeBool(18, this.N);
        }
        if ((this.D & 0x400) == 1024) {
            codedOutputStream.writeInt32(19, this.O);
        }
        if ((this.D & 0x800) == 2048) {
            codedOutputStream.writeInt32(20, this.P);
        }
        if ((this.D & 0x1000) == 4096) {
            codedOutputStream.writeInt64(21, this.Q);
        }
        if ((this.D & 0x2000) == 8192) {
            codedOutputStream.writeInt64(22, this.R);
        }
        if ((this.D & 0x4000) == 16384) {
            codedOutputStream.writeMessage(23, (MessageLite)this.F());
        }
        if ((this.D & 0x8000) == 32768) {
            codedOutputStream.writeFloat(24, this.T);
        }
        if ((this.D & 0x10000) == 65536) {
            codedOutputStream.writeInt32(25, this.U);
        }
        if ((this.D & 0x20000) == 131072) {
            codedOutputStream.writeBool(30, this.V);
        }
        if ((this.D & 0x40000) == 262144) {
            codedOutputStream.writeBool(31, this.W);
        }
        if ((this.D & 0x80000) == 524288) {
            codedOutputStream.writeBool(32, this.X);
        }
        if ((this.D & 0x100000) == 0x100000) {
            codedOutputStream.writeBool(33, this.Y);
        }
        if ((this.D & 0x200000) == 0x200000) {
            codedOutputStream.writeBool(34, this.Z);
        }
        if ((this.D & 0x400000) == 0x400000) {
            codedOutputStream.writeBool(35, this.aa);
        }
        if ((this.D & 0x800000) == 0x800000) {
            codedOutputStream.writeBool(38, this.ab);
        }
        if ((this.D & 0x1000000) == 0x1000000) {
            codedOutputStream.writeInt64(50, this.ac);
        }
        if ((this.D & 0x2000000) == 0x2000000) {
            codedOutputStream.writeMessage(70, (MessageLite)this.ac());
        }
        if ((this.D & 0x4000000) == 0x4000000) {
            codedOutputStream.writeMessage(71, (MessageLite)this.af());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.D & 1) == 1) {
            n += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.E);
        }
        if ((this.D & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.F);
        }
        if ((this.D & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.G);
        }
        if ((this.D & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.H);
        }
        if ((this.D & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)13, (long)this.I);
        }
        if ((this.D & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.J);
        }
        if ((this.D & 0x40) == 64) {
            n += CodedOutputStream.computeMessageSize((int)15, (MessageLite)this.o());
        }
        if ((this.D & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.L);
        }
        if ((this.D & 0x100) == 256) {
            n += CodedOutputStream.computeBoolSize((int)17, (boolean)this.M);
        }
        if ((this.D & 0x200) == 512) {
            n += CodedOutputStream.computeBoolSize((int)18, (boolean)this.N);
        }
        if ((this.D & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)19, (int)this.O);
        }
        if ((this.D & 0x800) == 2048) {
            n += CodedOutputStream.computeInt32Size((int)20, (int)this.P);
        }
        if ((this.D & 0x1000) == 4096) {
            n += CodedOutputStream.computeInt64Size((int)21, (long)this.Q);
        }
        if ((this.D & 0x2000) == 8192) {
            n += CodedOutputStream.computeInt64Size((int)22, (long)this.R);
        }
        if ((this.D & 0x4000) == 16384) {
            n += CodedOutputStream.computeMessageSize((int)23, (MessageLite)this.F());
        }
        if ((this.D & 0x8000) == 32768) {
            n += CodedOutputStream.computeFloatSize((int)24, (float)this.T);
        }
        if ((this.D & 0x10000) == 65536) {
            n += CodedOutputStream.computeInt32Size((int)25, (int)this.U);
        }
        if ((this.D & 0x20000) == 131072) {
            n += CodedOutputStream.computeBoolSize((int)30, (boolean)this.V);
        }
        if ((this.D & 0x40000) == 262144) {
            n += CodedOutputStream.computeBoolSize((int)31, (boolean)this.W);
        }
        if ((this.D & 0x80000) == 524288) {
            n += CodedOutputStream.computeBoolSize((int)32, (boolean)this.X);
        }
        if ((this.D & 0x100000) == 0x100000) {
            n += CodedOutputStream.computeBoolSize((int)33, (boolean)this.Y);
        }
        if ((this.D & 0x200000) == 0x200000) {
            n += CodedOutputStream.computeBoolSize((int)34, (boolean)this.Z);
        }
        if ((this.D & 0x400000) == 0x400000) {
            n += CodedOutputStream.computeBoolSize((int)35, (boolean)this.aa);
        }
        if ((this.D & 0x800000) == 0x800000) {
            n += CodedOutputStream.computeBoolSize((int)38, (boolean)this.ab);
        }
        if ((this.D & 0x1000000) == 0x1000000) {
            n += CodedOutputStream.computeInt64Size((int)50, (long)this.ac);
        }
        if ((this.D & 0x2000000) == 0x2000000) {
            n += CodedOutputStream.computeMessageSize((int)70, (MessageLite)this.ac());
        }
        if ((this.D & 0x4000000) == 0x4000000) {
            n += CodedOutputStream.computeMessageSize((int)71, (MessageLite)this.af());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iq_0)) {
            return super.equals(object);
        }
        iq_0 iq_02 = (iq_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == iq_02.b();
        if (this.b()) {
            bl = bl && this.c().equals((Object)iq_02.c());
        }
        boolean bl3 = bl = bl && this.d() == iq_02.d();
        if (this.d()) {
            bl = bl && this.e() == iq_02.e();
        }
        boolean bl4 = bl = bl && this.f() == iq_02.f();
        if (this.f()) {
            bl = bl && this.g() == iq_02.g();
        }
        boolean bl5 = bl = bl && this.h() == iq_02.h();
        if (this.h()) {
            bl = bl && this.i() == iq_02.i();
        }
        boolean bl6 = bl = bl && this.j() == iq_02.j();
        if (this.j()) {
            bl = bl && this.k() == iq_02.k();
        }
        boolean bl7 = bl = bl && this.l() == iq_02.l();
        if (this.l()) {
            bl = bl && this.m() == iq_02.m();
        }
        boolean bl8 = bl = bl && this.n() == iq_02.n();
        if (this.n()) {
            bl = bl && this.o().equals(iq_02.o());
        }
        boolean bl9 = bl = bl && this.q() == iq_02.q();
        if (this.q()) {
            bl = bl && this.r() == iq_02.r();
        }
        boolean bl10 = bl = bl && this.s() == iq_02.s();
        if (this.s()) {
            bl = bl && this.t() == iq_02.t();
        }
        boolean bl11 = bl = bl && this.u() == iq_02.u();
        if (this.u()) {
            bl = bl && this.v() == iq_02.v();
        }
        boolean bl12 = bl = bl && this.w() == iq_02.w();
        if (this.w()) {
            bl = bl && this.x() == iq_02.x();
        }
        boolean bl13 = bl = bl && this.y() == iq_02.y();
        if (this.y()) {
            bl = bl && this.z() == iq_02.z();
        }
        boolean bl14 = bl = bl && this.A() == iq_02.A();
        if (this.A()) {
            bl = bl && this.B() == iq_02.B();
        }
        boolean bl15 = bl = bl && this.C() == iq_02.C();
        if (this.C()) {
            bl = bl && this.D() == iq_02.D();
        }
        boolean bl16 = bl = bl && this.E() == iq_02.E();
        if (this.E()) {
            bl = bl && this.F().equals(iq_02.F());
        }
        boolean bl17 = bl = bl && this.H() == iq_02.H();
        if (this.H()) {
            bl = bl && Float.floatToIntBits(this.I()) == Float.floatToIntBits(iq_02.I());
        }
        boolean bl18 = bl = bl && this.J() == iq_02.J();
        if (this.J()) {
            bl = bl && this.K() == iq_02.K();
        }
        boolean bl19 = bl = bl && this.L() == iq_02.L();
        if (this.L()) {
            bl = bl && this.M() == iq_02.M();
        }
        boolean bl20 = bl = bl && this.N() == iq_02.N();
        if (this.N()) {
            bl = bl && this.O() == iq_02.O();
        }
        boolean bl21 = bl = bl && this.P() == iq_02.P();
        if (this.P()) {
            bl = bl && this.Q() == iq_02.Q();
        }
        boolean bl22 = bl = bl && this.R() == iq_02.R();
        if (this.R()) {
            bl = bl && this.S() == iq_02.S();
        }
        boolean bl23 = bl = bl && this.T() == iq_02.T();
        if (this.T()) {
            bl = bl && this.U() == iq_02.U();
        }
        boolean bl24 = bl = bl && this.V() == iq_02.V();
        if (this.V()) {
            bl = bl && this.W() == iq_02.W();
        }
        boolean bl25 = bl = bl && this.X() == iq_02.X();
        if (this.X()) {
            bl = bl && this.Y() == iq_02.Y();
        }
        boolean bl26 = bl = bl && this.Z() == iq_02.Z();
        if (this.Z()) {
            bl = bl && this.aa() == iq_02.aa();
        }
        boolean bl27 = bl = bl && this.ab() == iq_02.ab();
        if (this.ab()) {
            bl = bl && this.ac().equals(iq_02.ac());
        }
        boolean bl28 = bl = bl && this.ae() == iq_02.ae();
        if (this.ae()) {
            bl = bl && this.af().equals(iq_02.af());
        }
        bl = bl && this.unknownFields.equals((Object)iq_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iq_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.d()) {
            n = 37 * n + 10;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 11;
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 12;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashLong((long)this.k());
        }
        if (this.l()) {
            n = 37 * n + 14;
            n = 53 * n + this.m();
        }
        if (this.n()) {
            n = 37 * n + 15;
            n = 53 * n + this.o().hashCode();
        }
        if (this.q()) {
            n = 37 * n + 16;
            n = 53 * n + this.r();
        }
        if (this.s()) {
            n = 37 * n + 17;
            n = 53 * n + Internal.hashBoolean((boolean)this.t());
        }
        if (this.u()) {
            n = 37 * n + 18;
            n = 53 * n + Internal.hashBoolean((boolean)this.v());
        }
        if (this.w()) {
            n = 37 * n + 19;
            n = 53 * n + this.x();
        }
        if (this.y()) {
            n = 37 * n + 20;
            n = 53 * n + this.z();
        }
        if (this.A()) {
            n = 37 * n + 21;
            n = 53 * n + Internal.hashLong((long)this.B());
        }
        if (this.C()) {
            n = 37 * n + 22;
            n = 53 * n + Internal.hashLong((long)this.D());
        }
        if (this.E()) {
            n = 37 * n + 23;
            n = 53 * n + this.F().hashCode();
        }
        if (this.H()) {
            n = 37 * n + 24;
            n = 53 * n + Float.floatToIntBits(this.I());
        }
        if (this.J()) {
            n = 37 * n + 25;
            n = 53 * n + this.K();
        }
        if (this.L()) {
            n = 37 * n + 30;
            n = 53 * n + Internal.hashBoolean((boolean)this.M());
        }
        if (this.N()) {
            n = 37 * n + 31;
            n = 53 * n + Internal.hashBoolean((boolean)this.O());
        }
        if (this.P()) {
            n = 37 * n + 32;
            n = 53 * n + Internal.hashBoolean((boolean)this.Q());
        }
        if (this.R()) {
            n = 37 * n + 33;
            n = 53 * n + Internal.hashBoolean((boolean)this.S());
        }
        if (this.T()) {
            n = 37 * n + 34;
            n = 53 * n + Internal.hashBoolean((boolean)this.U());
        }
        if (this.V()) {
            n = 37 * n + 35;
            n = 53 * n + Internal.hashBoolean((boolean)this.W());
        }
        if (this.X()) {
            n = 37 * n + 38;
            n = 53 * n + Internal.hashBoolean((boolean)this.Y());
        }
        if (this.Z()) {
            n = 37 * n + 50;
            n = 53 * n + Internal.hashLong((long)this.aa());
        }
        if (this.ab()) {
            n = 37 * n + 70;
            n = 53 * n + this.ac().hashCode();
        }
        if (this.ae()) {
            n = 37 * n + 71;
            n = 53 * n + this.af().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iq_0 a(ByteBuffer byteBuffer) {
        return (iq_0)B.parseFrom(byteBuffer);
    }

    public static iq_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)B.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iq_0 a(ByteString byteString) {
        return (iq_0)B.parseFrom(byteString);
    }

    public static iq_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)B.parseFrom(byteString, extensionRegistryLite);
    }

    public static iq_0 a(byte[] byArray) {
        return (iq_0)B.parseFrom(byArray);
    }

    public static iq_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)B.parseFrom(byArray, extensionRegistryLite);
    }

    public static iq_0 a(InputStream inputStream) {
        return (iq_0)GeneratedMessageV3.parseWithIOException(B, (InputStream)inputStream);
    }

    public static iq_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)GeneratedMessageV3.parseWithIOException(B, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_0 b(InputStream inputStream) {
        return (iq_0)GeneratedMessageV3.parseDelimitedWithIOException(B, (InputStream)inputStream);
    }

    public static iq_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)GeneratedMessageV3.parseDelimitedWithIOException(B, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iq_0 a(CodedInputStream codedInputStream) {
        return (iq_0)GeneratedMessageV3.parseWithIOException(B, (CodedInputStream)codedInputStream);
    }

    public static iq_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iq_0)GeneratedMessageV3.parseWithIOException(B, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public is ah() {
        return iq_0.ai();
    }

    public static is ai() {
        return ag.aj();
    }

    public static is a(iq_0 iq_02) {
        return ag.aj().a(iq_02);
    }

    public is aj() {
        return this == ag ? new is() : new is().a(this);
    }

    protected is a(GeneratedMessageV3.BuilderParent builderParent) {
        is is2 = new is(builderParent);
        return is2;
    }

    public static iq_0 ak() {
        return ag;
    }

    public static Parser<iq_0> al() {
        return B;
    }

    public Parser<iq_0> getParserForType() {
        return B;
    }

    public iq_0 am() {
        return ag;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aj();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ah();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aj();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ah();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.am();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.am();
    }

    static /* synthetic */ boolean an() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iq_0 iq_02) {
        return iq_02.unknownFields;
    }
}

