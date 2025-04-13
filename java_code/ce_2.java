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
 * Renamed from cE
 */
public final class ce_2
extends GeneratedMessageV3
implements ch_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    volatile Object e;
    private byte f = (byte)-1;
    private static final ce_2 g = new ce_2();
    static final Parser<ce_2> h = new cf_1();

    ce_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ce_2() {
        this.d = 0L;
        this.e = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ce_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.M;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.N.ensureFieldAccessorsInitialized(ce_2.class, cg_2.class);
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
        if (!(object instanceof ce_2)) {
            return super.equals(object);
        }
        ce_2 ce_22 = (ce_2)object;
        boolean bl = true;
        bl = bl && this.b() == ce_22.b();
        bl = bl && this.c().equals(ce_22.c());
        bl = bl && this.unknownFields.equals((Object)ce_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ce_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + this.c().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ce_2 a(ByteBuffer byteBuffer) {
        return (ce_2)h.parseFrom(byteBuffer);
    }

    public static ce_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ce_2 a(ByteString byteString) {
        return (ce_2)h.parseFrom(byteString);
    }

    public static ce_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ce_2 a(byte[] byArray) {
        return (ce_2)h.parseFrom(byArray);
    }

    public static ce_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ce_2 a(InputStream inputStream) {
        return (ce_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ce_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ce_2 b(InputStream inputStream) {
        return (ce_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ce_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ce_2 a(CodedInputStream codedInputStream) {
        return (ce_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ce_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ce_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cg_2 e() {
        return ce_2.f();
    }

    public static cg_2 f() {
        return g.g();
    }

    public static cg_2 a(ce_2 ce_22) {
        return g.g().a(ce_22);
    }

    public cg_2 g() {
        return this == g ? new cg_2() : new cg_2().a(this);
    }

    protected cg_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        cg_2 cg_22 = new cg_2(builderParent);
        return cg_22;
    }

    public static ce_2 h() {
        return g;
    }

    public static Parser<ce_2> i() {
        return h;
    }

    public Parser<ce_2> getParserForType() {
        return h;
    }

    public ce_2 j() {
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

    static /* synthetic */ UnknownFieldSet b(ce_2 ce_22) {
        return ce_22.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        ce_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

