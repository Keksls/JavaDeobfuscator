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

public final class hD
extends GeneratedMessageV3
implements hG {
    private static final long m = 0L;
    int n;
    public static final int a = 1;
    int o;
    public static final int b = 2;
    int p;
    public static final int c = 3;
    long q;
    public static final int d = 4;
    int r;
    public static final int e = 5;
    long s;
    public static final int f = 6;
    int t;
    public static final int g = 7;
    int u;
    public static final int h = 8;
    hn_0 v;
    public static final int i = 9;
    long w;
    public static final int j = 10;
    int x;
    public static final int k = 11;
    int y;
    private byte z = (byte)-1;
    private static final hD A = new hD();
    @Deprecated
    public static final Parser<hD> l = new he_0();

    hD(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hD() {
        this.o = 0;
        this.p = 1;
        this.q = 0L;
        this.r = 0;
        this.s = 0L;
        this.t = 0;
        this.u = 0;
        this.w = 0L;
        this.x = 0;
        this.y = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block20: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block20;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block20;
                        bl2 = true;
                        continue block20;
                    }
                    case 8: {
                        this.n |= 1;
                        this.o = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        hw_1 hw_12 = hw_1.a(n2);
                        if (hw_12 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block20;
                        }
                        this.n |= 2;
                        this.p = n2;
                        continue block20;
                    }
                    case 24: {
                        this.n |= 4;
                        this.q = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 32: {
                        this.n |= 8;
                        this.r = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 40: {
                        this.n |= 0x10;
                        this.s = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 48: {
                        this.n |= 0x20;
                        this.t = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 56: {
                        this.n |= 0x40;
                        this.u = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 66: {
                        hp_0 hp_02 = null;
                        if ((this.n & 0x80) == 128) {
                            hp_02 = this.v.g();
                        }
                        this.v = (hn_0)codedInputStream.readMessage(hn_0.b, extensionRegistryLite);
                        if (hp_02 != null) {
                            hp_02.a(this.v);
                            this.v = hp_02.h();
                        }
                        this.n |= 0x80;
                        continue block20;
                    }
                    case 72: {
                        this.n |= 0x100;
                        this.w = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 80: {
                        this.n |= 0x200;
                        this.x = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 88: 
                }
                this.n |= 0x400;
                this.y = codedInputStream.readInt32();
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
        return hl_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.b.ensureFieldAccessorsInitialized(hD.class, hf_0.class);
    }

    @Override
    public boolean b() {
        return (this.n & 1) == 1;
    }

    @Override
    public int c() {
        return this.o;
    }

    @Override
    public boolean d() {
        return (this.n & 2) == 2;
    }

    @Override
    public hw_1 e() {
        hw_1 hw_12 = hw_1.a(this.p);
        return hw_12 == null ? hw_1.a : hw_12;
    }

    @Override
    public boolean f() {
        return (this.n & 4) == 4;
    }

    @Override
    public long g() {
        return this.q;
    }

    @Override
    public boolean h() {
        return (this.n & 8) == 8;
    }

    @Override
    public int i() {
        return this.r;
    }

    @Override
    public boolean j() {
        return (this.n & 0x10) == 16;
    }

    @Override
    public long k() {
        return this.s;
    }

    @Override
    public boolean l() {
        return (this.n & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.t;
    }

    @Override
    public boolean n() {
        return (this.n & 0x40) == 64;
    }

    @Override
    public int o() {
        return this.u;
    }

    @Override
    public boolean p() {
        return (this.n & 0x80) == 128;
    }

    @Override
    public hn_0 q() {
        return this.v == null ? hn_0.h() : this.v;
    }

    @Override
    public hv_0 r() {
        return this.v == null ? hn_0.h() : this.v;
    }

    @Override
    public boolean s() {
        return (this.n & 0x100) == 256;
    }

    @Override
    public long t() {
        return this.w;
    }

    @Override
    public boolean u() {
        return (this.n & 0x200) == 512;
    }

    @Override
    public int v() {
        return this.x;
    }

    @Override
    public boolean w() {
        return (this.n & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.y;
    }

    public final boolean isInitialized() {
        byte by = this.z;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.z = 0;
            return false;
        }
        if (this.p() && !this.q().isInitialized()) {
            this.z = 0;
            return false;
        }
        this.z = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.n & 1) == 1) {
            codedOutputStream.writeInt32(1, this.o);
        }
        if ((this.n & 2) == 2) {
            codedOutputStream.writeEnum(2, this.p);
        }
        if ((this.n & 4) == 4) {
            codedOutputStream.writeInt64(3, this.q);
        }
        if ((this.n & 8) == 8) {
            codedOutputStream.writeInt32(4, this.r);
        }
        if ((this.n & 0x10) == 16) {
            codedOutputStream.writeInt64(5, this.s);
        }
        if ((this.n & 0x20) == 32) {
            codedOutputStream.writeInt32(6, this.t);
        }
        if ((this.n & 0x40) == 64) {
            codedOutputStream.writeInt32(7, this.u);
        }
        if ((this.n & 0x80) == 128) {
            codedOutputStream.writeMessage(8, (MessageLite)this.q());
        }
        if ((this.n & 0x100) == 256) {
            codedOutputStream.writeInt64(9, this.w);
        }
        if ((this.n & 0x200) == 512) {
            codedOutputStream.writeInt32(10, this.x);
        }
        if ((this.n & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.y);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.n & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.o);
        }
        if ((this.n & 2) == 2) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.p);
        }
        if ((this.n & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.q);
        }
        if ((this.n & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.r);
        }
        if ((this.n & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.s);
        }
        if ((this.n & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.t);
        }
        if ((this.n & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.u);
        }
        if ((this.n & 0x80) == 128) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.q());
        }
        if ((this.n & 0x100) == 256) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.w);
        }
        if ((this.n & 0x200) == 512) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.x);
        }
        if ((this.n & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.y);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hD)) {
            return super.equals(object);
        }
        hD hD2 = (hD)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == hD2.b();
        if (this.b()) {
            bl = bl && this.c() == hD2.c();
        }
        boolean bl3 = bl = bl && this.d() == hD2.d();
        if (this.d()) {
            bl = bl && this.p == hD2.p;
        }
        boolean bl4 = bl = bl && this.f() == hD2.f();
        if (this.f()) {
            bl = bl && this.g() == hD2.g();
        }
        boolean bl5 = bl = bl && this.h() == hD2.h();
        if (this.h()) {
            bl = bl && this.i() == hD2.i();
        }
        boolean bl6 = bl = bl && this.j() == hD2.j();
        if (this.j()) {
            bl = bl && this.k() == hD2.k();
        }
        boolean bl7 = bl = bl && this.l() == hD2.l();
        if (this.l()) {
            bl = bl && this.m() == hD2.m();
        }
        boolean bl8 = bl = bl && this.n() == hD2.n();
        if (this.n()) {
            bl = bl && this.o() == hD2.o();
        }
        boolean bl9 = bl = bl && this.p() == hD2.p();
        if (this.p()) {
            bl = bl && this.q().equals(hD2.q());
        }
        boolean bl10 = bl = bl && this.s() == hD2.s();
        if (this.s()) {
            bl = bl && this.t() == hD2.t();
        }
        boolean bl11 = bl = bl && this.u() == hD2.u();
        if (this.u()) {
            bl = bl && this.v() == hD2.v();
        }
        boolean bl12 = bl = bl && this.w() == hD2.w();
        if (this.w()) {
            bl = bl && this.x() == hD2.x();
        }
        bl = bl && this.unknownFields.equals((Object)hD2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hD.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.p;
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.k());
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
            n = 53 * n + this.q().hashCode();
        }
        if (this.s()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.t());
        }
        if (this.u()) {
            n = 37 * n + 10;
            n = 53 * n + this.v();
        }
        if (this.w()) {
            n = 37 * n + 11;
            n = 53 * n + this.x();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hD a(ByteBuffer byteBuffer) {
        return (hD)l.parseFrom(byteBuffer);
    }

    public static hD a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)l.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hD a(ByteString byteString) {
        return (hD)l.parseFrom(byteString);
    }

    public static hD a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)l.parseFrom(byteString, extensionRegistryLite);
    }

    public static hD a(byte[] byArray) {
        return (hD)l.parseFrom(byArray);
    }

    public static hD a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)l.parseFrom(byArray, extensionRegistryLite);
    }

    public static hD a(InputStream inputStream) {
        return (hD)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream);
    }

    public static hD a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hD b(InputStream inputStream) {
        return (hD)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream);
    }

    public static hD b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hD a(CodedInputStream codedInputStream) {
        return (hD)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream);
    }

    public static hD a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hD)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hf_0 y() {
        return hD.z();
    }

    public static hf_0 z() {
        return A.A();
    }

    public static hf_0 a(hD hD2) {
        return A.A().a(hD2);
    }

    public hf_0 A() {
        return this == A ? new hf_0() : new hf_0().a(this);
    }

    protected hf_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        hf_0 hf_02 = new hf_0(builderParent);
        return hf_02;
    }

    public static hD B() {
        return A;
    }

    public static Parser<hD> C() {
        return l;
    }

    public Parser<hD> getParserForType() {
        return l;
    }

    public hD D() {
        return A;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.A();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.A();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.y();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.D();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.D();
    }

    static /* synthetic */ boolean E() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hD hD2) {
        return hD2.unknownFields;
    }
}

