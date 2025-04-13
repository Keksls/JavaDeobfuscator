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
 * Renamed from ob
 */
public final class ob_0
extends GeneratedMessageV3
implements oe_1 {
    private static final long c = 0L;
    int d;
    public static final int a = 2;
    long e;
    private byte f = (byte)-1;
    private static final ob_0 g = new ob_0();
    @Deprecated
    public static final Parser<ob_0> b = new oc_1();

    ob_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ob_0() {
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ob_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 16: 
                }
                this.d |= 1;
                this.e = codedInputStream.readInt64();
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
        return nz_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nz_0.f.ensureFieldAccessorsInitialized(ob_0.class, od_1.class);
    }

    @Override
    public boolean b() {
        return (this.d & 1) == 1;
    }

    @Override
    public long c() {
        return this.e;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.f = 0;
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.writeInt64(2, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.d & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ob_0)) {
            return super.equals(object);
        }
        ob_0 ob_02 = (ob_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ob_02.b();
        if (this.b()) {
            bl = bl && this.c() == ob_02.c();
        }
        bl = bl && this.unknownFields.equals((Object)ob_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ob_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ob_0 a(ByteBuffer byteBuffer) {
        return (ob_0)b.parseFrom(byteBuffer);
    }

    public static ob_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ob_0 a(ByteString byteString) {
        return (ob_0)b.parseFrom(byteString);
    }

    public static ob_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static ob_0 a(byte[] byArray) {
        return (ob_0)b.parseFrom(byArray);
    }

    public static ob_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static ob_0 a(InputStream inputStream) {
        return (ob_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static ob_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ob_0 b(InputStream inputStream) {
        return (ob_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static ob_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ob_0 a(CodedInputStream codedInputStream) {
        return (ob_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static ob_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public od_1 d() {
        return ob_0.e();
    }

    public static od_1 e() {
        return g.f();
    }

    public static od_1 a(ob_0 ob_02) {
        return g.f().a(ob_02);
    }

    public od_1 f() {
        return this == g ? new od_1() : new od_1().a(this);
    }

    protected od_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        od_1 od_12 = new od_1(builderParent);
        return od_12;
    }

    public static ob_0 g() {
        return g;
    }

    public static Parser<ob_0> h() {
        return b;
    }

    public Parser<ob_0> getParserForType() {
        return b;
    }

    public ob_0 i() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    static /* synthetic */ boolean j() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ob_0 ob_02) {
        return ob_02.unknownFields;
    }
}

