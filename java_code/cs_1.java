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
 * Renamed from cs
 */
public final class cs_1
extends GeneratedMessageV3
implements cv_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    bl_1 e;
    private byte f = (byte)-1;
    private static final cs_1 g = new cs_1();
    static final Parser<cs_1> h = new ct_1();

    cs_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cs_1() {
        this.d = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cs_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.E;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.F.ensureFieldAccessorsInitialized(cs_1.class, cu_2.class);
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
        if (!(object instanceof cs_1)) {
            return super.equals(object);
        }
        cs_1 cs_12 = (cs_1)object;
        boolean bl = true;
        bl = bl && this.b() == cs_12.b();
        boolean bl2 = bl = bl && this.c() == cs_12.c();
        if (this.c()) {
            bl = bl && this.d().equals(cs_12.d());
        }
        bl = bl && this.unknownFields.equals((Object)cs_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cs_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        if (this.c()) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cs_1 a(ByteBuffer byteBuffer) {
        return (cs_1)h.parseFrom(byteBuffer);
    }

    public static cs_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cs_1 a(ByteString byteString) {
        return (cs_1)h.parseFrom(byteString);
    }

    public static cs_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static cs_1 a(byte[] byArray) {
        return (cs_1)h.parseFrom(byArray);
    }

    public static cs_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static cs_1 a(InputStream inputStream) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static cs_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cs_1 b(InputStream inputStream) {
        return (cs_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static cs_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cs_1 a(CodedInputStream codedInputStream) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static cs_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cs_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cu_2 f() {
        return cs_1.g();
    }

    public static cu_2 g() {
        return g.h();
    }

    public static cu_2 a(cs_1 cs_12) {
        return g.h().a(cs_12);
    }

    public cu_2 h() {
        return this == g ? new cu_2() : new cu_2().a(this);
    }

    protected cu_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        cu_2 cu_22 = new cu_2(builderParent);
        return cu_22;
    }

    public static cs_1 i() {
        return g;
    }

    public static Parser<cs_1> j() {
        return h;
    }

    public Parser<cs_1> getParserForType() {
        return h;
    }

    public cs_1 k() {
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

    static /* synthetic */ UnknownFieldSet b(cs_1 cs_12) {
        return cs_12.unknownFields;
    }
}

