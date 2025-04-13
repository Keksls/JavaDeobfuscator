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

public final class iO
extends GeneratedMessageV3
implements iR {
    private static final long n = 0L;
    int o;
    public static final int a = 1;
    long p;
    public static final int b = 2;
    long q;
    public static final int c = 3;
    int r;
    public static final int d = 4;
    int s;
    public static final int e = 5;
    iu_1 t;
    public static final int f = 6;
    long u;
    public static final int g = 7;
    long v;
    public static final int h = 8;
    iq_0 w;
    public static final int i = 9;
    int x;
    public static final int j = 10;
    long y;
    public static final int k = 11;
    ic_1 z;
    public static final int l = 12;
    is_0 A;
    private byte B = (byte)-1;
    private static final iO C = new iO();
    @Deprecated
    public static final Parser<iO> m = new ip_0();

    iO(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iO() {
        this.p = 0L;
        this.q = 0L;
        this.r = 0;
        this.s = 0;
        this.u = 0L;
        this.v = 0L;
        this.x = 0;
        this.y = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block21: while (!bl2) {
                GeneratedMessageV3.Builder builder2;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block21;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block21;
                        bl2 = true;
                        continue block21;
                    }
                    case 8: {
                        this.o |= 1;
                        this.p = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 16: {
                        this.o |= 2;
                        this.q = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 24: {
                        this.o |= 4;
                        this.r = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 32: {
                        this.o |= 8;
                        this.s = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 42: {
                        builder2 = null;
                        if ((this.o & 0x10) == 16) {
                            builder2 = this.t.j();
                        }
                        this.t = (iu_1)codedInputStream.readMessage(iu_1.d, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.t);
                            this.t = builder2.k();
                        }
                        this.o |= 0x10;
                        continue block21;
                    }
                    case 48: {
                        this.o |= 0x20;
                        this.u = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 56: {
                        this.o |= 0x40;
                        this.v = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 66: {
                        builder2 = null;
                        if ((this.o & 0x80) == 128) {
                            builder2 = this.w.aj();
                        }
                        this.w = (iq_0)codedInputStream.readMessage(iq_0.B, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.w);
                            this.w = builder2.ak();
                        }
                        this.o |= 0x80;
                        continue block21;
                    }
                    case 72: {
                        this.o |= 0x100;
                        this.x = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 80: {
                        this.o |= 0x200;
                        this.y = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 90: {
                        builder2 = null;
                        if ((this.o & 0x400) == 1024) {
                            builder2 = this.z.o();
                        }
                        this.z = (ic_1)codedInputStream.readMessage(ic_1.f, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.z);
                            this.z = builder2.p();
                        }
                        this.o |= 0x400;
                        continue block21;
                    }
                    case 98: 
                }
                builder2 = null;
                if ((this.o & 0x800) == 2048) {
                    builder2 = this.A.n();
                }
                this.A = (is_0)codedInputStream.readMessage(is_0.f, extensionRegistryLite);
                if (builder2 != null) {
                    builder2.a(this.A);
                    this.A = builder2.o();
                }
                this.o |= 0x800;
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
        return io_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.b.ensureFieldAccessorsInitialized(iO.class, iQ.class);
    }

    @Override
    public boolean b() {
        return (this.o & 1) == 1;
    }

    @Override
    public long c() {
        return this.p;
    }

    @Override
    public boolean d() {
        return (this.o & 2) == 2;
    }

    @Override
    public long e() {
        return this.q;
    }

    @Override
    public boolean f() {
        return (this.o & 4) == 4;
    }

    @Override
    public int g() {
        return this.r;
    }

    @Override
    public boolean h() {
        return (this.o & 8) == 8;
    }

    @Override
    public int i() {
        return this.s;
    }

    @Override
    public boolean j() {
        return (this.o & 0x10) == 16;
    }

    @Override
    public iu_1 k() {
        return this.t == null ? iu_1.k() : this.t;
    }

    @Override
    public ix_1 l() {
        return this.t == null ? iu_1.k() : this.t;
    }

    @Override
    public boolean m() {
        return (this.o & 0x20) == 32;
    }

    @Override
    public long n() {
        return this.u;
    }

    @Override
    public boolean o() {
        return (this.o & 0x40) == 64;
    }

    @Override
    public long p() {
        return this.v;
    }

    @Override
    public boolean q() {
        return (this.o & 0x80) == 128;
    }

    @Override
    public iq_0 r() {
        return this.w == null ? iq_0.ak() : this.w;
    }

    @Override
    public it_0 s() {
        return this.w == null ? iq_0.ak() : this.w;
    }

    @Override
    public boolean t() {
        return (this.o & 0x100) == 256;
    }

    @Override
    public int u() {
        return this.x;
    }

    @Override
    public boolean v() {
        return (this.o & 0x200) == 512;
    }

    @Override
    public long w() {
        return this.y;
    }

    @Override
    public boolean x() {
        return (this.o & 0x400) == 1024;
    }

    @Override
    public ic_1 y() {
        return this.z == null ? ic_1.p() : this.z;
    }

    @Override
    public if_0 z() {
        return this.z == null ? ic_1.p() : this.z;
    }

    @Override
    public boolean A() {
        return (this.o & 0x800) == 2048;
    }

    @Override
    public is_0 B() {
        return this.A == null ? is_0.o() : this.A;
    }

    @Override
    public iv_1 C() {
        return this.A == null ? is_0.o() : this.A;
    }

    public final boolean isInitialized() {
        byte by = this.B;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.B = 0;
            return false;
        }
        if (!this.d()) {
            this.B = 0;
            return false;
        }
        if (!this.f()) {
            this.B = 0;
            return false;
        }
        if (!this.h()) {
            this.B = 0;
            return false;
        }
        if (this.j() && !this.k().isInitialized()) {
            this.B = 0;
            return false;
        }
        if (this.q() && !this.r().isInitialized()) {
            this.B = 0;
            return false;
        }
        if (this.x() && !this.y().isInitialized()) {
            this.B = 0;
            return false;
        }
        this.B = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.o & 1) == 1) {
            codedOutputStream.writeInt64(1, this.p);
        }
        if ((this.o & 2) == 2) {
            codedOutputStream.writeInt64(2, this.q);
        }
        if ((this.o & 4) == 4) {
            codedOutputStream.writeInt32(3, this.r);
        }
        if ((this.o & 8) == 8) {
            codedOutputStream.writeInt32(4, this.s);
        }
        if ((this.o & 0x10) == 16) {
            codedOutputStream.writeMessage(5, (MessageLite)this.k());
        }
        if ((this.o & 0x20) == 32) {
            codedOutputStream.writeInt64(6, this.u);
        }
        if ((this.o & 0x40) == 64) {
            codedOutputStream.writeInt64(7, this.v);
        }
        if ((this.o & 0x80) == 128) {
            codedOutputStream.writeMessage(8, (MessageLite)this.r());
        }
        if ((this.o & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.x);
        }
        if ((this.o & 0x200) == 512) {
            codedOutputStream.writeInt64(10, this.y);
        }
        if ((this.o & 0x400) == 1024) {
            codedOutputStream.writeMessage(11, (MessageLite)this.y());
        }
        if ((this.o & 0x800) == 2048) {
            codedOutputStream.writeMessage(12, (MessageLite)this.B());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.o & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.p);
        }
        if ((this.o & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.q);
        }
        if ((this.o & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.r);
        }
        if ((this.o & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.s);
        }
        if ((this.o & 0x10) == 16) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.k());
        }
        if ((this.o & 0x20) == 32) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.u);
        }
        if ((this.o & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.v);
        }
        if ((this.o & 0x80) == 128) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.r());
        }
        if ((this.o & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.x);
        }
        if ((this.o & 0x200) == 512) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.y);
        }
        if ((this.o & 0x400) == 1024) {
            n += CodedOutputStream.computeMessageSize((int)11, (MessageLite)this.y());
        }
        if ((this.o & 0x800) == 2048) {
            n += CodedOutputStream.computeMessageSize((int)12, (MessageLite)this.B());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iO)) {
            return super.equals(object);
        }
        iO iO2 = (iO)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == iO2.b();
        if (this.b()) {
            bl = bl && this.c() == iO2.c();
        }
        boolean bl3 = bl = bl && this.d() == iO2.d();
        if (this.d()) {
            bl = bl && this.e() == iO2.e();
        }
        boolean bl4 = bl = bl && this.f() == iO2.f();
        if (this.f()) {
            bl = bl && this.g() == iO2.g();
        }
        boolean bl5 = bl = bl && this.h() == iO2.h();
        if (this.h()) {
            bl = bl && this.i() == iO2.i();
        }
        boolean bl6 = bl = bl && this.j() == iO2.j();
        if (this.j()) {
            bl = bl && this.k().equals(iO2.k());
        }
        boolean bl7 = bl = bl && this.m() == iO2.m();
        if (this.m()) {
            bl = bl && this.n() == iO2.n();
        }
        boolean bl8 = bl = bl && this.o() == iO2.o();
        if (this.o()) {
            bl = bl && this.p() == iO2.p();
        }
        boolean bl9 = bl = bl && this.q() == iO2.q();
        if (this.q()) {
            bl = bl && this.r().equals(iO2.r());
        }
        boolean bl10 = bl = bl && this.t() == iO2.t();
        if (this.t()) {
            bl = bl && this.u() == iO2.u();
        }
        boolean bl11 = bl = bl && this.v() == iO2.v();
        if (this.v()) {
            bl = bl && this.w() == iO2.w();
        }
        boolean bl12 = bl = bl && this.x() == iO2.x();
        if (this.x()) {
            bl = bl && this.y().equals(iO2.y());
        }
        boolean bl13 = bl = bl && this.A() == iO2.A();
        if (this.A()) {
            bl = bl && this.B().equals(iO2.B());
        }
        bl = bl && this.unknownFields.equals((Object)iO2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iO.a().hashCode();
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
            n = 53 * n + Internal.hashLong((long)this.n());
        }
        if (this.o()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.p());
        }
        if (this.q()) {
            n = 37 * n + 8;
            n = 53 * n + this.r().hashCode();
        }
        if (this.t()) {
            n = 37 * n + 9;
            n = 53 * n + this.u();
        }
        if (this.v()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.w());
        }
        if (this.x()) {
            n = 37 * n + 11;
            n = 53 * n + this.y().hashCode();
        }
        if (this.A()) {
            n = 37 * n + 12;
            n = 53 * n + this.B().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iO a(ByteBuffer byteBuffer) {
        return (iO)m.parseFrom(byteBuffer);
    }

    public static iO a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)m.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iO a(ByteString byteString) {
        return (iO)m.parseFrom(byteString);
    }

    public static iO a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)m.parseFrom(byteString, extensionRegistryLite);
    }

    public static iO a(byte[] byArray) {
        return (iO)m.parseFrom(byArray);
    }

    public static iO a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)m.parseFrom(byArray, extensionRegistryLite);
    }

    public static iO a(InputStream inputStream) {
        return (iO)GeneratedMessageV3.parseWithIOException(m, (InputStream)inputStream);
    }

    public static iO a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)GeneratedMessageV3.parseWithIOException(m, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iO b(InputStream inputStream) {
        return (iO)GeneratedMessageV3.parseDelimitedWithIOException(m, (InputStream)inputStream);
    }

    public static iO b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)GeneratedMessageV3.parseDelimitedWithIOException(m, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iO a(CodedInputStream codedInputStream) {
        return (iO)GeneratedMessageV3.parseWithIOException(m, (CodedInputStream)codedInputStream);
    }

    public static iO a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iO)GeneratedMessageV3.parseWithIOException(m, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public iQ D() {
        return iO.E();
    }

    public static iQ E() {
        return C.F();
    }

    public static iQ a(iO iO2) {
        return C.F().a(iO2);
    }

    public iQ F() {
        return this == C ? new iQ() : new iQ().a(this);
    }

    protected iQ a(GeneratedMessageV3.BuilderParent builderParent) {
        iQ iQ2 = new iQ(builderParent);
        return iQ2;
    }

    public static iO G() {
        return C;
    }

    public static Parser<iO> H() {
        return m;
    }

    public Parser<iO> getParserForType() {
        return m;
    }

    public iO I() {
        return C;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.F();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.D();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.F();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.D();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.I();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.I();
    }

    static /* synthetic */ boolean J() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iO iO2) {
        return iO2.unknownFields;
    }
}

