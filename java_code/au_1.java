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
 * Renamed from aU
 */
public final class au_1
extends GeneratedMessageV3
implements ax_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    long e;
    private byte f = (byte)-1;
    private static final au_1 g = new au_1();
    static final Parser<au_1> h = new av_1();

    au_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private au_1() {
        this.d = 0L;
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    au_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 16: 
                }
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
        return ak_2.w;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.x.ensureFieldAccessorsInitialized(au_1.class, aw_2.class);
    }

    @Override
    public long b() {
        return this.d;
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
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0L) {
            codedOutputStream.writeInt64(1, this.d);
        }
        if (this.e != 0L) {
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
        if (this.d != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.d);
        }
        if (this.e != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof au_1)) {
            return super.equals(object);
        }
        au_1 au_12 = (au_1)object;
        boolean bl = true;
        bl = bl && this.b() == au_12.b();
        bl = bl && this.c() == au_12.c();
        bl = bl && this.unknownFields.equals((Object)au_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + au_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.c());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static au_1 a(ByteBuffer byteBuffer) {
        return (au_1)h.parseFrom(byteBuffer);
    }

    public static au_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static au_1 a(ByteString byteString) {
        return (au_1)h.parseFrom(byteString);
    }

    public static au_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static au_1 a(byte[] byArray) {
        return (au_1)h.parseFrom(byArray);
    }

    public static au_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static au_1 a(InputStream inputStream) {
        return (au_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static au_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static au_1 b(InputStream inputStream) {
        return (au_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static au_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static au_1 a(CodedInputStream codedInputStream) {
        return (au_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static au_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (au_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public aw_2 d() {
        return au_1.e();
    }

    public static aw_2 e() {
        return g.f();
    }

    public static aw_2 a(au_1 au_12) {
        return g.f().a(au_12);
    }

    public aw_2 f() {
        return this == g ? new aw_2() : new aw_2().a(this);
    }

    protected aw_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        aw_2 aw_22 = new aw_2(builderParent);
        return aw_22;
    }

    public static au_1 g() {
        return g;
    }

    public static Parser<au_1> h() {
        return h;
    }

    public Parser<au_1> getParserForType() {
        return h;
    }

    public au_1 i() {
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

    static /* synthetic */ UnknownFieldSet b(au_1 au_12) {
        return au_12.unknownFields;
    }
}

