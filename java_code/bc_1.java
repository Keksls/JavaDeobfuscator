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
 * Renamed from bc
 */
public final class bc_1
extends GeneratedMessageV3
implements bf_1 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    volatile Object e;
    private byte f = (byte)-1;
    private static final bc_1 g = new bc_1();
    static final Parser<bc_1> h = new bd_1();

    bc_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bc_1() {
        this.d = 0L;
        this.e = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bc_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                String string = codedInputStream.readStringRequireUtf8();
                this.e = string;
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
        return ak_2.q;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.r.ensureFieldAccessorsInitialized(bc_1.class, be_1.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public String c() {
        Object object = this.e;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.e = string;
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if (!this.d().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.e);
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
        if (!this.d().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bc_1)) {
            return super.equals(object);
        }
        bc_1 bc_12 = (bc_1)object;
        boolean bl = true;
        bl = bl && this.b() == bc_12.b();
        bl = bl && this.c().equals(bc_12.c());
        bl = bl && this.unknownFields.equals((Object)bc_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bc_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + this.c().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bc_1 a(ByteBuffer byteBuffer) {
        return (bc_1)h.parseFrom(byteBuffer);
    }

    public static bc_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bc_1 a(ByteString byteString) {
        return (bc_1)h.parseFrom(byteString);
    }

    public static bc_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static bc_1 a(byte[] byArray) {
        return (bc_1)h.parseFrom(byArray);
    }

    public static bc_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static bc_1 a(InputStream inputStream) {
        return (bc_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static bc_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_1 b(InputStream inputStream) {
        return (bc_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static bc_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_1 a(CodedInputStream codedInputStream) {
        return (bc_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static bc_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public be_1 e() {
        return bc_1.f();
    }

    public static be_1 f() {
        return g.g();
    }

    public static be_1 a(bc_1 bc_12) {
        return g.g().a(bc_12);
    }

    public be_1 g() {
        return this == g ? new be_1() : new be_1().a(this);
    }

    protected be_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        be_1 be_12 = new be_1(builderParent);
        return be_12;
    }

    public static bc_1 h() {
        return g;
    }

    public static Parser<bc_1> i() {
        return h;
    }

    public Parser<bc_1> getParserForType() {
        return h;
    }

    public bc_1 j() {
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

    static /* synthetic */ UnknownFieldSet b(bc_1 bc_12) {
        return bc_12.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        bc_1.checkByteStringIsUtf8((ByteString)byteString);
    }
}

