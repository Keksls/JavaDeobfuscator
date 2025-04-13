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
 * Renamed from bJ
 */
public final class bj_2
extends GeneratedMessageV3
implements bm_1 {
    private static final long b = 0L;
    public static final int a = 1;
    long c;
    private byte d = (byte)-1;
    private static final bj_2 e = new bj_2();
    static final Parser<bj_2> f = new bk_1();

    bj_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bj_2() {
        this.c = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bj_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.j.ensureFieldAccessorsInitialized(bj_2.class, bl_2.class);
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
        if (!(object instanceof bj_2)) {
            return super.equals(object);
        }
        bj_2 bj_22 = (bj_2)object;
        boolean bl = true;
        bl = bl && this.b() == bj_22.b();
        bl = bl && this.unknownFields.equals((Object)bj_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bj_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bj_2 a(ByteBuffer byteBuffer) {
        return (bj_2)f.parseFrom(byteBuffer);
    }

    public static bj_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bj_2 a(ByteString byteString) {
        return (bj_2)f.parseFrom(byteString);
    }

    public static bj_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static bj_2 a(byte[] byArray) {
        return (bj_2)f.parseFrom(byArray);
    }

    public static bj_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static bj_2 a(InputStream inputStream) {
        return (bj_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static bj_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bj_2 b(InputStream inputStream) {
        return (bj_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static bj_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bj_2 a(CodedInputStream codedInputStream) {
        return (bj_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static bj_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bj_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bl_2 c() {
        return bj_2.d();
    }

    public static bl_2 d() {
        return e.e();
    }

    public static bl_2 a(bj_2 bj_22) {
        return e.e().a(bj_22);
    }

    public bl_2 e() {
        return this == e ? new bl_2() : new bl_2().a(this);
    }

    protected bl_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bl_2 bl_22 = new bl_2(builderParent);
        return bl_22;
    }

    public static bj_2 f() {
        return e;
    }

    public static Parser<bj_2> g() {
        return f;
    }

    public Parser<bj_2> getParserForType() {
        return f;
    }

    public bj_2 h() {
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

    static /* synthetic */ UnknownFieldSet b(bj_2 bj_22) {
        return bj_22.unknownFields;
    }
}

