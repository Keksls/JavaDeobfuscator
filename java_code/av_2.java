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
 * Renamed from av
 */
public final class av_2
extends GeneratedMessageV3
implements ay_2 {
    private static final long c = 0L;
    public static final int a = 1;
    int d;
    public static final int b = 2;
    ByteString e;
    private byte f = (byte)-1;
    private static final av_2 g = new av_2();
    static final Parser<av_2> h = new aw_1();

    av_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private av_2() {
        this.d = 0;
        this.e = ByteString.EMPTY;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    av_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.d = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 18: 
                }
                this.e = codedInputStream.readBytes();
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
        return ao_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.d.ensureFieldAccessorsInitialized(av_2.class, ax_1.class);
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public ByteString c() {
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
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0) {
            codedOutputStream.writeInt32(1, this.d);
        }
        if (!this.e.isEmpty()) {
            codedOutputStream.writeBytes(2, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.d);
        }
        if (!this.e.isEmpty()) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof av_2)) {
            return super.equals(object);
        }
        av_2 av_22 = (av_2)object;
        boolean bl = true;
        bl = bl && this.b() == av_22.b();
        bl = bl && this.c().equals((Object)av_22.c());
        bl = bl && this.unknownFields.equals((Object)av_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + av_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b();
        n = 37 * n + 2;
        n = 53 * n + this.c().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static av_2 a(ByteBuffer byteBuffer) {
        return (av_2)h.parseFrom(byteBuffer);
    }

    public static av_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static av_2 a(ByteString byteString) {
        return (av_2)h.parseFrom(byteString);
    }

    public static av_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static av_2 a(byte[] byArray) {
        return (av_2)h.parseFrom(byArray);
    }

    public static av_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static av_2 a(InputStream inputStream) {
        return (av_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static av_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static av_2 b(InputStream inputStream) {
        return (av_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static av_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static av_2 a(CodedInputStream codedInputStream) {
        return (av_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static av_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (av_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ax_1 d() {
        return av_2.e();
    }

    public static ax_1 e() {
        return g.f();
    }

    public static ax_1 a(av_2 av_22) {
        return g.f().a(av_22);
    }

    public ax_1 f() {
        return this == g ? new ax_1() : new ax_1().a(this);
    }

    protected ax_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ax_1 ax_12 = new ax_1(builderParent);
        return ax_12;
    }

    public static av_2 g() {
        return g;
    }

    public static Parser<av_2> h() {
        return h;
    }

    public Parser<av_2> getParserForType() {
        return h;
    }

    public av_2 i() {
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

    static /* synthetic */ UnknownFieldSet b(av_2 av_22) {
        return av_22.unknownFields;
    }
}

