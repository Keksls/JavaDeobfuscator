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
 * Renamed from jk
 */
public final class jk_0
extends GeneratedMessageV3
implements jn_0 {
    private static final long p = 0L;
    int q;
    public static final int a = 1;
    long r;
    public static final int b = 2;
    long s;
    public static final int c = 3;
    int t;
    public static final int d = 4;
    int u;
    public static final int e = 5;
    jo v;
    public static final int f = 6;
    jo w;
    public static final int g = 7;
    long x;
    public static final int h = 8;
    int y;
    public static final int i = 9;
    int z;
    public static final int j = 10;
    int A;
    public static final int k = 11;
    int B;
    public static final int l = 12;
    int C;
    public static final int m = 13;
    int D;
    public static final int n = 14;
    long E;
    private byte F = (byte)-1;
    private static final jk_0 G = new jk_0();
    @Deprecated
    public static final Parser<jk_0> o = new jl_0();

    jk_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jk_0() {
        this.r = 0L;
        this.s = 0L;
        this.t = 0;
        this.u = 0;
        this.x = 0L;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jk_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block23: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block23;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block23;
                        bl2 = true;
                        continue block23;
                    }
                    case 8: {
                        this.q |= 1;
                        this.r = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 16: {
                        this.q |= 2;
                        this.s = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 24: {
                        this.q |= 4;
                        this.t = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 32: {
                        this.q |= 8;
                        this.u = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 42: {
                        jq jq2 = null;
                        if ((this.q & 0x10) == 16) {
                            jq2 = this.v.l();
                        }
                        this.v = (jo)codedInputStream.readMessage(jo.d, extensionRegistryLite);
                        if (jq2 != null) {
                            jq2.a(this.v);
                            this.v = jq2.m();
                        }
                        this.q |= 0x10;
                        continue block23;
                    }
                    case 50: {
                        jq jq2 = null;
                        if ((this.q & 0x20) == 32) {
                            jq2 = this.w.l();
                        }
                        this.w = (jo)codedInputStream.readMessage(jo.d, extensionRegistryLite);
                        if (jq2 != null) {
                            jq2.a(this.w);
                            this.w = jq2.m();
                        }
                        this.q |= 0x20;
                        continue block23;
                    }
                    case 56: {
                        this.q |= 0x40;
                        this.x = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 64: {
                        this.q |= 0x80;
                        this.y = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 72: {
                        this.q |= 0x100;
                        this.z = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 80: {
                        this.q |= 0x200;
                        this.A = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 88: {
                        this.q |= 0x400;
                        this.B = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 96: {
                        this.q |= 0x800;
                        this.C = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 104: {
                        this.q |= 0x1000;
                        this.D = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 112: 
                }
                this.q |= 0x2000;
                this.E = codedInputStream.readInt64();
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
        return iw_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.b.ensureFieldAccessorsInitialized(jk_0.class, jm_0.class);
    }

    @Override
    public boolean b() {
        return (this.q & 1) == 1;
    }

    @Override
    public long c() {
        return this.r;
    }

    @Override
    public boolean d() {
        return (this.q & 2) == 2;
    }

    @Override
    public long e() {
        return this.s;
    }

    @Override
    public boolean f() {
        return (this.q & 4) == 4;
    }

    @Override
    public int g() {
        return this.t;
    }

    @Override
    public boolean h() {
        return (this.q & 8) == 8;
    }

    @Override
    public int i() {
        return this.u;
    }

    @Override
    public boolean j() {
        return (this.q & 0x10) == 16;
    }

    @Override
    public jo k() {
        return this.v == null ? jo.m() : this.v;
    }

    @Override
    public jr l() {
        return this.v == null ? jo.m() : this.v;
    }

    @Override
    public boolean m() {
        return (this.q & 0x20) == 32;
    }

    @Override
    public jo n() {
        return this.w == null ? jo.m() : this.w;
    }

    @Override
    public jr o() {
        return this.w == null ? jo.m() : this.w;
    }

    @Override
    public boolean p() {
        return (this.q & 0x40) == 64;
    }

    @Override
    public long q() {
        return this.x;
    }

    @Override
    public boolean r() {
        return (this.q & 0x80) == 128;
    }

    @Override
    public int s() {
        return this.y;
    }

    @Override
    public boolean t() {
        return (this.q & 0x100) == 256;
    }

    @Override
    public int u() {
        return this.z;
    }

    @Override
    public boolean v() {
        return (this.q & 0x200) == 512;
    }

    @Override
    public int w() {
        return this.A;
    }

    @Override
    public boolean x() {
        return (this.q & 0x400) == 1024;
    }

    @Override
    public int y() {
        return this.B;
    }

    @Override
    public boolean z() {
        return (this.q & 0x800) == 2048;
    }

    @Override
    public int A() {
        return this.C;
    }

    @Override
    public boolean B() {
        return (this.q & 0x1000) == 4096;
    }

    @Override
    public int C() {
        return this.D;
    }

    @Override
    public boolean D() {
        return (this.q & 0x2000) == 8192;
    }

    @Override
    public long E() {
        return this.E;
    }

    public final boolean isInitialized() {
        byte by = this.F;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.F = 0;
            return false;
        }
        if (!this.d()) {
            this.F = 0;
            return false;
        }
        if (!this.f()) {
            this.F = 0;
            return false;
        }
        if (!this.h()) {
            this.F = 0;
            return false;
        }
        if (!this.j()) {
            this.F = 0;
            return false;
        }
        if (!this.m()) {
            this.F = 0;
            return false;
        }
        if (!this.p()) {
            this.F = 0;
            return false;
        }
        if (!this.r()) {
            this.F = 0;
            return false;
        }
        if (!this.D()) {
            this.F = 0;
            return false;
        }
        if (!this.k().isInitialized()) {
            this.F = 0;
            return false;
        }
        if (!this.n().isInitialized()) {
            this.F = 0;
            return false;
        }
        this.F = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.q & 1) == 1) {
            codedOutputStream.writeInt64(1, this.r);
        }
        if ((this.q & 2) == 2) {
            codedOutputStream.writeInt64(2, this.s);
        }
        if ((this.q & 4) == 4) {
            codedOutputStream.writeInt32(3, this.t);
        }
        if ((this.q & 8) == 8) {
            codedOutputStream.writeInt32(4, this.u);
        }
        if ((this.q & 0x10) == 16) {
            codedOutputStream.writeMessage(5, (MessageLite)this.k());
        }
        if ((this.q & 0x20) == 32) {
            codedOutputStream.writeMessage(6, (MessageLite)this.n());
        }
        if ((this.q & 0x40) == 64) {
            codedOutputStream.writeInt64(7, this.x);
        }
        if ((this.q & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.y);
        }
        if ((this.q & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.z);
        }
        if ((this.q & 0x200) == 512) {
            codedOutputStream.writeInt32(10, this.A);
        }
        if ((this.q & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.B);
        }
        if ((this.q & 0x800) == 2048) {
            codedOutputStream.writeInt32(12, this.C);
        }
        if ((this.q & 0x1000) == 4096) {
            codedOutputStream.writeInt32(13, this.D);
        }
        if ((this.q & 0x2000) == 8192) {
            codedOutputStream.writeInt64(14, this.E);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.q & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.r);
        }
        if ((this.q & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.s);
        }
        if ((this.q & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.t);
        }
        if ((this.q & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.u);
        }
        if ((this.q & 0x10) == 16) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.k());
        }
        if ((this.q & 0x20) == 32) {
            n += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.n());
        }
        if ((this.q & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.x);
        }
        if ((this.q & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.y);
        }
        if ((this.q & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.z);
        }
        if ((this.q & 0x200) == 512) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.A);
        }
        if ((this.q & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.B);
        }
        if ((this.q & 0x800) == 2048) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.C);
        }
        if ((this.q & 0x1000) == 4096) {
            n += CodedOutputStream.computeInt32Size((int)13, (int)this.D);
        }
        if ((this.q & 0x2000) == 8192) {
            n += CodedOutputStream.computeInt64Size((int)14, (long)this.E);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jk_0)) {
            return super.equals(object);
        }
        jk_0 jk_02 = (jk_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jk_02.b();
        if (this.b()) {
            bl = bl && this.c() == jk_02.c();
        }
        boolean bl3 = bl = bl && this.d() == jk_02.d();
        if (this.d()) {
            bl = bl && this.e() == jk_02.e();
        }
        boolean bl4 = bl = bl && this.f() == jk_02.f();
        if (this.f()) {
            bl = bl && this.g() == jk_02.g();
        }
        boolean bl5 = bl = bl && this.h() == jk_02.h();
        if (this.h()) {
            bl = bl && this.i() == jk_02.i();
        }
        boolean bl6 = bl = bl && this.j() == jk_02.j();
        if (this.j()) {
            bl = bl && this.k().equals(jk_02.k());
        }
        boolean bl7 = bl = bl && this.m() == jk_02.m();
        if (this.m()) {
            bl = bl && this.n().equals(jk_02.n());
        }
        boolean bl8 = bl = bl && this.p() == jk_02.p();
        if (this.p()) {
            bl = bl && this.q() == jk_02.q();
        }
        boolean bl9 = bl = bl && this.r() == jk_02.r();
        if (this.r()) {
            bl = bl && this.s() == jk_02.s();
        }
        boolean bl10 = bl = bl && this.t() == jk_02.t();
        if (this.t()) {
            bl = bl && this.u() == jk_02.u();
        }
        boolean bl11 = bl = bl && this.v() == jk_02.v();
        if (this.v()) {
            bl = bl && this.w() == jk_02.w();
        }
        boolean bl12 = bl = bl && this.x() == jk_02.x();
        if (this.x()) {
            bl = bl && this.y() == jk_02.y();
        }
        boolean bl13 = bl = bl && this.z() == jk_02.z();
        if (this.z()) {
            bl = bl && this.A() == jk_02.A();
        }
        boolean bl14 = bl = bl && this.B() == jk_02.B();
        if (this.B()) {
            bl = bl && this.C() == jk_02.C();
        }
        boolean bl15 = bl = bl && this.D() == jk_02.D();
        if (this.D()) {
            bl = bl && this.E() == jk_02.E();
        }
        bl = bl && this.unknownFields.equals((Object)jk_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jk_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + this.k().hashCode();
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + this.n().hashCode();
        }
        if (this.p()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.q());
        }
        if (this.r()) {
            n = 37 * n + 8;
            n = 53 * n + this.s();
        }
        if (this.t()) {
            n = 37 * n + 9;
            n = 53 * n + this.u();
        }
        if (this.v()) {
            n = 37 * n + 10;
            n = 53 * n + this.w();
        }
        if (this.x()) {
            n = 37 * n + 11;
            n = 53 * n + this.y();
        }
        if (this.z()) {
            n = 37 * n + 12;
            n = 53 * n + this.A();
        }
        if (this.B()) {
            n = 37 * n + 13;
            n = 53 * n + this.C();
        }
        if (this.D()) {
            n = 37 * n + 14;
            n = 53 * n + Internal.hashLong((long)this.E());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jk_0 a(ByteBuffer byteBuffer) {
        return (jk_0)o.parseFrom(byteBuffer);
    }

    public static jk_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)o.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jk_0 a(ByteString byteString) {
        return (jk_0)o.parseFrom(byteString);
    }

    public static jk_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)o.parseFrom(byteString, extensionRegistryLite);
    }

    public static jk_0 a(byte[] byArray) {
        return (jk_0)o.parseFrom(byArray);
    }

    public static jk_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)o.parseFrom(byArray, extensionRegistryLite);
    }

    public static jk_0 a(InputStream inputStream) {
        return (jk_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream);
    }

    public static jk_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jk_0 b(InputStream inputStream) {
        return (jk_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream);
    }

    public static jk_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jk_0 a(CodedInputStream codedInputStream) {
        return (jk_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream);
    }

    public static jk_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jk_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jm_0 F() {
        return jk_0.G();
    }

    public static jm_0 G() {
        return G.H();
    }

    public static jm_0 a(jk_0 jk_02) {
        return G.H().a(jk_02);
    }

    public jm_0 H() {
        return this == G ? new jm_0() : new jm_0().a(this);
    }

    protected jm_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        jm_0 jm_02 = new jm_0(builderParent);
        return jm_02;
    }

    public static jk_0 I() {
        return G;
    }

    public static Parser<jk_0> J() {
        return o;
    }

    public Parser<jk_0> getParserForType() {
        return o;
    }

    public jk_0 K() {
        return G;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.H();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.F();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.H();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.F();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.K();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.K();
    }

    static /* synthetic */ boolean L() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jk_0 jk_02) {
        return jk_02.unknownFields;
    }
}

