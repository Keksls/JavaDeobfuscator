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
 * Renamed from bN
 */
public final class bn_1
extends GeneratedMessageV3
implements bq_2 {
    private static final long b = 0L;
    public static final int a = 1;
    long c;
    private byte d = (byte)-1;
    private static final bn_1 e = new bn_1();
    static final Parser<bn_1> f = new bo_2();

    bn_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bn_1() {
        this.c = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bn_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: 
                }
                this.c = codedInputStream.readInt64();
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
        return ak_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.f.ensureFieldAccessorsInitialized(bn_1.class, bp_2.class);
    }

    @Override
    public long b() {
        return this.c;
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
        if (this.c != 0L) {
            codedOutputStream.writeInt64(1, this.c);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.c != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.c);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bn_1)) {
            return super.equals(object);
        }
        bn_1 bn_12 = (bn_1)object;
        boolean bl = true;
        bl = bl && this.b() == bn_12.b();
        bl = bl && this.unknownFields.equals((Object)bn_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bn_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bn_1 a(ByteBuffer byteBuffer) {
        return (bn_1)f.parseFrom(byteBuffer);
    }

    public static bn_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bn_1 a(ByteString byteString) {
        return (bn_1)f.parseFrom(byteString);
    }

    public static bn_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static bn_1 a(byte[] byArray) {
        return (bn_1)f.parseFrom(byArray);
    }

    public static bn_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static bn_1 a(InputStream inputStream) {
        return (bn_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static bn_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bn_1 b(InputStream inputStream) {
        return (bn_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static bn_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bn_1 a(CodedInputStream codedInputStream) {
        return (bn_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static bn_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bn_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bp_2 c() {
        return bn_1.d();
    }

    public static bp_2 d() {
        return e.e();
    }

    public static bp_2 a(bn_1 bn_12) {
        return e.e().a(bn_12);
    }

    public bp_2 e() {
        return this == e ? new bp_2() : new bp_2().a(this);
    }

    protected bp_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bp_2 bp_22 = new bp_2(builderParent);
        return bp_22;
    }

    public static bn_1 f() {
        return e;
    }

    public static Parser<bn_1> g() {
        return f;
    }

    public Parser<bn_1> getParserForType() {
        return f;
    }

    public bn_1 h() {
        return e;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.e();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.c();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.c();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    static /* synthetic */ boolean i() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bn_1 bn_12) {
        return bn_12.unknownFields;
    }
}

