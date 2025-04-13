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
 * Renamed from jU
 */
public final class ju_0
extends GeneratedMessageV3
implements jx_0 {
    private static final long p = 0L;
    int q;
    public static final int a = 1;
    long r;
    public static final int b = 2;
    long s;
    public static final int c = 3;
    int t;
    public static final int d = 4;
    long u;
    public static final int e = 5;
    long v;
    public static final int f = 6;
    boolean w;
    public static final int g = 7;
    ByteString x;
    public static final int h = 8;
    ByteString y;
    public static final int i = 9;
    int z;
    public static final int j = 10;
    int A;
    public static final int k = 11;
    volatile Object B;
    public static final int l = 12;
    long C;
    public static final int m = 13;
    ByteString D;
    public static final int n = 14;
    ByteString E;
    private byte F = (byte)-1;
    private static final ju_0 G = new ju_0();
    @Deprecated
    public static final Parser<ju_0> o = new jv_0();

    ju_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ju_0() {
        this.r = 0L;
        this.s = 0L;
        this.t = 0;
        this.u = 0L;
        this.v = 0L;
        this.w = false;
        this.x = ByteString.EMPTY;
        this.y = ByteString.EMPTY;
        this.z = 0;
        this.A = 0;
        this.B = "";
        this.C = 0L;
        this.D = ByteString.EMPTY;
        this.E = ByteString.EMPTY;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ju_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.u = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 40: {
                        this.q |= 0x10;
                        this.v = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 48: {
                        this.q |= 0x20;
                        this.w = codedInputStream.readBool();
                        continue block23;
                    }
                    case 58: {
                        this.q |= 0x40;
                        this.x = codedInputStream.readBytes();
                        continue block23;
                    }
                    case 66: {
                        this.q |= 0x80;
                        this.y = codedInputStream.readBytes();
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
                    case 90: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.q |= 0x400;
                        this.B = byteString;
                        continue block23;
                    }
                    case 96: {
                        this.q |= 0x800;
                        this.C = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 106: {
                        this.q |= 0x1000;
                        this.D = codedInputStream.readBytes();
                        continue block23;
                    }
                    case 114: 
                }
                this.q |= 0x2000;
                this.E = codedInputStream.readBytes();
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
        return jo_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.f.ensureFieldAccessorsInitialized(ju_0.class, jw_0.class);
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
    public long i() {
        return this.u;
    }

    @Override
    public boolean j() {
        return (this.q & 0x10) == 16;
    }

    @Override
    public long k() {
        return this.v;
    }

    @Override
    public boolean l() {
        return (this.q & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.w;
    }

    @Override
    public boolean n() {
        return (this.q & 0x40) == 64;
    }

    @Override
    public ByteString o() {
        return this.x;
    }

    @Override
    public boolean p() {
        return (this.q & 0x80) == 128;
    }

    @Override
    public ByteString q() {
        return this.y;
    }

    @Override
    public boolean r() {
        return (this.q & 0x100) == 256;
    }

    @Override
    public int s() {
        return this.z;
    }

    @Override
    public boolean t() {
        return (this.q & 0x200) == 512;
    }

    @Override
    public int u() {
        return this.A;
    }

    @Override
    public boolean v() {
        return (this.q & 0x400) == 1024;
    }

    @Override
    public String w() {
        Object object = this.B;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.B = string;
        }
        return string;
    }

    @Override
    public ByteString x() {
        Object object = this.B;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.B = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean y() {
        return (this.q & 0x800) == 2048;
    }

    @Override
    public long z() {
        return this.C;
    }

    @Override
    public boolean A() {
        return (this.q & 0x1000) == 4096;
    }

    @Override
    public ByteString B() {
        return this.D;
    }

    @Override
    public boolean C() {
        return (this.q & 0x2000) == 8192;
    }

    @Override
    public ByteString D() {
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
        if (!this.l()) {
            this.F = 0;
            return false;
        }
        if (!this.n()) {
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
        if (!this.t()) {
            this.F = 0;
            return false;
        }
        if (!this.v()) {
            this.F = 0;
            return false;
        }
        if (!this.y()) {
            this.F = 0;
            return false;
        }
        if (!this.A()) {
            this.F = 0;
            return false;
        }
        if (!this.C()) {
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
            codedOutputStream.writeInt64(4, this.u);
        }
        if ((this.q & 0x10) == 16) {
            codedOutputStream.writeInt64(5, this.v);
        }
        if ((this.q & 0x20) == 32) {
            codedOutputStream.writeBool(6, this.w);
        }
        if ((this.q & 0x40) == 64) {
            codedOutputStream.writeBytes(7, this.x);
        }
        if ((this.q & 0x80) == 128) {
            codedOutputStream.writeBytes(8, this.y);
        }
        if ((this.q & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.z);
        }
        if ((this.q & 0x200) == 512) {
            codedOutputStream.writeInt32(10, this.A);
        }
        if ((this.q & 0x400) == 1024) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)11, (Object)this.B);
        }
        if ((this.q & 0x800) == 2048) {
            codedOutputStream.writeInt64(12, this.C);
        }
        if ((this.q & 0x1000) == 4096) {
            codedOutputStream.writeBytes(13, this.D);
        }
        if ((this.q & 0x2000) == 8192) {
            codedOutputStream.writeBytes(14, this.E);
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
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.u);
        }
        if ((this.q & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.v);
        }
        if ((this.q & 0x20) == 32) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.w);
        }
        if ((this.q & 0x40) == 64) {
            n += CodedOutputStream.computeBytesSize((int)7, (ByteString)this.x);
        }
        if ((this.q & 0x80) == 128) {
            n += CodedOutputStream.computeBytesSize((int)8, (ByteString)this.y);
        }
        if ((this.q & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.z);
        }
        if ((this.q & 0x200) == 512) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.A);
        }
        if ((this.q & 0x400) == 1024) {
            n += GeneratedMessageV3.computeStringSize((int)11, (Object)this.B);
        }
        if ((this.q & 0x800) == 2048) {
            n += CodedOutputStream.computeInt64Size((int)12, (long)this.C);
        }
        if ((this.q & 0x1000) == 4096) {
            n += CodedOutputStream.computeBytesSize((int)13, (ByteString)this.D);
        }
        if ((this.q & 0x2000) == 8192) {
            n += CodedOutputStream.computeBytesSize((int)14, (ByteString)this.E);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ju_0)) {
            return super.equals(object);
        }
        ju_0 ju_02 = (ju_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ju_02.b();
        if (this.b()) {
            bl = bl && this.c() == ju_02.c();
        }
        boolean bl3 = bl = bl && this.d() == ju_02.d();
        if (this.d()) {
            bl = bl && this.e() == ju_02.e();
        }
        boolean bl4 = bl = bl && this.f() == ju_02.f();
        if (this.f()) {
            bl = bl && this.g() == ju_02.g();
        }
        boolean bl5 = bl = bl && this.h() == ju_02.h();
        if (this.h()) {
            bl = bl && this.i() == ju_02.i();
        }
        boolean bl6 = bl = bl && this.j() == ju_02.j();
        if (this.j()) {
            bl = bl && this.k() == ju_02.k();
        }
        boolean bl7 = bl = bl && this.l() == ju_02.l();
        if (this.l()) {
            bl = bl && this.m() == ju_02.m();
        }
        boolean bl8 = bl = bl && this.n() == ju_02.n();
        if (this.n()) {
            bl = bl && this.o().equals((Object)ju_02.o());
        }
        boolean bl9 = bl = bl && this.p() == ju_02.p();
        if (this.p()) {
            bl = bl && this.q().equals((Object)ju_02.q());
        }
        boolean bl10 = bl = bl && this.r() == ju_02.r();
        if (this.r()) {
            bl = bl && this.s() == ju_02.s();
        }
        boolean bl11 = bl = bl && this.t() == ju_02.t();
        if (this.t()) {
            bl = bl && this.u() == ju_02.u();
        }
        boolean bl12 = bl = bl && this.v() == ju_02.v();
        if (this.v()) {
            bl = bl && this.w().equals(ju_02.w());
        }
        boolean bl13 = bl = bl && this.y() == ju_02.y();
        if (this.y()) {
            bl = bl && this.z() == ju_02.z();
        }
        boolean bl14 = bl = bl && this.A() == ju_02.A();
        if (this.A()) {
            bl = bl && this.B().equals((Object)ju_02.B());
        }
        boolean bl15 = bl = bl && this.C() == ju_02.C();
        if (this.C()) {
            bl = bl && this.D().equals((Object)ju_02.D());
        }
        bl = bl && this.unknownFields.equals((Object)ju_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ju_0.a().hashCode();
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
            n = 53 * n + Internal.hashLong((long)this.i());
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.k());
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.m());
        }
        if (this.n()) {
            n = 37 * n + 7;
            n = 53 * n + this.o().hashCode();
        }
        if (this.p()) {
            n = 37 * n + 8;
            n = 53 * n + this.q().hashCode();
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
            n = 53 * n + this.w().hashCode();
        }
        if (this.y()) {
            n = 37 * n + 12;
            n = 53 * n + Internal.hashLong((long)this.z());
        }
        if (this.A()) {
            n = 37 * n + 13;
            n = 53 * n + this.B().hashCode();
        }
        if (this.C()) {
            n = 37 * n + 14;
            n = 53 * n + this.D().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ju_0 a(ByteBuffer byteBuffer) {
        return (ju_0)o.parseFrom(byteBuffer);
    }

    public static ju_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)o.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ju_0 a(ByteString byteString) {
        return (ju_0)o.parseFrom(byteString);
    }

    public static ju_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)o.parseFrom(byteString, extensionRegistryLite);
    }

    public static ju_0 a(byte[] byArray) {
        return (ju_0)o.parseFrom(byArray);
    }

    public static ju_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)o.parseFrom(byArray, extensionRegistryLite);
    }

    public static ju_0 a(InputStream inputStream) {
        return (ju_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream);
    }

    public static ju_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ju_0 b(InputStream inputStream) {
        return (ju_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream);
    }

    public static ju_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ju_0 a(CodedInputStream codedInputStream) {
        return (ju_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream);
    }

    public static ju_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ju_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jw_0 E() {
        return ju_0.F();
    }

    public static jw_0 F() {
        return G.G();
    }

    public static jw_0 a(ju_0 ju_02) {
        return G.G().a(ju_02);
    }

    public jw_0 G() {
        return this == G ? new jw_0() : new jw_0().a(this);
    }

    protected jw_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        jw_0 jw_02 = new jw_0(builderParent);
        return jw_02;
    }

    public static ju_0 H() {
        return G;
    }

    public static Parser<ju_0> I() {
        return o;
    }

    public Parser<ju_0> getParserForType() {
        return o;
    }

    public ju_0 J() {
        return G;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.G();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.E();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.E();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.J();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.J();
    }

    static /* synthetic */ boolean K() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ju_0 ju_02) {
        return ju_02.unknownFields;
    }
}

