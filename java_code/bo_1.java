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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from bo
 */
public final class bo_1
extends GeneratedMessageV3
implements br_1 {
    private static final long b = 0L;
    public static final int a = 1;
    volatile Object c;
    private byte d = (byte)-1;
    private static final bo_1 e = new bo_1();
    static final Parser<bo_1> f = new bp_1();

    bo_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bo_1() {
        this.c = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bo_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                String string = codedInputStream.readStringRequireUtf8();
                this.c = string;
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
        return ak_2.aa;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ab.ensureFieldAccessorsInitialized(bo_1.class, bq_1.class);
    }

    @Override
    public String b() {
        Object object = this.c;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.c = string;
        return string;
    }

    @Override
    public ByteString c() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.d;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.d = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.c);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!this.c().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.c);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bo_1)) {
            return super.equals(object);
        }
        bo_1 bo_12 = (bo_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(bo_12.b());
        bl = bl && this.unknownFields.equals((Object)bo_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bo_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bo_1 a(ByteBuffer byteBuffer) {
        return (bo_1)f.parseFrom(byteBuffer);
    }

    public static bo_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bo_1 a(ByteString byteString) {
        return (bo_1)f.parseFrom(byteString);
    }

    public static bo_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static bo_1 a(byte[] byArray) {
        return (bo_1)f.parseFrom(byArray);
    }

    public static bo_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static bo_1 a(InputStream inputStream) {
        return (bo_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static bo_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bo_1 b(InputStream inputStream) {
        return (bo_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static bo_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bo_1 a(CodedInputStream codedInputStream) {
        return (bo_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static bo_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bq_1 d() {
        return bo_1.e();
    }

    public static bq_1 e() {
        return e.f();
    }

    public static bq_1 a(bo_1 bo_12) {
        return e.f().a(bo_12);
    }

    public bq_1 f() {
        return this == e ? new bq_1() : new bq_1().a(this);
    }

    protected bq_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        bq_1 bq_12 = new bq_1(builderParent);
        return bq_12;
    }

    public static bo_1 g() {
        return e;
    }

    public static Parser<bo_1> h() {
        return f;
    }

    public Parser<bo_1> getParserForType() {
        return f;
    }

    public bo_1 i() {
        return e;
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

    static /* synthetic */ UnknownFieldSet b(bo_1 bo_12) {
        return bo_12.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        bo_1.checkByteStringIsUtf8((ByteString)byteString);
    }
}

