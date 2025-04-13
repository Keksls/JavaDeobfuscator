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
 * Renamed from cI
 */
public final class ci_1
extends GeneratedMessageV3
implements cl_1 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    bl_1 e;
    private byte f = (byte)-1;
    private static final ci_1 g = new ci_1();
    static final Parser<ci_1> h = new cj_1();

    ci_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ci_1() {
        this.d = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ci_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
        return ak_2.G;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.H.ensureFieldAccessorsInitialized(ci_1.class, ck_1.class);
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
        if (!(object instanceof ci_1)) {
            return super.equals(object);
        }
        ci_1 ci_12 = (ci_1)object;
        boolean bl = true;
        bl = bl && this.b() == ci_12.b();
        boolean bl2 = bl = bl && this.c() == ci_12.c();
        if (this.c()) {
            bl = bl && this.d().equals(ci_12.d());
        }
        bl = bl && this.unknownFields.equals((Object)ci_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ci_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        if (this.c()) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ci_1 a(ByteBuffer byteBuffer) {
        return (ci_1)h.parseFrom(byteBuffer);
    }

    public static ci_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ci_1 a(ByteString byteString) {
        return (ci_1)h.parseFrom(byteString);
    }

    public static ci_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ci_1 a(byte[] byArray) {
        return (ci_1)h.parseFrom(byArray);
    }

    public static ci_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ci_1 a(InputStream inputStream) {
        return (ci_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ci_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ci_1 b(InputStream inputStream) {
        return (ci_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ci_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ci_1 a(CodedInputStream codedInputStream) {
        return (ci_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ci_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ci_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ck_1 f() {
        return ci_1.g();
    }

    public static ck_1 g() {
        return g.h();
    }

    public static ck_1 a(ci_1 ci_12) {
        return g.h().a(ci_12);
    }

    public ck_1 h() {
        return this == g ? new ck_1() : new ck_1().a(this);
    }

    protected ck_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ck_1 ck_12 = new ck_1(builderParent);
        return ck_12;
    }

    public static ci_1 i() {
        return g;
    }

    public static Parser<ci_1> j() {
        return h;
    }

    public Parser<ci_1> getParserForType() {
        return h;
    }

    public ci_1 k() {
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

    static /* synthetic */ UnknownFieldSet b(ci_1 ci_12) {
        return ci_12.unknownFields;
    }
}

