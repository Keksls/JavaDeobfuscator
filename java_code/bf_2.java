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
 * Renamed from bF
 */
public final class bf_2
extends GeneratedMessageV3
implements bi_1 {
    private static final long b = 0L;
    public static final int a = 1;
    long c;
    private byte d = (byte)-1;
    private static final bf_2 e = new bf_2();
    static final Parser<bf_2> f = new bg_1();

    bf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bf_2() {
        this.c = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.n.ensureFieldAccessorsInitialized(bf_2.class, bh_2.class);
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
        if (!(object instanceof bf_2)) {
            return super.equals(object);
        }
        bf_2 bf_22 = (bf_2)object;
        boolean bl = true;
        bl = bl && this.b() == bf_22.b();
        bl = bl && this.unknownFields.equals((Object)bf_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bf_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bf_2 a(ByteBuffer byteBuffer) {
        return (bf_2)f.parseFrom(byteBuffer);
    }

    public static bf_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bf_2 a(ByteString byteString) {
        return (bf_2)f.parseFrom(byteString);
    }

    public static bf_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static bf_2 a(byte[] byArray) {
        return (bf_2)f.parseFrom(byArray);
    }

    public static bf_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static bf_2 a(InputStream inputStream) {
        return (bf_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static bf_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bf_2 b(InputStream inputStream) {
        return (bf_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static bf_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bf_2 a(CodedInputStream codedInputStream) {
        return (bf_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static bf_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bf_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bh_2 c() {
        return bf_2.d();
    }

    public static bh_2 d() {
        return e.e();
    }

    public static bh_2 a(bf_2 bf_22) {
        return e.e().a(bf_22);
    }

    public bh_2 e() {
        return this == e ? new bh_2() : new bh_2().a(this);
    }

    protected bh_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bh_2 bh_22 = new bh_2(builderParent);
        return bh_22;
    }

    public static bf_2 f() {
        return e;
    }

    public static Parser<bf_2> g() {
        return f;
    }

    public Parser<bf_2> getParserForType() {
        return f;
    }

    public bf_2 h() {
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

    static /* synthetic */ UnknownFieldSet b(bf_2 bf_22) {
        return bf_22.unknownFields;
    }
}

