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
 * Renamed from oq
 */
public final class oq_1
extends GeneratedMessageV3
implements ox_2 {
    private static final long n = 0L;
    int o;
    public static final int a = 1;
    int p;
    public static final int b = 2;
    int q;
    public static final int c = 3;
    int r;
    public static final int d = 4;
    oy_2 s;
    public static final int e = 5;
    oy_2 t;
    public static final int f = 6;
    long u;
    public static final int g = 7;
    int v;
    public static final int h = 8;
    int w;
    public static final int i = 9;
    int x;
    public static final int j = 10;
    long y;
    public static final int k = 11;
    int z;
    public static final int l = 12;
    int A;
    private byte B = (byte)-1;
    private static final oq_1 C = new oq_1();
    @Deprecated
    public static final Parser<oq_1> m = new or_1();

    oq_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oq_1() {
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.u = 0L;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0L;
        this.z = 0;
        this.A = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oq_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block21: while (!bl2) {
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
                        this.p = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 16: {
                        this.o |= 2;
                        this.q = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 24: {
                        this.o |= 4;
                        this.r = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 34: {
                        oa_1 oa_12 = null;
                        if ((this.o & 8) == 8) {
                            oa_12 = this.s.h();
                        }
                        this.s = (oy_2)codedInputStream.readMessage(oy_2.c, extensionRegistryLite);
                        if (oa_12 != null) {
                            oa_12.a(this.s);
                            this.s = oa_12.i();
                        }
                        this.o |= 8;
                        continue block21;
                    }
                    case 42: {
                        oa_1 oa_12 = null;
                        if ((this.o & 0x10) == 16) {
                            oa_12 = this.t.h();
                        }
                        this.t = (oy_2)codedInputStream.readMessage(oy_2.c, extensionRegistryLite);
                        if (oa_12 != null) {
                            oa_12.a(this.t);
                            this.t = oa_12.i();
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
                        this.v = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 64: {
                        this.o |= 0x80;
                        this.w = codedInputStream.readInt32();
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
                    case 88: {
                        this.o |= 0x400;
                        this.z = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 96: 
                }
                this.o |= 0x800;
                this.A = codedInputStream.readInt32();
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
        return oo_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo_1.d.ensureFieldAccessorsInitialized(oq_1.class, os_1.class);
    }

    @Override
    public boolean b() {
        return (this.o & 1) == 1;
    }

    @Override
    public int c() {
        return this.p;
    }

    @Override
    public boolean d() {
        return (this.o & 2) == 2;
    }

    @Override
    public int e() {
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
    public oy_2 i() {
        return this.s == null ? oy_2.i() : this.s;
    }

    @Override
    public ob_1 j() {
        return this.s == null ? oy_2.i() : this.s;
    }

    @Override
    public boolean k() {
        return (this.o & 0x10) == 16;
    }

    @Override
    public oy_2 l() {
        return this.t == null ? oy_2.i() : this.t;
    }

    @Override
    public ob_1 m() {
        return this.t == null ? oy_2.i() : this.t;
    }

    @Override
    public boolean n() {
        return (this.o & 0x20) == 32;
    }

    @Override
    public long o() {
        return this.u;
    }

    @Override
    public boolean p() {
        return (this.o & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.v;
    }

    @Override
    public boolean r() {
        return (this.o & 0x80) == 128;
    }

    @Override
    public int s() {
        return this.w;
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
    public int y() {
        return this.z;
    }

    @Override
    public boolean z() {
        return (this.o & 0x800) == 2048;
    }

    @Override
    public int A() {
        return this.A;
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
        if (!this.k()) {
            this.B = 0;
            return false;
        }
        if (!this.n()) {
            this.B = 0;
            return false;
        }
        if (!this.i().isInitialized()) {
            this.B = 0;
            return false;
        }
        if (!this.l().isInitialized()) {
            this.B = 0;
            return false;
        }
        this.B = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.o & 1) == 1) {
            codedOutputStream.writeInt32(1, this.p);
        }
        if ((this.o & 2) == 2) {
            codedOutputStream.writeInt32(2, this.q);
        }
        if ((this.o & 4) == 4) {
            codedOutputStream.writeInt32(3, this.r);
        }
        if ((this.o & 8) == 8) {
            codedOutputStream.writeMessage(4, (MessageLite)this.i());
        }
        if ((this.o & 0x10) == 16) {
            codedOutputStream.writeMessage(5, (MessageLite)this.l());
        }
        if ((this.o & 0x20) == 32) {
            codedOutputStream.writeInt64(6, this.u);
        }
        if ((this.o & 0x40) == 64) {
            codedOutputStream.writeInt32(7, this.v);
        }
        if ((this.o & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.w);
        }
        if ((this.o & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.x);
        }
        if ((this.o & 0x200) == 512) {
            codedOutputStream.writeInt64(10, this.y);
        }
        if ((this.o & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.z);
        }
        if ((this.o & 0x800) == 2048) {
            codedOutputStream.writeInt32(12, this.A);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.p);
        }
        if ((this.o & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.q);
        }
        if ((this.o & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.r);
        }
        if ((this.o & 8) == 8) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.i());
        }
        if ((this.o & 0x10) == 16) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.l());
        }
        if ((this.o & 0x20) == 32) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.u);
        }
        if ((this.o & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.v);
        }
        if ((this.o & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.w);
        }
        if ((this.o & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.x);
        }
        if ((this.o & 0x200) == 512) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.y);
        }
        if ((this.o & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.z);
        }
        if ((this.o & 0x800) == 2048) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.A);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oq_1)) {
            return super.equals(object);
        }
        oq_1 oq_12 = (oq_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == oq_12.b();
        if (this.b()) {
            bl = bl && this.c() == oq_12.c();
        }
        boolean bl3 = bl = bl && this.d() == oq_12.d();
        if (this.d()) {
            bl = bl && this.e() == oq_12.e();
        }
        boolean bl4 = bl = bl && this.f() == oq_12.f();
        if (this.f()) {
            bl = bl && this.g() == oq_12.g();
        }
        boolean bl5 = bl = bl && this.h() == oq_12.h();
        if (this.h()) {
            bl = bl && this.i().equals(oq_12.i());
        }
        boolean bl6 = bl = bl && this.k() == oq_12.k();
        if (this.k()) {
            bl = bl && this.l().equals(oq_12.l());
        }
        boolean bl7 = bl = bl && this.n() == oq_12.n();
        if (this.n()) {
            bl = bl && this.o() == oq_12.o();
        }
        boolean bl8 = bl = bl && this.p() == oq_12.p();
        if (this.p()) {
            bl = bl && this.q() == oq_12.q();
        }
        boolean bl9 = bl = bl && this.r() == oq_12.r();
        if (this.r()) {
            bl = bl && this.s() == oq_12.s();
        }
        boolean bl10 = bl = bl && this.t() == oq_12.t();
        if (this.t()) {
            bl = bl && this.u() == oq_12.u();
        }
        boolean bl11 = bl = bl && this.v() == oq_12.v();
        if (this.v()) {
            bl = bl && this.w() == oq_12.w();
        }
        boolean bl12 = bl = bl && this.x() == oq_12.x();
        if (this.x()) {
            bl = bl && this.y() == oq_12.y();
        }
        boolean bl13 = bl = bl && this.z() == oq_12.z();
        if (this.z()) {
            bl = bl && this.A() == oq_12.A();
        }
        bl = bl && this.unknownFields.equals((Object)oq_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oq_1.a().hashCode();
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
            n = 53 * n + this.i().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + this.l().hashCode();
        }
        if (this.n()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.o());
        }
        if (this.p()) {
            n = 37 * n + 7;
            n = 53 * n + this.q();
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
            n = 53 * n + Internal.hashLong((long)this.w());
        }
        if (this.x()) {
            n = 37 * n + 11;
            n = 53 * n + this.y();
        }
        if (this.z()) {
            n = 37 * n + 12;
            n = 53 * n + this.A();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oq_1 a(ByteBuffer byteBuffer) {
        return (oq_1)m.parseFrom(byteBuffer);
    }

    public static oq_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)m.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oq_1 a(ByteString byteString) {
        return (oq_1)m.parseFrom(byteString);
    }

    public static oq_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)m.parseFrom(byteString, extensionRegistryLite);
    }

    public static oq_1 a(byte[] byArray) {
        return (oq_1)m.parseFrom(byArray);
    }

    public static oq_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)m.parseFrom(byArray, extensionRegistryLite);
    }

    public static oq_1 a(InputStream inputStream) {
        return (oq_1)GeneratedMessageV3.parseWithIOException(m, (InputStream)inputStream);
    }

    public static oq_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)GeneratedMessageV3.parseWithIOException(m, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oq_1 b(InputStream inputStream) {
        return (oq_1)GeneratedMessageV3.parseDelimitedWithIOException(m, (InputStream)inputStream);
    }

    public static oq_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)GeneratedMessageV3.parseDelimitedWithIOException(m, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oq_1 a(CodedInputStream codedInputStream) {
        return (oq_1)GeneratedMessageV3.parseWithIOException(m, (CodedInputStream)codedInputStream);
    }

    public static oq_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oq_1)GeneratedMessageV3.parseWithIOException(m, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public os_1 B() {
        return oq_1.C();
    }

    public static os_1 C() {
        return C.D();
    }

    public static os_1 a(oq_1 oq_12) {
        return C.D().a(oq_12);
    }

    public os_1 D() {
        return this == C ? new os_1() : new os_1().a(this);
    }

    protected os_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        os_1 os_12 = new os_1(builderParent);
        return os_12;
    }

    public static oq_1 E() {
        return C;
    }

    public static Parser<oq_1> F() {
        return m;
    }

    public Parser<oq_1> getParserForType() {
        return m;
    }

    public oq_1 G() {
        return C;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.D();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.B();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.D();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.B();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.G();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.G();
    }

    static /* synthetic */ boolean H() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(oq_1 oq_12) {
        return oq_12.unknownFields;
    }
}

