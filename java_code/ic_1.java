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
 * Renamed from iC
 */
public final class ic_1
extends GeneratedMessageV3
implements if_0 {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    boolean i;
    public static final int b = 2;
    int j;
    public static final int c = 3;
    iy_1 k;
    public static final int d = 4;
    long l;
    public static final int e = 5;
    boolean m;
    private byte n = (byte)-1;
    private static final ic_1 o = new ic_1();
    @Deprecated
    public static final Parser<ic_1> f = new id_0();

    ic_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ic_1() {
        this.i = false;
        this.j = 0;
        this.l = 0L;
        this.m = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ic_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.i = codedInputStream.readBool();
                        continue block14;
                    }
                    case 16: {
                        this.h |= 2;
                        this.j = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 26: {
                        ia_1 ia_12 = null;
                        if ((this.h & 4) == 4) {
                            ia_12 = this.k.j();
                        }
                        this.k = (iy_1)codedInputStream.readMessage(iy_1.d, extensionRegistryLite);
                        if (ia_12 != null) {
                            ia_12.a(this.k);
                            this.k = ia_12.k();
                        }
                        this.h |= 4;
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
                this.m = codedInputStream.readBool();
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
        return io_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.f.ensureFieldAccessorsInitialized(ic_1.class, ie_0.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public boolean c() {
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
    public iy_1 g() {
        return this.k == null ? iy_1.k() : this.k;
    }

    @Override
    public ib_1 h() {
        return this.k == null ? iy_1.k() : this.k;
    }

    @Override
    public boolean i() {
        return (this.h & 8) == 8;
    }

    @Override
    public long j() {
        return this.l;
    }

    @Override
    public boolean k() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public boolean l() {
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
        if (!this.b()) {
            this.n = 0;
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.f()) {
            this.n = 0;
            return false;
        }
        if (!this.i()) {
            this.n = 0;
            return false;
        }
        if (!this.k()) {
            this.n = 0;
            return false;
        }
        if (!this.g().isInitialized()) {
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeBool(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeInt32(2, this.j);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeMessage(3, (MessageLite)this.g());
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt64(4, this.l);
        }
        if ((this.h & 0x10) == 16) {
            codedOutputStream.writeBool(5, this.m);
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
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.j);
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.g());
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ic_1)) {
            return super.equals(object);
        }
        ic_1 ic_12 = (ic_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ic_12.b();
        if (this.b()) {
            bl = bl && this.c() == ic_12.c();
        }
        boolean bl3 = bl = bl && this.d() == ic_12.d();
        if (this.d()) {
            bl = bl && this.e() == ic_12.e();
        }
        boolean bl4 = bl = bl && this.f() == ic_12.f();
        if (this.f()) {
            bl = bl && this.g().equals(ic_12.g());
        }
        boolean bl5 = bl = bl && this.i() == ic_12.i();
        if (this.i()) {
            bl = bl && this.j() == ic_12.j();
        }
        boolean bl6 = bl = bl && this.k() == ic_12.k();
        if (this.k()) {
            bl = bl && this.l() == ic_12.l();
        }
        bl = bl && this.unknownFields.equals((Object)ic_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ic_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.j());
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.l());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ic_1 a(ByteBuffer byteBuffer) {
        return (ic_1)f.parseFrom(byteBuffer);
    }

    public static ic_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ic_1 a(ByteString byteString) {
        return (ic_1)f.parseFrom(byteString);
    }

    public static ic_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static ic_1 a(byte[] byArray) {
        return (ic_1)f.parseFrom(byArray);
    }

    public static ic_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static ic_1 a(InputStream inputStream) {
        return (ic_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static ic_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ic_1 b(InputStream inputStream) {
        return (ic_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static ic_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ic_1 a(CodedInputStream codedInputStream) {
        return (ic_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static ic_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ic_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ie_0 m() {
        return ic_1.n();
    }

    public static ie_0 n() {
        return o.o();
    }

    public static ie_0 a(ic_1 ic_12) {
        return o.o().a(ic_12);
    }

    public ie_0 o() {
        return this == o ? new ie_0() : new ie_0().a(this);
    }

    protected ie_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ie_0 ie_02 = new ie_0(builderParent);
        return ie_02;
    }

    public static ic_1 p() {
        return o;
    }

    public static Parser<ic_1> q() {
        return f;
    }

    public Parser<ic_1> getParserForType() {
        return f;
    }

    public ic_1 r() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ic_1 ic_12) {
        return ic_12.unknownFields;
    }
}

