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
 * Renamed from bV
 */
public final class bv_2
extends GeneratedMessageV3
implements by_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    bl_1 e;
    private byte f = (byte)-1;
    private static final bv_2 g = new bv_2();
    static final Parser<bv_2> h = new bw_1();

    bv_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bv_2() {
        this.d = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bv_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                bn_2 bn_22 = null;
                if (this.e != null) {
                    bn_22 = this.e.l();
                }
                this.e = (bl_1)codedInputStream.readMessage(bl_1.n(), extensionRegistryLite);
                if (bn_22 == null) continue;
                bn_22.a(this.e);
                this.e = bn_22.m();
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
        return ak_2.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.h.ensureFieldAccessorsInitialized(bv_2.class, bx_2.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    @Override
    public bl_1 d() {
        return this.e == null ? bl_1.m() : this.e;
    }

    @Override
    public ba_2 e() {
        return this.d();
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
        if (this.e != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.d());
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
        if (this.e != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.d());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bv_2)) {
            return super.equals(object);
        }
        bv_2 bv_22 = (bv_2)object;
        boolean bl = true;
        bl = bl && this.b() == bv_22.b();
        boolean bl2 = bl = bl && this.c() == bv_22.c();
        if (this.c()) {
            bl = bl && this.d().equals(bv_22.d());
        }
        bl = bl && this.unknownFields.equals((Object)bv_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bv_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        if (this.c()) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bv_2 a(ByteBuffer byteBuffer) {
        return (bv_2)h.parseFrom(byteBuffer);
    }

    public static bv_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bv_2 a(ByteString byteString) {
        return (bv_2)h.parseFrom(byteString);
    }

    public static bv_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static bv_2 a(byte[] byArray) {
        return (bv_2)h.parseFrom(byArray);
    }

    public static bv_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static bv_2 a(InputStream inputStream) {
        return (bv_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static bv_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bv_2 b(InputStream inputStream) {
        return (bv_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static bv_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bv_2 a(CodedInputStream codedInputStream) {
        return (bv_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static bv_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bv_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bx_2 f() {
        return bv_2.g();
    }

    public static bx_2 g() {
        return g.h();
    }

    public static bx_2 a(bv_2 bv_22) {
        return g.h().a(bv_22);
    }

    public bx_2 h() {
        return this == g ? new bx_2() : new bx_2().a(this);
    }

    protected bx_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bx_2 bx_22 = new bx_2(builderParent);
        return bx_22;
    }

    public static bv_2 i() {
        return g;
    }

    public static Parser<bv_2> j() {
        return h;
    }

    public Parser<bv_2> getParserForType() {
        return h;
    }

    public bv_2 k() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bv_2 bv_22) {
        return bv_22.unknownFields;
    }
}

