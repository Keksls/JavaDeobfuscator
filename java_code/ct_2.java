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
 * Renamed from cT
 */
public final class ct_2
extends GeneratedMessageV3
implements cw_1 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    int e;
    private byte f = (byte)-1;
    private static final ct_2 g = new ct_2();
    static final Parser<ct_2> h = new cu_1();

    ct_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ct_2() {
        this.d = 0L;
        this.e = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ct_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 16: 
                }
                this.e = n = codedInputStream.readEnum();
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
        return ak_2.y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.z.ensureFieldAccessorsInitialized(ct_2.class, cv_1.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public cr_2 d() {
        cr_2 cr_22 = cr_2.a(this.e);
        return cr_22 == null ? cr_2.c : cr_22;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0L) {
            codedOutputStream.writeInt64(1, this.d);
        }
        if (this.e != cr_2.a.getNumber()) {
            codedOutputStream.writeEnum(2, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.d);
        }
        if (this.e != cr_2.a.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ct_2)) {
            return super.equals(object);
        }
        ct_2 ct_22 = (ct_2)object;
        boolean bl = true;
        bl = bl && this.b() == ct_22.b();
        bl = bl && this.e == ct_22.e;
        bl = bl && this.unknownFields.equals((Object)ct_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ct_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + this.e;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ct_2 a(ByteBuffer byteBuffer) {
        return (ct_2)h.parseFrom(byteBuffer);
    }

    public static ct_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ct_2 a(ByteString byteString) {
        return (ct_2)h.parseFrom(byteString);
    }

    public static ct_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ct_2 a(byte[] byArray) {
        return (ct_2)h.parseFrom(byArray);
    }

    public static ct_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ct_2 a(InputStream inputStream) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ct_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ct_2 b(InputStream inputStream) {
        return (ct_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ct_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ct_2 a(CodedInputStream codedInputStream) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ct_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cv_1 e() {
        return ct_2.f();
    }

    public static cv_1 f() {
        return g.g();
    }

    public static cv_1 a(ct_2 ct_22) {
        return g.g().a(ct_22);
    }

    public cv_1 g() {
        return this == g ? new cv_1() : new cv_1().a(this);
    }

    protected cv_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        cv_1 cv_12 = new cv_1(builderParent);
        return cv_12;
    }

    public static ct_2 h() {
        return g;
    }

    public static Parser<ct_2> i() {
        return h;
    }

    public Parser<ct_2> getParserForType() {
        return h;
    }

    public ct_2 j() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ct_2 ct_22) {
        return ct_22.unknownFields;
    }
}

