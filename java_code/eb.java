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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class eb
extends GeneratedMessageV3
implements ee {
    private static final long r = 0L;
    int s;
    public static final int a = 1;
    int t;
    public static final int b = 2;
    int u;
    public static final int c = 3;
    int v;
    public static final int d = 4;
    int w;
    public static final int e = 5;
    int x;
    public static final int f = 6;
    int y;
    public static final int g = 7;
    int z;
    public static final int h = 8;
    int A;
    public static final int i = 9;
    int B;
    public static final int j = 10;
    int C;
    public static final int k = 11;
    int D;
    public static final int l = 12;
    int E;
    public static final int m = 13;
    int F;
    public static final int n = 14;
    int G;
    public static final int o = 15;
    int H;
    public static final int p = 16;
    int I;
    private byte J = (byte)-1;
    private static final eb K = new eb();
    @Deprecated
    public static final Parser<eb> q = new ec();

    eb(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eb() {
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block25: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block25;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block25;
                        bl2 = true;
                        continue block25;
                    }
                    case 8: {
                        this.s |= 1;
                        this.t = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 16: {
                        this.s |= 2;
                        this.u = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 24: {
                        this.s |= 4;
                        this.v = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 32: {
                        this.s |= 8;
                        this.w = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 40: {
                        this.s |= 0x10;
                        this.x = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 48: {
                        this.s |= 0x20;
                        this.y = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 56: {
                        this.s |= 0x40;
                        this.z = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 64: {
                        this.s |= 0x80;
                        this.A = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 72: {
                        this.s |= 0x100;
                        this.B = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 80: {
                        this.s |= 0x200;
                        this.C = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 88: {
                        this.s |= 0x400;
                        this.D = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 96: {
                        this.s |= 0x800;
                        this.E = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 104: {
                        this.s |= 0x1000;
                        this.F = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 112: {
                        this.s |= 0x2000;
                        this.G = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 120: {
                        this.s |= 0x4000;
                        this.H = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 128: 
                }
                this.s |= 0x8000;
                this.I = codedInputStream.readInt32();
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
        return dZ.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dZ.b.ensureFieldAccessorsInitialized(eb.class, ed.class);
    }

    @Override
    public boolean b() {
        return (this.s & 1) == 1;
    }

    @Override
    public int c() {
        return this.t;
    }

    @Override
    public boolean d() {
        return (this.s & 2) == 2;
    }

    @Override
    public int e() {
        return this.u;
    }

    @Override
    public boolean f() {
        return (this.s & 4) == 4;
    }

    @Override
    public int g() {
        return this.v;
    }

    @Override
    public boolean h() {
        return (this.s & 8) == 8;
    }

    @Override
    public int i() {
        return this.w;
    }

    @Override
    public boolean j() {
        return (this.s & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.x;
    }

    @Override
    public boolean l() {
        return (this.s & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.y;
    }

    @Override
    public boolean n() {
        return (this.s & 0x40) == 64;
    }

    @Override
    public int o() {
        return this.z;
    }

    @Override
    public boolean p() {
        return (this.s & 0x80) == 128;
    }

    @Override
    public int q() {
        return this.A;
    }

    @Override
    public boolean r() {
        return (this.s & 0x100) == 256;
    }

    @Override
    public int s() {
        return this.B;
    }

    @Override
    public boolean t() {
        return (this.s & 0x200) == 512;
    }

    @Override
    public int u() {
        return this.C;
    }

    @Override
    public boolean v() {
        return (this.s & 0x400) == 1024;
    }

    @Override
    public int w() {
        return this.D;
    }

    @Override
    public boolean x() {
        return (this.s & 0x800) == 2048;
    }

    @Override
    public int y() {
        return this.E;
    }

    @Override
    @Deprecated
    public boolean z() {
        return (this.s & 0x1000) == 4096;
    }

    @Override
    @Deprecated
    public int A() {
        return this.F;
    }

    @Override
    public boolean B() {
        return (this.s & 0x2000) == 8192;
    }

    @Override
    public int C() {
        return this.G;
    }

    @Override
    public boolean D() {
        return (this.s & 0x4000) == 16384;
    }

    @Override
    public int E() {
        return this.H;
    }

    @Override
    public boolean F() {
        return (this.s & 0x8000) == 32768;
    }

    @Override
    public int G() {
        return this.I;
    }

    public final boolean isInitialized() {
        byte by = this.J;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.J = 0;
            return false;
        }
        if (!this.d()) {
            this.J = 0;
            return false;
        }
        if (!this.f()) {
            this.J = 0;
            return false;
        }
        if (!this.h()) {
            this.J = 0;
            return false;
        }
        if (!this.j()) {
            this.J = 0;
            return false;
        }
        if (!this.l()) {
            this.J = 0;
            return false;
        }
        if (!this.n()) {
            this.J = 0;
            return false;
        }
        if (!this.p()) {
            this.J = 0;
            return false;
        }
        if (!this.r()) {
            this.J = 0;
            return false;
        }
        if (!this.t()) {
            this.J = 0;
            return false;
        }
        if (!this.v()) {
            this.J = 0;
            return false;
        }
        if (!this.x()) {
            this.J = 0;
            return false;
        }
        this.J = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.s & 1) == 1) {
            codedOutputStream.writeInt32(1, this.t);
        }
        if ((this.s & 2) == 2) {
            codedOutputStream.writeInt32(2, this.u);
        }
        if ((this.s & 4) == 4) {
            codedOutputStream.writeInt32(3, this.v);
        }
        if ((this.s & 8) == 8) {
            codedOutputStream.writeInt32(4, this.w);
        }
        if ((this.s & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.x);
        }
        if ((this.s & 0x20) == 32) {
            codedOutputStream.writeInt32(6, this.y);
        }
        if ((this.s & 0x40) == 64) {
            codedOutputStream.writeInt32(7, this.z);
        }
        if ((this.s & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.A);
        }
        if ((this.s & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.B);
        }
        if ((this.s & 0x200) == 512) {
            codedOutputStream.writeInt32(10, this.C);
        }
        if ((this.s & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.D);
        }
        if ((this.s & 0x800) == 2048) {
            codedOutputStream.writeInt32(12, this.E);
        }
        if ((this.s & 0x1000) == 4096) {
            codedOutputStream.writeInt32(13, this.F);
        }
        if ((this.s & 0x2000) == 8192) {
            codedOutputStream.writeInt32(14, this.G);
        }
        if ((this.s & 0x4000) == 16384) {
            codedOutputStream.writeInt32(15, this.H);
        }
        if ((this.s & 0x8000) == 32768) {
            codedOutputStream.writeInt32(16, this.I);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.s & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.t);
        }
        if ((this.s & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.u);
        }
        if ((this.s & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.v);
        }
        if ((this.s & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.w);
        }
        if ((this.s & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.x);
        }
        if ((this.s & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.y);
        }
        if ((this.s & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.z);
        }
        if ((this.s & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.A);
        }
        if ((this.s & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.B);
        }
        if ((this.s & 0x200) == 512) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.C);
        }
        if ((this.s & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.D);
        }
        if ((this.s & 0x800) == 2048) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.E);
        }
        if ((this.s & 0x1000) == 4096) {
            n += CodedOutputStream.computeInt32Size((int)13, (int)this.F);
        }
        if ((this.s & 0x2000) == 8192) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.G);
        }
        if ((this.s & 0x4000) == 16384) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.H);
        }
        if ((this.s & 0x8000) == 32768) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.I);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eb)) {
            return super.equals(object);
        }
        eb eb2 = (eb)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == eb2.b();
        if (this.b()) {
            bl = bl && this.c() == eb2.c();
        }
        boolean bl3 = bl = bl && this.d() == eb2.d();
        if (this.d()) {
            bl = bl && this.e() == eb2.e();
        }
        boolean bl4 = bl = bl && this.f() == eb2.f();
        if (this.f()) {
            bl = bl && this.g() == eb2.g();
        }
        boolean bl5 = bl = bl && this.h() == eb2.h();
        if (this.h()) {
            bl = bl && this.i() == eb2.i();
        }
        boolean bl6 = bl = bl && this.j() == eb2.j();
        if (this.j()) {
            bl = bl && this.k() == eb2.k();
        }
        boolean bl7 = bl = bl && this.l() == eb2.l();
        if (this.l()) {
            bl = bl && this.m() == eb2.m();
        }
        boolean bl8 = bl = bl && this.n() == eb2.n();
        if (this.n()) {
            bl = bl && this.o() == eb2.o();
        }
        boolean bl9 = bl = bl && this.p() == eb2.p();
        if (this.p()) {
            bl = bl && this.q() == eb2.q();
        }
        boolean bl10 = bl = bl && this.r() == eb2.r();
        if (this.r()) {
            bl = bl && this.s() == eb2.s();
        }
        boolean bl11 = bl = bl && this.t() == eb2.t();
        if (this.t()) {
            bl = bl && this.u() == eb2.u();
        }
        boolean bl12 = bl = bl && this.v() == eb2.v();
        if (this.v()) {
            bl = bl && this.w() == eb2.w();
        }
        boolean bl13 = bl = bl && this.x() == eb2.x();
        if (this.x()) {
            bl = bl && this.y() == eb2.y();
        }
        boolean bl14 = bl = bl && this.z() == eb2.z();
        if (this.z()) {
            bl = bl && this.A() == eb2.A();
        }
        boolean bl15 = bl = bl && this.B() == eb2.B();
        if (this.B()) {
            bl = bl && this.C() == eb2.C();
        }
        boolean bl16 = bl = bl && this.D() == eb2.D();
        if (this.D()) {
            bl = bl && this.E() == eb2.E();
        }
        boolean bl17 = bl = bl && this.F() == eb2.F();
        if (this.F()) {
            bl = bl && this.G() == eb2.G();
        }
        bl = bl && this.unknownFields.equals((Object)eb2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eb.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
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
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + this.m();
        }
        if (this.n()) {
            n = 37 * n + 7;
            n = 53 * n + this.o();
        }
        if (this.p()) {
            n = 37 * n + 8;
            n = 53 * n + this.q();
        }
        if (this.r()) {
            n = 37 * n + 9;
            n = 53 * n + this.s();
        }
        if (this.t()) {
            n = 37 * n + 10;
            n = 53 * n + this.u();
        }
        if (this.v()) {
            n = 37 * n + 11;
            n = 53 * n + this.w();
        }
        if (this.x()) {
            n = 37 * n + 12;
            n = 53 * n + this.y();
        }
        if (this.z()) {
            n = 37 * n + 13;
            n = 53 * n + this.A();
        }
        if (this.B()) {
            n = 37 * n + 14;
            n = 53 * n + this.C();
        }
        if (this.D()) {
            n = 37 * n + 15;
            n = 53 * n + this.E();
        }
        if (this.F()) {
            n = 37 * n + 16;
            n = 53 * n + this.G();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eb a(ByteBuffer byteBuffer) {
        return (eb)q.parseFrom(byteBuffer);
    }

    public static eb a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)q.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eb a(ByteString byteString) {
        return (eb)q.parseFrom(byteString);
    }

    public static eb a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)q.parseFrom(byteString, extensionRegistryLite);
    }

    public static eb a(byte[] byArray) {
        return (eb)q.parseFrom(byArray);
    }

    public static eb a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)q.parseFrom(byArray, extensionRegistryLite);
    }

    public static eb a(InputStream inputStream) {
        return (eb)GeneratedMessageV3.parseWithIOException(q, (InputStream)inputStream);
    }

    public static eb a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)GeneratedMessageV3.parseWithIOException(q, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eb b(InputStream inputStream) {
        return (eb)GeneratedMessageV3.parseDelimitedWithIOException(q, (InputStream)inputStream);
    }

    public static eb b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)GeneratedMessageV3.parseDelimitedWithIOException(q, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eb a(CodedInputStream codedInputStream) {
        return (eb)GeneratedMessageV3.parseWithIOException(q, (CodedInputStream)codedInputStream);
    }

    public static eb a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eb)GeneratedMessageV3.parseWithIOException(q, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ed H() {
        return eb.I();
    }

    public static ed I() {
        return K.J();
    }

    public static ed a(eb eb2) {
        return K.J().a(eb2);
    }

    public ed J() {
        return this == K ? new ed() : new ed().a(this);
    }

    protected ed a(GeneratedMessageV3.BuilderParent builderParent) {
        ed ed2 = new ed(builderParent);
        return ed2;
    }

    public static eb K() {
        return K;
    }

    public static Parser<eb> L() {
        return q;
    }

    public Parser<eb> getParserForType() {
        return q;
    }

    public eb M() {
        return K;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.J();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.H();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.J();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.H();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.M();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.M();
    }

    static /* synthetic */ boolean N() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eb eb2) {
        return eb2.unknownFields;
    }
}

