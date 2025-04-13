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

public final class na
extends GeneratedMessageV3
implements nd {
    private static final long h = 0L;
    int i;
    public static final int a = 1;
    long j;
    public static final int b = 2;
    long k;
    public static final int c = 3;
    le_0 l;
    public static final int d = 4;
    int m;
    public static final int e = 5;
    long n;
    public static final int f = 6;
    long o;
    private byte p = (byte)-1;
    private static final na q = new na();
    @Deprecated
    public static final Parser<na> g = new nb();

    na(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private na() {
        this.j = 0L;
        this.k = 0L;
        this.m = 0;
        this.n = 0L;
        this.o = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    na(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block15;
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.i |= 1;
                        this.j = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 16: {
                        this.i |= 2;
                        this.k = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 26: {
                        lg lg2 = null;
                        if ((this.i & 4) == 4) {
                            lg2 = this.l.G();
                        }
                        this.l = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (lg2 != null) {
                            lg2.a(this.l);
                            this.l = lg2.H();
                        }
                        this.i |= 4;
                        continue block15;
                    }
                    case 32: {
                        this.i |= 8;
                        this.m = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 40: {
                        this.i |= 0x10;
                        this.n = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 48: 
                }
                this.i |= 0x20;
                this.o = codedInputStream.readInt64();
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
        return mY.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mY.d.ensureFieldAccessorsInitialized(na.class, nc.class);
    }

    @Override
    public boolean b() {
        return (this.i & 1) == 1;
    }

    @Override
    public long c() {
        return this.j;
    }

    @Override
    public boolean d() {
        return (this.i & 2) == 2;
    }

    @Override
    public long e() {
        return this.k;
    }

    @Override
    public boolean f() {
        return (this.i & 4) == 4;
    }

    @Override
    public le_0 g() {
        return this.l == null ? le_0.H() : this.l;
    }

    @Override
    public lp h() {
        return this.l == null ? le_0.H() : this.l;
    }

    @Override
    public boolean i() {
        return (this.i & 8) == 8;
    }

    @Override
    public int j() {
        return this.m;
    }

    @Override
    public boolean k() {
        return (this.i & 0x10) == 16;
    }

    @Override
    public long l() {
        return this.n;
    }

    @Override
    public boolean m() {
        return (this.i & 0x20) == 32;
    }

    @Override
    public long n() {
        return this.o;
    }

    public final boolean isInitialized() {
        byte by = this.p;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.p = 0;
            return false;
        }
        if (!this.d()) {
            this.p = 0;
            return false;
        }
        if (!this.f()) {
            this.p = 0;
            return false;
        }
        if (!this.i()) {
            this.p = 0;
            return false;
        }
        if (!this.k()) {
            this.p = 0;
            return false;
        }
        if (!this.m()) {
            this.p = 0;
            return false;
        }
        if (!this.g().isInitialized()) {
            this.p = 0;
            return false;
        }
        this.p = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.i & 1) == 1) {
            codedOutputStream.writeInt64(1, this.j);
        }
        if ((this.i & 2) == 2) {
            codedOutputStream.writeInt64(2, this.k);
        }
        if ((this.i & 4) == 4) {
            codedOutputStream.writeMessage(3, (MessageLite)this.g());
        }
        if ((this.i & 8) == 8) {
            codedOutputStream.writeInt32(4, this.m);
        }
        if ((this.i & 0x10) == 16) {
            codedOutputStream.writeInt64(5, this.n);
        }
        if ((this.i & 0x20) == 32) {
            codedOutputStream.writeInt64(6, this.o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.i & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.j);
        }
        if ((this.i & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.k);
        }
        if ((this.i & 4) == 4) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.g());
        }
        if ((this.i & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.m);
        }
        if ((this.i & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.n);
        }
        if ((this.i & 0x20) == 32) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.o);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof na)) {
            return super.equals(object);
        }
        na na2 = (na)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == na2.b();
        if (this.b()) {
            bl = bl && this.c() == na2.c();
        }
        boolean bl3 = bl = bl && this.d() == na2.d();
        if (this.d()) {
            bl = bl && this.e() == na2.e();
        }
        boolean bl4 = bl = bl && this.f() == na2.f();
        if (this.f()) {
            bl = bl && this.g().equals(na2.g());
        }
        boolean bl5 = bl = bl && this.i() == na2.i();
        if (this.i()) {
            bl = bl && this.j() == na2.j();
        }
        boolean bl6 = bl = bl && this.k() == na2.k();
        if (this.k()) {
            bl = bl && this.l() == na2.l();
        }
        boolean bl7 = bl = bl && this.m() == na2.m();
        if (this.m()) {
            bl = bl && this.n() == na2.n();
        }
        bl = bl && this.unknownFields.equals((Object)na2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + na.a().hashCode();
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
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + this.j();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.l());
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.n());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static na a(ByteBuffer byteBuffer) {
        return (na)g.parseFrom(byteBuffer);
    }

    public static na a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (na)g.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static na a(ByteString byteString) {
        return (na)g.parseFrom(byteString);
    }

    public static na a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (na)g.parseFrom(byteString, extensionRegistryLite);
    }

    public static na a(byte[] byArray) {
        return (na)g.parseFrom(byArray);
    }

    public static na a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (na)g.parseFrom(byArray, extensionRegistryLite);
    }

    public static na a(InputStream inputStream) {
        return (na)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream);
    }

    public static na a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static na b(InputStream inputStream) {
        return (na)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream);
    }

    public static na b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static na a(CodedInputStream codedInputStream) {
        return (na)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream);
    }

    public static na a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nc o() {
        return na.p();
    }

    public static nc p() {
        return q.q();
    }

    public static nc a(na na2) {
        return q.q().a(na2);
    }

    public nc q() {
        return this == q ? new nc() : new nc().a(this);
    }

    protected nc a(GeneratedMessageV3.BuilderParent builderParent) {
        nc nc2 = new nc(builderParent);
        return nc2;
    }

    public static na r() {
        return q;
    }

    public static Parser<na> s() {
        return g;
    }

    public Parser<na> getParserForType() {
        return g;
    }

    public na t() {
        return q;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.q();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.o();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.t();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.t();
    }

    static /* synthetic */ boolean u() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(na na2) {
        return na2.unknownFields;
    }
}

