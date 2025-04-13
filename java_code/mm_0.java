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
 * Renamed from mm
 */
public final class mm_0
extends GeneratedMessageV3
implements mp_0 {
    private static final long j = 0L;
    int k;
    public static final int a = 1;
    long l;
    public static final int b = 2;
    le_0 m;
    public static final int c = 3;
    my_0 n;
    public static final int d = 5;
    int o;
    public static final int e = 6;
    int p;
    public static final int f = 7;
    long q;
    public static final int g = 8;
    int r;
    public static final int h = 9;
    long s;
    private byte t = (byte)-1;
    private static final mm_0 u = new mm_0();
    @Deprecated
    public static final Parser<mm_0> i = new mn_0();

    mm_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mm_0() {
        this.l = -1L;
        this.o = 0;
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.s = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mm_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block17: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block17;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block17;
                        bl2 = true;
                        continue block17;
                    }
                    case 8: {
                        this.k |= 1;
                        this.l = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 18: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.k & 2) == 2) {
                            builder2 = this.m.G();
                        }
                        this.m = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.m);
                            this.m = builder2.H();
                        }
                        this.k |= 2;
                        continue block17;
                    }
                    case 26: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.k & 4) == 4) {
                            builder2 = this.n.m();
                        }
                        this.n = (my_0)codedInputStream.readMessage(my_0.e, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.n);
                            this.n = builder2.n();
                        }
                        this.k |= 4;
                        continue block17;
                    }
                    case 40: {
                        this.k |= 8;
                        this.o = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: {
                        this.k |= 0x10;
                        this.p = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 56: {
                        this.k |= 0x20;
                        this.q = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 64: {
                        this.k |= 0x40;
                        this.r = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 72: 
                }
                this.k |= 0x80;
                this.s = codedInputStream.readInt64();
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
        return mk.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.f.ensureFieldAccessorsInitialized(mm_0.class, mo_1.class);
    }

    @Override
    public boolean b() {
        return (this.k & 1) == 1;
    }

    @Override
    public long c() {
        return this.l;
    }

    @Override
    public boolean d() {
        return (this.k & 2) == 2;
    }

    @Override
    public le_0 e() {
        return this.m == null ? le_0.H() : this.m;
    }

    @Override
    public lp f() {
        return this.m == null ? le_0.H() : this.m;
    }

    @Override
    public boolean g() {
        return (this.k & 4) == 4;
    }

    @Override
    public my_0 h() {
        return this.n == null ? my_0.n() : this.n;
    }

    @Override
    public mB i() {
        return this.n == null ? my_0.n() : this.n;
    }

    @Override
    public boolean j() {
        return (this.k & 8) == 8;
    }

    @Override
    public int k() {
        return this.o;
    }

    @Override
    public boolean l() {
        return (this.k & 0x10) == 16;
    }

    @Override
    public int m() {
        return this.p;
    }

    @Override
    public boolean n() {
        return (this.k & 0x20) == 32;
    }

    @Override
    public long o() {
        return this.q;
    }

    @Override
    public boolean p() {
        return (this.k & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.r;
    }

    @Override
    public boolean r() {
        return (this.k & 0x80) == 128;
    }

    @Override
    public long s() {
        return this.s;
    }

    public final boolean isInitialized() {
        byte by = this.t;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.g()) {
            this.t = 0;
            return false;
        }
        if (!this.j()) {
            this.t = 0;
            return false;
        }
        if (!this.l()) {
            this.t = 0;
            return false;
        }
        if (!this.n()) {
            this.t = 0;
            return false;
        }
        if (!this.p()) {
            this.t = 0;
            return false;
        }
        if (this.d() && !this.e().isInitialized()) {
            this.t = 0;
            return false;
        }
        if (!this.h().isInitialized()) {
            this.t = 0;
            return false;
        }
        this.t = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.k & 1) == 1) {
            codedOutputStream.writeInt64(1, this.l);
        }
        if ((this.k & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        if ((this.k & 4) == 4) {
            codedOutputStream.writeMessage(3, (MessageLite)this.h());
        }
        if ((this.k & 8) == 8) {
            codedOutputStream.writeInt32(5, this.o);
        }
        if ((this.k & 0x10) == 16) {
            codedOutputStream.writeInt32(6, this.p);
        }
        if ((this.k & 0x20) == 32) {
            codedOutputStream.writeInt64(7, this.q);
        }
        if ((this.k & 0x40) == 64) {
            codedOutputStream.writeInt32(8, this.r);
        }
        if ((this.k & 0x80) == 128) {
            codedOutputStream.writeInt64(9, this.s);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.k & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.l);
        }
        if ((this.k & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        if ((this.k & 4) == 4) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.h());
        }
        if ((this.k & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.o);
        }
        if ((this.k & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.p);
        }
        if ((this.k & 0x20) == 32) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.q);
        }
        if ((this.k & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.r);
        }
        if ((this.k & 0x80) == 128) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.s);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mm_0)) {
            return super.equals(object);
        }
        mm_0 mm_02 = (mm_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mm_02.b();
        if (this.b()) {
            bl = bl && this.c() == mm_02.c();
        }
        boolean bl3 = bl = bl && this.d() == mm_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(mm_02.e());
        }
        boolean bl4 = bl = bl && this.g() == mm_02.g();
        if (this.g()) {
            bl = bl && this.h().equals(mm_02.h());
        }
        boolean bl5 = bl = bl && this.j() == mm_02.j();
        if (this.j()) {
            bl = bl && this.k() == mm_02.k();
        }
        boolean bl6 = bl = bl && this.l() == mm_02.l();
        if (this.l()) {
            bl = bl && this.m() == mm_02.m();
        }
        boolean bl7 = bl = bl && this.n() == mm_02.n();
        if (this.n()) {
            bl = bl && this.o() == mm_02.o();
        }
        boolean bl8 = bl = bl && this.p() == mm_02.p();
        if (this.p()) {
            bl = bl && this.q() == mm_02.q();
        }
        boolean bl9 = bl = bl && this.r() == mm_02.r();
        if (this.r()) {
            bl = bl && this.s() == mm_02.s();
        }
        bl = bl && this.unknownFields.equals((Object)mm_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mm_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
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
            n = 53 * n + Internal.hashLong((long)this.o());
        }
        if (this.p()) {
            n = 37 * n + 8;
            n = 53 * n + this.q();
        }
        if (this.r()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.s());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mm_0 a(ByteBuffer byteBuffer) {
        return (mm_0)i.parseFrom(byteBuffer);
    }

    public static mm_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mm_0 a(ByteString byteString) {
        return (mm_0)i.parseFrom(byteString);
    }

    public static mm_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static mm_0 a(byte[] byArray) {
        return (mm_0)i.parseFrom(byArray);
    }

    public static mm_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static mm_0 a(InputStream inputStream) {
        return (mm_0)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static mm_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mm_0 b(InputStream inputStream) {
        return (mm_0)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static mm_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mm_0 a(CodedInputStream codedInputStream) {
        return (mm_0)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static mm_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mm_0)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mo_1 t() {
        return mm_0.u();
    }

    public static mo_1 u() {
        return u.v();
    }

    public static mo_1 a(mm_0 mm_02) {
        return u.v().a(mm_02);
    }

    public mo_1 v() {
        return this == u ? new mo_1() : new mo_1().a(this);
    }

    protected mo_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        mo_1 mo_12 = new mo_1(builderParent);
        return mo_12;
    }

    public static mm_0 w() {
        return u;
    }

    public static Parser<mm_0> x() {
        return i;
    }

    public Parser<mm_0> getParserForType() {
        return i;
    }

    public mm_0 y() {
        return u;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.v();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.v();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.t();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.y();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.y();
    }

    static /* synthetic */ boolean z() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mm_0 mm_02) {
        return mm_02.unknownFields;
    }
}

