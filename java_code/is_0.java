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
 * Renamed from iS
 */
public final class is_0
extends GeneratedMessageV3
implements iv_1 {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    int j;
    public static final int c = 3;
    int k;
    public static final int d = 4;
    long l;
    public static final int e = 5;
    int m;
    private byte n = (byte)-1;
    private static final is_0 o = new is_0();
    @Deprecated
    public static final Parser<is_0> f = new iT();

    is_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private is_0() {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0L;
        this.m = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    is_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.h |= 1;
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 16: {
                        this.h |= 2;
                        this.j = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.h |= 4;
                        this.k = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 32: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 40: 
                }
                this.h |= 0x10;
                this.m = codedInputStream.readInt32();
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
        return io_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.j.ensureFieldAccessorsInitialized(is_0.class, iu_0.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public int e() {
        return this.j;
    }

    @Override
    public boolean f() {
        return (this.h & 4) == 4;
    }

    @Override
    public int g() {
        return this.k;
    }

    @Override
    public boolean h() {
        return (this.h & 8) == 8;
    }

    @Override
    public long i() {
        return this.l;
    }

    @Override
    public boolean j() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.m;
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeInt32(2, this.j);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt32(3, this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt64(4, this.l);
        }
        if ((this.h & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.m);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.j);
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof is_0)) {
            return super.equals(object);
        }
        is_0 is_02 = (is_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == is_02.b();
        if (this.b()) {
            bl = bl && this.c() == is_02.c();
        }
        boolean bl3 = bl = bl && this.d() == is_02.d();
        if (this.d()) {
            bl = bl && this.e() == is_02.e();
        }
        boolean bl4 = bl = bl && this.f() == is_02.f();
        if (this.f()) {
            bl = bl && this.g() == is_02.g();
        }
        boolean bl5 = bl = bl && this.h() == is_02.h();
        if (this.h()) {
            bl = bl && this.i() == is_02.i();
        }
        boolean bl6 = bl = bl && this.j() == is_02.j();
        if (this.j()) {
            bl = bl && this.k() == is_02.k();
        }
        bl = bl && this.unknownFields.equals((Object)is_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + is_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
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
            n = 53 * n + Internal.hashLong((long)this.i());
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + this.k();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static is_0 a(ByteBuffer byteBuffer) {
        return (is_0)f.parseFrom(byteBuffer);
    }

    public static is_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static is_0 a(ByteString byteString) {
        return (is_0)f.parseFrom(byteString);
    }

    public static is_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static is_0 a(byte[] byArray) {
        return (is_0)f.parseFrom(byArray);
    }

    public static is_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static is_0 a(InputStream inputStream) {
        return (is_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static is_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static is_0 b(InputStream inputStream) {
        return (is_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static is_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static is_0 a(CodedInputStream codedInputStream) {
        return (is_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static is_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (is_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public iu_0 l() {
        return is_0.m();
    }

    public static iu_0 m() {
        return o.n();
    }

    public static iu_0 a(is_0 is_02) {
        return o.n().a(is_02);
    }

    public iu_0 n() {
        return this == o ? new iu_0() : new iu_0().a(this);
    }

    protected iu_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        iu_0 iu_02 = new iu_0(builderParent);
        return iu_02;
    }

    public static is_0 o() {
        return o;
    }

    public static Parser<is_0> p() {
        return f;
    }

    public Parser<is_0> getParserForType() {
        return f;
    }

    public is_0 q() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(is_0 is_02) {
        return is_02.unknownFields;
    }
}

